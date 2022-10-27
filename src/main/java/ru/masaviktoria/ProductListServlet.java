package ru.masaviktoria;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/product-list")
public class ProductListServlet extends HttpServlet {
    private  List<Product> productList = new ArrayList<>();


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (int i = 0; i<10; i++){
            Product product = new Product(i, "Product title #" + i, Math.random()*100);
            productList.add(product);
        }
        resp.getWriter().println("<h1>Product list</h1>");
        resp.getWriter().println("<list>");
        for (Product product: productList) {
            resp.getWriter().println("<li>ID: " + product.getId() + " Title: " + product.getTitle() + " Cost: " + product.getCost() + "</li>");
        }
        resp.getWriter().println("</list>");
    }
}
