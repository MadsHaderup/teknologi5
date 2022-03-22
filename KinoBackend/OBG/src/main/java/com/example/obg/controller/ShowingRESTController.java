package com.example.obg.controller;

import com.example.obg.model.Showing;
import com.example.obg.repository.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

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

    @GetMapping("/showingbydate/{date}")
    public List<Showing> getShowingsByDate(@PathVariable Date date){
        return showingRepository.findByShowingDate(date);

    }



}



