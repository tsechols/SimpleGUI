
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
        App inventory=new App("Inventory System");

        Page dashBoardPage=inventory.addPage("Dashboard");
        Page productPage=inventory.addPage("Products");
        Page addProductPage=inventory.addPage("Add Product");
       // Page changeProductPage=inventory.addPage("Change Product"); Want to add but not required

        ArrayList products=new ArrayList();

        String[] colNames={"Name", "ID", "Category", "Quantity", "Price"};
        Table allProductTable=new Table(colNames, products);

        addProductHandler addProductHandler=new addProductHandler(allProductTable);

        Form addProductForm=new Form(colNames, "Add Product", addProductHandler);

        productPage.addComponent(allProductTable);  
        addProductPage.addComponent(addProductForm);



        inventory.show();
    }
}



class Dashboard{
    Table products;
    Page dashBoardPage;
    Panel aPanel, bPanel, cPanel;
    
    
    public Dashboard(Table products, Page dashBoardPage){
        this.products=products;
        this.dashBoardPage=dashBoardPage;
        aPanel=new Panel(2, 1, 10, 10);
        bPanel=new Panel(1, 3, 10, 10);
        cPanel=new Panel(1, 2, 10, 10);
        aPanel.add(bPanel);
        aPanel.add(cPanel);
        this.dashBoardPage.addComponent(aPanel);
    }

    public void update(){
        StatCard total=new StatCard("Total Products", 
        String.valueOf(products.getRowCount()));
        int inStock=0, noStock=0;

        // for(Object item:products.getTableData()){
        //     Product product=(Product)item;
        //     if(product.status.equals("In Stock"))
        //         inStock++;
        //     else if (product.status.equals("Out of Stock"))
        //         noStock++;    
        }
        
       //    StatCard 
}

class Model {
    ArrayList products;
    Chart categoryChart, quantityChart;
    StatCard numProducts, valueProducts;

    public Model(){

    }


}

class View {
    App app;
    Model model;

    public View(App app, Model model){
        this.app=app;
        this.model=model;    
    }

    //update charts/statcards when data added/edited
    void update() {

    }
}
