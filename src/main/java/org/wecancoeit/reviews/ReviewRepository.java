package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviews = new HashMap<>();

    public ReviewRepository(){
        Review jCole = new Review(001L,"The Off-season", "jcole.jpg","Hip-Hop/Rap",
                "With the release of Fayetteville North Carolina' own Jermaine Cole [aka J. Cole], seeks to challenge the minds of fans worldwide. " +
                        "There is no question that the world we are living in is unlike any other era. Police brutality against young black men has been a focal point " +
                        " of legislation and protest worldwide. Now as the country heads towards a post-pandemic reality, J. Cole drops an instant classic highlighted by " +
                        " melodic tunes such as the outro 'hunger on hillside' where Cole delivers arguable the most powerful verse of hte past two years in hip hop." +
                        "Thank you Jermaine Cole. Oh yeah.. not to mention, Cole has signed with the Rwandan professional basketball team where he competed in his " +
                        "first professional game Sunday May 16th. In 17 minutes he scored 3 points, secured 3 boards and coordinated smoothly a few assists. ");
        Review kodakBlack = new Review(002L,"Haitian Boy Kodak","kodak.png","Hip-Hop/Rap","Kodak Black dropped his 7th mixtape following his " +
                "release from a federal penitentiary after almost 46-months for lying on federal paperwork. Controversy has surrounded the Florida rapper, whom " +
                "secured the help of Former President Donald Trump who amidst ample backlash, commuted his sentence upon leaving office. This 8-track mixtape offers fans a different view of " +
                "Kodak who is a haitian born Florida resident who gets back to his roots midway through the tape on track # 4 Dejanbem, a track where he speaks in his native " +
                "Creole language. ");
        reviews.put(jCole.getId(),jCole);
        reviews.put(kodakBlack.getId(), kodakBlack);

    }

    public Collection<Review> getAllReviews(){
        return reviews.values();
    }

    public Review getAReviewById(Long id){
        return reviews.get(id);
    }
    public Review getAReviewByGenre(String genre){
        return reviews.get(genre.toLowerCase());
    }
    public Review getAReviewByTitle(String title){
        return reviews.get(title.toLowerCase());
    }




}
