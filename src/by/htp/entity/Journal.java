package by.htp.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Journal {
		
	private HashMap<Client, Date> history = new HashMap<Client, Date>();
	
	//��������� �������� � �������
	public void addToHistory(Client client, Date date) {
		history.put(client, date);
	}
	
	
	//������� ����� �� �������� � �������
	public boolean workOrNotWork(Client client) {
		return true;
	}
	
	//���������� �������� � �������
	public void displayJournal() {
		long i = 0;
		Iterator<HashMap.Entry<Client, Date>> it = history.entrySet().iterator();
		while (it.hasNext()) {
		    HashMap.Entry<Client, Date> pair = it.next();
		    //i += pair.getKey() + pair.getValue();
		    System.out.println("Name: " + pair.getKey().getNameClient() + " " + "Date: " + pair.getValue().toString());
		}	}
	
}
