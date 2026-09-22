package com.xworkz.sound.component;

import com.xworkz.sound.dto.MovieDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MovieComponent {
    public MovieComponent() {
        System.out.println("MovieComponent Created");
    }

    @RequestMapping("/movie")
    public String onMovie(MovieDTO movieDTO) {
        System.out.println("running movie()");
        System.out.println("MovieDto-->"+movieDTO);
        return "/Movie.jsp";
    }
}
