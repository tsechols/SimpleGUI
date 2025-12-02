
//import java.util.ArrayList; Might use later for now just work on making product work

class addProductHandler implements FormSubmitHandler{
    Table products;

    public addProductHandler(Table products){
        this.products=products;
    }


    @Override
    public void onSubmit(String[] values) {
        //ToDo: create new product and add to arraylist of products
        //throw new UnsupportedOperationException("Not supported yet.");
        Product product=new Product(values[0], values[1], values[2], values[3]);
        products.addRow(product);
    }
    
}