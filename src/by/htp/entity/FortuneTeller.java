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
	
/*Реализовать программу, которая позволяет предсказывать пользователю вариант развития различных ситуаций.
  Предсказатель (FortuneTeller) - класс, у которого хранится:
	- набор гаданий и набор ответов для каждого гадания (LinkedHashMap<Prediction, Queue<Answer>>);
	- очередь клиентов (PriorityQueue<Client>). В день получить магическую помощь могут не более 10 клиентов.
	  Один клиент не может получать магическую помощь чаще одного раза в неделю.
  Реализовать следующие функциональные возможности:
	- клиент может просмотреть список доступных предсказаний;
	- клиент может обратиться к предсказателю, указать цель гадания, получить ответ. Если клиент обращается чаще одного раза в неделю, 
	  либо на дату обращения превышен лимит предсказателя (не более 10 предсказаний в сутки), клиент попадает в лист ожидания; 
	- клиент хранит историю обращений к предсказателю (TreeMap <Date, PredictionResult> ) PredictionResult = Prediction + Answer.
	- предсказатель ведёт учёт клиентов (HashMap<Date, Client>), которым оказывалась магическая помощь и предоставляет отчет о данных клиентах;
	- предсказатель предоставляет возможность просмотра списка клиентов, записанных в очередь на приём;
	- предсказатель имеет возможность удалять клиента из списка ожидания.
*/
// объявляем pred - набор гаданий и набор ответов для каждого гадания
private LinkedHashMap<Prediction, Queue<Answer>> pred;
// объявляем queQlients - очередь клиентов
private PriorityQueue<Client> queClients;
private ArrayList<Client> waitList;
private HashMap<Date, Client> accounting;

//конструктор
public FortuneTeller() {
	pred = new LinkedHashMap<Prediction, Queue<Answer>>();
	queClients = new PriorityQueue<Client>();
	waitList = new ArrayList<Client>();
	accounting = new HashMap<Date, Client>();
	
	
}

//добавлять клиентов в очередь
public void getInQue(Client client) {
	queClients.add(client);
}
public void displayClientsInQueue() {
	Iterator itr = queClients.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

//клиент может просмотреть список доступных предсказаний;
public void displayPredictions() {
	Iterator<Prediction> itr = pred.keySet().iterator();
	while(itr.hasNext()) {
		System.out.println("fsdfs");
		System.out.println(itr.next().toString());
	}
	
}

//клиент попадает в лист ожидания; 
public void addWaitList(Client client) {
	waitList.add(client);
}

//предсказатель ведёт учёт клиентов (HashMap<Date, Client>), которым оказывалась магическая помощь
public void accountingClients(Client client) {
	Date date = Calendar.getInstance().getTime();
	accounting.put(date, client);
}

// предоставляет отчет о данных клиентах;
public void displayClients() {
	Set<Entry<Date, Client>> entrySet = accounting.entrySet();
	Iterator itr = entrySet.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

// Возвращается список предсказаний.
public Set<Prediction> getSetPrediction() {
	return pred.keySet();
	}




	
	public static void showPredictions(){
		Queue<Answer> target1 = new LinkedList<>();
		target1.add(new Answer("Ты женишься"));
		target1.add(new Answer("У тебя будет 5 детей"));
		target1.add(new Answer("У тебя еще будет любовь"));
		
		Queue<Answer> target2 = new LinkedList<>();
		target2.add(new Answer("Ты найдешь хорошую работу"));
		target2.add(new Answer("Тебя повысят"));
		target2.add(new Answer("Освоишь новую профессию"));
		
		Queue<Answer> target3 = new LinkedList<>();
		target3.add(new Answer("Ты поедешь заграницу"));
		target3.add(new Answer("Ты посетишь Тибет"));
		target3.add(new Answer("Ты побываешь в Австралии"));
		
           System.out.println("test");				
		Map<Prediction, Queue<Answer>> predictions = new LinkedHashMap<>();
		predictions.put(new Prediction("Love"), target1);
		predictions.put(new Prediction("Work"), target2);
		predictions.put(new Prediction("Traveling"), target3);
		System.out.println(predictions);
		
	}
}
