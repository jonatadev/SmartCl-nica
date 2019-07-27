package org.uem.clinica.interfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

      public void conexao() throws SQLException {
            try {
                  // Estabele conexão com o banco de dados
                  String databaseUrl = "jdbc:derby://localhost:1527/sample";
                  String user = "sample";
                  String pass = "sample";
                  Class.forName("org.apache.derby.jdbc.ClientDriver");
                  Connection con = null;
                  con = DriverManager.getConnection(databaseUrl, user, pass);
                  //con.close();
            } catch (ClassNotFoundException ex) {
                  System.err.println(ex);
            }
      }
}
