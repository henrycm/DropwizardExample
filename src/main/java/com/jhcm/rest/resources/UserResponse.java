package com.jhcm.rest.resources;

public class UserResponse {

    private long id;
    private String name;

    public UserResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
