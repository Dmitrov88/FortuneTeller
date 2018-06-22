package by.htp.entity;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
