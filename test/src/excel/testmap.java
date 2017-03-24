//package excel;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class testmap {
//
//	public static void main(String[] args){
//		
//		Map<String, Object> vCondition = new HashMap<String, Object>();
//		Map<String, String> map = new HashMap<String, String>();
//		for(int i = 0;i < signalList.size();i++){
//			 map = (Map<String, String>) signalList.get(i);
//			 String MSB =  map.get("MSB");
//			 String LSB =  map.get("LSB");
//			 String[] msb = MSB.split(",");
//			 String[] lsb = LSB.split(",");
//			int aa = Integer.valueOf(msb[0]);
//			int bb = Integer.valueOf(msb[1]);
//			int cc = Integer.valueOf(lsb[0]);
//			int dd = Integer.valueOf(lsb[1]);
//			int ee = cc * 8 - dd;
//			int ff = condition.length();
//			String result = null;
//			if(ff > ee){
//				vCondition.put(map.get("SIGNAL_DICTIONARY"), BinaryToDecimal(convert(condition,msb[0],msb[1],lsb[0],lsb[1])));
//			}else {
//				logger.warn("车况长度为："+ff+"要截取的长度为："+ee);
//			}
//		}
//		return vCondition;
//	}
//}
