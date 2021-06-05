package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import javax.persistence.Lob;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviews = new HashMap<>();


    public ReviewRepository(Review ...reviewToAdd){
        for(Review review: reviewToAdd){
            reviews.put(review.getId(), review);
        }
    }
    public ReviewRepository(){

        Review chapter1 = new Review(1L, "War of The Millennials","images/warstories.jpg","...this is war...","WAR OF THE MILLENNIALS\n" +
                " \n" +
                "We are the fountain of youth; we are the new America. United we stand filled with vigour, freshness, and enthusiasm about life. We live for tomorrow, next week, next month, next year. " +
                "We the youth are indeed the fountain of youth, the fountain of tomorrow. We are the generation after the present generation. We will be here when we are gone. \n" +
                "\tAs one solid youth we break the barriers of division handed down from the enemy of, WE THE PEOPLE, the fountain of youth, the youth. " +
                "Together in solidarity, stealing back our minds and goals from the enemy, breaking free from the mental slavery of; school, work, mediocracy and moderation. " +
                "We enter the revolutionary framework of study, work, and rifle. Following the blueprint of past progression against oppression and adding to it, together in solidary we shine forth bright like diamonds, blood diamonds if you may.\n" +
                "\tHow are we not yesterday, today, and tomorrow when everything we do leaves a mark? They say, “these young kids are wild”, yes, they are right; mad, wild, creative, and hurt. " +
                "Call it what you may, they just need to know that WE ARE! Our missiles are misguided, aimed at each other via the miseducation that these social realms we concave in are our own, " +
                "as opposed to being aimed at the enemy who hoards the wealth and opportunity to render these trivial concerns unqualified for our attention. \n");
        Review chapter2 = new Review(2L, "Choices and Awareness","images/cna.jpg","...we choose not..","Many say that life is about choices, I agree. However, the element that people forget to mention is awareness. Awareness is the reality that one recognizes. Us millennials being born in a socially reputable era, where we imitate and mirror the action, cause, and effects of the trends of our peers lose our youthfulness—creative labour—by falling hook, line, and sinker for the socially accepted drift of the season. We create a cycle of envy among ourselves as everyone is vying for the same position, not realizing all the spots are controlled\n" +
                "How was the choice ours when the options of success were not made aware to us? Being a product of your environment does not mean you are more probable to fail if the environment you " +
                "are from is morally sufficient. Simple math. Coming from an environment that yields criminals, drug addicts, prostitutes, drug dealers, absent fathers, the odds of coming out of this setting with a PhD in botany are not great. To graduate high school in this environment is not a given. Us millennials born in the suburbs fall in the same reservoir of mediocrity and moderation. \n" +
                "The multi-media targets us millennials—we are their number one consumer. Those of us privileged enough to be aware, conscious of a totally different set of circumstances, a different environment. Those of us who had a father at home, " +
                "who never had to see poverty, or struggle. In this design we are all one. They feed us poison through the media, the self-destructive music we party to, the video games they sell us that perpetuate violence the urban jungle, now we want to " +
                "leave our suburb in the hills to see it for ourselves now that we are aware. Hollywood sells liveable, conceivable fantasies to our parents, adulterous movies of betrayal and pain, visions of a happier life with another man/woman—all in the name of love. They tear our families apart, and at the same time sell us pharmaceuticals (legal drugs) to alleviate the pain of depression which they have caused. What about Us! They unite the top and bottom through depression and hopelessness. This necessary evil in their capitalistic power structure keeps us all dependent on their design of mediocrity, on the enemy.\n" +
                "\tTo keep us moderate was their design because no person of moderance can conceive the types of highs and lows we experience as a whole. Growing up in the urban jungles we never knew the effect of having 4 active grandparents, two-parent households. Those of us who did dealt the design a glitch and made the square in the hole on the first try. Therefore, those of us from the jungle; to graduate from high school was an honour, enough of a high in our environment to keep ourselves and families satisfied. Once this “honour” is achieved there are enough distractions to keep us from perceiving higher aspirations—fatherless loose girls, guns, drugs, athletic fantasies, and entertainment. Effectively keeping us moderate. That is those of us from the jungle who don’t jump off the porch too early, as their fate is tied up in the graveyards and prisons. \n");
        Review chapter3 = new Review(3L, "The Alliance Of Fear","images/fear.jpg","...conquer fear...","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore magna aliqua. Cras pulvinar mattis nunc sed blandit libero volutpat sed cras. Consectetur adipiscing elit " +
                "pellentesque habitant morbi tristique. Vulputate ut pharetra sit amet aliquam id. Diam quis enim lobortis scelerisque fermentum. " +
                "Fringilla phasellus faucibus scelerisque eleifend donec pretium. Lobortis elementum nibh tellus molestie nunc non blandit massa. " +
                "In dictum non consectetur a. Nunc faucibus a pellentesque sit amet porttitor eget. Dictum fusce ut placerat orci nulla. Lacus vestibulum " +
                "sed arcu non odio. Dictum sit amet justo donec enim.");
        Review chapter4 = new Review(4L, "3 x Design","images/kb.jpg","...only one shot..","On the other end of the spectrum, those of us who grew up secluded from the jungles in the hills behind gated communities and such; who never felt the effect of having only a mother to raise us. Or never had to choose between basic education and work in order to survive. To graduate high school was both required, guided, and expected a given. Once this was achieved our families had enough resources and money to put us through college, eliminating this struggle altogether. Though it may seem this way on the surface, we must remember that the liberal education is what lines the pockets of the generations that come before us as it stifles our creative youth, and oftentimes we are working for a boss who has been in power for decades and has no plans of passing this on to you. So, as you perform 90% of the work and innovation, you receive a 10% reward. Once in college we follow in the footsteps of our family’s elders who we have known and understood to be successful and happy their whole lives. We become comfortable moderate in our future. That is those of us who aren’t sucked into the vortex they’ve created in this design to unite the top and bottom, depression, pharmaceuticals. They have created a barrier between us millennials, keeping us form truly understanding the power WE THE PEOPLE, the fountain of youth holds as one solid whole. So, if you ever thought of yourself as better than, worse than, reassess the situation with this new ray of awareness. We are all one. ");

        reviews.put(chapter1.getId(), chapter1);
        reviews.put(chapter2.getId(), chapter2);
        reviews.put(chapter3.getId(), chapter3);
        reviews.put(chapter4.getId(), chapter4);

    }

    public Collection<Review> findAll(){
        return reviews.values();
    }

    public Review findone(long id){

        return reviews.get(id);
    }
    public Review getAReviewByGenre(String genre){

        return reviews.get(genre);
    }
    public Review getAReviewByTitle(String title){

        return reviews.get(title);
    }

