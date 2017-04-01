/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author liamjudge
 */
public class LoyaltyMember implements Customer {

    @Override
    public void customerType() {
        
        System.out.println("This is a loyalty customer!");
    }
    
    
}
