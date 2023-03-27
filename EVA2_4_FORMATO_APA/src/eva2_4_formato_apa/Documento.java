package eva2_4_formato_apa;

/**
 *
 * @author Armando Bueno
 */
public class Documento {
    private String author;
    private String title;
    private int year;
    private String month;
    private int day;
    private String city;

    public Documento() {
    }

    public Documento(String author, String title, int year, String month, int day, String city) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.month = month;
        this.day = day;
        this.city = city;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
