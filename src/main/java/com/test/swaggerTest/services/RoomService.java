package com.test.swaggerTest.services;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by RReddy on 3/11/2016.
 */
@Path("/room")
@Api(value = "roomService")
public class RoomService {

    @GET
    @Path("/{id}")
    @Produces
    @ApiOperation(value="Get a room by ID")
    public Response getRoom(@PathParam("id") String id){

        return Response.ok("Take your room").build();
    }
}
