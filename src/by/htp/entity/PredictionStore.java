package by.htp.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PredictionStore {
	
	public List<Answer> getLoveAnswers() {
		
		List<Answer> answers = new LinkedList<>();
		answers.add(new Answer("Ты женишься"));
		answers.add(new Answer("У тебя будет 5 детей"));
		answers.add(new Answer("У тебя еще будет любовь"));
		return answers;
				
	}
	
    public List<Answer> getJobAnswers() {
		
    	List<Answer> answers = new LinkedList<>();
		answers.add(new Answer("Ты найдешь хорошую работу"));
		answers.add(new Answer("Тебя повысят"));
		answers.add(new Answer("Освоишь новую профессию"));
		return answers;
				
	}

    public List<Answer> getTravelingAnswers() {
		
    	List<Answer> answers = new LinkedList<>();
		answers.add(new Answer("Ты поедешь заграницу"));
		answers.add(new Answer("Ты посетишь Тибет"));
		answers.add(new Answer("Ты побываешь в Австралии"));
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
