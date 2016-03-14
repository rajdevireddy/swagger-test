package com.test.swaggerTest.bo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by RReddy on 3/10/2016.
 */
public class BusinessObject {

    private static final Logger logger = LogManager.getLogger(BusinessObject.class.getName());

    public int getProduct(int a, int b){
        logger.debug("getProduct invoked with params a={}, b={}",a,b);
        return a*b;
    }
}
