package ytespring.egitim.demo.practice4;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExternalApiController {


    private final ExternalApiService externalApiService;

    @Autowired
    public ExternalApiController(final ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/reqres")
    public void sendGetRequest() {
        externalApiService.getRestResponse();
    }

    @PostMapping("/json")
    public UserResponseDTO sendPostRequest(@RequestBody @Valid UserDto userDto) {
        return externalApiService.getPostResponse(userDto);
    }
}
