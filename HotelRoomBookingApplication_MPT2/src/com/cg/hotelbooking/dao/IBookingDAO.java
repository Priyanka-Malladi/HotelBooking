package com.cg.hotelbooking.dao;

import java.util.List;

import com.cg.hotelbooking.beans.HotelDetails;

public interface IBookingDAO {

	public List<HotelDetails> getHotelDetailsList();
}
