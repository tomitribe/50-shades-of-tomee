package org.superbiz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("people")
@Produces(MediaType.APPLICATION_JSON)
public class PeopleResource {
    @GET
    @Path("master")
    public Person master() {
        return new Person("Christian");
    }

    @GET
    @Path("student")
    public Person student() {
        return new Person("Ana");
    }
}
