/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pixelesbinarios;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class PixelesBinarios {

  public static int laberinto[][];
public static int i,j,n,m;
    public static void ingreso(int a,int b){
           int temp;
        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
                temp=(int)(Math.random()*2+1);                
                if(temp==2)
                    temp=0;                
                laberinto[i][j]=temp;
            }
        }
    }
     public static void imprimir(int a, int b){
        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
               System.out.printf("%2s  \033[31m %d","",laberinto[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Bienvenido Neymar");
        Scanner leer = new Scanner(System.in);
        System.out.println("numero de filas: ");
        n=leer.nextInt();
        System.out.println("numero de columnas: ");
        m=leer.nextInt();
        laberinto=new int[n+1][m+1];
        ingreso(n,m);
        imprimir(n,m);
    }
    
}
