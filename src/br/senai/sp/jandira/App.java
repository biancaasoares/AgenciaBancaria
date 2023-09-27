package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Menu;

import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("/// -----  Bem Vindo ao Banco do Senai  ------  ///");

        Menu menu = new Menu();
        menu.executarMenu();

    }
}
