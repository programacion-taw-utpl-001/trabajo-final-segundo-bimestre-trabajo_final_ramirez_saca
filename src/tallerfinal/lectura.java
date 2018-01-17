/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class lectura  {
     protected Scanner entrada;
    // permite al usuario abrir el archivo
    public void abrirArchivo(){
        try{
            entrada = new Scanner( new File( "datos.txt" ) );
        } // fin de try
        catch ( FileNotFoundException fileNotFoundException ){
            System.err.println( "Error al abrir el archivo." );
            System.exit( 1 );
        } // fin de catch
    } // fin del metodo abrirArchivo
}
