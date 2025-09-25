package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    // Na minha maquina o Xampp esta utilizando a porta 3307, mas em Defalt ele utiliza a 3306
    private static final String URL = "jdbc:mysql://localhost:3307/achadosplus";
    private static final String USER = "root";  // usuário padrão
    private static final String PASSWORD = "";   // senha vazia no XAMPP, ajuste se mudou

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // carrega driver
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL não encontrado!", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
