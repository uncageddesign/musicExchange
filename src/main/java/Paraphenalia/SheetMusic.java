package Paraphenalia;

public class SheetMusic extends Accessories{

    private String author;
    private String title;
    private String genre;

    public SheetMusic(String brand, Double boughtPrice, Double sellingPrice, String category, String author, String title, String genre) {
        super(brand, boughtPrice, sellingPrice, category);
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}
