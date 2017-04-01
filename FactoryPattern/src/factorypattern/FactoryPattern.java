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
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String a[]) {
        
        CustomerFactory osf = new CustomerFactory();
        Customer obj = osf.getInstance("Loyalty");
        obj.customerType();
       
    }
    
}
