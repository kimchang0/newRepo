package kcy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class tedChang {

	public static void main(String[] args) {




		List <Map<String, String>> rList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<String, String>();

		pMap.put("name", "±Ëº±ø≠");
		pMap.put("email", "±Ëº±ø≠@");
		pMap.put("addr", "±∫∆˜");
		pMap.put("dept", "µ•∫–");

		rList.add(pMap);
		pMap = null;
		pMap = new HashMap<String, String>();

		pMap.put("name", "±Ë√¢øµ");
		pMap.put("email", "±Ë√¢øµ@");
		pMap.put("addr", "¿Œ√µ");
		pMap.put("dept", "µ•∫–");

		rList.add(pMap);
		pMap = null;

		Iterator <Map<String, String>> it = rList.iterator();

		while(it.hasNext()) {
			Map<String, String> rMap = it.next();

			System.out.println("name: " + rMap.get("name"));
			System.out.println("name: " + rMap.get("email"));
			System.out.println("name: " + rMap.get("addr"));
			System.out.println("name: " + rMap.get("dept"));
			System.out.println("--------------------------------");

			rMap = null;
		}	
		
		
		
		
		
	}

}
