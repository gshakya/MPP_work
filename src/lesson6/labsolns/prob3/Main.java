package lesson6.labsolns.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
	private static final String NAME = "name";
	private static final String STREET = "street";
	private static final String CITY = "city";
	private static final String ZIP = "zip";

	//Use the DomServiceClass to get all customers 
	//whose city of residence begins with "Ma", in sorted order.
	//Create
	public List<Customer> allCustomersBeginWithMa() {
		String n = System.getProperty("line.separator");
		 List<Customer> returnList = new ArrayList<>();
        try {           
            DomInterface xml = new DomServiceClass("src/lesson6/labsolns/prob3/customer.xml");
           
            List<Properties> propsList = xml.lookupPartialEntry(CITY, "Ma");
            for(Properties p : propsList) {
            	Customer nextCust = new Customer(p.getProperty(NAME), p.getProperty(STREET),
            			                   p.getProperty(CITY), p.getProperty(ZIP));
            	returnList.add(nextCust);
            } 
            
        }
        catch(DomException e) {
            System.out.println(e.getMessage());
        } 
        return returnList;
        
	}
	public static void main(String[] args) {
		Main m = new Main();
		List<Customer> list = m.allCustomersBeginWithMa();
		System.out.println(list);

	}

}
