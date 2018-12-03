package com.cg.hotelbooking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hotelbooking.beans.HotelDetails;
import com.cg.hotelbooking.dao.IBookingDAO;

@Service("service")
@Transactional
public class BookingServiceImpl implements IBookingService {

	@Autowired
	IBookingDAO dao;
	
	@Override
	public List<HotelDetails> getHotelDetailsList() {
		// TODO Auto-generated method stub
		return dao.getHotelDetailsList();
	}

}
