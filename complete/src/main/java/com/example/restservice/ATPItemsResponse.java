package com.example.restservice;

public record ATPItemsResponse(Product product, Double quantity, UnitOfMeasure unitOfMeasure, String context) {
}


//public class ATPItemsResponse {
//
//    private static final long serialVersionUID = 1L;
//
//    /** <i>Generated property</i> for <code>ATPItemsResponse.atpProduct</code> property defined at extension <code>sapomsaservices</code>. */
//    @JsonProperty("product") @JsonInclude(JsonInclude.Include.NON_NULL)
//    private Product atpProduct;
//
//    /** <i>Generated property</i> for <code>ATPItemsResponse.quantity</code> property defined at extension <code>sapomsaservices</code>. */
//    @JsonProperty("quantity")  @JsonInclude(JsonInclude.Include.NON_NULL)
//    private Double quantity;
//
//    /** <i>Generated property</i> for <code>ATPItemsResponse.atpUnitOfMeasure</code> property defined at extension <code>sapomsaservices</code>. */
//    @JsonProperty("unitOfMeasure") @JsonInclude(JsonInclude.Include.NON_NULL)
//    private UnitOfMeasure atpUnitOfMeasure;
//
//    /** <i>Generated property</i> for <code>ATPItemsResponse.context</code> property defined at extension <code>sapomsaservices</code>. */
//    @JsonProperty("context")  @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String context;
//
//    public ATPItemsResponse(Product p1, double v, UnitOfMeasure ea, String s) {
//        this.atpProduct=p1;
//        this.quantity=v;
//        this.atpUnitOfMeasure=ea;
//        this.context=s;
//    }
//
//    public Product getAtpProduct() {
//        return atpProduct;
//    }
//
//    public void setAtpProduct(Product atpProduct) {
//        this.atpProduct = atpProduct;
//    }
//
//    public Double getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Double quantity) {
//        this.quantity = quantity;
//    }
//
//    public UnitOfMeasure getAtpUnitOfMeasure() {
//        return atpUnitOfMeasure;
//    }
//
//    public void setAtpUnitOfMeasure(UnitOfMeasure atpUnitOfMeasure) {
//        this.atpUnitOfMeasure = atpUnitOfMeasure;
//    }
//
//    public String getContext() {
//        return context;
//    }
//
//    public void setContext(String context) {
//        this.context = context;
//    }
//}
