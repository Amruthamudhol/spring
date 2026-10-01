package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.MovieDTO;
import com.xworkz.twisty.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@RequestMapping("/")
public class MovieComponent {

    @Autowired
    private MovieService movieService;

    public MovieComponent() {
        System.out.println("MovieComponent Created");
    }

    @PostMapping("/movie")
    public String onMovieSubmit(Model model, @Valid MovieDTO movieDTO, BindingResult bindingResult) {
        System.out.println("running onMovieSubmit()");
        System.out.println("MovieDTO-->" + movieDTO);

        if (bindingResult.hasErrors()) {
            System.out.println("There are validation errors, please fix it");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("movieDTO", movieDTO);

        } else {
            model.addAttribute("message", "Movie added successfully");
            System.out.println("no validation errors");
            System.out.println(movieDTO);
            model.addAttribute("movieDTO", new MovieDTO());
        }

        return "Movie.jsp";
    }

    @GetMapping("/movie")
    public String onPlace(Model model) {

        System.out.println("running onPlace()");
        List<String> languages = Stream.of("Kannada", "Hindi", "English", "Telugu", "Tamil", "Malayalam").collect(Collectors.toList());
        model.addAttribute("languages", languages);
        model.addAttribute("placeDTO", new MovieDTO());

        return "Place.jsp";
    }
}
