import amontov.dao.ProductsDAO;
import amontov.products.Product;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductsDAO productsDAO = new ProductsDAO();
        productsDAO.add(new Product());
    }
}