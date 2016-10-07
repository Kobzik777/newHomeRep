package epam.ua.json;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;



/**
 * Created by Кобзарь on 06/10/2016.
 */
public class Runner {
    public static void main(String args[])throws Exception{
        Books g = new Books(1, "War and Peace" ,3 );
        JSONObject json =  new JSONObject();
        json.put("id", g.getId());
        json.put("title", g.getTitle());
        json.put("quantity" , g.getQuantity() );
        System.out.println(json.toJSONString());
        String jString = json.toJSONString();

        ObjectMapper mapper = new ObjectMapper();
        Books wasRead = mapper.readValue(jString, Books.class);
        System.out.println(wasRead);
    }
}
