
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // byte = Representa entero de 8 bits , Rango -128 a 127

        byte edad = 25;

        //short = Representa un entenro de 16 bits, Rango -32,768 a 32,767

        short estatura = 180;

        // int = Representa un entero de 32 bits , Rango -2^31 a 2^31-1

        int valor = 500000;

        // long = Representa un entero de 64 bits , Rango  -2^63 a 2^63-1

        long numeroTarjeta = 54145;

        //float = Representa un numero de punto flotante de presicion simple 32 bits

        float numero = 10.5f;

        //double representa un numero de punto flotante de presicion simple de 64 bits

        double gravedad = 9.8;

        //boolean = Representa valor entre true o false (verdadero o falso)

        boolean recibo = true;


        // char  una letra

        char letra = 'A';

        char numeroUnoChar = '9';
        char numeroDosChar = '2';

        char resultadoSumarChar = (char)(numeroUnoChar + numeroDosChar);

        System.out.println("Las suma de Char es : "+resultadoSumarChar);



        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Hola, "+nombre);

        byte numeroUno;
        byte numeroDos;

        final  double PI = 3.1416;

        double radio = 5;

        System.out.println("Ingrese el numero uno en valor byte:  ");
        numeroUno = scanner.nextByte();

        System.out.println("Ingese el numero dos en valor byte:  ");
        numeroDos = scanner.nextByte();




        byte resultadoSuma = (byte) (numeroUno + numeroDos);
        byte resultadoResta = (byte)(numeroUno - numeroDos);
        byte resultadoMultiplicacion = (byte)(numeroUno * numeroDos);
        byte resultadoDivision = (byte)(numeroDos / numeroUno);


        System.out.println("La edad es : "+edad);
        System.out.println("El resultado de la suma es "+resultadoSuma);
        System.out.println("El resultado de la Resta es: "+resultadoResta);
        System.out.println("El resultado de la multiplicacion es : "+resultadoMultiplicacion);
        System.out.println("El resultado de la division es : "+resultadoDivision);





        }


    }
