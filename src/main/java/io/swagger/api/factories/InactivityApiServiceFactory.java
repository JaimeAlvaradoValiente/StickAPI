package io.swagger.api.factories;

import io.swagger.api.InactivityApiService;
import io.swagger.api.impl.InactivityApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:06:06.217Z[GMT]")public class InactivityApiServiceFactory {
    private final static InactivityApiService service = new InactivityApiServiceImpl();

    public static InactivityApiService getInactivityApi() {
        return service;
    }
}
