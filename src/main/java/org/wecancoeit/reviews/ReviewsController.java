package org.wecancoeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;

@Controller
public class ReviewsController {


    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/all-reviews")
    public String findAllReviews(Model model){
        model.addAttribute("TotalReviews",reviewRepo.findAll());
        return "all-reviews";
    }

    @RequestMapping ("/review")
    public String getAReview (@RequestParam(value = "id") Long id, Model model) throws ReviewNotFoundException {

        if(reviewRepo.findone(id) == null){
            throw new ReviewNotFoundException();
        }
        model.addAttribute("review", reviewRepo.findone(id));
        return "reviewTemplate";
    }

    @GetMapping("/genre")
    public String getAGenre(@RequestParam(value = "genre") String genre, Model model) throws ReviewNotFoundException{
        if (reviewRepo.getAReviewByGenre(genre)==null){
            throw new ReviewNotFoundException();
        }
        model.addAttribute("reviewGenre",reviewRepo.getAReviewByGenre(genre));
        return "genreTemplate";
    }





}
