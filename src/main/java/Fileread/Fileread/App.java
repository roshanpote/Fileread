package Fileread.Fileread;

/**
 * Hello world!
 *
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App 
{
	public static void main(String[] args) throws ParseException {
		
        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", new Integer(100));

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");
        

        obj.put("messages", list);
        JSONParser parser = new JSONParser();
        {

        try (FileWriter file = new FileWriter("C:\\Users\\Shri Gajanan\\Desktop\\test.json")) {

            file.write(obj.toJSONString());
            file.flush();

            Object obj1 = parser.parse(new FileReader("C:\\Users\\Shri Gajanan\\Desktop\\test1.json"));
            JSONObject jsonObject = (JSONObject) obj1;
            System.out.println(jsonObject);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);
       

    }

}
}
