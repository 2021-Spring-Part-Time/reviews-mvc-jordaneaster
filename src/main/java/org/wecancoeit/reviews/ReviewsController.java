package org.wecancoeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;

@Controller
public class ReviewsController {


    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/all-reviews")
    public String getAllReviews(Model model){
        model.addAttribute("TotalReviews",reviewRepo.getAllReviews());
        return "all-reviews";
    }

    @RequestMapping ("/review")
    public String getAReview (@RequestParam(value = "id") Long id, Model model){
        model.addAttribute("review", reviewRepo.getAReviewById(id));
        return "review";
    }





}
