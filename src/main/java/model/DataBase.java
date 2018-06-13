package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataBase {

    public static Article[] articles = new Article[]{
            new Article(0, "Artykuł 1", "Szkielety 56 dzieci zostały odnalezione przez archeologów" +
                    " w peruwiańskiej prowincji Trujillo. Zdaniem naukowców, dzieci miały być ofiarami rytualnych mordów w okresie" +
                    " państwa Chimu (1100 – 1400 n.e.). Prace wykopaliskowe trwają w tym rejonie od początku maja. Oprócz szkieletów" +
                    " dzieci znaleziono także szczątki 30 młodych lam. Wcześniej - w kwietniu - kilka kilometrów dalej archeolodzy" +
                    " odkryli jeszcze większy masowy grób. Znaleziono tam szczątki ponad 140 dzieci oraz ponad 200 młodych lam.",
                    new Category("tragedia"), LocalDate.of(2018, 06, 8), "../static/img/aricle-foto.jpg"),
            new Article(1, "Artykuł 2", "Pellentesque in ipsum id orci porta dapibus. Vivamus magna justo, lacinia eget consectetur" +
                    " sed, convallis at tellus. Proin eget tortor risus. Praesent sapien massa, convallis a pellentesque nec," +
                    " egestas non nisi. Sed porttitor lectus nibh. Curabitur non nulla sit amet nisl tempus convallis quis ac " +
                    "lectus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit" +
                    " neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula. Curabitur arcu erat, accumsan id imperdiet" +
                    " et, porttitor at sem. Cras ultricies ligula sed magna dictum porta. Proin eget tortor risus. Quisque velit " +
                    "nisi, pretium ut lacinia in, elementum id enim. Curabitur aliquet quam id dui posuere blandit. Lorem ipsum" +
                    " dolor sit amet, consectetur adipiscing elit. Cras ultricies ligula sed magna dictum porta. Curabitur aliquet" +
                    " quam id dui posuere blandit. Donec sollicitudin molestie malesuada. Donec rutrum congue leo eget malesuada." +
                    " Nulla porttitor accumsan tincidunt. Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus." +
                    " Curabitur aliquet quam id dui posuere blandit.", new Category("kultura"), LocalDate.of(2018, 6, 6), "../static/img/92593.jpg"),
            new Article(2, "Artykuł 3", "Donec sollicitudin molestie malesuada. Praesent sapien massa, convallis a pellentesque nec," +
                    " egestas non nisi. Pellentesque in ipsum id orci porta dapibus. Donec rutrum congue leo eget malesuada." +
                    " Quisque velit nisi, pretium ut lacinia in, elementum id enim. Sed porttitor lectus nibh. Vestibulum ante" +
                    " ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor " +
                    "sit amet aliquam vel, ullamcorper sit amet ligula. Donec rutrum congue leo eget malesuada. Vivamus" +
                    " suscipit tortor eget felis porttitor volutpat. Cras ultricies ligula sed magna dictum porta.",
                    new Category("sport"), LocalDate.of(2018, 6, 2), "../static/img/teamsport.jpg"),
            new Article(3, "Artykuł 4", "Donec sollicitudin molestie malesuada. Praesent sapien massa, convallis a pellentesque nec," +
                    " egestas non nisi. Pellentesque in ipsum id orci porta dapibus. Donec rutrum congue leo eget malesuada." +
                    " Quisque velit nisi, pretium ut lacinia in, elementum id enim. Sed porttitor lectus nibh. Vestibulum ante" +
                    " ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor " +
                    "sit amet aliquam vel, ullamcorper sit amet ligula. Donec rutrum congue leo eget malesuada. Vivamus" +
                    " suscipit tortor eget felis porttitor volutpat. Cras ultricies ligula sed magna dictum porta.",
                    new Category("rozrywka"), LocalDate.of(2018, 6, 1), "../static/img/images.jpg"),
            new Article(4, "Artykuł 5", "Donec sollicitudin molestie malesuada. Praesent sapien massa, convallis a pellentesque nec," +
                    " egestas non nisi. Pellentesque in ipsum id orci porta dapibus. Donec rutrum congue leo eget malesuada." +
                    " Quisque velit nisi, pretium ut lacinia in, elementum id enim. Sed porttitor lectus nibh. Vestibulum ante" +
                    " ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor " +
                    "sit amet aliquam vel, ullamcorper sit amet ligula. Donec rutrum congue leo eget malesuada. Vivamus" +
                    " suscipit tortor eget felis porttitor volutpat. Cras ultricies ligula sed magna dictum porta.",
                    new Category("pogoda"), LocalDate.of(2018, 5, 29), "../static/img/pogoda.jpg")

    };

    public static Article getArticleById(int id) {

        for (Article art : articles) {
            if (art.getId() == id) {
                return art;
            }
        }
        return null;
    }

}
