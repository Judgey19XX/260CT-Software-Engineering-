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
public class CustomerFactory {
    
    public Customer getInstance(String str)
    {
        if (str.equals("Standard"))
           return new StandardMember();
        else if (str.equals("Loyalty"));
           return new LoyaltyMember();
        
    }
    
}
