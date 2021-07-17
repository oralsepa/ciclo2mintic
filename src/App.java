import java.util.Scaner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


/* EJEMPLO 1 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”. */

public class App {
    public static void main(String[] args) throws Exception {
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese el primer número:");
        String strNum1 = buffer.readLine();
        Integer num1 = Integer.parseInt(strNum1);

        System.out.println("Ingrese el segundo número:");
        String strNum2 = buffer.readLine();
        Integer num2 = Integer.parseInt(strNum2);
        
        Integer suma1 = (num1 + num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma1);

        if (num1 >= num2){
            Integer resta1 = (num1 - num2);
            System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + resta1);

        } else {
            Integer resta1 = (num2 - num1);
            System.out.println("La resta de " + num2 + " y " + num1 + " es igual a " + resta1);
        }
        
        if (num1 >= num2){
            if (num2 !=0){
                Integer division1 = (num1 / num2);
                System.out.println("La división de " + num1 + " y " + num2 + " es igual a " + division1);

            } else {
                System.out.println("La división no puede hacerse porque el divisor es igual a cero");
            }
        
        } else {
            if (num1 !=0){
                Integer division1 = (num2 / num1);
                System.out.println("La división de " + num2 + " y " + num1 + " es igual a " + division1);

            } else {
                System.out.println("La división no puede hacerse porque el divisor es igual a cero");
            }
        }

        Integer producto1 = (num1 * num2);
        System.out.println("El producto de " + num1 + " y " + num2 + " es igual a " + producto1);

        
    }
}



/*EJEMPLO 2*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales. */

public class App {
    public static void main(String[] args) throws Exception {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        //Capta la información del nombre del alumno//
        System.out.println("Ingrese el nombre del alumno: ");
        String strName1 = buffer.readLine();

        //Capta las notas del alumno//
        System.out.println("Ingresa la nota 1 del alumno: ");
        String strNota1 = buffer.readLine();
        Float Nota1 = Float.parseFloat(strNota1);

        System.out.println("Ingresa la nota 2 del alumno: ");
        String strNota2 = buffer.readLine();
        Float Nota2 = Float.parseFloat(strNota2);

        System.out.println("Ingresa la nota 3 del alumno: ");
        String strNota3 = buffer.readLine();
        Float Nota3 = Float.parseFloat(strNota3);

        //Genera el promedio de las notas//
        Float promedio = ((Nota1 + Nota2 + Nota3)/3);

        System.out.println("El promedio obtenido es de :" + promedio);

        
        if (promedio >= 3.0){
            System.out.println("El alumno " + strName1 + " está aprobado");

        } else {
            System.out.println("El alumno " + strName1 + " está reprobado");
        }
    }
}



/* EJEMPLO 3*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.graalvm.compiler.lir.alloc.lsra.LinearScan;

import java.io.IOException;

public class Lectura {

    public static void main(String[] args) throws IOException{


        /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Por favor introduzca un texto:");
		String x = br.readLine();
		System.out.println("Hola " + x); */

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String fn = sc.nextLine();
        String[] fn1 = fn.split("/");
        System.out.println(fn1[0]);
        int dia = Integer.parseInt(fn1[0]);
        //System.out.println(dia);
        int mes = Integer.parseInt(fn1[1]);
        //System.out.println(mes);
        int anio = Integer.parseInt(fn1[2]);
        //System.out.println(anio);
        var sum = dia + mes + anio;
        System.out.println(sum);

        var ns = 0;
        while(sum > 0){
            ns = ns + sum % 10;
            sum /= 10;

        }
        System.out.println("Su numero de la suerte es: " + ns);

    }

    private static void split(String fn) {
    }

    
}



/*EJEMPLO 4*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Este programa calcula el perímetro de una circunferencia */

public class PerimetroCircunferencia {
       public static void main(String[] args) throws IOException{
           
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        //Declaración de PI y la variable perímetro
        final double PI = 3.1415926536;
        Double perimetro;

        //Solicita el ingreso del valor del radio
        System.out.println("Ingrese el radio de la circunferencia: ");
        String strRadio = buffer.readLine();

        //Convierte el valor de cadena de caracteres (string) a double
        Double radio = Double.parseDouble(strRadio);
  
        //Calcula el perímetro
        perimetro = 2.0 * PI * radio;

        //Muestra el resultado
        System.out.println("El perímetro de la circunferencia de radio " + radio + " es " + perimetro);
        
    }
}


