package co.develhope.EnVar1.controller;


import co.develhope.EnVar1.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping
    public String sayHello() {

        return basicService.getEnVars();
    }
}
