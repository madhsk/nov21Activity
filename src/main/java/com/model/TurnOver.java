package com.model;
import java.util.*;
import javax.persistence.*;
@Entity
public class TurnOver {
	@Id
	private String year;
	
	@OneToMany(mappedBy = "turnOver", cascade = CascadeType.PERSIST)
    private List<Sales> saleList;
	
	public TurnOver() {
		
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<Sales> getSaleList() {
		return saleList;
	}
	public void setSaleList(List<Sales> saleList) {
		this.saleList = saleList;
	}	
}
 
 