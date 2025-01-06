package org.koreait.tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.controllers.RequestJoin;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class Ex01 {

    private ObjectMapper om;
    private RestTemplate restTemplate;

    @BeforeEach
    void init() {
        om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        restTemplate = new RestTemplate();
    }

    @Test
    void test1() throws Exception {

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("1234");
        form.setConfirmPassword("1234");
        form.setName("사용자01");

        String json = om.writeValueAsString(form); // 자바 객체 -> JSON 문자열
        System.out.println(json);

        // JSON 문자열 -> 자바 객체 변환
        RequestJoin form2 = om.readValue(json, RequestJoin.class); // 단일 클래스 형태의 자료형으로 변환 Class 클래스가 매개변수
        System.out.println("form2 : " + form2);
    }

    @Test
    void test2() throws Exception {
        List<RequestJoin> items = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> RequestJoin.builder()
                        .email("user" + i + "@test.org")
                        .password("1234")
                        .confirmPassword("1234")
                        .name("사용자" + i).build()).toList();

        String json = om.writeValueAsString(items);
        System.out.println(json);

        // List<T>, Map<K, V>, Set<...>  -> TypeReference(추상클래스) 객체
        //List<RequestJoin> items2 = om.readValue(json, new TypeReference<List<RequestJoin>>() {});
        List<RequestJoin> items2 = om.readValue(json, new TypeReference<>() {});
        items2.forEach(System.out::println);
    }

    @Test
    void test3() {
        //UriComponents url = UriComponentsBuilder.fromUri(URI.create("https://www.naver.com"))
        UriComponents url = UriComponentsBuilder.fromUriString("https://www.naver.com")
                .queryParam("k1", "v1")
                .queryParam("k2", "v2")
                .queryParam("k3", "한글")
                .fragment("header")
                .encode() // 멀티 바이트 문자 -> 16진수 형태로 변경 - URL 인코딩
                .build();
        String _url = url.toString();
        System.out.println(_url);
    }

    @Test
    void test4() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        //String body = restTemplate.getForObject(URI.create(url), String.class); // 응답 바디
        Post body = restTemplate.getForObject(URI.create(url), Post.class);
        System.out.println(body);
    }

    @Test
    void test5() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        //ResponseEntity<String> response = restTemplate.getForEntity(URI.create(url), String.class);
        ResponseEntity<Post> response = restTemplate.getForEntity(URI.create(url), Post.class);
        HttpStatusCode status = response.getStatusCode();
        System.out.println("status:" + status);
        HttpHeaders headers = response.getHeaders(); // 응답 헤더
        System.out.println("headers:" + headers);
        System.out.println("body:" + response.getBody());
    }
}
