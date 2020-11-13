package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StepsApiService;
import io.swagger.api.factories.StepsApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


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


@Path("/steps")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:06:06.217Z[GMT]")public class StepsApi  {
   private final StepsApiService delegate;

   public StepsApi(@Context ServletConfig servletContext) {
      StepsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StepsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StepsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = StepsApiServiceFactory.getStepsApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "obtener el número de pasos desde el último periodo de actividad", description = "Pasando un id del dispositivo se obtiene el número de pasos desde el último periodo de actividad ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "número de pasos asociados al dispositivo", content = @Content(schema = @Schema(implementation = Integer.class))),
        
        @ApiResponse(responseCode = "400", description = "dispositivo incorrecto") })
    public Response getSteps(@Parameter(in = ParameterIn.QUERY, description = "id del dispositivo",required=true) @QueryParam("idDevice") Integer idDevice
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSteps(idDevice,securityContext);
    }
}
