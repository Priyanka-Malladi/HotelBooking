package com.cg.hotelbooking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.hotelbooking.beans.HotelDetails;


@Repository("dao")
public class BookingDAOImpl implements IBookingDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<HotelDetails> getHotelDetailsList() {
		// TODO Auto-generated method stub
		Query queryOne = entityManager.createQuery("FROM HotelDetails");
		List<HotelDetails> myList = queryOne.getResultList();

		return myList;
		
	}

}
