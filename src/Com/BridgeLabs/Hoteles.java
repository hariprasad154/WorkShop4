package Com.BridgeLabs;

import java.time.LocalDate;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class Hoteles {
	//lakeWood
	//week->110,80 
	//weekend->90,80
	
	//Bridgewood
	//week ->160 ,110
	//60 ,50
	
	//Ridewood ->220,100
	//150,40
	
	public void Hoteles() {
		Integer[][] arr1= {{110,80,90,80},{160,110,60,50},{220,100,150,40}};
		Hashtable<String,Object> lst=new Hashtable<>();
		lst.put("Lakewood",arr1[0] );
		lst.put("Bridgewood", arr1[1]);
		lst.put("Ridewood", arr1[2]);
		
	}
	
	
	
	public static List<LocalDate> getDatesBetweenUsingJava9(
			  LocalDate startDate, LocalDate endDate) {
			 
			    return startDate.datesUntil(endDate)
			      .collect(Collectors.toList());
			}
	
	public static void main(String[] args) {
		Hoteles.getDatesBetweenUsingJava9(null,null);
	}

}
