package mx.com.isccarrasco.service.rest;

import mx.com.isccarrasco.domain.Person;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     Service for retrieve the persons data from de database.
 * </p>
 * Created by mario on 21/04/17.
 */
@Path("/persons")
@Singleton
public class PersonService {

    List<Person> persons = new ArrayList<>();

    @PostConstruct
    public void init() {
        persons.add(new Person("Juan", 23, "mx"));
        persons.add(new Person("Pedro", 23, "mx"));
        persons.add(new Person("Alicia", 23, "mx"));
        persons.add(new Person("Carmen", 23, "mx"));

    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response listPerson(@Context SecurityContext sc) {

        return Response.status(Response.Status.OK)
                .entity(persons)
                .type(MediaType.APPLICATION_JSON).build();

    }

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Response insert(Person person) {

        if (person == null) {
            return Response.status(Response.Status.UNSUPPORTED_MEDIA_TYPE)
                    .entity(person)
                    .type(MediaType.APPLICATION_JSON).build();
        }

        persons.add(person);


        return Response.status(Response.Status.OK)
                .entity(person)
                .type(MediaType.APPLICATION_JSON).build();

    }

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/{name}")
    public Response getByName(@PathParam(value = "name") String name) {

        Person result = new Person();

        for (Person p : persons) {
            if (p.getName().equals(name)) {
                result = p;
                break;
            }
        }

        return Response.ok(result, MediaType.APPLICATION_JSON).build();

    }

}
