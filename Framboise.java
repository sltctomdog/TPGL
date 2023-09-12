/**
 *
 * @author tom-Shiiir0
 */
public class Framboise {
    private double prix;
    private String origine;

    public Framboise() {
        this.prix = 0.2; // prix en euros
        this.origine = "Maroc";
    }

    public Framboise(double prix, String origine) {
        if (prix < 0)
            this.prix = -prix; // une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if (origine.equals(""))
            this.origine = "Espagne"; // Espagne par défaut
        else
            this.origine = origine;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Framboise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) { // predicat pour tester si 2 framboises sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Framboise f = (Framboise) o;
            return (prix == f.prix && origine.equals(f.origine));
        }
        return false;
    }

    public boolean isSeedless() { // predicat indiquant qu'une framboise a des pepins
        return false;
    }

    public static void main(String[] args) {
        Framboise f = new Framboise();

        System.out.println(f.getOrigine());
        System.out.println(f.getPrix());
        System.out.println(f.toString());
    }
}