/*EJERCICIO 5*/
[7:37 p. m., 1/7/2021] OrlandoSedano: import java.util.Scanner;

public class EjercicioEnClase2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        String nombre = Sc.nextLine();

        System.out.println("Ingrese la primera nota del alumno: ");
        double Nota1 = Sc.nextDouble();
     
        System.out.println("Ingrese la segunda nota del alumno: ");
        double Nota2 = Sc.nextDouble();

        System.out.println("Ingrese la tercera nota del alumno: ");
        double Nota3 = Sc.nextDouble();

        double promedio = (Nota1 + Nota2 + Nota3)/3;

        if (promedio >= 3.0 ) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
        Sc.close();
    }  
}


/*EJERCICIO 6*/
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite el numero 1: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite el numero 2: ");
        int num2 = entrada.nextInt();
        int suma = num1 + num2;
        int resta = num1- num2;        
        int multiplica = num1 *num2;
        System.out.println("La suma de " + num1 + " y " + num2 +" es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 +" es: "+ resta);
        System.out.println("La multiplicacion" + num1 + " y " + num2 +" es: " + multiplica);
        try{
            float division = num1 / num2;
            System.out.println("La division de "+ num1 + " y " + num2 +" es: " + division);
        }catch(Exception e){
            System.out.println("no es posible dividir entre 0");
        }
        entrada.close();
    }
}


/*EJERCICIO 7*/
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor Ingrese el Nombre del Alumno: ");
        String nomAlumno = entrada.nextLine();
        float promedio = 0;
        for(int i = 1; i<=3;i++){        
            System.out.println("Por favor Ingrese la nota de la evaluación n°"+i);
            float notaEvaluacion = entrada.nextFloat();
            promedio += notaEvaluacion;
        }
        promedio= promedio /3;
        System.out.println("El estado del Alumno " + nomAlumno+  " Con el promedio " + promedio + " es "+ (promedio>=3? "Aprobado":"Reprobado"));
        entrada.close();
    }
}



/*EJERCICIO 8*/
import java.util.Date;
import java.util.GregorianCalendar;

public class A02_Unidad_1 {

 public static void main(String[] args) {
  
  // Instanciamos 3 objetos de la clase Libro
  Libro libro_001 = new Libro("Amarte mas no pude", 85000, 2017, 04, 22);
  Libro libro_002 = new Libro("Ahogado en el código", 95000, 1995, 06, 2);
  Libro libro_003 = new Libro("Marte mi nuevo hogar", 10500, 2002, 03, 15);
  // Creamos un array
  Libro[] biblioteca = new Libro[3];
  // Asignamos los objetos en cada idice
  biblioteca[0] = libro_001;
  biblioteca[1] = libro_002;
  biblioteca[2] = libro_003;
  
  // Utilizamos un for para incrementar el iva y ejecutar los metodos
  for (Libro i: biblioteca) {
   i.setPrecioConIva(0.9);
   System.out.println("Libro 001: " + i.getNombre());
   System.out.println("Fecha de Edicion: " + i.getFecha());
   System.out.println("Valor con IVA: $" + i.getValor());
   System.out.println();
  }  

 }
 
} // creamos la clase Libro
 class Libro {
  // creamos sus atributos
  private String nombre;
  private double valor;
  private Date fecha;
  
  public Libro(String nombre, double valor, int año, int mes, int dia) {
   
   this.nombre = nombre;
   this.valor = valor;
   GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
   fecha = calendario.getTime();
   
  }
  // Metodo que devuelve nombre
  public String getNombre() {
   return nombre;
  }
  // metodo que devuelve valor
  public double getValor() {
   return valor;
  }
  // metodo que devuelve fecha
  public Date getFecha() {
   return fecha;
  }
  // metodo que calcula el precio con iva
  public void setPrecioConIva(double porcentaje) {
   double precioTotal = valor*porcentaje/100;
   valor += precioTotal;
  }
  
 }



 /*EJERCICIO 9*/
 Realizar el ejercicio en el que se ingrese 4 notas del alumno, mostrar el promedio de las 4 notas e indicar si está APROBADO caso contrario NO APROBADO.
