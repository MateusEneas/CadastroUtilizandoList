package projeto1.application;


import projeto1.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Qual seu email: ");
        String email = sc.next();
        System.out.print("Qual seu genero (M/F): ");
        String genero = sc.next();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.next();

        Pessoa pessoa = new Pessoa(nome, email, genero, cpf);
        pessoa.addCadastro(pessoa);

        System.out.println("Irá cadastrar mais quantas pessoas? (0-999)");
        int continuarCadastro = sc.nextInt();

        for (int i = 0; i<continuarCadastro; i++){
            System.out.print("Digite seu nome: ");
            sc.nextLine();
            String nome1 = sc.nextLine();
            System.out.print("Qual seu email: ");
            String email1 = sc.next();
            System.out.print("Qual seu genero (M/F): ");
            String genero1 = sc.next();
            System.out.print("Digite seu CPF: ");
            String cpf1 = sc.next();
            Pessoa pessoa1 = new Pessoa(nome1, email1, genero1, cpf1);
            pessoa.addCadastro(pessoa1);
        }

        for (Pessoa s: pessoa.getCadastros() ) {
            System.out.println(s);
        }

        sc.close();
    }
}
