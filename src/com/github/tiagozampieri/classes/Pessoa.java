package com.github.tiagozampieri.classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Pessoa {
    private String nome;
    private String email;
    private Date dataNascimento;
    private Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$");

    public static void main(String[] args) {
    }

    public Pessoa(
            String nome,
            String email,
            String dataNascimento
    ) throws ParseException {
        setNome(nome);
        setEmail(email);
        setDataNascimento(dataNascimento);
    }

    private boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = isEmailValid(email) ? email : "email inválido";
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        String data = dataNascimento.replaceAll("/", "-");
        String pattern = "yyyy-dd-mm";
        DateFormat formatter = new SimpleDateFormat(pattern);
        Date dataNasc = formatter.parse(data);
        this.dataNascimento = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento.toString();
    }
}
