package com.sathya.test;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.sathya.entity.Flight;

public class MyClass extends EmptyInterceptor
{
@Override
public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) 
{
   boolean flag=false;	
	if(entity instanceof Flight)
	{
		System.out.println("onSave() called before Save object in Database");
		flag=true;
	}
	return flag; 
	
}
}
