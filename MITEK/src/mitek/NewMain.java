/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitek;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author lenovo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory scp = SOAPConnectionFactory.newInstance();
            SOAPConnection sp = scp.createConnection();

            String url = "http://localhost/tesxml/hello.php";
            
            MessageFactory mfactory  = MessageFactory.newInstance();
            SOAPMessage    smessage  = mfactory.createMessage();
            SOAPPart       spart     = smessage.getSOAPPart();
            
            SOAPEnvelope   senvelope = spart.getEnvelope();
            senvelope.addNamespaceDeclaration("kalimat", url);
    
            SOAPBody sb = senvelope.getBody();
            SOAPElement soapelement = sb.addChildElement("kalimat");
            soapelement.addChildElement("pesan").addTextNode("70839397");
    
            smessage.saveChanges();
    
            SOAPMessage smes = sp.call(smessage, url);
            //String req = smes.getSOAPBody().getElementsByTagName("nama").item(0).getTextContent();
            
            NodeList nodes = smes.getSOAPBody().getElementsByTagName("item");
            String nama [] = new String[nodes.getLength()];
            String idpel [] = new String[nodes.getLength()];
            
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element data = (Element) node;
                    nama[i] = data.getElementsByTagName("nama").item(0).getTextContent();
                    idpel[i] = data.getElementsByTagName("idpel").item(0).getTextContent();
                    System.out.println(nama[i]+" / "+idpel[i]);
                    
                }   
            }
            //System.out.println(nodes.getLength());
            sp.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static SOAPMessage soapRequest() throws Exception {
    
    MessageFactory  mf = MessageFactory.newInstance();
    SOAPMessage     sm = mf.createMessage();
    SOAPPart        sp = sm.getSOAPPart();
    
    String url = "http://localhost/tesxml/hello.php";
    SOAPEnvelope    se = sp.getEnvelope();
    se.addNamespaceDeclaration("kalimat", url);
    
    SOAPBody sb = se.getBody();
    SOAPElement soapelement = sb.addChildElement("kalimat");
    soapelement.addChildElement("pesan").addTextNode("hai");
    
    sm.saveChanges();
    sm.writeTo(System.out);
    return sm;
}

private static void printSoap(SOAPMessage sm) throws Exception{
    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer t = tf.newTransformer();
    Source s = sm.getSOAPPart().getContent();
    System.out.print("\nContent : ");
    StreamResult sr = new StreamResult(System.out);
    t.transform(s, sr);
}
}
