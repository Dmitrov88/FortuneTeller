package by.htp.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.TreeMap;

public class Client implements Comparable<Client> {

private String nameClient;
private TreeMap<Date, PredictionResult> history;

//клиент хранит историю обращений к предсказателю
public void addPredictionResult(Prediction prediction, Answer answer) {
	Date date = Calendar.getInstance().getTime();
	PredictionResult predictionResult = new PredictionResult(prediction, answer);
	history.put(date, predictionResult);
	
}

public Client(String nameClient) {
	super();
	this.nameClient = nameClient;
}

@Override
public int compareTo(Client o) {
	// TODO Auto-generated method stub
	return nameClient.compareTo(o.nameClient);
}

@Override
public String toString() {
	return "Client [nameClient=" + nameClient + ", history=" + history + "]";
}

}
