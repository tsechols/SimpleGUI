
//import java.util.ArrayList; Might use later for now just work on making product work

class addProductHandler implements FormSubmitHandler{
    Table products;

    public addProductHandler(Table products){
        this.products=products;
    }


    @Override
    public void onSubmit(String[] values) {
        //ToDo: create new product and add to arraylist of products
        
        //Change array later, have int and double for quantity and price (Good now)
        Product product=new Product(values[0], values[1], values[2], Integer.parseInt(values[3]), Double.parseDouble(values[4]) );
        products.addRow(product);
    }
    
}