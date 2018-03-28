package edu.epe.eh2745.lectureV;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ReadXML {

	private static void extractNode(Node _node)
	{ //convert node to element in order to search for the data inside it
		String name, rdf_id;
		Element element= (Element)_node;
		System.out.println("Element: "+ element.getTagName());
		name= element.getElementsByTagName("cim:IdentifiedObject.name").item(0).getTextContent();
		rdf_id= element.getAttribute("rdf:ID");
		System.out.println("- ID: "+ rdf_id+ "; Name: "+name);
	}
	public static void main(String[] args) 
	{
		try{
			File XmlFile = new File("./res/opencim3sub.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(XmlFile);
			
			//normalized CIM XML file
			doc.getDocumentElement().normalize();
			NodeList substationlist= doc.getElementsByTagName("cim:Substation");
			NodeList vlevellist= doc.getElementsByTagName("cim:VoltageLevel");
			NodeList machinelist= doc.getElementsByTagName("cim:SynchronousMachine");
			for( int i= 0; i< substationlist.getLength(); i++)
			{
				extractNode(substationlist.item(i));
			}
			for( int i= 0; i< vlevellist.getLength(); i++)
			{
				extractNode(vlevellist.item(i));
			}
			for( int i= 0; i< machinelist.getLength(); i++)
			{
				extractNode(machinelist.item(i));
			}
		}
		catch (Exception _e){
			_e.printStackTrace();
		}
	}

}
