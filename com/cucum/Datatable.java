package com.cucum;

import java.util.List;
import java.util.Map;

public class Datatable {


	Passing bulk of data in particular step
	
	
	//1d of without header
	when("user enters the username and pwd"){
		public void user enter the username(DataTable table) throws IOException {	

			List<String> as=table.asList();	
			as.get(0);
			as.get(1);
		}
	}

	
	//2d of without header
		when("user enters the username and pwd"){
			public void user enter the username(DataTable table) throws IOException {	
				
				List<List<String>>=table.asLists();
				List<String> li=asLists.get(0);
				String s = li.get(0);
			}
		}
		
		
		//1d with header
		when("user enters the username and pwd"){
			public void user enter the username(DataTable table) throws IOException {	
				Map<String,String> ma=table.asMap(String.class,String.class);	
				String s1=ma.get("username");
				String s2=ma.get("Password");
				
				System.out.println(s1);	
			}
		}
		
		//2d  with header
				when("user enters the username and pwd"){
					public void user enter the username(DataTable table) throws IOException {
						
						List<Map<String,String>> asMaps=table.asMap(String.class,String.class);
						Map<String,String> map=asMaps.get(1);
						
						String s1 = map.get("username");
						String s2 = map.get("password");
						
						
	
						
						System.out.println(s1);	
						System.out.println(s2);	
					}
				}
		
		
}
