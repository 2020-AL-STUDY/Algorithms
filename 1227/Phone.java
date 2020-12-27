package phoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	phone("23");
	}
	
	public static List<String> phone(String digits) {
		HashMap<Character, char[]> map = new HashMap<Character, char[]>();
		 map.put('2',new char[]{'a','b','c'});
		    map.put('3',new char[]{'d','e','f'});
		    map.put('4',new char[]{'g','h','i'});
		    map.put('5',new char[]{'j','k','l'});
		    map.put('6',new char[]{'m','n','o'});
		    map.put('7',new char[]{'p','q','r','s'});
		    map.put('8',new char[]{'t','u','v'});
		    map.put('9',new char[]{'w','x','y','z'});
		List<String> result=new ArrayList<String>();
		if(digits==null||digits.length()==0) {
			return result;
		}
		 char[] arr = new char[digits.length()];
		search(digits,0,map,result,arr);
		System.out.println(result);
		return result;
		
	}
	public static void search(String d,int index,HashMap<Character,char[]>map,List<String>result,char[] arr){
		if(index==d.length()) {
			
			result.add(new String(arr));
			return;
		}
		char c=d.charAt(index);
		char[] alpabet=map.get(c);
//		System.out.println(alpabet);
		for(int i=0; i<alpabet.length;i++) {
			arr[index]=alpabet[i];
			search(d,index+1,map,result,arr);
		}
	}
}

