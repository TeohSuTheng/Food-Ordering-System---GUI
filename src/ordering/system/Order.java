/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering.system;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Order implements Serializable {
    private String name;
    private String address;
    private String shop;
    private String dish;

    public Order(String name, String address, String shop, String dish) {
        this.shop = shop;
        this.dish = dish;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
    
    
}
