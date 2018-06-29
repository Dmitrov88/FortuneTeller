package by.htp.entity;

import java.util.Date;

public class ClientsFactory {
	
	private Date dateBeforeNow(long hours) {
		Date now = new Date();
		long millis = now.getTime() -  1000*60*60*hours;
		
		return new Date(millis);
	}
	
	public void fill(Journal journal) {
		//Date now = new Date();
		journal.addToHistory(new Client("Dasha"), dateBeforeNow(7) );
		journal.addToHistory(new Client("John"), dateBeforeNow(27) );
		journal.addToHistory(new Client("Irak"), dateBeforeNow(1) );
		journal.addToHistory(new Client("Edmund"), dateBeforeNow(55) );
		journal.addToHistory(new Client("Zoya"), dateBeforeNow(19999) );
	}
}