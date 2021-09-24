/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author roger
 */
public class Aluno {

    /**
     * @return the a_id
     */
    
    
    
    public Aluno() {
    }

    public Aluno(int a_id, String a_nome, String a_rg, String a_cpf, String a_end, String a_tel, Date a_dtcadastro, int a_ativo) {
        this.a_id = a_id;
        this.a_nome = a_nome;
        this.a_rg = a_rg;
        this.a_cpf = a_cpf;
        this.a_end = a_end;
        this.a_tel = a_tel;
        this.a_dtcadastro = a_dtcadastro;
        this.a_ativo = a_ativo;
    }

    public int getA_id() {
        return a_id;
    }

    /**
     * @param a_id the a_id to set
     */
    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    /**
     * @return the a_nome
     */
    public String getA_nome() {
        return a_nome;
    }

    /**
     * @param a_nome the a_nome to set
     */
    public void setA_nome(String a_nome) {
        this.a_nome = a_nome;
    }

    /**
     * @return the a_rg
     */
    public String getA_rg() {
        return a_rg;
    }

    /**
     * @param a_rg the a_rg to set
     */
    public void setA_rg(String a_rg) {
        this.a_rg = a_rg;
    }

    /**
     * @return the a_cpf
     */
    public String getA_cpf() {
        return a_cpf;
    }

    /**
     * @param a_cpf the a_cpf to set
     */
    public void setA_cpf(String a_cpf) {
        this.a_cpf = a_cpf;
    }

    /**
     * @return the a_end
     */
    public String getA_end() {
        return a_end;
    }

    /**
     * @param a_end the a_end to set
     */
    public void setA_end(String a_end) {
        this.a_end = a_end;
    }

    /**
     * @return the a_tel
     */
    public String getA_tel() {
        return a_tel;
    }

    /**
     * @param a_tel the a_tel to set
     */
    public void setA_tel(String a_tel) {
        this.a_tel = a_tel;
    }

    /**
     * @return the a_dtcadastro
     */
    public Date getA_dtcadastro() {
        return a_dtcadastro;
    }

    /**
     * @param a_dtcadastro the a_dtcadastro to set
     */
    public void setA_dtcadastro(Date a_dtcadastro) {
        this.a_dtcadastro = a_dtcadastro;
    }

    /**
     * @return the a_ativo
     */
    public int getA_ativo() {
        return a_ativo;
    }

    /**
     * @param a_ativo the a_ativo to set
     */
    public void setA_ativo(int a_ativo) {
        this.a_ativo = a_ativo;
    }

    private int a_id; 
    private String a_nome; 
    private String a_rg; 
    private String a_cpf; 
    private String a_end; 
    private String a_tel; 
    private Date a_dtcadastro; 
    private int a_ativo; 
}
