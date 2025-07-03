package ytespring.egitim.demo.example;

import jakarta.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;
import ytespring.egitim.demo.practice4.UserDto;
import ytespring.egitim.demo.practice4.UserResponseDTO;

import java.net.URI;

@Component
public class MyFirstBean {

    public UserResponseDTO sendPostRequest(@Valid UserDto userDto) {
        RestClient restClient = RestClient.builder().build();
        URI uri = UriComponentsBuilder.fromUriString("https://jsonplaceholder.typicode.com/")
                .path("/posts")
                .build()
                .toUri();
        return restClient.post()
                .uri(uri)
                .body(userDto)
                .retrieve()
                .body(UserResponseDTO.class);
    }

    public void sendGetRequest() {
        RestClient restClient = RestClient.builder().build();
        URI uri = UriComponentsBuilder.fromUriString("https://reqres.in/api/users")
                .queryParam("page", "2")
                .build()
                .toUri();
        String response = restClient.get()
                .uri(uri)
                .retrieve()
                .body(String.class);
        System.out.println("Response: " + response);
    }


}
