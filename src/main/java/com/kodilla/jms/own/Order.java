package com.kodilla.jms.own;

import java.io.Serializable;

/**
 * User: Z6PWA
 * Date: 21.10.2023
 */
public class Order implements Serializable
{
  private static final long serialVersionUID = 4329617004242031635L;
  private int id;
  private int price;

  public Order()
  {
  }

  public Order(int id, int price)
  {
    this.id = id;
    this.price = price;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getPrice()
  {
    return price;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  @Override
  public String toString()
  {
    return "Order{" +
      "id=" + id +
      ", price=" + price +
      '}';
  }
}
