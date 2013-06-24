package com.ggungs.MiplatformUIHelper.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author ggungs
 *
 */
public class XMLLoader {

    
    public Document load() {
        //File f  = new File("../");
        //System.out.print( System.getProperty("user.dir"));
        
        File xmlSrc = new File("./mip/Test.xml");
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
            
            Document xmlDocument = builder.parse(xmlSrc);
            XPath xPath =  XPathFactory.newInstance().newXPath();
            
            String expression = "//Window/Form/*[@Left]";
            XPathExpression xPathExpression = xPath.compile(expression);
            
            NodeList nodeList = (NodeList)xPathExpression.evaluate(xmlDocument, XPathConstants.NODESET);
            
            for(int i = 0; i < nodeList.getLength(); i++) {
                System.out.println(nodeList.item(i).getNodeName());
            }
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        
        
        return null;
    }
}
