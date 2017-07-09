package mx.com.isccarrasco.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by mario on 7/9/17.
 */
@Path("/secured")
public class BasicSecuredResource {

    @GET
    @Path("message")
    @Produces(MediaType.TEXT_PLAIN)
    public String securedMethod() {
        return "This API need logins";

    }
}
