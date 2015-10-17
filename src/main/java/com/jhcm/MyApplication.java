package com.jhcm;

import com.jhcm.rest.resources.UserResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MyApplication extends Application<AppConfig> {

    public static void main(String[] args) throws Exception {
        new MyApplication().run(new String[] { "server", "config.yml" });
    }

    @Override
    public void run(AppConfig configuration, Environment environment) throws Exception {
        UserResource ur = new UserResource();
        environment.jersey().register(ur);
    }

}
