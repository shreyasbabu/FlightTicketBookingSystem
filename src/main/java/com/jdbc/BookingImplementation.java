package com.jdbc;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookingDAO;
import com.model.Booking;

@Repository
@Transactional
public class BookingImplementation implements BookingDAO {
	
	@Autowired
	private SessionFactory factory;
	public boolean newBooking(Booking booking) {
		Session session = factory.getCurrentSession();
		try
		{
			session.save(booking);
			return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}

	public List<Booking> getBookedDetails(int personId) {
		Session session = factory.getCurrentSession();
		List<Booking> bookingList = new ArrayList<Booking>();
		try
		{
			/*Query query =  session.createQuery("from Booking where person=:pid").setParameter("pid", personId.getPersonId());
			bookingList = query.list();*/
/*			Criteria  c=session.createCriteria(Booking.class);
			c.add(Restrictions.eq("person", personId));
			bookingList=c.list();*/
			String sql_query="from Booking WHERE person="+personId;
			bookingList=session.createQuery(sql_query).list();
			return bookingList;
		}
		catch(RuntimeException e)
		{
			return bookingList;
		}
	}
	public boolean deleteBooking(int bookingId) {
		Session session = factory.getCurrentSession();
		try
		{
			Booking del = (Booking) session.load(Booking.class, bookingId);
			session.delete(del);
			return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
}
}