/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author lenovo
 */
public class Interventions {

    private int id_interv;
     private int id_med;
    private int id_patien;
    private Timestamp date_inter;
    private String descriptions;
    private Patient pastient;
    
     public Interventions() {
        
    }
    
//kol
    public Interventions(int id_interv, int id_med, int id_patien, Timestamp date_inter, String descriptions, Patient pastient, Medcin medcin) {
        this.id_interv = id_interv;
        this.id_med = id_med;
        this.id_patien = id_patien;
        this.date_inter = date_inter;
        this.descriptions = descriptions;
        this.pastient = pastient;
        this.medcin = medcin;
    }
    
    
    
    
    

    public int getId_interv() {
        return id_interv;
    }

    public void setId_interv(int id_interv) {
        this.id_interv = id_interv;
    }

    public int getId_med() {
        return id_med;
    }

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public int getId_patien() {
        return id_patien;
    }

    public void setId_patien(int id_patien) {
        this.id_patien = id_patien;
    }

    public Timestamp getDate_inter() {
        return date_inter;
    }

    public void setDate_inter(Timestamp date_inter) {
        this.date_inter = date_inter;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Patient getPastient() {
        return pastient;
    }

    public void setPastient(Patient pastient) {
        this.pastient = pastient;
    }

    public Medcin getMedcin() {
        return medcin;
    }

    public void setMedcin(Medcin medcin) {
        this.medcin = medcin;
    }
    private Medcin medcin;
    

}
