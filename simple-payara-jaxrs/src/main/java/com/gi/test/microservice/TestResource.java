package com.gi.test.microservice;

import com.gi.test.microservice.domain.DomainObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 */
@Path("test")
public class TestResource {

    @GET
    @Produces("application/json")
    public DomainObject message() {
        DomainObject pojo = new DomainObject();
        pojo.setMessage("Hello world!");
        pojo.setMillis(System.currentTimeMillis());
        return pojo;
    }

}
