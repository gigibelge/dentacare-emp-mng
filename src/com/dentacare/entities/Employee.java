package com.dentacare.entities;

import java.time.LocalDate;

public class Employee {

    private int id_employe;
    private String nom_complet;
    private LocalDate date_naissance;
    private String telephone;
    private String email;
    private String poste;
    private LocalDate date_embauche;
    private String specialisation_medicale;
    private int id_service;

    public Employee(){
    }

    public Employee(int id_employe, String nom_complet, LocalDate date_naissance, String telephone,
                    String email, String poste, LocalDate date_embauche, String specialisation_medicale, int id_service){
        this.id_employe = id_employe;
        this.nom_complet = nom_complet;
        this.date_naissance = date_naissance;
        this.telephone = telephone;
        this.email = email;
        this.poste = poste;
        this.date_embauche = date_embauche;
        this.specialisation_medicale = specialisation_medicale;
        this.id_service = id_service;
    }

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public String getSpecialisation_medicale() {
        return specialisation_medicale;
    }

    public void setSpecialisation_medicale(String specialisation_medicale) {
        this.specialisation_medicale = specialisation_medicale;
    }

    public LocalDate getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(LocalDate date_embauche) {
        this.date_embauche = date_embauche;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getNom_complet() {
        return nom_complet;
    }

    public void setNom_complet(String nom_complet) {
        this.nom_complet = nom_complet;
    }

    public int getId_employe() {
        return id_employe;
    }

    public void setId_employe(int id_employe) {
        this.id_employe = id_employe;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id_employe=" + id_employe +
                ", nom_complet='" + nom_complet + '\'' +
                ", date_naissance=" + date_naissance +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", poste='" + poste + '\'' +
                ", date_embauche=" + date_embauche +
                ", specialisation_medicale='" + specialisation_medicale + '\'' +
                ", id_service=" + id_service +
                '}';
    }
}
