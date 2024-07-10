package com.practice.bookauthors.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @WebMvcTest(AuthorController.class)
public class AuthorControllerTest {
    @Autowired
    private static MockMvc mockMvc;

    // @BeforeAll
    // private static void setup() {
    // mockMvc = MockMvcBuilders.standaloneSetup(new AuthorController()).build();
    // }

    @Test
    void testCreateAuthor() throws Exception {
        // mockMvc.perform(post("/authors")
        // .contentType(MediaType.APPLICATION_JSON)
        // .content("{\"name\":\"Dad\"}"))
        // .andExpect(status().isOk());
    }

    @Test
    void testDeleteAuthor() {
        // TODO
    }

    @Test
    void testGetAllAuthors() {
        // TODO
    }

    @Test
    void testUpdateAuthor() {
        // TODO
    }
}
