package test;

import com.jxnu.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import test.util.SessionUtil;

import java.util.List;

/**
 * Created by Administrator on 2016-3-14.
 */
public class StudentTest {

	private Session session;

	@Before
	public void getSession() {
		session = SessionUtil.getSession();
	}

	@Test
	public void testSave() {
		Transaction tx = null;
		tx = session.beginTransaction();
		Student s = new Student();
		s.setName("s1");
		s.setAddress("add1");
		session.save(s);
		tx.commit();
	}

	@Test
	public void testQuery() {
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Student");  // 类名Student
		List<Student> list = query.list();
		for (Student s : list) {
			System.out.println(s);
		}
	}

//	@Test
//	public void testQuery() {
//		session.beginTransaction();
//		session.
//	}
}
