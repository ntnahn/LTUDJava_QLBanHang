package com.qlbh.model;
// Generated 21/09/2016 7:13:01 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.qlbh.pojo.Bophan;

/**
 * Home object for domain model class Bophan.
 * @see com.qlbh.model.Bophan
 * @author Hibernate Tools
 */
@Stateless
public class BophanHome {

	private static final Log log = LogFactory.getLog(BophanHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Bophan transientInstance) {
		log.debug("persisting Bophan instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Bophan persistentInstance) {
		log.debug("removing Bophan instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Bophan merge(Bophan detachedInstance) {
		log.debug("merging Bophan instance");
		try {
			Bophan result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bophan findById(int id) {
		log.debug("getting Bophan instance with id: " + id);
		try {
			Bophan instance = entityManager.find(Bophan.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}