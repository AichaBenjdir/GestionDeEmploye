public class Employe extends Personne implements IPoseurDeConge {

    public Employe(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void poserConge(String dateDebut, String dateFin) {
        Conge conge = new Conge(dateDebut, dateFin);
        poserConge(conge);
    }

    @Override
    public void poserConge(Conge conge) {
        listeConges.add(conge);
        System.out.println("Employé " + nom + " a posé un congé : " + conge);
    }
}
