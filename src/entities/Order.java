package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setID(Integer id) {
		this.id = id;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void seDate(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString(){
		return "ID: "+ id
				+ "\nMOMENT: " + sdf.format(moment)
				+ "\nSTATUS: " + status;
	}
}
