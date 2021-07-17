/*
javac EjerciciosOASP.java

javac EjerciciosOASP
*/

/* 
git o github
…or create a new repository on the command line
    echo "# ciclo2" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/oralsepa/ciclo2.git
    git push -u origin main
…or push an existing repository from the command line
    git remote add origin https://github.com/oralsepa/ciclo2.git
    git branch -M main
    git push -u origin main

1.click dercho y "git bash here"
2.add .

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjerciciosOASP {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Por favor diga quien es? ");
        String nombre = sc.nextLine(); //capura de datos usando  Scanner
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Qué quiere? ");
        String accion = br.readLine(); //capura de datos usando  BufferReader
        
        System.out.print ("Hola " + nombre +"!\t");
        System.out.print ("por que quiere? " + accion);

        sc.close();

        /*if (){

        } else if (){

        } else {

        }

        switch (){
            case valor 1:

            break;
            case valor 2:

            break;
            default:

        }

        while (){

        }


        do{
             
        } while();

        for(ini;condicion;incremento){

        }*/
        
    }
}


