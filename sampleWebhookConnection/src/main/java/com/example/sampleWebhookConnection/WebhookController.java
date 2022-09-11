package com.example.sampleWebhookConnection;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {
    @RequestMapping(value="/welcome",method= RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }

    @RequestMapping(value="/webhook",method= RequestMethod.GET)
    public String web(@RequestParam String name, @RequestParam Long age){

        return "welcome to webhook My Name is"+name+".I am "+age+"year's old";
    }
    @RequestMapping(value="/webhook",method= RequestMethod.POST)
    public String web1(@RequestParam String name,@RequestParam Long age){

        return "welcome to webhook My Name is"+name+".I am "+age+"year's old";
    }

}
