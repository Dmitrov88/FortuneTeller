package by.htp.entity;

import java.util.PriorityQueue;

public class Journal {
		
	public PriorityQueue<Client> history = new PriorityQueue<Client>();
	
	//��������� �������� � �������
	public void addToHistory(Client client) {
		history.add(client);
	}
	
	//������� ����� �� �������� � �������
	public boolean workOrNotWork(Client client) {
		return true;
	}
	
}
