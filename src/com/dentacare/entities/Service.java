package com.dentacare.entities;

public class Service {

    private int id_service;
    private String nom_service;
    private String mission_principale;
    private int id_responsable;

    public Service(){
    // Constructeur sans paramètres
    }

    public Service(int id_service, String nom_service, String mission_principale, int id_responsable){
        this.id_responsable = id_responsable;
        this.nom_service = nom_service;
        this.mission_principale = mission_principale;
        this. id_service = id_service;
    }

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public String getNom_service() {
        return nom_service;
    }

    public void setNom_service(String nom_service) {
        this.nom_service = nom_service;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getMission_principale() {
        return mission_principale;
    }

    public void setMission_principale(String mission_principale) {
        this.mission_principale = mission_principale;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id_service=" + id_service +
                ", nom_service='" + nom_service + '\'' +
                ", mission_principale='" + mission_principale + '\'' +
                ", id_responsable=" + id_responsable +
                '}';
    }
}
