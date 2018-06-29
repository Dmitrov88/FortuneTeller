package by.htp.run;

import by.htp.entity.Client;
import by.htp.entity.ClientsFactory;
import by.htp.entity.FortuneTeller;
import by.htp.entity.Journal;
import by.htp.entity.Prediction;

public class MainApp {

	public static void main(String[] args) {
		
		FortuneTeller fortuneteller = new FortuneTeller();
		
		Client client1 = new Client("Dasha");
		Client client2 = new Client("Gosha");
		Client client3 = new Client("Alena");
		Client client4 = new Client("Misha");
		Client client5 = new Client("Dasha");
		Client client6 = new Client("Sasha");
		
		fortuneteller.displayClientsInQueue();
		fortuneteller.displayClients();
		fortuneteller.getSetPrediction();
				//fortuneteller.displayPredictions();
		
		
		fortuneteller.displayPredictions();
		Journal journal = new Journal();
		new ClientsFactory().fill(journal);
		
		journal.displayJournal();
		
		

	}

}
