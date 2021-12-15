package com.example;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Slf4j
@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        log.error("OK");
        return "Hello RESTEasy";
    }
}