package com.niit.dao;

public interface CartItemDao {
  void addCartItem(CartItem cartItem);
  void removeCartItem(int cartItemId);
  public void removeAllCartItem(int cartId);
  public Cart getCart(int cartId);
  
}
