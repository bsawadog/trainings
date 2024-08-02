public class Cercle {

    public double rayon;
    public boolean erreurMessage = false;

    public Cercle(double rayon) {
        validerRayon(rayon);
    }

    public String aire(){
         double aire = Math.PI * Math.pow(this.rayon, 2);
         return erreurMessage?"Impossible de calculer l'aire car le rayon est invalide":Double.toString(aire);
    }

    public String perimetre(){
        double perimetre = this.rayon * 2 * Math.PI;
        return erreurMessage?"Impossible de calculer le périmetre car le rayon est invalide":Double.toString(perimetre);
    }

    public void validerRayon(double rayon){
        if (rayon>0) {
            this.rayon = rayon;
        } else {
            System.out.println("Erreur : Pour créer un cercle, le rayon doit être supérieur à 0");
            this.erreurMessage = true;
        }
    }
}

/**
 * Création d'une class nommée Cercle dont la visiblité est public. Cela veut dire qu'elle peut etre appelée dans n'importe quelle
 * partie du progamme. Elle contient :
 * une proprété de type double pouvant prendre des nombre a virgule et visibilité public;
 * Un conctructeur qui est appelé a chaque fois qu'on crée une instance de la classe Cercle et prend toujours une valeur pour
 * assigner au rayon de l'instance courante.
 * D'une méthode aire() et perimetre() qui sont des méthodes d'instances qui font les calculs et retournent le résultat attendu
 * Cela veut dire qu'a chaque fois qu'on crée une instance de Cercle il faut passer la valeur du rayon. Et au besoin on appelle les
 * methodes d'instance qui font les calculs pour l'instance.
 */
