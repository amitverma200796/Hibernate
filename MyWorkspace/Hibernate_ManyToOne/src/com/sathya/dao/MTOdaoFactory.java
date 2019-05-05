
	package com.sathya.dao;

	public class MTOdaoFactory {
		private static MTOdao dao;
		public synchronized static  MTOdao getInstance()
		{
			if(dao==null)
			{
				dao=new MTOdaoImpl();
				
			}
			return dao;	
		}

		}


