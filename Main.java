public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe("Ahmed", "Ben Ali");
        Directeur d1 = new Directeur("Sami", "Trabelsi", 5);

        // Employé pose un congé
        e1.poserConge("2025-06-01", "2025-06-10");
        Conge conge1 = e1.getListeConges().get(0);

        // Directeur valide le congé de l'employé
        d1.validerConge(conge1, e1);

        // Directeur pose un congé (automatiquement validé)
        d1.poserConge("2025-08-01", "2025-08-15");

        // Affichage final
        System.out.println("\nListe des congés de l'employé :");
        for (Conge c : e1.getListeConges()) {
            System.out.println(c);
        }

        System.out.println("\nListe des congés du directeur :");
        for (Conge c : d1.getListeConges()) {
            System.out.println(c);
        }
    }
}
