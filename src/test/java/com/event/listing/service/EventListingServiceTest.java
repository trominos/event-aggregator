package com.event.listing.service;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class EventListingServiceTest {

	
	 public static void main(String[] args) {
         Client client = Client.create();
         
         
         WebResource eventsRes = client
                      .resource("http://localhost/events");
         String strEvents = eventsRes.type(MediaType.APPLICATION_JSON).get(String.class);
         
         System.out.println(strEvents);

         WebResource actorsRes = client
                 .resource("http://localhost:81");
         String strActors = actorsRes.type(MediaType.APPLICATION_JSON).get(String.class);
         System.out.println(strActors);
         
         
         
	 }
	
}
