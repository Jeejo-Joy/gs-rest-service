package com.example.restservice;

import java.util.List;

public record SAPOMSAATPResponse(List<ATPItemsResponse> items) {
}

//public class SAPOMSAATPResponse {
//
//    private List<ATPItemsResponse> atpItemsResponse = new ArrayList<>();
//
//    public List<ATPItemsResponse> getAtpItemsResponse() {
//        return atpItemsResponse;
//    }
//
//    public void setAtpItemsResponse(List<ATPItemsResponse> atpItemsResponse) {
//        this.atpItemsResponse = atpItemsResponse;
//    }
//}
