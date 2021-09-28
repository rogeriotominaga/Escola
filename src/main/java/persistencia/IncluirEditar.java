/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Classes.Aluno;
/**
 *
 * @author roger
 */
public class IncluirEditar {
    
    Aluno objaluno = new Aluno();
    public int Incluir(Aluno objaluno) throws SQLException
    {
        conexao conexao = new conexao();
        int registros;
        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement 
    ("INSERT INTO Aluno (a_nome,a_rg,a_cpf,a_end,a_tel,a_dtcadastro,a_ativo)") + "VALUES (?,?,?,?,?,?,?)")) {
        pstmt.setString(1,objaluno.getA_nome().toUpperCase().trim());
        pstmt.setString(2,objaluno.getA_rg().trim());
        pstmt.setString(3,objaluno.getA_cpf().trim());
        pstmt.setString(4,objaluno.getA_end().trim());
        pstmt.setString(5,objaluno.getA_tel().trim());
        pstmt.setTimestamp(6,new java.sql.Timestamp(objaluno.geta_dtcadastro().getTime()));
        pstmt.setInt(7,objaluno.getA_ativo());
        
        registros = pstmt.executeUpdate();
    }
    PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
    ResultSet rs = pstmtAux.executeQuery();
    int codigo = 0;
    
    if ((registros ==1)&&(rs != null)) {
        rs.next();
        codigo = rs.getInt(1);
        return codigo;
    }
       
}

