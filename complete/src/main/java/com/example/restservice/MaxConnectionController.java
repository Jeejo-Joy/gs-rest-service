package com.example.restservice;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MaxConnectionController {
    private static final int MAX_REQUESTS_PER_SECOND = 1000;
    private static final long REQUEST_INTERVAL = 1000 / MAX_REQUESTS_PER_SECOND;
    private long lastRequestTime = 0;


    @GetMapping("/max-connections")
    public String handleRequest() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastRequestTime < REQUEST_INTERVAL) {
            throw new TooManyRequestsException();
        }
        lastRequestTime = currentTime;
        System.out.println("max-connections-called");
        return "Hello, world!";
    }

    @PostMapping("/max-connections")
    public SAPOMSAATPResponse handlePostRequest() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastRequestTime < REQUEST_INTERVAL) {
            throw new TooManyRequestsException();
        }
        lastRequestTime = currentTime;
        System.out.println("max-connections-called for POST");

        try {
            Thread.sleep(3000); // 4secs
        } catch (InterruptedException e) {
            // Ignore
        }
        List<ATPItemsResponse> coll = new ArrayList<>();
        ATPItemsResponse res = new ATPItemsResponse(new Product("p1"),10.0,new UnitOfMeasure("EA"), "");
        coll.add(res);
        return new SAPOMSAATPResponse(coll);
    }

    // for slow connection
    @PostMapping("/slow-request-endpoint")
    public SAPOMSAATPResponse handlePostRequestSlowConnection() {

        try {
            Thread.sleep(10000); // 10secs
        } catch (InterruptedException e) {
            // Ignore
        }

        long currentTime = System.currentTimeMillis();
        if (currentTime - lastRequestTime < REQUEST_INTERVAL) {
            throw new TooManyRequestsException();
        }
        lastRequestTime = currentTime;
        System.out.println("max-connections-called for POST");

        List<ATPItemsResponse> coll = new ArrayList<>();
        ATPItemsResponse res = new ATPItemsResponse(new Product("p1"),10.0,new UnitOfMeasure("EA"), "");
        coll.add(res);
        return new SAPOMSAATPResponse(coll);
    }

    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    public static class TooManyRequestsException extends RuntimeException {
        public TooManyRequestsException() {
            super("Too many requests");
        }
    }
}
