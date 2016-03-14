package com.test.swaggerTest.services;

import com.test.swaggerTest.bo.BusinessObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by RReddy on 3/10/2016.
 */
@Path("calculator")
@Api(value = "calculator")
public class CalculatorService {

    private static final Logger logger = LogManager.getLogger(CalculatorService.class.getName());

    @GET
    @Path("/product/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    @ApiOperation(value = "Returns the result of multiplication",
                  notes = "Some more additional notes that takes more space to explain that it is a product service")
    public Response getProduct(@PathParam("a") int a, @PathParam("b") int b){
        logger.debug("Calculator Service Invoked - product");

        int product = (new BusinessObject()).getProduct(a,b);
        return Response.ok(product+"").build();
    }
}
