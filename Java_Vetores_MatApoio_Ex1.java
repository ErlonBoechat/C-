/*
1) Escreva um programa em Java para ler as notas de uma 
turma e imprimir a média da turma e as notas acima da 
média. O programa deverá pedir, inicialmente, o total de 
notas que serão lidas.
*/

import java.util.Scanner;
public class Vetor {
   public static void main(String[] args) {

    int tNotas=0, c=0;
    float notas[];
    
    Scanner tn = new Scanner(System.in);
    Scanner n = new Scanner(System.in);
   
    
    System.out.print("Total de notas: ");
    tNotas = tn.nextInt();
    
    notas = new float[tNotas]; //vetor inicializado depois do valor de tNotas

    System.out.println("----------------\n");
    
    for(c=0;c<tNotas;c++)
    {
        System.out.print("Digite a "+(c+1)+"a nota: ");
        notas[c] = n.nextFloat();
    }
    
    System.out.println("----------------\n");
    
    for(c=0;c<tNotas;c++)
    {
        System.out.println(notas[c]+"\n");
    }
    
  }
}
