package com.eattogether.heytogether;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class ArticleApiController {
    @PostMapping("/articles")
    public ResponseEntity create(@RequestBody ArticleDto articleDto) {
        // TODO: 2019-12-04
        return ResponseEntity.ok().build();
    }
}
