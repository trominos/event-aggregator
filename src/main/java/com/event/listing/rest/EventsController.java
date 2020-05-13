package com.event.listing.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.listing.service.ListingAreSvc;


@RestController
public class EventsController {
	ListingAreSvc svc = new ListingAreSvc();
	
	@GetMapping("/eventsagr")
	public String  getEvents() {
		return svc.getData();
	}

}
