package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(ReviewsController.class)
public class ReviewControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private Review review1;
    @Mock
    private Review review2;


    @MockBean
    private ReviewRepository reviewRepo;

    @Test
    public void shouldBeOkForAllReviewsInAllReviewsTemplate() throws Exception {
        mockMvc.perform(get("/all-reviews")).andExpect(status().isOk())
                .andExpect(view().name("all-reviews"));
    }

    @Test
    public void shouldFindAllReviewsInModel() throws Exception{
        Collection<Review> allReviewsInModel = Arrays.asList(review1,review2);
        when(reviewRepo.findAll()).thenReturn(allReviewsInModel);
        mockMvc.perform(get("/all-reviews")).andExpect(model()
                .attribute("TotalReviews",allReviewsInModel));
    }

    @Test
    public void shouldBeOkForOneReviewInModel() throws Exception{
        Long reviewOneId = 1L;
        when(reviewRepo.findone(reviewOneId)).thenReturn(review1);
        mockMvc.perform(get("/review?id=1"))
                .andExpect(model().attribute("review",review1));
    }

    @Test
    public void shouldBeOkForOneReviewInReviewTemplate()throws Exception{
        Long reviewOneId = 1L;
        when(reviewRepo.findone(reviewOneId)).thenReturn(review1);
        mockMvc.perform(get("/review?id=1")).andExpect(status().isOk())
                .andExpect(view().name("review"));
    }

    @Test
    public void shouldBeNotFoundForRequestNotInModel() throws Exception{
        Long courseTwoId = 2L;
        when(reviewRepo.findone(courseTwoId)).thenReturn(review2);
        mockMvc.perform(get("/review?id=3")).andExpect(status().isNotFound());

    }


}
