package com.dentacare.entities;

import java.time.LocalDate;

public class Project {
    private int idProjet;
    private String nomProject;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Project() {
    }

    public Project(String nomProject, int idProjet, String description, LocalDate dateDebut, LocalDate dateFin) {
        this.nomProject = nomProject;
        this.idProjet = idProjet;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getNomProject() {
        return nomProject;
    }

    public void setNomProject(String nomProject) {
        this.nomProject = nomProject;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Project{" +
                "idProjet=" + idProjet +
                ", nomProject='" + nomProject + '\'' +
                ", description='" + description + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}
