package by.htp.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PredictionStore {
	
	public List<Answer> getLoveAnswers() {
		
		List<Answer> answers = new LinkedList<>();
		answers.add(new Answer("�� ��������"));
		answers.add(new Answer("� ���� ����� 5 �����"));
		answers.add(new Answer("� ���� ��� ����� ������"));
		return answers;
				
	}
	
    public List<Answer> getJobAnswers() {
		
    	List<Answer> answers = new LinkedList<>();
		answers.add(new Answer("�� ������� ������� ������"));
		answers.add(new Answer("���� �������"));
		answers.add(new Answer("������� ����� ���������"));
		return answers;
				
	}

    public List<Answer> getTravelingAnswers() {
		
    	List<Answer> answers = new LinkedList<>();
		answers.add(new Answer("�� ������� ���������"));
		answers.add(new Answer("�� �������� �����"));
		answers.add(new Answer("�� ��������� � ���������"));
		return answers;
    }
    
    public  LinkedHashMap<Prediction, List<Answer>> getPredictions(){
    	 LinkedHashMap<Prediction, List<Answer>> pred = new LinkedHashMap<Prediction, List<Answer>>();
    	 Prediction lovePred = new Prediction("Love");
    	 pred.put(lovePred, getLoveAnswers());
    	 
    	 Prediction jobPred = new Prediction("Job");
    	 pred.put(jobPred, getJobAnswers());
    	 
    	 Prediction travelingPred = new Prediction("Traveling");
    	 pred.put(travelingPred, getTravelingAnswers());
    	 
    	 
    	 return pred;
    	
    }
}
