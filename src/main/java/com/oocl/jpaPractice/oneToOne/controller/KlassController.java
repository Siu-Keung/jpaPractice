package com.oocl.jpaPractice.oneToOne.controller;

import com.oocl.jpaPractice.oneToOne.entity.Klass;
import com.oocl.jpaPractice.oneToOne.entity.Leader;
import com.oocl.jpaPractice.oneToOne.repository.KlassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dylan Wei
 * @date 2018-07-26 21:52
 */
@RestController
@RequestMapping("/oneToOne")
public class KlassController {
    @Autowired
    private KlassRepository klassRepository;

    @GetMapping("/klasses")
    public List<Klass> getAllKlasses(){
        return this.klassRepository.findAll();
    }

    @PostMapping("/klasses")
    public Klass addKlass(@RequestBody Klass klass){
        Leader leader = klass.getLeader();
        if(leader != null)
            leader.setKlass(klass);
        return this.klassRepository.save(klass);
    }

}
