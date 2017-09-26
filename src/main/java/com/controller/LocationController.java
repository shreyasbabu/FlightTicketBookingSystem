package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
}
