package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.StudentDao;
import com.ashim.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(Student student)
	{
		getCurrentSession().saveOrUpdate(student);
	}

	public void deleteRow(Student student)
	{
		getCurrentSession().delete(student);
	}

	public Student getRowById(Integer id)
	{
		return (Student) getCurrentSession().get(Student.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Student> getList()
	{
		return getCurrentSession().createQuery("FROM Student").list();
	}

	@SuppressWarnings("unchecked")
	public List<Student> getDataByStudent(Student student)
	{
		String hql = "SELECT stud FROM Student As stud JOIN stud.section AS sec "
				+ "WHERE (:sectionId is null OR sec.sectionId = :sectionId) "
				+ "AND (:studentId is null OR stud.studentId = :studentId) "
				+ "AND (:studentName is null OR stud.studentName LIKE :studentName) ";

		return getCurrentSession().createQuery(hql)
				.setParameter("sectionId", student.getSection().getSectionId())
				.setParameter("studentId", student.getStudentId())
				.setParameter("studentName", "%" + student.getStudentName() + "%").list();
	}
}