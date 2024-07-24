import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
  
   int num [] = new int[5];
   int cont, i, j, aux;
   for (cont=0; cont<num.length; cont++)
    {System.out.print("Digite o" + (cont+1) + " o número: ");
   num[cont] = entrada.nextInt();
   } 
    
   System.out.println("Os números digitados foram: ");
    for (cont=0; cont<num.length; cont++)
      System.out.println("Posição " + (cont) + " número: " + num[cont]);
    for (i=0; i<num.length; i++)
      for (j=i+1; j<num.length; j++)  {
        if (num[i] > num[j]) {
          aux = num[i];
          num[i] = num[j];
          num[j] = aux;
      }   
    }
      System.out.println("Os números digitados e ordenados são: ");
      for (cont=0; cont<num.length; cont++)
        System.out.println("Posição " + (cont) + " número: " + num[cont]);


      }   
  
  }    