package com.lockerz.thrift.user_lookup.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import com.lockerz.thrift.user_lookup.gen.UserLookup;
import com.lockerz.thrift.user_lookup.dao.DaoException;

public class UserLookupDaoImpl extends DaoImpl {
	
	@Override
	public UserLookup lookupByUsername(String username) throws DaoException {
		// need this
		Session session = null;
		// try
		try {
			// need this
			UserLookup row = null;
			// need this
			session = getHibernateTemplate().getSessionFactory().openSession();
			// need this
			@SuppressWarnings("rawtypes")
			List rows = session
				.createCriteria(UserLookup.class)
				.add( Restrictions.eq( "email", username ) )
				.list();
			// sanity check
			if(rows != null && rows.size() == 1) {
				// need this
				row = (UserLookup) rows.get(0);
			}
			// return here
			return row;
		// catch here
		} catch(Exception e) {
			// create message
			String message = this.getClass().getName() + " -> " + e.getMessage();
			// throw an exception here
			throw new DaoException(message);
		// close the session
		} finally {
			// sanity check
			if(session !=  null && session.isConnected()) {
				// close here
				session.close();
			}
		}
	}
	
	@Override
	public UserLookup lookupById(long id) throws DaoException {
		// need this
		Session session = null;
		// try
		try {
			// need this
			UserLookup row = null;
			// need this
			session = getHibernateTemplate().getSessionFactory().openSession();
			// need this
			@SuppressWarnings("rawtypes")
			List rows = session
				.createCriteria(UserLookup.class)
				.add( Restrictions.eq( "id", id ) )
				.list();
			// sanity check
			if(rows != null && rows.size() == 1) {
				// need this
				row = (UserLookup) rows.get(0);
			}
			// return here
			return row;
		// catch here
		} catch(Exception e) {
			// create message
			String message = this.getClass().getName() + " -> " + e.getMessage();
			// throw an exception here
			throw new DaoException(message);
		// close the session
		} finally {
			// sanity check
			if(session !=  null && session.isConnected()) {
				// close here
				session.close();
			}
		}
	}
}