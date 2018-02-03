//package mx.com.isccarrasco.servlet;
//
//import mx.com.isccarrasco.domain.Credentials;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
///**
// * Created by mario on 7/19/17.
// */
//@Path("/authentication")
//public class AuthenticationEndpoint {
//
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    public Response authenticateUser(@FormParam("username") String username,
//                                     @FormParam("password") String password) {
//
//        try {
//
//            // Authenticate the user using the credentials provided
//            authenticate(username, password);
//
//            // Issue a token for the user
//            String token = issueToken(username);
//
//            // Return the token on the response
//            return Response.ok(token).build();
//
//        } catch (Exception e) {
//            return Response.status(Response.Status.UNAUTHORIZED).build();
//        }
//    }
//
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response authenticateUser(Credentials credentials) {
//
//        String username = credentials.getUsername();
//        String password = credentials.getPassword();
//
//        // Authenticate the user, issue a token and return a response
//
//        try {
//
//            // Authenticate the user using the credentials provided
//            authenticate(username, password);
//
//            // Issue a token for the user
//            String token = issueToken(username);
//
//            // Return the token on the response
//            return Response.ok(token).build();
//
//        } catch (Exception e) {
//            return Response.status(Response.Status.UNAUTHORIZED).build();
//        }
//    }
//
//    private void authenticate(String username, String password) throws Exception {
//        // Authenticate against a database, LDAP, file or whatever
//        // Throw an Exception if the credentials are invalid
//    }
//
//    private String issueToken(String username) {
//        // Issue a token (can be a random String persisted to a database or a JWT token)
//        // The issued token must be associated to a user
//        // Return the issued token
//
//        return "";
//    }
//
//}
