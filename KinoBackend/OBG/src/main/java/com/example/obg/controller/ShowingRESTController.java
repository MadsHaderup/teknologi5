package com.example.obg.controller;

import com.example.obg.model.Showing;
import com.example.obg.repository.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin

public class ShowingRESTController {
    @Autowired
    ShowingRepository showingRepository;

    @PostMapping("/showing")
    @ResponseStatus(HttpStatus.CREATED)
    public Showing postShowing(@RequestBody Showing showing) {
        System.out.println("showing is = " + showing.getShowingID());
        return showingRepository.save(showing);
    }

}



