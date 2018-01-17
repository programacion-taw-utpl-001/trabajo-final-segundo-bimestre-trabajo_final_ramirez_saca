/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class LeerArchivoTexto {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo(int op) {
        if (op == 1) {
            try {
                entrada = new Scanner(new File("datos.txt"));
            } // fin de try
            catch (FileNotFoundException fileNotFoundException) {
                System.err.println("Error al abrir el archivo.");
                System.exit(1);
            } // fin de catch
        }
        if (op == 2) {
            try {
                entrada = new Scanner(new File("datos.txt"));
            } // fin de try
            catch (FileNotFoundException fileNotFoundException) {
                System.err.println("Error al abrir el archivo.");
                System.exit(1);
            } // fin de catch
        }
    } // fin del metodo abrirArchivo

    // lee registro del archivo
    public int[] leerRegistros() {
        ArrayList<Integer> lista = new ArrayList<>();
        try { // lee registros del archivo, usando el objeto Scanner
            while (entrada.hasNext()) {
                // System.out.println(entrada.nextLine());
                String cadena = entrada.nextLine();
                ArrayList<String> registro = new ArrayList<>(Arrays.asList(cadena.split(",")));

                int n1 = Integer.parseInt(registro.get(0));
                lista.add(n1);
            } // fin de while
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return transformarArrayList_to_arreglo(lista);
    } // fin del m�todo leerRegistros
    // transforma de arraylist a arreglo

    public int[] transformarArrayList_to_arreglo(ArrayList<Integer> lista) {
        int[] arreglo = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            arreglo[i] = lista.get(i);
        }
        return arreglo;
    }

    // cierra el archivo y termina la aplicaci�n
    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
}

/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. * * RENUNCIA: Los autores y el editor de
 * este libro han realizado su mejor * esfuerzo para preparar este libro. Esto
 * incluye el desarrollo, la * investigaci�n y prueba de las teor�as y programas
 * para determinar su * efectividad. Los autores y el editor no hacen ninguna
 * garant�a de * ning�n tipo, expresa o impl�cita, en relaci�n con estos
 * programas o * con la documentaci�n contenida en estos libros. Los autores y
 * el * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de * estos
 * programas. *
 * ***********************************************************************
 */
