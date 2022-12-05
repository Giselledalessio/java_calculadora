//import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *  Crea una aplicación llamada Calculadora, nos pedirá 2 operandos (int) y un signo aritmético (String),
 *  según este último se realizara la operación correspondiente.
 *  Al final mostrara el resultado en consola.
 *
 * Los signos aritméticos disponibles son:
 *
 * +: suma los dos operandos.
 * -: resta los operandos.
 * *: multiplica los operandos.
 * /: divide los operandos, este debe dar un resultado con decimales (double)
 * ^:  1º operando como base y 2º como exponente.
 * %:  módulo, resto de la división entre num1 y num2.
 * */

public class Calculadora {

    public static void main(String[] args) {

        //Declaracion e instanciacion del objeto scanner
        //Scanner sc = new Scanner(System.in); NO LO UTILIZAMOS MAS
        Icon miIcono = new ImageIcon("calculadora.gif");
        Icon miIcono2 = new ImageIcon("calculadora-120.png");


        //Declaracion de variables
        double num1, num2;
        double resultado=0; // La inicializo en 0
        String operacion, str1, str2;

        //Instrucciones de salida entrada
        //System.out.println("*** Bienvenido a la calculadora matematica ***\n\n");
        JOptionPane.showMessageDialog(null,"*** Bienvenido a la calculadora matematica ***", "Bienvenida",-1,miIcono);

        //System.out.println("Escribe el primer numero");
        //num1=sc.nextDouble();

        str1=(String)JOptionPane.showInputDialog(null, "Escribe el primer numero", "Primer numero", -1, miIcono, null, "");
        num1= Double.parseDouble(str1);


        //Menu
        //System.out.println("Escribe el codigo de operacion\n[+] suma\n[-] resta\n[*] multiplicacion\n[/]division\n[^] potencia\n[%] modulo ");
        //String operacion = sc.next();
        operacion = (String)JOptionPane.showInputDialog(null,"Escribe el codigo de operacion\n[+] suma\n[-] resta\n[*] multiplicacion\n[/]division\n[^] potencia\n[%] modulo ", "Menú", -1, miIcono, null,"");

        //Instruccion salida-entrada
        //System.out.println("Escribe el segundo numero ");
        //num2=sc.nextDouble();

        str2=(String)JOptionPane.showInputDialog(null, "Escribe el segundo número", "Segundo número", -1, miIcono, null, "");
        num2= Double.parseDouble(str2);

        //segun el codigo de operacion, haremos una u otra accion
        switch (operacion){
            case "+":
                resultado=num1+num2;
                break;
            case "-":
                resultado=num1-num2;
                break;
            case "*":
                resultado=num1*num2;
                break;
            case "/":
                resultado=num1/num2;
                break;
            case "^":
                resultado=(int)Math.pow(num1, num2);
                break;
            case "%":
                resultado=num1%num2;
                break;
        }

        //Resultado
        //System.out.println( num1+" "+operacion+" "+num2+" = "+resultado);
        JOptionPane.showMessageDialog(null, num1+" "+operacion+" "+num2+" = "+resultado, "Resultado",-1, miIcono2);

    }
}