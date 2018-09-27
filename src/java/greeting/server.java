/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Data;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Isma
 */
@Path("/")
public class server {

    @GET
    @Path("/")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response test() throws JSONException {
     Data data= new Data(1, "Hello, Mundo!");
        return Response.status(200).entity(data.ToJSON().toString()).build();
    }
    
    @GET
    @Path("/{name}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response test( @PathParam("name")String name) throws JSONException {
         Data data= new Data(1, "Hello, "+name+"!");
        return Response.status(200).entity(data.ToJSON().toString()).build();
    }
   

}
