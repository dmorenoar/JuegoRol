/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxb_demo;

import generated.Libros;
import generated.Libros.Libro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author dani
 */
public class JAXB_DEMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            File f = new File("libros.xml");

            //Creamos un contexto de JAXB
            JAXBContext context = JAXBContext.newInstance(Libros.class);
            MarshallerExample mar = new MarshallerExample();
            Libros misLibros = new Libros();

            BufferedReader in = new BufferedReader(new FileReader("libros.txt"));
            Libro libroActual = null;
            String linea;
            int num = 0;
            while ((linea = in.readLine()) != null) {
                libroActual = new Libro();
                //num = Integer.parseInt(in.readLine());
                libroActual.setPublicadoEn(Integer.parseInt(linea));
                linea = in.readLine();
                libroActual.setTitulo(linea);
                linea = in.readLine();
                libroActual.setAutor(linea);
                misLibros.getLibro().add(libroActual);
            }
            //Escribimos lo leido en el txt al XML
            mar.marshaller(context, f, misLibros);

            //Leemos del fichero XML
            mar.unmarshaller(context, f, misLibros);
            
            
        } catch (IOException | NumberFormatException | JAXBException ex) {
            Logger.getLogger(JAXB_DEMO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
