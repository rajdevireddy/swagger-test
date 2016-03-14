package com.test.swaggerTest.servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by RReddy on 3/10/2016.
 */
public class AboutMe extends HttpServlet {

    private static final Logger logegr = LogManager.getLogger(AboutMe.class.getName());

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        try {
            PrintWriter writer = response.getWriter();
            writer.append("<HTML>" +
                          "<BODY><H2> This is my Swagger test application. </H2>" +
                          "</BODY>"+
                          "</HTML>");
        } catch (IOException e) {
            response.sendError(123,"Failed");
        }
    }

}
