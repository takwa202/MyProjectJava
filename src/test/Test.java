/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Pharmacien;
import java.sql.Timestamp;
import servise.PharmacienServeces;

/**
 *
 * @author lenovo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * ************************* test pharmacien  *******************************************
         */
        Pharmacien ph = new Pharmacien("NF33", "p1", "adress", 155551, "passs", "mail", 0);
        PharmacienServeces fs = new PharmacienServeces();
        fs.insert(ph);
        //fs.delete(9);
      //  fs.update(ph, 3);
       // System.out.println(fs.FindAll().toString());
      //  System.out.println(fs.FindById(1).toString());
      //  fs.bloqueFARM(1);
      //  System.out.println(fs.hashingFunction("unmotdepasse"));
      //  System.out.println(fs.exist(5));
        
        
        

    }

    
    
    
    
    
    
    
    
    
    
    
      public static Timestamp createdate(int y,int m,int j) {
         
        Timestamp date2 = new Timestamp(y - 1900, m - 1, j, 4, 0, 0, 0);
      
        return date2;
    }

}
