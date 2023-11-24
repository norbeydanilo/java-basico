package EstructurasControl;
import java.util.Scanner;

public class Condicionales {
        public static void main(String[] args) throws Exception {
                /*
                 * Condicional Simple
                 * Como su nombre indica, es la estructura condicional más sencilla en
                 * Java. La usaremos para decidir si una instrucción o bloque de
                 * instrucciones se ejecuta o no dependiendo de una condición.
                 * 
                 * instrucción 1;
                 * instrucción 2;
                 * if(condición){ //inicio de la condición
                 * instrucción 3;
                 * instrucción 4;
                 * } //fin de la condición
                 * instrucción 5;
                 * instrucción 6;
                 */
                Scanner sc = new Scanner(System.in);
                System.out.print("Nota: ");
                int nota;
                nota = sc.nextInt();
                if (nota >= 5) {// ----------------------inicio de la condición
                        System.out.println("Enhorabuena!!");
                        System.out.println("Has aprobado");
                } // -------------------------------------fin de la condición
                System.out.println("Hasta Pronto!");

                /*
                 * Estructura Condicional Doble
                 * Mediante esta estructura de control el flujo de ejecución del
                 * programa puede seguir dos caminos distintos dependiendo del valor
                 * de una condición.
                 * 
                 * instrucción 1;
                 * instrucción 2;
                 * if(condición){ //inicio de la condición 1
                 * instrucción 3;
                 * }else{ //inicio de la condición 2
                 * instrucción 4;
                 * }
                 * instrucción 5;
                 * instrucción 6;
                 */
                System.out.print("Nota: ");
                nota = sc.nextInt();
                if (nota >= 5) {
                        System.out.println("Enhorabuena!!");
                        System.out.println("Has aprobado");
                } else {
                        System.out.println("Lo siento, has suspendido");
                }
                System.out.println("Hasta Pronto!");

                /*
                 * Estructura Condicional Múltiple
                 * La estructura condicional múltiple se obtiene encadenando sentencias
                 * if ... else.
                 * 
                 * instrucción 1;
                 * instrucción 2;
                 * if(condición 1){ //inicio de la condición 1
                 * instrucción 3;
                 * }else if(condición 2){ //inicio de la condición 2
                 * instrucción 4;
                 * }else if(condición 3){ //inicio de la condición 3
                 * instrucción 5;
                 * }else{ //si ninguna se cumple
                 * instrucción 6;
                 * }
                 * 
                 * instrucción 7;
                 */
                int hora;
                System.out.print("Introduzca una hora (>= 0 y <= 23): ");
                hora = sc.nextInt();
                if (hora >= 0 && hora < 12) {
                        System.out.println("Buenos días");
                } else if (hora >= 12 && hora < 21) {
                        System.out.println("Buenas tardes");
                } else if (hora >= 21 && hora < 24) {
                        System.out.println("Buenas noches");
                } else {
                        System.out.println("Hora no válida");
                }
                System.out.println("Hasta pronto!!!");

                /*
                 * switch
                 * Esta estructura de control se utiliza para seleccionar una de entre
                 * múltiples opciones posibles.
                 * switch (expresión){
                 * 
                 * case VALOR1:
                 * 
                 * instrucciones1;
                 * 
                 * break;
                 * 
                 * case VALOR2:
                 * 
                 * instrucciones2;
                 * 
                 * break;
                 * 
                 * .....
                 * 
                 * default:
                 * 
                 * instrucciones3;
                 * 
                 * }
                 */
                int mes;
                System.out.print("Introduzca un numero de mes: ");
                mes = sc.nextInt();

                switch (mes) { // inicio del switch
                        case 1:
                                System.out.println("ENERO");
                                break;
                        case 2:
                                System.out.println("FEBRERO");
                                break;
                        case 3:
                                System.out.println("MARZO");
                                break;
                        case 4:
                                System.out.println("ABRIL");
                                break;
                        case 5:
                                System.out.println("MAYO");
                                break;
                        case 6:
                                System.out.println("JUNIO");
                                break;
                        case 7:
                                System.out.println("JULIO");
                                break;
                        case 8:
                                System.out.println("AGOSTO");
                                break;
                        case 9:
                                System.out.println("SEPTIEMBRE");
                                break;
                        case 10:
                                System.out.println("OCTUBRE");
                                break;
                        case 11:
                                System.out.println("NOVIEMBRE");
                                break;
                        case 12:
                                System.out.println("DICIEMBRE");
                                break;
                        default:
                                System.out.println("Mes no válido");
                } // fin del switch

                sc.close();
        }
}
