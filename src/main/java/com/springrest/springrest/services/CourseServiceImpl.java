package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	//List<Course> list;
	
	public CourseServiceImpl() {
		/*
		 * list = new ArrayList<Course>(); list.add(new
		 * Course(001,"Core Java","Basics of Java")); list.add(new
		 * Course(002,"Java/J2EE","Introduction to Advance Java"));
		 */
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		/*
		 * Course c=null; for (Course course : list) { if(course.getId()==courseId) {
		 * c=course; break; } } return c;
		 */
		Course c= courseDao.findById(courseId).get();
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		/*
		 * list.add(course); return course;
		 */
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		/*
		 * list.forEach(e ->{ if(e.getId()==course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
		 * }); return course;
		 */
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(long courseId) {
		/*
		 * for (Course curCourse : list) { if(curCourse.getId()==courseId) {
		 * list.remove(curCourse); break; } }
		 */
		courseDao.delete(courseDao.getById(courseId));
	}

}
