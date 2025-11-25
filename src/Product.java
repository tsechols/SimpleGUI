class Product implements Rowable{
    String productName, productCategory, productID;
    int quantity;
    double productPrice;
    
    public Product(String productName, String productCategory, String productID){
        this.productName=productName;
        this.productCategory=productCategory;
        this.productID=productID;
    }

    //public int


    @Override
    public Object[] getRowData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}