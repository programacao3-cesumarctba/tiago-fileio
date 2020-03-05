package com.github.tiagozampieri.main;

import com.github.tiagozampieri.classes.Pessoa;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Pessoa p1 = new Pessoa("Tiago", "tiago@gmail.com", "10/10/2000");
        Pessoa p2 = new Pessoa("Pedro", "pedro@gmail.com", "10/10/2000");
        Pessoa p3 = new Pessoa("João", "joao@gmail", "10/10/2000");


        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        pessoas.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa.getNome() + " | Email: " + pessoa.getEmail() + " | " + pessoa.getDataNascimento());
        });
    }
}
