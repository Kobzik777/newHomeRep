package epam.ua.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/**
 * Created by Кобзарь on 06/10/2016.
 */
public class Runner {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse(
                Runner.class.getResourceAsStream("Goods.xml") );


        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile("/books/list/item[@id=1]/title");
        String result = (String) expr.evaluate(document , XPathConstants.STRING);
        System.out.println(result);

        XPathExpression exprList = xpath.compile("/books/list/item");
        NodeList nodeList = (NodeList) exprList.evaluate(document , XPathConstants.NODESET);
        for( int i = 0; i< nodeList.getLength(); i++){
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getAttribute("id"));
            System.out.println( elem.getElementsByTagName("title")
                    .item(0).getFirstChild().getNodeValue()  );
        }
    }
}
