package by.htp.run;

import by.htp.entity.Client;
import by.htp.entity.FortuneTeller;

public class MainApp {

	public static void main(String[] args) {
		
		FortuneTeller fortuneteller = new FortuneTeller();
		
		Client client1 = new Client("Dasha");
		Client client2 = new Client("Gosha");
		Client client3 = new Client("Alena");
		Client client4 = new Client("Misha");
		Client client5 = new Client("Dasha");
		Client client6 = new Client("Sasha");
		fortuneteller.getInQue(client1);
		fortuneteller.getInQue(client2);
		fortuneteller.getInQue(client3);
		fortuneteller.getInQue(client4);
		fortuneteller.getInQue(client5);
		fortuneteller.getInQue(client6);
		fortuneteller.displayClientsInQueue();

	}

}
