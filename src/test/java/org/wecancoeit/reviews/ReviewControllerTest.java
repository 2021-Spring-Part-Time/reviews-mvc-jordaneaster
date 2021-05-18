package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@WebMvcTest(ReviewsController.class)
public class ReviewControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldBeOkForAllReviewsInAllReviewsTemplate() throws Exception {
        mockMvc.perform(get("/all-reviews")).andExpect(status().isOk())
                .andExpect(view().name("all-reviews"));
    }


}
