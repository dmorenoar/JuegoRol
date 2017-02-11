/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxb_demo;

import generated.Libros;
import generated.Libros.Libro;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author dani
 */
public class MarshallerExample {
    
    //Método que lee la información del documento XML
    public void unmarshaller(JAXBContext context, File f, Libros misLibros){   
        try {
            Unmarshaller un = context.createUnmarshaller();
            misLibros = (Libros) un.unmarshal(f);

          for(Libro lib : misLibros.getLibro()){
              System.out.println("+++++++++++++++++++++++++++++++");
              System.out.println("Publicado en el año: " + lib.getPublicadoEn());
              System.out.println("Su autor es: " + lib.getAutor());
              System.out.println("Titulo:" + lib.getTitulo());
              System.out.println("+++++++++++++++++++++++++++++++");
          }
          
        } catch (Exception e) {
            System.out.println("No se ha podido leer del fichero");
        }
    }
    //Método que permite la escritura en un fichero XML   
    public void marshaller(JAXBContext context, File f,Libros misLibros){   
        try {
                    
           Marshaller m = context.createMarshaller();
           m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           m.marshal(misLibros, f);
            
        } catch (Exception e) {
            System.out.println("No se ha podido guardar en el fichero");
        }
    }
}
