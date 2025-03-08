package pl.malbork.nucleus.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("/users")
@RestController
public interface UserEndpoint {
    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    Mono<Void> getUsers();
}
