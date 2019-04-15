/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceapp;

/**
 *
 * @author Alex
 */
public class InvoiceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Invoice inv1 = new Invoice ("Part#1", "LCD", 4, 563.53);
        System.out.println("Below is the info about current invoice:");
        System.out.println(inv1.getPartNumber()+" "+inv1.getPartDescription()+ " "+inv1.getQuantity()+" pcs "+inv1.getPrice()+"$");
        System.out.println("Total amount to be paid:"+ inv1.getInvoiceAmount());
               
    }
    
}
