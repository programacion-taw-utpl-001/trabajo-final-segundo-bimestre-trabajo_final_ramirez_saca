/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfinal;

import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class TallerFinal {

    static OrdenamientoSeleccion arreglos1;
    static OrdenamientoCombinacion arreglos2;
    static OrdenamientoInsercion arreglos3;
    

    //static LeerArchivoTexto leeA;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        int ops = 0;
        LeerArchivoTexto leeA = new LeerArchivoTexto();

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //Operaciones A = new Operaciones();
        while (!salir) {
            System.out.println(" ESCOJA UNA OPCION");

            System.out.println("1: Ordenamiento Por Seleccion");
            System.out.println("2: Ordenamiento Por combinacion");
            System.out.println("3: Ordenamiento Por Inserccion");
            System.out.println("4: SALIR");
            try {
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        long startTime;
                        long endTime;
                        int op;

                        System.out.println("A SELECCIONADO LA OPCION 1");

                        System.out.println("INGRESE LA OPCION CON EL NUMERO DE VALORES A OPERAR");
                        System.out.println("1: (100)");
                        System.out.println("2: (1000)");
                        System.out.println("3: (5000)");
                        System.out.println("4: (1000)");
                        System.out.println("5: (50000)");
                        System.out.println("6: (100000)");
                        System.out.println("7: (500000)");
                        System.out.println("8: (1000000)");
                        System.out.println("9: (2000000)");
                        System.out.println("10: SALIR");

                        op = sn.nextInt();
                        switch (op) {
                            case 1:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                //Calcula el tiempo de ejecucion                                 
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                long miliseg = (long) ((endTime) / 1e6);
                                CalculaTiempo calcular = new CalculaTiempo(miliseg);
                                System.out.println(calcular);
                                //System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 2:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 3:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 4:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 5:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 6:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 7:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 8:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");

                                break;
                            case 9:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos1 = new OrdenamientoSeleccion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos1); // imprime arreglo desordenado

                                arreglos1.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos1); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");

                                break;
                            case 10:
                                salir = true;
                                break;
                            default:
                                System.out.println("Ingrese un Numero Valido");

                        }
                        break;
                    //Caso 2 ordenamiento por combiancion 
                    case 2:
                        System.out.println("A SELLECIONADO LA OPCION 2");

                        System.out.println("INGRESE LA OPCION CON EL NUMERO DE VALORES A OPERAR");
                        System.out.println("1: (100)");
                        System.out.println("2: (1000)");
                        System.out.println("3: (5000)");
                        System.out.println("4: (1000)");
                        System.out.println("5: (50000)");
                        System.out.println("6: (100000)");
                        System.out.println("7: (500000)");
                        System.out.println("8: (1000000)");
                        System.out.println("9: (2000000)");
                        System.out.println("10: SALIR");

                        op = sn.nextInt();
                        switch (op) {
                            case 1:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 2:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 3:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 4:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 5:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 6:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 7:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 8:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");

                                break;
                            case 9:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos2 = new OrdenamientoCombinacion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos2.ordenar(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos2); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");

                                break;
                            case 10:
                                salir = true;
                                break;
                            default:
                                System.out.println("Ingrese un Numero Valido");

                        }
                        break;
                    case 3:
                        System.out.println("A SELLECIONADO LA OPCION 3");

                        System.out.println("INGRESE LA OPCION CON EL NUMERO DE VALORES A OPERAR");
                        System.out.println("1: (100)");
                        System.out.println("2: (1000)");
                        System.out.println("3: (5000)");
                        System.out.println("4: (1000)");
                        System.out.println("5: (50000)");
                        System.out.println("6: (100000)");
                        System.out.println("7: (500000)");
                        System.out.println("8: (1000000)");
                        System.out.println("9: (2000000)");
                        System.out.println("10: SALIR");

                        op = sn.nextInt();
                        switch (op) {
                            case 1:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 2:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 3:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 4:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 5:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 6:

                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 7:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 8:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");
                                break;
                            case 9:
                                startTime = System.nanoTime();
                                leeA.abrirArchivo(op);
                                arreglos3 = new OrdenamientoInsercion(leeA.leerRegistros());
                                System.out.println("Arreglo desordenado:");
                                System.out.println(arreglos2); // imprime arreglo desordenado

                                arreglos3.sort(); // ordena el arreglo

                                System.out.println("Arreglo ordenado:");
                                System.out.println(arreglos3); // imprime el arreglo ordenado
                                leeA.cerrarArchivo();
                                endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
                                System.out.println("Tiempo" + "Duración: " + (endTime) / 1e6 + " ms");

                                break;
                            case 10:
                                salir = true;
                                break;
                            default:
                                System.out.println("Ingrese un Numero Valido");

                        }
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Ingrese un Numero Valido");

                }

            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }
    }

    

}
