/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Session;
import com.example.demo.repository.SessionRepository;

/**
 * @author balaj
 *
 */
@RestController
@RequestMapping("/session")
public class SessionController {
	
	@Autowired
    private SessionRepository sessionRepository;

    @PostMapping
    public Session save(@RequestBody Session session){
    	return sessionRepository.addSessionData(session);
    }

    @GetMapping("/{id}")
    public Session getSessionData(@PathVariable String id){
        return sessionRepository.getSessionData(id);
    }
}
