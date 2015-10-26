/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.examples.jcache.pizzaconnector;

import java.util.List;

/**
 *
 * @author steve
 */
public interface PizzaStoreConnectorI {

    Customer findCustomerById(long ID);

    Order getOrderById(long ID);

    List<Long> getOrderIDsForCustomer(long custID);

    Customer getOrdersForCustomer(long customerID);
    
    void placeOrder(long customerID, long orderID, Order order);
    
    void cancelOrder(long orderID);
    
    void createCustomer(long customerID, Customer customer);
    
}
