package edu.iviettech.springbaitap3.domain;


import edu.iviettech.springbaitap3.entity.Product;

public class CartEntity {

    private Product product;
    private int amount = 0;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
