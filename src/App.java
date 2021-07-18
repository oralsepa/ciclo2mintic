import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;


EJEMPLO 0*/
/*public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


/* EJEMPLO 1 
Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”. */
/*public class App {
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
}*/


/*EJEMPLO 2
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales. */
/*public class App {
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
}*/


/* EJEMPLO 3*/
/*public class App{
    public static void main(String[] args) throws IOException{
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
}*/


/*EJEMPLO 4
Este programa calcula el perímetro de una circunferencia */
/*public class App{
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
}*/


/*EJERCICIO 5*/
/*public class App{
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
}*/


/*EJERCICIO 6*/
/*public class App02_Unidad_1 {

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
}

// creamos la clase Libro
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
}*/   