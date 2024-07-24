public class Cercle {
    public double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double aire(){
        return this.rayon * this.rayon * Math.PI;
    }

    public double perimetre(){
        return this.rayon * 2 * Math.PI;
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
