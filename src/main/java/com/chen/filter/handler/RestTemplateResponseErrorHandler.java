package com.chen.filter.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;

/**
 * Created by cvter on 2017/6/5.
 */
public class RestTemplateResponseErrorHandler extends DefaultResponseErrorHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateResponseErrorHandler.class);

    public void handleError(ClientHttpResponse response) throws IOException {
        HttpStatus statusCode = response.getStatusCode();
        if (HttpStatus.UNAUTHORIZED.value() == statusCode.value()) {

        } else {
            super.handleError(response);
        }
    }
}
