package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {

    static final  String URL= "jdbc:postgresql://localhost:5432/postgres";
    static final  String USER="postgres";
    static final  String PASS="....";

    public static Connection criarConexao()throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection conecta = DriverManager.getConnection(URL,USER,PASS);
        if(conecta!=null){
            System.out.print("Conexão feita com sucesso!!!!");
            return conecta;
        }return null;
    }


}
