/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servise;

import InServise.InterInterServeses;
import InServise.InterPharmServeses;
import entity.Interventions;
import entity.Medcin;
import entity.Patient;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author lenovo
 */
public class InterServices implements InterInterServeses<Interventions> {

    Connection conx;

    //c'est un constructeur !!
    public InterServices() {
        conx = MyDB.getInstance().getConnection();
        //Blob blob = conx.createBlob();
    }

    @Override
    public void insert(Interventions inter) {

        String req = "INSERT INTO `intervention`(`id_med `,`id_patien`,`date_inter`,`descriptions`)"
                + "values()";

        try {
            Statement st = conx.createStatement();
            st.executeUpdate(req);
            // System.out.println(med); 
            //   System.out.println(req); 
            System.out.println("MEDCIN ADDED SUCCSEFULY !");
            //System.out.println(med); 
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

   

  
 private ResultSet rs;
    @Override
    public List<Interventions> FindAll() {
        List<Interventions> list = new ArrayList<>();
        String req = "SELECT * From `medecin` ";
        try {
            Statement st = conx.createStatement();
            rs = st.executeQuery(req);
            while (rs.next()) {
              //  Interventions e = new Interventions(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getString(16));
              //  list.add(e);
            }
            System.out.println("MEDCIN DELETED SUCCSEFULY !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }
  private static int idm =1 ;

    @Override
    public List<Interventions> FindById(int id) {
       /*   String req = "SELECT`medecin.nom_med`,`medecin.prenom_med`,"
                 + "`medecin.spéciatilte`,`patient.Nom_patient`,`patient.Nom_patient`,`patient.Prénom_patient`,`intervention.date_inter`,`intervention.descriptions`"
                 + " FROM`intervention` JOIN `medecin` ON `intervention.id_med`=`medecin.id_med` JOIN intervention`"
                 + "ON `intervention.id_patien`=`patient.Id_patient` WHERE `intervention.id_med` = 1 ";*/
      
         List<Interventions> list = new ArrayList<>();
         String req = "SELECT`nom_med`,`prenom_med`,"
                 + "`spéciatilte`,`Nom_patient`,`Prénom_patient`,`date_inter`,`descriptions`"
                 + " FROM`intervention` JOIN `medecin` ON intervention.id_med=medecin.id_med JOIN `patient`"
                 + "ON intervention.id_patien=patient.Id_patient WHERE intervention.id_med = "+id+"   ";
        // AND intervention.id_patien = 1

        try {
            Statement st = conx.createStatement();
            rs = st.executeQuery(req);
            while (rs.next()) {
               System.out.println("a one");
                Patient pat = new Patient();
                Medcin  med = new Medcin();
                Interventions inter = new Interventions();
                med.setNom_med(rs.getString("nom_med"));
                med.setPrenom_med(rs.getString("prenom_med"));
                med.setSpeciatilte(rs.getString("spéciatilte"));
                pat.setNom_patient(rs.getString("Nom_patient"));
                pat.setPrénom_patient(rs.getString("Prénom_patient"));
                inter.setDate_inter(rs.getTimestamp("date_inter"));
                inter.setDescriptions(rs.getString("descriptions"));
                inter.setMedcin(med);
                inter.setPastient(pat);
                list.add(inter);
            }
            System.out.println("MEDCIN FOUND SUCCSEFULY !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
     return list;
    }

    @Override
    public void update(Interventions object, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List searchByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List searchBySpeciality(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    