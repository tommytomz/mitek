/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import function.ColumnsAutoSizer;
import function.Params;
import function.ValueComboBox;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Tommy
 */
public class SoapMitek {
    
    public String [] sendSoap(JProgressBar progresbar, String urlxml, String namespace, Params [] params, String [] kolom){
        
        String [] getdata = new String[kolom.length];
        
//        Runnable runner = new Runnable(){
//            public void run() {
                
                try {
                    
                    //progresbar.setString("0%");
                    //progresbar.setIndeterminate(true);

                    SOAPConnectionFactory scp = SOAPConnectionFactory.newInstance();
                    SOAPConnection sp = scp.createConnection();

                    String url = urlxml;

                    MessageFactory mfactory  = MessageFactory.newInstance();
                    SOAPMessage    smessage  = mfactory.createMessage();
                    SOAPPart       spart     = smessage.getSOAPPart();

                    SOAPEnvelope   senvelope = spart.getEnvelope();
                    senvelope.addNamespaceDeclaration(namespace, url);

                    SOAPBody sb = senvelope.getBody();
                    SOAPElement soapelement = sb.addChildElement(namespace);
                    for(int i=0; i<params.length; i++){
                        soapelement.addChildElement(params[i].getLabel()).addTextNode(params[i].getValue());
                    }
                    
                    smessage.saveChanges();

                    SOAPMessage smes = sp.call(smessage, url);
                    
                    //DefaultTableModel m = (DefaultTableModel) tabledata.getModel();
                    NodeList nodes = smes.getSOAPBody().getElementsByTagName("item");

                    //progresbar.setMaximum(nodes.getLength());

//                    progresbar.setIndeterminate(false);
//                    progresbar.setValue(100);
                    
                    Node node = nodes.item(0);                    
                    for(int i=0; i<kolom.length; i++){
                        
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element data = (Element) node;
                            getdata[i] = data.getElementsByTagName(kolom[i]).item(0).getTextContent();
                            //System.out.println(getdata[i]);
                        }
                         
                    }
                    
                    //Thread.sleep(100);
                    
                    //sp.close();
                    
                    senvelope.removeContents();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        
//            }
//        };
        //Thread t = new Thread(runner, "Code Executer");
        //t.start();
        
        return getdata;
        
    }
    
    public void getSoapToComboBox(JComboBox combobox, String urlxml, String namespace, Params [] params, String [] kolom){
        
                try {
                    combobox.removeAllItems();
                    
                    SOAPConnectionFactory scp = SOAPConnectionFactory.newInstance();
                    SOAPConnection sp = scp.createConnection();

                    String url = urlxml;

                    MessageFactory mfactory  = MessageFactory.newInstance();
                    SOAPMessage    smessage  = mfactory.createMessage();
                    SOAPPart       spart     = smessage.getSOAPPart();
                    
                    smessage.removeAllAttachments();
                    
                    SOAPEnvelope   senvelope = spart.getEnvelope();
                    senvelope.addNamespaceDeclaration(namespace, url);

                    SOAPBody sb = senvelope.getBody();
                    SOAPElement soapelement = sb.addChildElement(namespace);
                    for(int i=0; i<params.length; i++){
                        soapelement.addChildElement(params[i].getLabel()).addTextNode(params[i].getValue());
                    }
                    
                    smessage.saveChanges();

                    SOAPMessage smes = sp.call(smessage, url);
                    
                    NodeList nodes = smes.getSOAPBody().getElementsByTagName("item");

                    String [] value = new String[nodes.getLength()];
                    String [] label = new String[nodes.getLength()];
                    
                    combobox.addItem(new ValueComboBox(null, "Pilih"));
                    
                    for (int i = 0; i < nodes.getLength(); i++) {
                        Node node = nodes.item(i);
                
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element data = (Element) node;
                            value[i] = data.getElementsByTagName(kolom[0]).item(0).getTextContent();
                            label[i] = data.getElementsByTagName(kolom[1]).item(0).getTextContent();
                            combobox.addItem(new ValueComboBox(value[i], label[i]));
                            //System.out.println(label[i+1]);
                        }   
                    }
                    
                    combobox.removeItemAt(1);
                    
                    sp.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
        
    }
    
    public void getDataSoap(JProgressBar progresbar, JTable table, String urlxml, String namespace, Params [] params, String [] kolom){
        try {
            //progresbar.setString("0%");
            //progresbar.setIndeterminate(true);
            
            SOAPConnectionFactory scp = SOAPConnectionFactory.newInstance();
            SOAPConnection sp = scp.createConnection();

            String url = urlxml;
            
            MessageFactory mfactory  = MessageFactory.newInstance();
            SOAPMessage    smessage  = mfactory.createMessage();
            SOAPPart       spart     = smessage.getSOAPPart();
            
            SOAPEnvelope   senvelope = spart.getEnvelope();
            senvelope.addNamespaceDeclaration(namespace, url);
    
            SOAPBody sb = senvelope.getBody();
            SOAPElement soapelement = sb.addChildElement(namespace);
            for(int i=0; i<params.length; i++){
                soapelement.addChildElement(params[i].getLabel()).addTextNode(params[i].getValue());
            }
    
            smessage.saveChanges();
    
            SOAPMessage smes = sp.call(smessage, url);
            //String req = smes.getSOAPBody().getElementsByTagName("nama").item(0).getTextContent();
            
            
            //DefaultTableModel m = (DefaultTableModel) table.getModel();
            NodeList nodes = smes.getSOAPBody().getElementsByTagName("item");
            
            //progresbar.setMaximum(nodes.getLength());
            
            //progresbar.setIndeterminate(false);
            //progresbar.setStringPainted(true);
            
            int p = nodes.getLength();
            
            String datatable [][] = new String[nodes.getLength()][kolom.length];

            //double persen = 0;
            //NumberFormat formatter = new DecimalFormat("#0.0");
            
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element data = (Element) node;
                    
                    for (int j = 0; j < kolom.length; j++) {
                        datatable[i][j] = data.getElementsByTagName(kolom[j].toLowerCase().replace(" ", "")).item(0).getTextContent();
                        
                    }
                    //dtm.addColumn("Idpel", ""+data.getElementsByTagName(kolom[i]).item(0).getTextContent());
//                    nama[i] = data.getElementsByTagName("nama").item(0).getTextContent();
//                    idpel[i] = data.getElementsByTagName("idpel").item(0).getTextContent();
//                    m.addRow(new Object[]{idpel[i], nama[i]});
                    //System.out.println(data.getElementsByTagName("rid").item(0).getTextContent());

                    //
                    //progresbar.setValue(i);
//                    
                    //persen = (((i+1.0) / p) * 100);
                    //progresbar.setString(""+formatter.format(persen)+"%");
                    
                    //System.out.println(formatter.format(persen)+"%");
                    
                }   
            }
              DefaultTableModel dtm = new DefaultTableModel(datatable, kolom);
              dtm.removeRow(0);
//            dtm.addColumn("Idpel", idpel);
//            dtm.addColumn("Nama", nama);
              table.setModel(dtm);
              ColumnsAutoSizer.sizeColumnsToFit(table);
            sp.close();
            
            Thread.sleep(100);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