//    Review jCole = new Review(1L,"The Off-season", "images/jCole.jpg","Hip-Hop/Rap",
//            "With the release of 'The Off-Season' Fayetteville North Carolina' own Jermaine Cole [aka J. Cole], seeks to challenge the minds of fans worldwide. " +
//                    "There is no question that the world we are living in is unlike any other era. Police brutality against young black men has been a focal point " +
//                    " of legislation and protest worldwide. Now as the country heads towards a post-pandemic reality, J. Cole drops an instant classic highlighted by " +
//                    " melodic tunes such as the outro 'hunger on hillside' where Cole delivers arguable the most powerful verse of the past two years in hip hop." +
//                    "Thank you Jermaine Cole. Oh yeah.. not to mention, Cole has signed with the Rwandan professional basketball team where he competed in his " +
//                    "first professional game Sunday May 16th. In 17 minutes he scored 3 points, secured 3 boards and coordinated smoothly a few assists. ");
//    Review kodakBlack = new Review(2L,"Haitian Boy Kodak","images/kodak-black.jpg","Hip-Hop/Rap","Kodak Black dropped his 7th mixtape following his " +
//            "release from a federal penitentiary after almost 46-months for lying on federal paperwork. Controversy has surrounded the Florida rapper, whom " +
//            "secured the help of Former President Donald Trump who amidst ample backlash, commuted his sentence upon leaving office. This 8-track mixtape offers fans a different view of " +
//            "Kodak who is a haitian born Florida resident who gets back to his roots midway through the tape on track # 4 Dejanbem, a track where he speaks in his native " +
//            "Creole language. ");
//    Review toosii = new Review(3L,"Thank You For Believing","images/toosii.jpg","Hip-Hop/RnB","Syracuse native Toosii presented the world with his first platinum mixtape. Now a resident of North Carolina," +
//            "the melodic rapper/singer and songwriter delivers to his fans a perfectly tuned and amped up mixtape just in time for the summer.");
//    Review quandoRondo = new Review(4L,"Still Taking Risks","images/QR.jpg","Hip-Hop/Rap","Tyquian Terrel Bowman aka Quando Rondo to the ")
//        reviews.put(jCole.getId(),jCole);
//        reviews.put(kodakBlack.getId(), kodakBlack);
//        reviews.put(toosii.getId(), toosii);


}
