package week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Maps2 {
	public static void main(String args[]) {
		String s="heeeeellooooo  java hey heeelloooo everyone its getting complicateeeeed right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		
		
		System.out.println(MappingBasedonVowels(s));

	}
	
	public static String MappingBasedonVowels(String s) {
		String st[]=s.split(" ");
		Arrays.sort(st);
		StringBuilder sb1=new StringBuilder();
		//System.out.println(Arrays.toString(st));
		Map<Integer, String> map=new TreeMap<>();
		for (int i=0;i<st.length;i++) {
			//System.out.println(st.length);
			int count=0;
			sb1.replace(0,4,"aeiou");
			for (int j=0;j<st[i].length();j++) {
				if(st[i].charAt(j)=='a'||st[i].charAt(j)=='e'||st[i].charAt(j)=='i'||st[i].charAt(j)=='o'||st[i].charAt(j)=='u') {
					for(int c=0;c<sb1.length();c++) 
						if(sb1.charAt(c)==(st[i].charAt(j))) {
							//System.out.println(sb1.charAt(c));
							sb1.deleteCharAt(c);
							count++;	
						}
				}
			}
			//System.out.println(count);
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
			return sb.toString().trim();
		}

}
