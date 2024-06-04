/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu número da Conta: ");
        int numeroAgencia = scan.nextInt();
        
        System.out.println("Informe seu número da Agência: ");
        String agencia = scan.next();
        
        System.out.println("Informe o nome do Cliente: ");
        String nome = scan.next();
        
        System.out.println("Informe o saldo da conta: ");
        double saldo = scan.nextDouble();
        
        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco,"
                + " sua agência é "+ agencia +", conta "+ numeroAgencia +" e seu saldo "+ saldo +" já está disponível para saque");
    }
    
}
