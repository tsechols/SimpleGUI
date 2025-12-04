class Product implements Rowable{
    String productName, productCategory, productID;
     int quantity;
     double productPrice;
    
    
    public Product(String productName, String productCategory, String productID, int quantity, double productPrice){
        this.productName=productName;
        this.productCategory=productCategory;
        this.productID=productID;
        this.productPrice=productPrice;
        this.quantity=quantity;
    }

    //public int


    @Override
    public Object[] getRowData() {
        //throw new UnsupportedOperationException("Not supported yet.");
        Object[] productInfo={productName, productCategory, productID, quantity, productPrice};
        return productInfo;

    }


}