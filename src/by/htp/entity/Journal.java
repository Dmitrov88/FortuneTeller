package by.htp.entity;

import java.util.PriorityQueue;

public class Journal {
		
	public PriorityQueue<Client> history = new PriorityQueue<Client>();
	
	//добавлять клиентов в очередь
	public void addToHistory(Client client) {
		history.add(client);
	}
	
	//смотрим можно ли добавить в очередь
	public boolean workOrNotWork(Client client) {
		return true;
	}
	
}
