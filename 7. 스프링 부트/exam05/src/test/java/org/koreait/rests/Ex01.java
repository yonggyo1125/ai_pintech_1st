package org.koreait.rests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.controllers.ApiMemberController;
import org.koreait.member.controllers.RequestLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@SpringBootTest
//@AutoConfigureMockMvc
@ActiveProfiles({"default", "test"})
public class Ex01 {

    @Autowired
    private WebApplicationContext ctx;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        // 모든 컨트롤러 빈을 생성하고 테스트
        //mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
        // ApiMemberController 빈만 생성하고 테스트
        mockMvc = MockMvcBuilders.standaloneSetup(ApiMemberController.class).build();
    }

    @Test
    void test1() throws Exception {
        mockMvc.perform(get("/api/member/test1"))
                .andDo(print());
    }

    @Test
    void test2() throws Exception {
        mockMvc.perform(post("/api/member/test3")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED) //application/x-www-form-urlencoded
                .param("email", "user01@test.org")
                .param("password", "12345678")
                .param("saveEmail", "true")
        ).andDo(print());

        /**
         * 요청 바디 데이터
         * email=user01@test.org&password=12345678&saveEmail=true
         */
    }

    @Test
    void test3() throws Exception {
        RequestLogin form = new RequestLogin();
        //form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setSaveEmail(true);

        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(form);

        System.out.println(json);

        mockMvc.perform(post("/api/member/test3")
                .contentType(MediaType.APPLICATION_JSON)  // Content-Type: application/json
                .content(json)
        ).andDo(print());
    }
}
