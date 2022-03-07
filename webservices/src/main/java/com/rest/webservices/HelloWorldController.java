package com.rest.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@GetMapping(path = "/hello")
public String helloWorld() {
	return "HelloWorld";
}
@GetMapping(path = "/hello-bean")
public HelloWorldBean helloWorldBean() {
	return new HelloWorldBean("HelloWorld");
}
@GetMapping(path = "/hello/path-variable/{name}")
public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
	return new HelloWorldBean(String.format("HelloWorld, %s",name));
}
}
