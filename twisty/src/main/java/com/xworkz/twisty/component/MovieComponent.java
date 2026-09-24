package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.MovieDTO;
import com.xworkz.twisty.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MovieComponent {

    @Autowired
    private MovieService movieService;

    public MovieComponent() {
        System.out.println("MovieComponent Created");
    }

    @RequestMapping("/movie")
    public String onMovie(MovieDTO movieDTO, Model model) {
        System.out.println("running movie()");
        System.out.println("MovieDto-->"+movieDTO);
        this.movieService.validateAndSave(movieDTO);
        model.addAttribute("message", "Movie added successfully");
        return "/Movie.jsp";
    }
}
