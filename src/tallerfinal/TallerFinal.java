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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        LeerArchivoTexto leeA = new LeerArchivoTexto();
        leeA.abrirArchivo();

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //Operaciones A = new Operaciones();
        while (!salir) {
            System.out.println(" ESCOJA UNA OPCION");

            System.out.println("1: Ordenamiento Por combinacion");
            System.out.println("2: Ordenamiento Por Inserccion");
            System.out.println("3: SALIR");
            try {
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        OrdenamientoCombinacion arregloOrden = new OrdenamientoCombinacion(leeA.leerRegistros());

                        // imprime el arreglo desordenado
                        System.out.println("Desordenado:" + arregloOrden + "\n");

                        arregloOrden.ordenar(); // ordena el arreglo

                        // imprime el arreglo ordenado
                        System.out.println("Ordenado:   " + arregloOrden);
                        break;
                    case 2:
                        OrdenamientoInsercion arreglo = new OrdenamientoInsercion(leeA.leerRegistros());

                        System.out.println("Arreglo desordenado:");
                        System.out.println(arreglo); // imprime el arreglo desordenado

                        arreglo.sort(); // ordena el arreglo

                        System.out.println("Arreglo ordenado:");
                        System.out.println(arreglo);
                        break;
                    case 3:
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
