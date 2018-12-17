package com.clement.homeshop.delivery;

public class TakeAwayDelivery implements Delivery
{
    @Override
    public double getPrice()
    {
        return 0;
    }

    @Override
    public String getInfo() {
        return "retrait "+ getPrice();
    }
}
