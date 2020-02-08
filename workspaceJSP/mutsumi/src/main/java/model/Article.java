package model;

import java.util.Objects;

public class Article {
    private int id;
    private String nom;
    private String description;
    private String image;
    private double prix;

    public Article(int id, String nom, String description, String image, double prix) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return id == article.id &&
                Double.compare(article.prix, prix) == 0 &&
                nom.equals(article.nom) &&
                description.equals(article.description) &&
                image.equals(article.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, description, image, prix);
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", prix=" + prix +
                '}';
    }
}
