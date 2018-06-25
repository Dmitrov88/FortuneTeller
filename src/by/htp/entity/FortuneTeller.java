package by.htp.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class FortuneTeller {
	
/*����������� ���������, ������� ��������� ������������� ������������ ������� �������� ��������� ��������.
  ������������� (FortuneTeller) - �����, � �������� ��������:
	- ����� ������� � ����� ������� ��� ������� ������� (LinkedHashMap<Prediction, Queue<Answer>>);
	- ������� �������� (PriorityQueue<Client>). � ���� �������� ���������� ������ ����� �� ����� 10 ��������.
	  ���� ������ �� ����� �������� ���������� ������ ���� ������ ���� � ������.
  ����������� ��������� �������������� �����������:
	- ������ ����� ����������� ������ ��������� ������������;
	- ������ ����� ���������� � �������������, ������� ���� �������, �������� �����. ���� ������ ���������� ���� ������ ���� � ������, 
	  ���� �� ���� ��������� �������� ����� ������������� (�� ����� 10 ������������ � �����), ������ �������� � ���� ��������; 
	- ������ ������ ������� ��������� � ������������� (TreeMap <Date, PredictionResult> ) PredictionResult = Prediction + Answer.
	- ������������� ���� ���� �������� (HashMap<Date, Client>), ������� ����������� ���������� ������ � ������������� ����� � ������ ��������;
	- ������������� ������������� ����������� ��������� ������ ��������, ���������� � ������� �� ����;
	- ������������� ����� ����������� ������� ������� �� ������ ��������.
*/
// ��������� pred - ����� ������� � ����� ������� ��� ������� �������
private LinkedHashMap<Prediction, Queue<Answer>> pred;
// ��������� queQlients - ������� ��������
private PriorityQueue<Client> queClients;
private ArrayList<Client> waitList;
private HashMap<Date, Client> accounting;

//�����������
public FortuneTeller() {
	pred = new LinkedHashMap<Prediction, Queue<Answer>>();
	queClients = new PriorityQueue<Client>();
	waitList = new ArrayList<Client>();
	accounting = new HashMap<Date, Client>();
	
	
}

//��������� �������� � �������
public void getInQue(Client client) {
	queClients.add(client);
}
public void displayClientsInQueue() {
	Iterator itr = queClients.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

//������ ����� ����������� ������ ��������� ������������;
public void displayPredictions() {
	Iterator<Prediction> itr = pred.keySet().iterator();
	while(itr.hasNext()) {
		System.out.println("fsdfs");
		System.out.println(itr.next().toString());
	}
	
}

//������ �������� � ���� ��������; 
public void addWaitList(Client client) {
	waitList.add(client);
}

//������������� ���� ���� �������� (HashMap<Date, Client>), ������� ����������� ���������� ������
public void accountingClients(Client client) {
	Date date = Calendar.getInstance().getTime();
	accounting.put(date, client);
}

// ������������� ����� � ������ ��������;
public void displayClients() {
	Set<Entry<Date, Client>> entrySet = accounting.entrySet();
	Iterator itr = entrySet.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

// ������������ ������ ������������.
public Set<Prediction> getSetPrediction() {
	return pred.keySet();
	}




	
	public static void showPredictions(){
		Queue<Answer> target1 = new LinkedList<>();
		target1.add(new Answer("�� ��������"));
		target1.add(new Answer("� ���� ����� 5 �����"));
		target1.add(new Answer("� ���� ��� ����� ������"));
		
		Queue<Answer> target2 = new LinkedList<>();
		target2.add(new Answer("�� ������� ������� ������"));
		target2.add(new Answer("���� �������"));
		target2.add(new Answer("������� ����� ���������"));
		
		Queue<Answer> target3 = new LinkedList<>();
		target3.add(new Answer("�� ������� ���������"));
		target3.add(new Answer("�� �������� �����"));
		target3.add(new Answer("�� ��������� � ���������"));
		
           System.out.println("test");				
		Map<Prediction, Queue<Answer>> predictions = new LinkedHashMap<>();
		predictions.put(new Prediction("Love"), target1);
		predictions.put(new Prediction("Work"), target2);
		predictions.put(new Prediction("Traveling"), target3);
		System.out.println(predictions);
		
	}
}
