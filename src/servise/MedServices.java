/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servise;

import InServise.InterMedServeses;
import entity.Medcin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getBoolean;
import utils.MyDB;

/**
 *
 * @author lenovo
 */
public class MedServices implements InterMedServeses<Medcin> {

    Connection conx;

    //c'est un constructeur !!
    public MedServices() {
        conx = MyDB.getInstance().getConnection();
    }
    /* mdp_med, email_med,date_naissance_med,
     age_med,adresse_med,  genre_med,  nom_med,  prenom_med,
     num_tel_med,  photo_med, spéciatilte*/

    @Override
    public void insert(Medcin med) {
        String req = "INSERT INTO `medecin`(`mdp_med`, `email_med`, `date_naissance_med`, `age_med`, `adresse_med`, `genre_med`,`nom_med`, `prenom_med`, `num_tel_med`, `photo_med`, `spéciatilte`) "
                + "values ('" + med.getMdp_med() + "','" + med.getEmail_med() + "','" + med.getDate_naissance_med() + "','" + med.getAge_med() + "','"
                + med.getAdresse_med() + "','" + med.getGenre_med() + "','" + med.getNom_med() + "','" + med.getPrenom_med() + "','" + med.getNum_tel_med()
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
        }
    }

    @Override
    public void update(Medcin med, int id) {

        /* mdp_med, email_med,date_naissance_med,
         age_med,adresse_med,  genre_med,  nom_med,  prenom_med,
         num_tel_med,  photo_med, spéciatilte*/
        String req = "UPDATE `medecin` SET`mdp_med`='" + med.getMdp_med() + "',`email_med`='" + med.getEmail_med() + "',"
                + "`date_naissance_med`='" + med.getDate_naissance_med() + "',`age_med`='" + med.getAge_med() + "',`adresse_med`='"
                + med.getAdresse_med() + "',`genre_med`='" + med.getGenre_med() + "',`nom_med`='" + med.getNom_med() + "',`prenom_med`='"
                + med.getPrenom_med() + "',`num_tel_med`='" + med.getNum_tel_med() + "',`photo_med`='" + med.getPhoto_med() + "',`spéciatilte`='"
                + med.getSpéciatilte() + "' WHERE id_med= '" + id + "'";

        try {
            Statement st = conx.createStatement();
            st.executeUpdate(req);
            // System.out.println(med); 
            //  System.out.println(req); 
            System.out.println("MEDCIN UPDATED SUCCSEFULY !");
            //  System.out.println(med); 
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String req = "DELETE FROM `medecin`  WHERE id_med= '" + id + "'";

        try {
            Statement st = conx.createStatement();
            st.executeUpdate(req);
                 System.out.println("MEDCIN DELETED SUCCSEFULY !");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
 
        
    }
    
    private ResultSet rs;
    @Override
    public List<Medcin> FindAll() {
    List<Medcin> list =new ArrayList<>();
     String req = "SELECT * From `medecin` ";
         try {
            Statement st = conx.createStatement();
            rs =st.executeQuery(req);
            while(rs.next()){ 
            Medcin e = new Medcin(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getTimestamp(4),rs.getInt(5),rs.getString(6),rs.getString(7),  rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11), rs.getString(12), rs.getInt(13),rs.getInt(14),rs.getBoolean(15),rs.getString(16));
            list.add(e);                
            }
                 System.out.println("MEDCIN DELETED SUCCSEFULY !");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
 return list;
    
    }

    @Override
    public List FindById(int id) {
    List<Medcin> list = new ArrayList<>();
   String req = "SELECT  `id_med`, `mdp_med`, `email_med`, `date_naissance_med`, `age_med`, `adresse_med`, `genre_med`,`nom_med`, `prenom_med`, `num_tel_med`, `photo_med`,`photo_dip`,`nb_rec_med`,`nb_patient`,`is_Blocked`,`spéciatilte` From `medecin` WHERE id_med= '" + id + "' ";
   
    try {
            Statement st = conx.createStatement();
            rs =st.executeQuery(req);
            while(rs.next()){ 
            Medcin e = new Medcin(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getTimestamp(4),rs.getInt(5),rs.getString(6),rs.getString(7),  rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11), rs.getString(12), rs.getInt(13),rs.getInt(14),rs.getBoolean(15),rs.getString(16));
            list.add(e);                
            }
                 System.out.println("MEDCIN FOUND SUCCSEFULY !");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    return list ;
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
