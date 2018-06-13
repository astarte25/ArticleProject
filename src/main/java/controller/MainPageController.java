package controller;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import model.Article;
import model.DataBase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="mainPageController", value="/main")
public class MainPageController extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("articles", DataBase.articles);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/index.jsp");

        dispatcher.forward(req, resp);
    }
}
