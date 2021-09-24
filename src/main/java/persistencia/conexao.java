/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;


/**
 *
 * @author roger
 */
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexao {
    
public static String base="escola";

    private static Connection conexao;
    public conexao()
    { try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        String url = "jdbc:odbc:myodbc;database="+base+"user=;password=";
        
        conexao = DriverManager.getConnection(url);
        System.out.println("conexao ok");
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
            "Ocorreu um erro de conexao. Verifique a base de dados indicada !"+"\n" + erro.getLocalizedMessage());
            erro.printStackTrace();
        }
    }
    public Connection getConexao()
    {
        return conexao;
    }
}
