package temporaryP;

import java.util.ArrayList;
import java.util.Calendar;

import pl.agh.edu.is.webdb.privateservices.CrudService;
import pl.agh.edu.is.webdb.privateservices.Right;


public class Main {
	public static void main(String[] args){
		CrudService cs = new CrudService();
		

		
		Right r = new Right();
		r.setRightName("id"+Calendar.getInstance().getTimeInMillis());
		r.setDescription("description");
		cs.getCrudServicePort().addRight(r);
		
		ArrayList<Right> rights = (ArrayList<Right>) cs.getCrudServicePort().getAllRights();
		
		for(Right rs : rights){
			System.out.println(rs.getRightName()+", "+rs.getDescription());
			cs.getCrudServicePort().g
		}
		
		
	}
}
