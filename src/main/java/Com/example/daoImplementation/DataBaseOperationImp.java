
package Com.example.daoImplementation;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Com.example.Entity.Employee;
import Com.example.dao.DataBaseOperation;


public class DataBaseOperationImp implements DataBaseOperation{
	private static EntityManagerFactory emf;
	Employee emp=null;
	static {
		try {
			 emf = Persistence.createEntityManagerFactory("employeePU");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int save(Employee emp) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
		em.persist(emp);
		tx.commit();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}
		if(emp.getId()<=0) 
			return 0;
		else
			return 1;
	}
	 public boolean findloginData(String name,String password) {
		 EntityManager em = emf.createEntityManager();

	        try {
	            TypedQuery<Employee> q = em.createQuery(
	                    "SELECT e FROM Employee e WHERE e.name = :name AND e.password = :password",
	                    Employee.class);

	            q.setParameter("name", name);
	            q.setParameter("password", password);

	            Employee emp = q.getSingleResult();  
	            return emp != null;

	        } catch (NoResultException e) {
	            return false;
	        } finally {
	            em.close();
	        }
	   
	    }
	 public List<Employee> findAll(){
		 EntityManager em = emf.createEntityManager();

	        List<Employee> list = em.createQuery(
	                "SELECT e FROM Employee e", Employee.class)
	                .getResultList();

	        em.close();
	        return list;
	    }
	 public boolean updateEmployeeData(Employee emp) {
		 EntityManager em = emf.createEntityManager();
	        EntityTransaction tx = em.getTransaction();

	        try {
	            tx.begin();
	            em.merge(emp);    
	            tx.commit();
	        } catch (Exception e) {
	            tx.rollback();
	            e.printStackTrace();
	        } finally {
	            em.close();
	        }
			return true;
	 }
	 public boolean deleteEmployeeData(Employee emp) {
		 EntityManager em = emf.createEntityManager();
	        EntityTransaction tx = em.getTransaction();

	        try {
	            tx.begin();
	            emp = em.merge(emp);  
	            em.remove(emp);
	            tx.commit();
	        } catch (Exception e) {
	            tx.rollback();
	            e.printStackTrace();
	        } finally {
	            em.close();
	        }
			return true;
		  
	 }
}