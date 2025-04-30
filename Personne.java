import java.util.ArrayList;
import java.util.List;

public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected List<Conge> listeConges;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.listeConges = new ArrayList<>();
    }

    public List<Conge> getListeConges() {
        return listeConges;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
