class Product implements Rowable{
    String productName, productCategory, productID;
    // int quantity;
     String productPrice;
    
    public Product(String productName, String productCategory, String productID, String productPrice){
        this.productName=productName;
        this.productCategory=productCategory;
        this.productID=productID;
        this.productPrice=productPrice;
    }

    //public int


    @Override
    public Object[] getRowData() {
        //throw new UnsupportedOperationException("Not supported yet.");
        Object[] productInfo={productName, productCategory, productID, productPrice};
        return productInfo;

    }


}