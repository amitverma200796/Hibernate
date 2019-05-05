package com.sathya.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

@Entity

public class Flight {
	
		@Id
		private    int     flightno;
		private   String   source;
		private   String   destination;
		private   String   status;
		public int getFlightno() {
			return flightno;
		}
		public void setFlightno(int flightno) {
			this.flightno = flightno;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

		public   String   toString()
		{
			return   "Flight["+flightno+"\t"+source+"\t"+destination+"\t"+status+"]";
		}

		
}
