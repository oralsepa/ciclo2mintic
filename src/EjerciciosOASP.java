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
    git remote add origin https://github.com/oralsepa/ciclo2mintic.git
    git push -u origin main
…or push an existing repository from the command line
    git remote add origin https://github.com/oralsepa/ciclo2mintic.git
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

        String s1 = "Orlando ";
        String s2 = s1 + "Alberto";
        String s3 = s1 + s2 + " Sedano";

        s3.length(); //longitud de la cadena
        s3.indexOf('s'); //posición de la primera aparición, -1 si no existe
        s3.lastIndexOf('b'); //posición de la última aparición, -1 si no existe
        s3.chartAt(11); //carácter en la posición n
        s3.substring(5,12); //subcadena de la posición n1 a n2-1
        s3.toUpperCase(); //mayúsculas
        s3.toLowerCase(); //minúsculas
        s3.equals(s1); //colmpara las cadenas y devuelve "true" si son iguales
        s3.equalsIgnoreCase(s1); //similar al anterior sin consuderar mayúsculas o minúsculas
        valueOf(2344); //convierte el dato a string
        s3.trim(); //elimina los espacios en blanco de los extremos

        


        
    }
}


