package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:06:06.217Z[GMT]")public class StepsApiServiceImpl extends StepsApiService {
    @Override
    public Response getSteps( @NotNull Integer idDevice, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        // probando 
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
