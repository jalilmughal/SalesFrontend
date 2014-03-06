/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.sales.contract;

import javax.ejb.Remote;

/**
 *
 * @author RidvanGurel
 */
@Remote
public interface SalesManager {

    String sayHello(String name);

    String sayHelloTo(String email);
    
}
