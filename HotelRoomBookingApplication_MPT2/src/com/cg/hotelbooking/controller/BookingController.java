package com.cg.hotelbooking.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hotelbooking.beans.HotelDetails;
import com.cg.hotelbooking.service.IBookingService;


@Controller
public class BookingController {

	@Autowired
	IBookingService service;
	
	@RequestMapping(value="getAll",method=RequestMethod.GET)
	public ModelAndView getAllDetails(@ModelAttribute("temp") HotelDetails hotelDetails,Model model){
		List<HotelDetails> hotelsList = service.getHotelDetailsList();
		return new ModelAndView("HotelDetails","temp",hotelsList);
	}
	
	@RequestMapping(value="book", method=RequestMethod.GET)
	public ModelAndView success(@ModelAttribute("temp") HotelDetails hotelDetails,BindingResult bindingResult 
			,Map<String, Object> model){
		
		return new ModelAndView("BookingConfirmation","temp", model);
	
}
}
