package com.amazon.testcases;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
	
	 @DataProvider(name="SearchProvider")
     public static Object[] getDataFromDataprovider(){
        /* return new Object[][] {
             { "Think and Grow Rich (Re-Jacketed December 2017)" },
             { "M S Dhoni: Captain Cool"},
         };*/  
		 
		/* Object[] data = new Object[];
		// 1st row
			data[0] ="Think and Grow Rich (Re-Jacketed December 2017)";
			data[1] = "M S Dhoni: Captain Cool";
		 
		 return data;*/
		 
		 return new Object[] {"Three Thousand Stitches: Ordinary People, Extraordinary Lives", "Captain Cool: The M.S. Dhoni Story - 4th Revised Edition"};
}
}
