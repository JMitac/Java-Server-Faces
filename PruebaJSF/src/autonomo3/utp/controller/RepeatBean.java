package autonomo3.utp.controller;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by JMitac on 31/03/2016.
 */
@ManagedBean
@RequestScoped
public class RepeatBean {

    private List<Product> products = new ArrayList<Product>();


    public RepeatBean() {
        this.products.add(new Product(1, "JSF 2", "Descripcion"));
        this.products.add(new Product(2, "EclipseLink", "Descripcion"));
        this.products.add(new Product(3, "HTML 5", "Descripcion"));
        this.products.add(new Product(4, "Spring", "Descripcion"));
        this.products.add(new Product(5, "Oracle","asdasd"));
    }
    public String register() {
        return "registrationInfo";
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
