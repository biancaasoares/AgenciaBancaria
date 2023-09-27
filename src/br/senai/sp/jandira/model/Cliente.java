package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome,  endereco;
    private long cpf, rg, telefone;
    Scanner scanner = new Scanner(System.in);

    List<Cliente> listCliente = new ArrayList<>();

    public Cliente pesquisarCliente(long cpf){
        for (Cliente cliente : listCliente) {
            long validaCpf = cliente.getCpf();
            if (validaCpf == cpf){
                return cliente;
            }
        }
        return null;
    }

    public void listarClientes(){
        for (Cliente cliente: listCliente) {
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
        }
    }

    public void adicionarCliente(Cliente cliente){
        listCliente.add(cliente);
    }



    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getRg() {
        return rg;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getTelefone() {
        return telefone;
    }

    public void cadastrarCliente(){

        System.out.println("/-/-/-/-/-/  Cadastro Clinte  /-/-/-/-/-/");
        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Informe seu endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Informe seu CPF: ");
        cpf = scanner.nextLong();
        System.out.print("Informe seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe seu Telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("/-/-/-/-/  Cadastro Finalizado /-/-/-/-/-/");

    }


}