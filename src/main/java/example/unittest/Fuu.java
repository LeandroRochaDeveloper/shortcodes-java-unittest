package example.unittest;

import java.time.LocalDate;

public class Fuu {
    private String name;
    private float price;
    private LocalDate reelaseDate;

    public Fuu() { }

    public Fuu(String name, float price, LocalDate reelaseDate) {
        this.name = name;
        this.price = price;
        this.reelaseDate = reelaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getReelaseDate() {
        return reelaseDate;
    }

    public void setReelaseDate(LocalDate reelaseDate) {
        this.reelaseDate = reelaseDate;
    }
}
