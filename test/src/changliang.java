import java.util.HashMap;
import java.util.Map;

public class changliang {

	private static String a = "1";
	
	public static void main(String[] args){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("b", "1");
		String currPos = map.get("b");
		if(a == currPos){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}else{
			System.out.println("+++++++++++++");
		}
	}

}
