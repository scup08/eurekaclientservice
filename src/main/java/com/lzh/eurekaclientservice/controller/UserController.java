package com.lzh.eurekaclientservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 **/
@RestController
@RequestMapping("/test111")
public class UserController {
	
//    @Autowired
//    private ILoginService loginService;

    @RequestMapping(value= "/user/{id}" ,method = RequestMethod.GET)
    public String getUsers(@PathVariable("id") String id) {
    	System.out.println("id++++++++++++++++++++ " + id);
    	return id;
    }
}
