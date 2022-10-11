/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servise;

import InServise.InterMedServeses;
import InServise.InterPharmServeses;
import entity.Pharmacien;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author lenovo
 */
public class PharmacienServeces  implements InterPharmServeses<Pharmacien> {
     Connection conx;

    //c'est un constructeur !!
    public PharmacienServeces() {
        conx = MyDB.getInstance().getConnection();
    }

    @Override
    public void insert(Pharmacien farm) {
        /*
 String req = "INSERT INTO `pharmacien`(`Id_Pharmacien `, `nom_Pharmacien`, `Prenom_Pharmacien`, `Adress_Pharmacien`, `NumTel_Pharmacien`, `MotDePasse_Pharmacien`,`Email_Pharmacien`, `Blockfarm` ) "
                + "values ('" + farm.getMdp_med() + "','" + med.getEmail_med() + "','" + med.getDate_naissance_med() + "','" + med.getAge_med() + "','"
                + med.getAdresse_med() + "','" + farm.getGenre_med() + "','" + med.getNom_med() + "','" + med.getPrenom_med() + "','" + med.getNum_tel_med()
                + "','" + med.getPhoto_med() + "','" + med.getSpéciatilte() + "')";

        try {
            Statement st = conx.createStatement();
            st.executeUpdate(req);
            // System.out.println(med); 
            //   System.out.println(req); 
            System.out.println("MEDCIN ADDED SUCCSEFULY !");
            //System.out.println(med); 
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }  */  }

    @Override
    public void update(Pharmacien object, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List FindById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List searchByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List searchBySpeciality(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloqueMed(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
