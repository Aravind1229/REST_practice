package com.rest.webservices.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@Autowired
private MessageSource messageSource;
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
@GetMapping(path = "/hello-internationalized")
public String helloWorldInternationalized() {
	return messageSource.getMessage("good.morning.message",null,LocaleContextHolder.getLocale());
}
}
