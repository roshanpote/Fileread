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

public class App2 
{
	public static void main(String[] args) throws ParseException {
		
		loadJSON(function(response) {
			  // Parse JSON string into object
			    var actual_JSON = JSON.parse(response);
			    $("#YourDivIid").html(JSON.stringify(actual_JSON));
			 });
			}

			 function loadJSON(callback) {   

			    var xobj = new XMLHttpRequest();
			        xobj.overrideMimeType("application/json");
			    xobj.open('GET', 'C:\\Users\\Shri Gajanan\\Desktop\\test.json', true); // Replace 'my_data' with the path to your file
			    xobj.onreadystatechange = function () {
			          if (xobj.readyState == 4 && xobj.status == "200") {
			            // Required use of an anonymous callback as .open will NOT return a value but simply returns undefined in asynchronous mode
			            callback(xobj.responseText);
			          }
			    };
			    xobj.send(null);  
			 }
			 
        System.out.print(xobj);
       

    }

}