float n1,n2,n3,n4;
       float promedio;
       
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingrese la nota 1: ");
        n1 = entrada.nextFloat();
        
        System.out.println("Ingrese la nota 2: ");
        n2 = entrada.nextFloat();
        
        System.out.println("Ingrese la nota 3: ");
        n3 = entrada.nextFloat();
        
        System.out.println("Ingrese la nota 4: ");
        n4 = entrada.nextFloat();
        
        promedio = (n1+n2+n3+n4) / 4;
        
        if(promedio >= 0 && promedio < 3){
            
            System.out.println("reprobó");
        }
        
        else if(promedio >= 3 && promedio <= 5){
            
            System.out.println("aprobó");
        }
        
        else{
            System.out.println("error en el promedio");
            
        }
        
        System.out.println("El promedio es: "+promedio);



/*EJERCICIO 10*/
Realizar el ejercicio que muestre el nombre del cliente y la cantidad de artículos comprados, si la cantidad es menor de 5 pagara en efectivo, si es mayor de 5 y menor de 12 pagara con tarjeta, si es mayor de 13 pagara con cheque.
String nombre;
     int cantidad;
     
     Scanner entrada = new Scanner(System.in);
     
        System.out.println("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        
         System.out.println("Digite la cantidad de productos ");
        cantidad = entrada.nextInt();
        
        if(cantidad > 0 && cantidad < 5){
            
            System.out.println("EFECTIVO");
                        
        }
        
        else if(cantidad >= 5 && cantidad <= 12){
               System.out.println("TARJETA");
    }
        
         else if(cantidad >= 13){
               System.out.println("CHEQUE");
    }
         else{
             
             System.out.println("ERROR DE COMPRA");
             
         }



/*EJERCICIO 11*/
package mision;

import java.util.Scanner;

public class B01_Unidad_2_1 {

 public static void main(String[] args) {
  
  Carro vehiculo_01 = new Carro();
  
  Scanner entrada;
  entrada = new Scanner(System.in);
  
  System.out.println("\n-- Concesionario los coches --\n");
  System.out.print("Ingrese el nombre del vehiculo: ");
  String nombre = entrada.nextLine();
  System.out.print("Ingrese la marca del vehiculo: ");
  String marca = entrada.nextLine();
  System.out.print("Ingrese el modelo del vehiculo: ");
  int modelo = entrada.nextInt();
  
  vehiculo_01.setNombre(nombre);
  vehiculo_01.setMarca(marca);
  vehiculo_01.setModelo(modelo);
  
  System.out.println(vehiculo_01.getDatos());
  
  entrada.close();

 }

}
class Carro{
 
 private String nombre;
 private String marca;
 private int modelo;
 
 public Carro() {
  
 }
 
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }
 public void setMarca(String marca) {
  this.marca = marca;
 }
 public void setModelo(int modelo) {
  this.modelo = modelo;
 }
 public String getDatos() {
  return "El vehiculo "  + this.nombre + " " + this.marca + " del año " + this.modelo + " esta disponible.";
 }
}

/*EJERCICIO 12*/
CREATE TABLE Dept (
 ID INTEGER NOT NULL PRIMARY KEY,
 Name VARCHAR(25) NOT NULL 
);

create table productos(
idproducto int primary key identity(1,1) ,
nomproducto varchar(40) not null,
precio money not null,
fechaAlta date not null
);

create table pedidos_lineas(
 idpedidolinea int primary key identity(1,1),
 id_pedido int not null,
 cantidad int not null,
 id_producto int not null,
 CONSTRAINT FK_pedlinea FOREIGN KEY (id_pedido)
    REFERENCES pedidos(idpedido),
 CONSTRAINT FK_pedproducto FOREIGN KEY (id_producto)
    REFERENCES productos(idproducto)
);


/*EJERCICIO 13*/
Tipos de datos
    boolean
    byte
    char
    short
    int
    long
    float
    double

Caracteres
    \t tabulador
    \b backspace (retroceso)
    \n nueva linea
    \r retorno de Carro
    \f salto de linea 
    \´ comilla simple
    \" comilla doble
    \\ barra invertida

System.out.println(x);
System.out.print(x);
