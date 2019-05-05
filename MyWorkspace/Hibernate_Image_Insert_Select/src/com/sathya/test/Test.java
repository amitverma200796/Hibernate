package com.sathya.test;

import com.sathya.dao.ImageDao;
import com.sathya.dao.ImageDaoImpl;

public class Test {

	public static void main(String[] args) {
		ImageDao dao=new ImageDaoImpl();
		//dao.insertImage();
        dao.selectImage();
	}

}
