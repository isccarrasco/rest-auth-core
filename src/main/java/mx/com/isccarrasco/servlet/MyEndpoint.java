//package mx.com.isccarrasco.servlet;
//
//import mx.com.isccarrasco.filter.Secured;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.SecurityContext;
//import java.security.Principal;
//
///**
// * Created by mario on 7/19/17.
// */
//@Path("/")
//public class MyEndpoint {
//
//    @Context
//    SecurityContext securityContext;
//
//    @GET
//    @Path("{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response myUnsecuredMethod(@PathParam("id") Long id) {
//        // This method is not annotated with @Secured
//        // The authentication filter won't be executed before invoking this method
//
//        //System.out.println("Unsecured ");...
//
//        return Response.status(Response.Status.OK).entity("Unsecured resource").build();
//    }
//
//    @DELETE
//    @Secured
//    @Path("{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response mySecuredMethod(@PathParam("id") Long id) {
//        // This method is annotated with @Secured
//        // The authentication filter will be executed before invoking this method
//        // The HTTP request must be performed with a valid token
//
//        //...
//
//        return Response.status(Response.Status.OK).entity("Secured resource").build();
//
//
//    }
//
//    @GET
//    @Secured
//    @Path("{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response myMethod(@PathParam("id") Long id,
//                             @Context SecurityContext securityContext) {
//
//        Principal principal = securityContext.getUserPrincipal();
//        String username = principal.getName();
//        //...
//
//        return Response.status(Response.Status.OK).entity("Secured resource, getting user").build();
//    }
//
//}
