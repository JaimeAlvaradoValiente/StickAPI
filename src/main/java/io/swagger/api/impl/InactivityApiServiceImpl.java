package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.InactivityTime;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:06:06.217Z[GMT]")public class InactivityApiServiceImpl extends InactivityApiService {
    @Override
    public Response getInactivityTime( @NotNull Integer idDevice, SecurityContext securityContext) throws NotFoundException {
        System.out.println("Recibiendo petición para obtener el tiempo de inactividad del usuario");

        if (idDevice == null) {
            System.out.println ("Se ha introducido un dispositivo incorrecto");
            return Response.status(Response.Status.BAD_REQUEST).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "¡Dispositivo incorrecto!")).build();
        }
        else {
            System.out.println("Obteniendo tiempo de inactividad del usuario con el dispositivo " + idDevice);
            InactivityTime time = new InactivityTime();
            time.setHoras(7);
            time.setHoras(20);
            time.setSegundos(56);
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, time.toString())).build();
        }
    }

    @Override
    public Response putInactivityTime(InactivityTime body,  @NotNull Integer idDevice, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
