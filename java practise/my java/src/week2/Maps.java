package week2;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Maps {
	public static void main(String args[]) {
		String s="hello hh java hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		
		
		System.out.println(MappingBasedonVowels(s));

	}
	
	public static String MappingBasedonVowels(String s) {
		String st[]=s.split(" ");
		//System.out.println(Arrays.toString(st));
		Map<Integer, String> map=new TreeMap<>(Collections.reverseOrder());
		for (int i=0;i<st.length;i++) {
			//System.out.println(st.length);
			int count=0;
			for (int j=0;j<st[i].length();j++) {
				//System.out.println(st[i].length());
				if(st[i].charAt(j)=='a'||st[i].charAt(j)=='e'||st[i].charAt(j)=='i'||st[i].charAt(j)=='o'||st[i].charAt(j)=='u') {
					count++;
				}
			}
			//System.out.println(count                                                                                                );
			if(map.containsKey(count)) {
				String temp=map.get(count);
				temp=temp+" "+st[i];
				map.put(count, temp);
				//System.out.println();
				}
			else {
					map.put(count,st[i]);
				}
			
			}
		//System.out.println(map);
			StringBuilder sb=new StringBuilder();
			for (Entry<Integer, String> e:map.entrySet()) {
				sb.append(e.getValue()).append(" ");
			}
			return sb.toString();
		}
		
}


