package org.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/main")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
    @GET
    @Path("/quarkus")
    @Produces(MediaType.TEXT_PLAIN)
    public Response hiQuarkus() {
        return Response.ok("Quarkus framework").build();
    }
}