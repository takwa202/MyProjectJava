/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavauser;

import entity.Medcin;
import entity.Pharmacien;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import servise.MedServices;
import servise.PharmacienServeces;
import utils.MyDB;

/**
 *
 * @author lenovo
 */
public class ProjetJavaUser {
    /* Medcin(int id_med, String mdp_med, String email_med, Timestamp date_naissance_med,
     int age_med, String adresse_med, String genre_med, String nom_med, String prenom_med,
     int num_tel_med, String photo_med, int nb_rec_med, int nb_patient, Boolean is_Blocked,String spéciatilte*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //**********************************************************test med *************************************

     // Timestamp date = createdate();
        // TODO code application logic here
        //  MyDB db = new MyDB();
        // Medcin med1 = new Medcin("updated mot de pass","email",date,11,"adree","male","ali","prenommed",555555,"photomed","specialier");
        //   MedServices ms = new MedServices();
        // ms.insert(med1);
        //  ms.update(med1,1);
        //ms.delete(10);
        // List <Medcin> res = ms.FindAll();
        // String res = ms.hashingFunction("hhhh");
        //String res2 = ms.hashingFunction("hhhh");
        // System.out.println("my hashed code is");
        // System.out.println(res);
        //System.out.println(res2);
     // List <Medcin> res = ms.FindById(1);
      //  searchlist(res);
        //System.out.println(res.get(0).getId_med());
        // affichlist(res);
        //**********************************************************test pharm ************************************* 
        Pharmacien farm = new Pharmacien("NF33", "p1", "adress", 155551, "passs", "mail", 0);
        // System.out.println(farm);
        PharmacienServeces fs = new PharmacienServeces();
       // fs.insert(farm);
       // fs.update(farm, 4);
        //fs.delete(1);
        //List <Pharmacien>  res = fs.FindAll();
        List <Pharmacien>  res = fs.FindById(5);
        //ArrayList al1 = new ArrayList();
      //  al1 = (ArrayList) res;
       // System.out.println(res.get(0).getId_Pharmacien());
         System.out.println(res.get(0).getId_Pharmacien());
        

    }

    // about time

    public static void searchlist(List<Medcin> med) {
        // int i = 0;
        for (int j = 0; j < med.size(); j++) {
            if (med.get(j).getId_med() == 1) {
                System.out.println("foundit");
            } else {
                System.out.println("notfoundit");
            }

        }

    }

    public static void affichlist(List<Medcin> med) {
        // int i = 0;
        for (int j = 0; j < med.size(); j++) {

            System.out.println(med.get(j).getId_med());

        }

    }

    public static Timestamp createdate() {
        //  Date date = new Date(1996-1900, 11, 12);  
        Timestamp date2 = new Timestamp(1996 - 1900, 1 - 1, 12, 4, 0, 0, 0);
      // System.out.println(date);
        // System.out.println(date2);
        return date2;
    }

}
