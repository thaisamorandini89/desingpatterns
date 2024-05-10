package singleton;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        try{
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();

            Connection connection = dbConnection.getConnection();

            dbConnection.closeConection();
        } catch (SQLException | ClassNotFoundException e){
            System.err.println("Erro ao obter conexão com o banco de dados: "+e.getMessage());
        }
    }
}
