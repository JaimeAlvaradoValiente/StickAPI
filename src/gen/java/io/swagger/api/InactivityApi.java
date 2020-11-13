package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.InactivityApiService;
import io.swagger.api.factories.InactivityApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.InactivityTime;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/inactivity")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:06:06.217Z[GMT]")public class InactivityApi  {
   private final InactivityApiService delegate;

   public InactivityApi(@Context ServletConfig servletContext) {
      InactivityApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("InactivityApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (InactivityApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = InactivityApiServiceFactory.getInactivityApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "obtener el tiempo de inactividad del usuario", description = "Pasando un id del dispositivo se obtiene el tiempo de inactividad del usuario ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "tiempo de inactividad", content = @Content(array = @ArraySchema(schema = @Schema(implementation = InactivityTime.class)))),
        
        @ApiResponse(responseCode = "400", description = "dispositivo incorrecto") })
    public Response getInactivityTime(@Parameter(in = ParameterIn.QUERY, description = "id del dispositivo",required=true) @QueryParam("idDevice") Integer idDevice
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getInactivityTime(idDevice,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    
    @Operation(summary = "actualizar el tiempo de inactividad del usuario", description = "Actualizar el tiempo de inactividad de un determinado dispositivo ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "dispositivo incorrecto"),
        
        @ApiResponse(responseCode = "404", description = "dispositivo no encontrado") })
    public Response putInactivityTime(@Parameter(in = ParameterIn.DEFAULT, description = "Tiempo de inactividad a actualizar" ,required=true) InactivityTime body

,@Parameter(in = ParameterIn.QUERY, description = "id del dispositivo",required=true) @QueryParam("idDevice") Integer idDevice
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putInactivityTime(body,idDevice,securityContext);
    }
}
