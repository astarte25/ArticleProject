package controller;


import model.Article;
import model.DataBase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "articleController", value = "/article/*")
public class ArticleController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Article[] articles = DataBase.articles;

        int articleId = Integer.parseInt(req.getPathInfo().substring(1));

        Article article = DataBase.getArticleById(articleId);

        if(article == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/view/error.jsp");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("article", article);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/view/articlePage.jsp");
            dispatcher.forward(req, resp);
        }


    }
}
