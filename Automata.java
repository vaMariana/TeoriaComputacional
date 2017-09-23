/*Mariana Ventura Alonso 140264  
Expresión: 1(00*)*
Las características de este programa son que el usuario ingresa una cada con 0 o 1 para verificar si entra en un estado 
válido o no para continuar con el recorrido hasta llegar al estado final
La lógica que se siguió fue leer la cadena para evaluar caracter por caracter para verificar si la cadena entra en un estado
válido o no válido y te dice que la cadena no es válida para la expresión.
*/
package automata;

import java.util.Scanner;

public class Automata {
    int cont;
    char [] car;
    boolean aceptado;

    public static void main(String[] args) {
          
        String cadena;
        Scanner teclado=new Scanner(System.in);
        Automata aut = new Automata();
        cadena=teclado.next();
       
        aut.car = cadena.toCharArray();
        aut.inicio();
        if(aut.aceptado)
             System.out.println("aceptacion");
        else System.out.println("no aceptacion");
    }
   public void inicio(){
           cont =0;
           q0();
   }
   public void q0(){
       aceptado=false;
       System.out.println("En q0");
       aceptado=false;
    if(cont<car.length){
       if(car[cont]=='0'){
            cont++;
            qerror();
       }else if(car[cont]=='1'){
            cont++;
            q1();
       }
    }
   
   }
   public void q1(){
       aceptado=true;
     System.out.println("En q1");
    if(cont<car.length){
       if(car[cont]=='0'){
            cont++;
           q2();
       }else if(car[cont]=='1'){
            cont++;
            qerror();
       }
    }
       
   
   }
   public void q2(){
       
    aceptado=true;
    
    if(cont<car.length){
       
       if(car[cont]=='0'){
            cont++;
            q2();
       }else if(car[cont]=='1'){
            cont++;
            qerror();
            
       }
    }
   
   }

      
   public void qerror(){
   System.out.println("Cadena no válida");
   aceptado = false;
    return;
   }
  

   }