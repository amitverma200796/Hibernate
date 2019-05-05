package com.sathya.test;

import com.sathya.dao.MTODao;
import com.sathya.dao.MTODaoImpl;

public class Test {

	public static void main(String[] args) {
		MTODao dao=new MTODaoImpl();
		//dao.saveStudentWithCourse();
          dao.removeCourseFromStudent(1093, 1);
	}

}
