/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Interventions;
import entity.Medcin;
import entity.Pharmacien;
import java.sql.Timestamp;
import servise.InterServices;
import servise.MedServices;
import servise.PharmacienServeces;
import servise.UserServeses;

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
       // fs.insert(ph);
       // fs.delete(9);
       // fs.update(ph, 3);
        //System.out.println(fs.FindAll().toString());
      // System.out.println(fs.FindById(1).toString());
       // fs.bloqueFARM(1);
      // System.out.println(fs.hashingFunction("unmotdepasse"));
        //System.out.println(fs.exist(5));
         /**
         * ************************* test med  *******************************************
         */
        Timestamp date =createdate(2000,1,1);
         Medcin med1 = new Medcin("updated mot de pass","email",date,11,"adree","male","ali","prenommed",555555,"photomed","specialier");
        MedServices ms = new MedServices();
        //ms.insert(med1);
        //ms.delete(3);
        //ms.update(med1,1);
       //System.out.println( ms.FindAll().toString());
        //System.out.println( ms.FindById(1).toString());
        //ms.bloqueMed(1);
        //System.out.println(ms.exist(1));
        //System.out.println(ms.isblocked(1));
       // System.out.println(ms.searchByName("ali"));
       // System.out.println(ms.searchBySpeciality(""));
       
      /**
         * ************************* test inter  *******************************************
         */
        
        InterServices inter = new InterServices();
        Interventions  intrO = new Interventions(1,3,createdate(2000,11,12),"test");
        //inter.insert(intrO);
        //inter.update(intrO,5);
        //inter.delete(6); System.out.println(ms.searchBySpeciality(""));
        //System.out.println(inter.FindAll(1));
       // System.out.println(inter.FindById(1,1));
       // System.out.println(inter.searchByPatientName("dxx", 1));
       System.out.println();

 /**
         * ************************* test metier  *******************************************
         */
       //(onclik ...)
     //  UserServeses us = new UserServeses();
       //us.analyse_Users_Reclamtions_And_Block();
       //System.out.println(us.controleSaisieRegistermail(""));
       // System.out.println(us.controleSaisiepassword(""));
       
        
        

    }

    
    
    
    
    
    
    
    
    
    
    
      public static Timestamp createdate(int y,int m,int j) {
         
        Timestamp date2 = new Timestamp(y - 1900, m - 1, j, 4, 0, 0, 0);
      
        return date2;
    }

}
