package com.aero.controller;

import com.aero.dao.AirportParsedDao;
import com.aero.dao.AirportTMPDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.AirportTMPEntity;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

@RestController
public class UploadVacController {




    @RequestMapping("/uploadVac")
    public String index() {

        try {

            File fXmlFile = new File("/home/rafaa/Projects/workspace/gs-spring-boot/complete/src/main/resources/airport-list.html");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("option");

            System.out.println("----------------------------");

            doTheJob(nList);
            //    parseVac();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Greetings from Spring Boot!";
    }

    private void doTheJob(NodeList nList) throws IOException {

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                System.out.println("Staff id : " + eElement.getAttribute("value"));

                String vacFile = "/home/rafaa/Projects/workspace/aerovac/src/main/resources/cartes-vac/" +eElement.getAttribute("value") + ".pdf";

                File f = new File(vacFile);
                if(f.exists() && !f.isDirectory()) {


                    URL website = new URL("https://www.sia.aviation-civile.gouv.fr/dvd/eAIP_21_JUN_2018/Atlas-VAC/PDF_AIPparSSection/VAC/AD/AD-2." + eElement.getAttribute("value") + ".pdf");
                    ReadableByteChannel rbc = Channels.newChannel(website.openStream());


                    FileOutputStream fos = new FileOutputStream(vacFile);
                    fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
                }

                PdfReader reader;
                try {

                    reader = new PdfReader(vacFile);

                    // pageNumber = 1
                    String textFromPage1 = reader.getNumberOfPages() > 0 ? PdfTextExtractor.getTextFromPage(reader, 1) : null;
                    String textFromPage2 = reader.getNumberOfPages() > 1 ? PdfTextExtractor.getTextFromPage(reader, 2) : null;
                    String textFromPage3 = reader.getNumberOfPages() > 2 ? PdfTextExtractor.getTextFromPage(reader, 3) : null;
                    String textFromPage4 = reader.getNumberOfPages() > 3 ? PdfTextExtractor.getTextFromPage(reader, 4) : null;
                    String textFromPage5 = reader.getNumberOfPages() > 4 ? PdfTextExtractor.getTextFromPage(reader, 5) : null;
                    String textFromPage6 = reader.getNumberOfPages() > 5 ? PdfTextExtractor.getTextFromPage(reader, 6) : null;
                    String textFromPage7 = reader.getNumberOfPages() > 6 ? PdfTextExtractor.getTextFromPage(reader, 7) : null;
                    String textFromPage8 = reader.getNumberOfPages() > 7 ? PdfTextExtractor.getTextFromPage(reader, 8) : null;
                    String textFromPage9 = reader.getNumberOfPages() > 8 ? PdfTextExtractor.getTextFromPage(reader, 9) : null;
                    String textFromPage10 = reader.getNumberOfPages() > 9 ? PdfTextExtractor.getTextFromPage(reader, 10) : null;
                    String textFromPage11 = reader.getNumberOfPages() > 10 ? PdfTextExtractor.getTextFromPage(reader, 11) : null;




                    Class.forName("com.mysql.jdbc.Driver");

                    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AeroVac","root","Getit4REAL");


                    String userString="INSERT INTO Airports_tmp (code_oaci, all_information_p1, all_information_p2, all_information_p3, all_information_p4" +
                            ", all_information_p5, all_information_p6, all_information_p7, all_information_p8, all_information_p9, all_information_p10, all_information_p11)" +
                            " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
                    String myStatement = userString;
                    PreparedStatement statement= conn.prepareStatement   (myStatement );
                    statement.setString(1, eElement.getAttribute("value"));
                    statement.setString(2, textFromPage1);
                    statement.setString(3, textFromPage2);
                    statement.setString(4, textFromPage3);
                    statement.setString(5, textFromPage4);
                    statement.setString(6, textFromPage5);
                    statement.setString(7, textFromPage6);
                    statement.setString(8, textFromPage7);
                    statement.setString(9, textFromPage8);
                    statement.setString(10, textFromPage9);
                    statement.setString(11, textFromPage10);
                    statement.setString(12, textFromPage11);

                    statement.executeUpdate();
                    statement.close();
                    conn.close();

                    System.out.println(textFromPage10);

                    reader.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
