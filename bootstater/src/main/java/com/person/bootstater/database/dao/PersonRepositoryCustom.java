package com.person.bootstater.database.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import com.person.bootstater.database.entity.Person;
@Component
public class PersonRepositoryCustom  {

	@PersistenceContext
	private EntityManager em;

	
	public List<Person> findAllPersons() {
		Query q = em.createNativeQuery("select * from Person");
		List<Person> ps = q.getResultList();
		return ps;
	}
	
	public List<Person> findPersonByName(String name) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> cq = cb.createQuery(Person.class);
		Root<Person> from = cq.from(Person.class);
		Predicate p = cb.equal(from.get("name"), name);
		cq.where(p);
		cq.select(from);		
		TypedQuery<Person> tp = em.createQuery(cq);
		List<Person> ps = tp.getResultList();
		return ps;
	}

	public List<Person> findPersonByDOB(String dob) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> cq = cb.createQuery(Person.class);
		Root<Person> root = cq.from(Person.class);
		List<Person> list = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			java.util.Date startDate = dateFormat.parse(dob);
//			java.util.Date endDate = dateFormat.parse(dob);
			ParameterExpression<java.util.Date> parameter = cb.parameter(java.util.Date.class);
			
			Predicate startDatePredicate = cb.greaterThanOrEqualTo(root.get("dob").as(java.sql.Date.class), parameter);
//			Predicate endDatePredicate = cb.lessThanOrEqualTo(root.get(Discount_.discountEndDate).as(java.sql.Date.class), parameter);

//			Predicate startDateOrPredicate = cb.or(startDatePredicate, root.get("dob").isNull());
//			Predicate endDateOrPredicate = cb.or(endDatePredicate, root.get(Discount_.discountEndDate).isNull());

//			Predicate and = cb.and(startDateOrPredicate, startDateOrPredicate);
	
			cq.where(startDatePredicate);
			
			list = em.createQuery(cq)
			        .setParameter(parameter, startDate, TemporalType.DATE)
//			        .setParameter(parameter, endDate, TemporalType.DATE)
			        .getResultList();
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}