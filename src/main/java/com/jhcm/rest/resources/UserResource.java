package com.jhcm.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

@Path("/users")
public class UserResource {

    @GET
    @Timed
    public UserResponse getUser(@QueryParam("name") Optional<String> name) {
        String fname = (name == null ? "Default" : name.toString());
        return new UserResponse(1, fname);
    }
}
