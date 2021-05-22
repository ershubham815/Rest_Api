package com.springrest.service;

import java.util.*;

import com.springrest.entities.Course;

public interface CourseService {

	
	public List<Course> getCourses();

	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public Course deletCourse(long courseId);
}
