package io.swagger.api.factories;

import io.swagger.api.StepsApiService;
import io.swagger.api.impl.StepsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:06:06.217Z[GMT]")public class StepsApiServiceFactory {
    private final static StepsApiService service = new StepsApiServiceImpl();

    public static StepsApiService getStepsApi() {
        return service;
    }
}
