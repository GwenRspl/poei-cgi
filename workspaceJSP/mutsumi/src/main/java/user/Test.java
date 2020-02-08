package user;

import dao.DAOClientJdbc;
import model.Client;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        testClientFindById();
    }

    static void testClientCreate() throws SQLException, ClassNotFoundException {
        Client c = new Client(1,"123","Rspl","Gwen","Vincennes");
        new DAOClientJdbc().create(c);
    }

    static void testClientFindById() throws SQLException, ClassNotFoundException {
        Client c = new DAOClientJdbc().findById(1);
        System.out.println(c);
    }
}
