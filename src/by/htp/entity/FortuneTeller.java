package by.htp.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
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
private LinkedHashMap<Prediction, List<Answer>> pred;
// ��������� queQlients - ������� ��������
private PriorityQueue<Client> journal;
private ArrayList<Client> waitList;
private HashMap<Date, Client> accounting;

//�����������List
public FortuneTeller() {
	
	pred = new PredictionStore().getPredictions();
	journal = new PriorityQueue<Client>();
	waitList = new ArrayList<Client>();
	accounting = new HashMap<Date, Client>();
	
	
}

//������ ��������� ������������;
public void displayPredictions() {
	Iterator<Prediction> itr = pred.keySet().iterator();
	System.out.println("������� ��������� ��� �������");
	int index = 1;
	while(itr.hasNext()) {
		StringBuilder sb = new StringBuilder();
		sb.append(index).append(". ").append(itr.next().getTitle());
				
		index++;
		System.out.println(sb.toString());
	}
	chosePrediction();
}
//������ � ���������� ������������
public void chosePrediction() {
	Scanner sc = new Scanner(System.in);
	String scan = sc.nextLine();
	this.displayPrediction(scan);
	}

//����� ������� �������� �� ���� �������� �������� ����
public Answer choseRandomAnswer(List<Answer> answers) {
	int index = new Random().nextInt(answers.size());
	return answers.get(index);
		
}

//���������� �����
public void displayAnswer(Answer answer) {
	System.out.println(answer.answer);
}

//���������� ���������� prediction
public void displayPrediction(Prediction prediction) {
	List<Answer> list = this.pred.get(prediction);
	Answer answer = this.choseRandomAnswer(list);
	displayAnswer(answer);
}

public void displayPrediction(String predictionName) {
	displayPrediction(new Prediction(predictionName));
}



public void displayClientsInQueue() {
	Iterator itr = journal.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
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
