package by.htp.entity;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FortuneTeller {

/*–еализовать программу, котора€ позвол€ет предсказывать пользователю вариант развити€ различных ситуаций.
  ѕредсказатель (FortuneTeller) - класс, у которого хранитс€:
	- набор гаданий и набор ответов дл€ каждого гадани€ (LinkedHashMap<Prediction, Queue<Answer>>);
	- очередь клиентов (PriorityQueue<Client>). ¬ день получить магическую помощь могут не более 10 клиентов.
	  ќдин клиент не может получать магическую помощь чаще одного раза в неделю.
  –еализовать следующие функциональные возможности:
	- клиент может просмотреть список доступных предсказаний;
	- клиент может обратитьс€ к предсказателю, указать цель гадани€, получить ответ. ≈сли клиент обращаетс€ чаще одного раза в неделю, 
	  либо на дату обращени€ превышен лимит предсказател€ (не более 10 предсказаний в сутки), клиент попадает в лист ожидани€; 
	- клиент хранит историю обращений к предсказателю (TreeMap <Date, PredictionResult> ) PredictionResult = Prediction + Answer.
	- предсказатель ведЄт учЄт клиентов (HashMap<Date, Client>), которым оказывалась магическа€ помощь и предоставл€ет отчет о данных клиентах;
	- предсказатель предоставл€ет возможность просмотра списка клиентов, записанных в очередь на приЄм;
	- предсказатель имеет возможность удал€ть клиента из списка ожидани€.
*/
	
	public static void showPredictions(){
		Queue<Answer> target1 = new LinkedList<>();
		target1.add(new Answer("“ы женишьс€"));
		target1.add(new Answer("” теб€ будет 5 детей"));
		target1.add(new Answer("” теб€ еще будет любовь"));
		
		Queue<Answer> target2 = new LinkedList<>();
		target2.add(new Answer("“ы найдешь хорошую работу"));
		target2.add(new Answer("“еб€ повыс€т"));
		target2.add(new Answer("ќсвоишь новую профессию"));
		
		Queue<Answer> target3 = new LinkedList<>();
		target3.add(new Answer("“ы поедешь заграницу"));
		target3.add(new Answer("“ы посетишь “ибет"));
		target3.add(new Answer("“ы побываешь в јвстралии"));
		
           System.out.println("test");				
		Map<Prediction, Queue<Answer>> predictions = new LinkedHashMap<>();
		predictions.put(new Prediction("Love"), target1);
		predictions.put(new Prediction("Work"), target2);
		predictions.put(new Prediction("Traveling"), target3);
		System.out.println(predictions);
		
	}
}
