package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartItemDaoImpl implements CartItemDao {
   @Autowired
   private SessionFactory sessionFactory;
   public void addCartItem(CartItem cartItem)
   {
	   Session session=sessionFactory.getCurrentSession();
	   session.saveOrUpdate(cartItem);
   }
   public void removeCartItem(int cartItemId)
   {
	   Session session=sessionFactory.getCurrentSession()
	   CartItem cartItem=(CartItem)session.get(Carttem.class,cartItemId);
	   session.delete(cartItem);
   }
   public void removedAllCartItem(int cartId)
   {
	   Session session=SessionFactory.getCurrentSession();
	   Cart cart=(Cart)session.get(Cart.class, cartId);
	   List<CartItem>cartItem=cart.getCartItem();
	   for(CartItem cartItem:cartItems)
	   {
		   session.delete(cartItem);
	   }
   }
   public Cart getCart(int cartId)
    {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class, cartId);
		return cart;
	}

}
