package Lab04.AimsProject.src;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public int getId() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDisc ++;
        this.id = 2026000 + nbDigitalVideoDisc;
    }
    public  DigitalVideoDisc( String title,String category, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDisc ++;
        this.id = 2026000 + nbDigitalVideoDisc;
    }
    public  DigitalVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDisc ++;
        this.id = 2026000 + nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc ++;
        this.id = 2026000 + nbDigitalVideoDisc;
    }
}
