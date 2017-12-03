package com.dm.web.application;

import com.dm.data.entities.Musician;
import com.dm.data.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/musicians")
public class MusiciansController {

    @Autowired
    MusicianRepository musicianRepository;


    @RequestMapping (method = RequestMethod.GET)
    public String findMusicians(Model model) {
        List<Musician> musicians = new ArrayList<>();
        musicianRepository.findAll().forEach(musicians::add);
        model.addAttribute("musicians", musicians);
        return "musicians";
    }
}
