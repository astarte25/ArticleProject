package model;

import sun.util.calendar.LocalGregorianCalendar;

import java.time.LocalDate;
import java.util.Date;

public class Article {

    private int id;
    private String name;
    private String articleText;
    private LocalDate date;
    private Category category;
    private String img;

    public Article() {
    }

    public Article( int id, String name, String articleText, Category category, LocalDate date, String img) {
        this.name = name;
        this.articleText = articleText;
        this.category = category;
        this.date = date;
        this.img = img;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
