package com.server.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import com.google.gson.Gson;
//import com.google.gson.JsonObject;

/**
 * Controller class for using information from the server and modifying it
 * @author bbanothu
 *
 */
 
@RestController
public class FunctionController {
    //42.335190,-83.049190
    @ResponseBody
    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public String json(@RequestParam("test") String test ) {
        return test + " was sent to the server successfully";
    }
	
}