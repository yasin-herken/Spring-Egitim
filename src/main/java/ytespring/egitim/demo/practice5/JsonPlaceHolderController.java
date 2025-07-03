package ytespring.egitim.demo.practice5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JsonPlaceHolderController {


    private final JsonPlaceHolderService jsonPlaceHolderService;

    @Autowired
    public JsonPlaceHolderController(JsonPlaceHolderService jsonPlaceHolderService) {
        this.jsonPlaceHolderService = jsonPlaceHolderService;
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return jsonPlaceHolderService.getPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable Long id) {
        return jsonPlaceHolderService.getPostById(id);
    }

    @GetMapping("/posts/user")
    public List<Post> getPostsByUserId(@RequestParam Long userId) {
        return jsonPlaceHolderService.getPostsByUserId(userId);
    }

    @PutMapping("/comments/{id}")
    public Comment updatePost(@PathVariable Long id, @RequestBody Comment comment) {
        return jsonPlaceHolderService.updateComment(id, comment);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable Long id) {

        jsonPlaceHolderService.deletePost(id);

    }
}