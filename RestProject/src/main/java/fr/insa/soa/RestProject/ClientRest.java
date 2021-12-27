package fr.insa.soa.RestProject;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

public class ClientRest {
	public static void main(String [] args) {
		//Instantation de client necessaire por l'execution des requetes et la consommation des réponses.
		Client client=ClientBuilder.newClient();
		//appel du service Rest, invocation de la méthode get corresponddant à l'URL
		Response response=client.target("http://localhost:8080/RestProject/webapi/comparator/longueur/Toulouse").request().get();
		// lecture de la réponse récupérée
		System.out.println(response.readEntity(String.class));
	}

}
