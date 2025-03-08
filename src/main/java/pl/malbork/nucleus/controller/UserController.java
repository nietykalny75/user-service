package pl.malbork.nucleus.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class UserController implements UserEndpoint {
    @Override
    public Mono<Void> getUsers() {
        return Mono.empty();
    }
}
