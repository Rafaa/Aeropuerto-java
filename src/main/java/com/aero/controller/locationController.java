package com.aero.controller;

import com.aero.service.AirportsService;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@RestController
public class locationController {

    @Autowired
    AirportsService airportsService;

    @RequestMapping("/setLocation")
    public String index() {

        try {

            File fXmlFile = new File("/home/rafaa/Projects/workspace/gs-spring-boot/complete/src/main/resources/locationList.html");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("a");

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

                System.out.println("Staff id : " + eElement.getAttribute("href"));

                String aerodromeUrl = eElement.getAttribute("href");



                String oaci = eElement.getTextContent().substring(0,4);

                String locationFile = "/home/rafaa/Projects/workspace/aerovac/src/main/resources/locations/" +oaci + ".html";

                File f = new File(locationFile);
                if(!f.exists() && !f.isDirectory()) {


                    RestTemplate restTemplate = new RestTemplate();
                    String ggg =  restTemplate.getForObject(aerodromeUrl,
                            String.class);




                    URL website = new URL(aerodromeUrl);
                    HttpURLConnection con = (HttpURLConnection) website.openConnection();
                    con.setRequestMethod("GET");
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer content = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();
                    con.disconnect();
                    FileOutputStream fos = new FileOutputStream(locationFile);
                    fos.write(content.toString().getBytes(Charset.forName("UTF-8")));


                    /*ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                    FileOutputStream fos = new FileOutputStream(locationFile);
                    fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);


                    URL website2 = new URL(aerodromeUrl);
                    InputStream is = (website.openStream());


                    Files.copy(is, f.toPath());*/


                }

                try {



                    File fXmlFile = new File(locationFile);
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(fXmlFile);

                    //optional, but recommended
                    //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
                    doc.getDocumentElement().normalize();

                    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

                    NodeList nListLocatoin = doc.getElementsByTagName("b");
                    for (int tempLocation = 0; tempLocation < nListLocatoin.getLength(); tempLocation++) {

                        Node nNodeLocation = nListLocatoin.item(tempLocation);

                        System.out.println("\nCurrent Element :" + nNodeLocation.getNodeName());
                        if (nNodeLocation.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElementLocation = (Element) nNodeLocation;

                            System.out.println("Staff id : " + eElementLocation.getAttribute("href"));



                            String location = eElementLocation.getNodeValue().substring(0, 4);
                            airportsService.setLocationAirportParsedByOACI(oaci, location);
                        }
                    }

                    System.out.println("----------------------------");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
