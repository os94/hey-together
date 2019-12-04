package com.eattogether.heytogether.web.controller;

import com.eattogether.heytogether.ArticleDto;
import com.eattogether.heytogether.domain.Money;
import com.eattogether.heytogether.domain.Orders;
import com.eattogether.heytogether.domain.Place;
import com.eattogether.heytogether.domain.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.webtestclient.WebTestClientRestDocumentation.document;
import static org.springframework.restdocs.webtestclient.WebTestClientRestDocumentation.documentationConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
@AutoConfigureRestDocs(uriScheme = "https", uriHost = "docs.api.com")
public class ArticleApiControllerTest {

    private WebTestClient webTestClient;

    @BeforeEach
    public void setUp(ApplicationContext applicationContext, RestDocumentationContextProvider restDocumentation) {
        webTestClient = WebTestClient.bindToApplicationContext(applicationContext)
                .configureClient()
                .filter(documentationConfiguration(restDocumentation))
                .build();
    }

    @Test
    @DisplayName("게시글 등록")
    void create_article() {
        ArticleDto articleDto = new ArticleDto(
                new Place(), new Shop(), new Money(), new Money(), new Orders(), LocalDateTime.now()
        );

        webTestClient.post().uri("/articles")
                .accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(articleDto), ArticleDto.class)
                .exchange().expectStatus().isOk()
                .expectBody()
                .consumeWith(document(
                        "articles/post",
                        requestFields(
                                fieldWithPath("place").description("배달받을 위치"),
                                fieldWithPath("shop").description("주문할 가게"),
                                fieldWithPath("minimumOrderPrice").description("최소 주문 금액"),
                                fieldWithPath("deliveryTip").description("배달 팁"),
                                fieldWithPath("orders").description("주문 목록"),
                                fieldWithPath("deadline").description("모집 마감 시간")
                        )));
    }
}
