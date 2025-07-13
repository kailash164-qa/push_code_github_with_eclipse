package com.gspan.RestAssuredEx1;

public class Demo {

	public static void main(String[] args) {
		String str="java";
		
		
		
		//input java output jav*a
		
		StringBuffer sb = new StringBuffer();
		
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			
			char ch = str.charAt(i);
			
			
			if (Character.isLetter(ch)) {
				
				
				sb.append("*");
				
			}
			
			
			
			System.out.println(sb.toString());
		}
		
		
	}

}
