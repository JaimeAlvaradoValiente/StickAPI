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
        System.out.println("Recibiendo petición para ofrecer métricas de actividad");

        if (idDevice == null) {
            System.out.println ("Se ha introducido un dispositivo incorrecto");
            return Response.status(Response.Status.BAD_REQUEST).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "¡Dispositivo incorrecto!")).build();
        }
        else {
            System.out.println("Obteniendo pasos desde es último punto de actividad del dispositivo " + idDevice);
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "32")).build();
        }
    }
}
