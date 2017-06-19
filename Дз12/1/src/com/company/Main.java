package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            // открываем файл
            File file = new File("test.xml");
            // объект для чтения файла в буффер
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            // указываем файл для парсинга
            Document doc = documentBuilder.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("element");
            System.out.println("Информация о элементах:");
            ArrayList<Student> arrayList = new ArrayList<>();
            for(int i = 0; i < nodeList.getLength();  i++){
                Node fstNode  = (Node) nodeList.item(i);
                if(fstNode.getNodeType() == Node.ELEMENT_NODE){
                    Element ageElemnt = (Element)fstNode;
                    NodeList ageElementLst = ageElemnt.getElementsByTagName("age");
                    Element  ageElement = (Element)ageElementLst.item(0);
                    NodeList ageNm = ageElement.getChildNodes();
                    System.out.println("Возраст: " + ((Node)ageNm.item(0)).getNodeValue());

                    Element idElemnt = (Element)fstNode;
                    NodeList idElementLst = idElemnt.getElementsByTagName("id");
                    Element  idElement = (Element)idElementLst.item(0);
                    NodeList idNm = idElement.getChildNodes();
                    System.out.println("ID: " + ((Node)idNm.item(0)).getNodeValue());

                    Element isDegreeElemnt = (Element)fstNode;
                    NodeList isDegreeElementLst = isDegreeElemnt.getElementsByTagName("isDegree");
                    Element  isDegreeElement = (Element)isDegreeElementLst.item(0);
                    NodeList isDegreeNm = isDegreeElement.getChildNodes();
                    System.out.println("Степень (есть/нету): " + ((Node)isDegreeNm.item(0)).getNodeValue());

                    Element nameElemnt = (Element)fstNode;
                    NodeList nameElementLst = nameElemnt.getElementsByTagName("name");
                    Element  nameElement = (Element)nameElementLst.item(0);
                    NodeList nameNm = nameElement.getChildNodes();
                    System.out.println("Имя: " + ((Node)nameNm.item(0)).getNodeValue());

                    Element surnameElemnt = (Element)fstNode;
                    NodeList surnameElementLst = surnameElemnt.getElementsByTagName("name");
                    Element  surnameElement = (Element)surnameElementLst.item(0);
                    NodeList surnameNm = surnameElement.getChildNodes();
                    System.out.println("Фамилия: " + ((Node)surnameNm.item(0)).getNodeValue());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
