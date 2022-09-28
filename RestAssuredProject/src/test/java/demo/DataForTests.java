package demo;
import org.testng.annotations.DataProvider;

public class DataForTests {
	
	
	
	@DataProvider(name="DataForPost")
		// DataForPost can give any name
		    public Object[][] dataForPost() {
		    	
//		    	Object[][] data=new Object[2][3];
//		    	
//		    	data[0][0]="Albert";
//		    	data[0][1]="Einstein";
//		    	data[1][2]="2";
//		    	
//		    	data[1][0]="Thomas";
//		    	data[1][1]="Edison";
//		    	data[1][2]="1";
//		    	
//		    	return data;
			 
			 //or
		    	return new Object[][] {
		    		{"Graham","Bell","1"},
		    		//{"Hendry","Ford","2"}
		    	};
		    }	
		    	
		    
		    //@DataProvider(name="dataDelete")
		    public Object[] dataForDelete() {
		    	// DataForPost can give any name
		    	
		    	return new Object[] {
		    			4,5,6,7
		    	};
		    	
		    	
		    }

}
