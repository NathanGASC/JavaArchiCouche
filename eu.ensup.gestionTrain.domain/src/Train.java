public class Train {
    private int id;
    private float vitesseMax;
    private String couleur;
    private int nbrWagon;
    private int nbrPassager;
    private String typeTrain;

    public Train(int id, float vitesseMax, String couleur, int nbrWagon, int nbrPassager, String typeTrain){
        this.setId(id);
        this.setVitesseMax(vitesseMax);
        this.setCouleur(couleur);
        this.setNbrWagon(nbrWagon);
        this.setNbrPassager(nbrPassager);
        this.setTypeTrain(typeTrain);
    }

    public String getCouleur() {
        return couleur;
    }
    public int getId() {
        return id;
    }
    public int getNbrPassager() {
        return nbrPassager;
    }
    public int getNbrWagon() {
        return nbrWagon;
    }
    public String getTypeTrain() {
        return typeTrain;
    }
    public float getVitesseMax() {
        return vitesseMax;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNbrPassager(int nbrPassager) {
        this.nbrPassager = nbrPassager;
    }
    public void setNbrWagon(int nbrWagon) {
        this.nbrWagon = nbrWagon;
    }
    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }
    public void setVitesseMax(float vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    
    @Override
    public String toString() {
        return this.id+"";
    }
}
