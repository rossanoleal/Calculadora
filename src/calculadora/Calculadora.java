/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ro_ss
 */
public class Calculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double numero;
        double numero2;
        double resultado;
        String operacao;
        boolean sair = false;
        
        do{
            resultado = 0;
            
            System.out.println("-----------------------------------");
            System.out.println("--- CALCULADORA CONSOLE EM JAVA ---");
            System.out.println("-----------------------------------");
            System.out.println("Informe o número da operação a ser calculada: \n Somar - 1 \n Subtrair - 2 \n Multiplicar - 3 \n Dividir - 4 \n Quadrado de um número - 5 \n Opção escolhida:");
            operacao = scanner.next();
                        
            switch(operacao){
                
                case "1":
                    System.out.println("Digite o primeiro número: ");
            numero = scanner.nextDouble();
            
                    System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextDouble();
                    resultado = numero + numero2;
                    break;
                    
                case "2":
                    System.out.println("Digite o primeiro número: ");
            numero = scanner.nextDouble();
            
                    System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextDouble();
                    resultado = numero - numero2;
                    break;
                    
                case "3":
                    System.out.println("Digite o primeiro número: ");
            numero = scanner.nextDouble();
            
                    System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextDouble();
                    resultado = numero * numero2;
                    break;
                    
                case "4":
                    System.out.println("Digite o primeiro número: ");
            numero = scanner.nextDouble();
            
                    System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextDouble();
                    if(numero2 == 0){
                        System.err.println("Não é possivel dividir por zero.");
                    }else{
                        resultado = numero / numero2;
                    }
                    break;
                    
                case "5":
                    System.out.println("Digite o número que será elevado ao quadrado: ");
            numero = scanner.nextDouble();
                    resultado = numero * numero;
                    break;
                    
            }
            
            System.out.println("RESULTADO:" + resultado);
            System.out.println("-----------------------------------");
            System.out.println("Para sair digite: 0 (Zero)\nPara continuar digite outro número:");
            if(scanner.nextInt() == 0){
                sair = true;
            }
        }while(sair == false);
    }
    
}
