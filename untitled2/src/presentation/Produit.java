package presentation;

import java.io.Serializable;

public class Produit  implements Serializable {

        private int id;
        private String nom;
        private String marque;
        private double prix;
        private String description;
        private int nombre;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public String getMarque() {
            return marque;
        }
        public void setMarque(String marque) {
            this.marque = marque;
        }
        public double getPrix() {
            return prix;
        }
        public void setPrix(double prix) {
            this.prix = prix;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public int getNombre() {
            return nombre;
        }
        public void setNombre(int nombre) {
            this.nombre = nombre;
        }

    }

