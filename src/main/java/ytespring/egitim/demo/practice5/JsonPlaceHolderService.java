package ytespring.egitim.demo.practice5;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class JsonPlaceHolderService {

    public List<Post> getPosts() {
        RestClient restClient = RestClient.builder().build();

        return restClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {
                });
    }

    public Post getPostById(Long id) {
        RestClient restClient = RestClient.builder().build();

        return restClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts/{id}", id)
                .retrieve()
                .body(Post.class);
    }

    public List<Post> getPostsByUserId(Long userId) {
        RestClient restClient = RestClient.builder().build();

        return restClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts?userId={userId}", userId)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {
                });
    }

    public Comment updateComment(Long id, Comment post) {
        RestClient restClient = RestClient.builder().build();

        return restClient.put()
                .uri("https://jsonplaceholder.typicode.com/comments/{id}", id)
                .body(post)
                .retrieve()
                .body(Comment.class);
    }

    public void deletePost(Long id) {
        RestClient restClient = RestClient.builder().build();

        restClient.delete()
                .uri("https://jsonplaceholder.typicode.com/posts/{id}", id)
                .retrieve()
                .body(Void.class);
    }
}
