package autonomo3.utp.controller;

/**
 * Created by JMitac on 31/03/2016.
 */
public class Product {

    private int productsId;
    private String productsDescription;
    private String productsName;

    /*public Product(int id, String desc, String name) {
        this.productsId = id;
        this.productsDescription = desc;
        this.productsName = name;
    }*/

    public Product(int productsId, String productsDescription, String productsName) {
        this.productsId = productsId;
        this.productsDescription = productsDescription;
        this.productsName = productsName;
    }

    public int getProductsId() {
        return productsId;
    }

    public void setProductsId(int productsId) {
        this.productsId = productsId;
    }

    public String getProductsDescription() {
        return productsDescription;
    }

    public void setProductsDescription(String productsDescription) {
        this.productsDescription = productsDescription;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }
}


