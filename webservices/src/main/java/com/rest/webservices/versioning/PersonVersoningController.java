package com.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersoningController {
@GetMapping("/v1/person")
public PersonV1 personv1() {
	return new PersonV1("Aravind");
}
@GetMapping("/v2/person")
public PersonV2 personv2() {
	return new PersonV2(new Name("Aravind","Avi"));
}
@GetMapping(value="/person/param",params="version=1")
public PersonV1 paramv1() {
	return new PersonV1("Aravind");
}
@GetMapping(value="/person/param",params="version=2")
public PersonV2 paramv2() {
	return new PersonV2(new Name("Aravind","Avi"));
}
@GetMapping(value="/person/header",headers="Hversion=1")
public PersonV1 headerv1() {
	return new PersonV1("Aravind");
}
@GetMapping(value="/person/produces",headers="Hversion=2")
public PersonV2 headerv2() {
	return new PersonV2(new Name("Aravind","Avi"));
}
@GetMapping(value="/person/header",produces="application/vnd.company.app-v1+json")
public PersonV1 produces() {
	return new PersonV1("Aravind");
}
@GetMapping(value="/person/header",produces="application/vnd.company.app-v2+json")
public PersonV2 producesv2() {
	return new PersonV2(new Name("Aravind","Avi"));
}
}
