package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepoTest {
        private ReviewRepository underTest;
        Review reviewOne = new Review(1L,"review1","image1","genre1","1");
        Review reviewTwo = new Review(2L,"review2","image2","genre2","");
    @Test
    public void shouldFindOneReview(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findone(1L);
        assertEquals(foundReview,reviewOne);

    }

    @Test
    public void shouldFindReviewOneAndTwo(){
        underTest = new ReviewRepository(reviewOne,reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne,reviewTwo);
    }
}
