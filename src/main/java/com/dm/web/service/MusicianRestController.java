package com.dm.web.service;

import com.dm.data.entities.Musician;
import com.dm.data.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class MusicianRestController {

    @Autowired
    private MusicianRepository musicianRepository;

    @RequestMapping(method = RequestMethod.GET, value="/musicians")
    public List<Musician> getAllMusicians() {
        List<Musician> musicians = new ArrayList<>();
        musicianRepository.findAll().forEach(musicians::add);
        return musicians;
    }
}
