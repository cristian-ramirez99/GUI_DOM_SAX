package manejador_xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ManejadorSAX extends DefaultHandler {
     
    //La variable debe de ser static, ya que los metodos lanzan Exceptions
    public static String datosXML;

    @Override
    public void startDocument() throws SAXException {
        datosXML = "";
    }

    @Override
    public void endDocument() throws SAXException {
    }

    @Override
    public void startElement(String uri, String localName, String name,
            Attributes attributes) throws SAXException {
        if (!localName.equals("libros") && !localName.equals("libro")) {
            //System.out.print(localName + ": ");
            datosXML += localName + ": ";
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        //  System.out.println(String.valueOf(ch, start, length));
        datosXML += String.valueOf(ch, start, length);
        System.out.println("Hola" + datosXML);
    }

    @Override
    public void endElement(String uri, String localName, String name)
            throws SAXException {
    }
}
