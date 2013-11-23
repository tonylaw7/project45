package hostel21;

import java.text.DateFormat;

public class Bed {

	private int id;
	private float price;
	private int roomNum;
	//private DateFormat date;
	private boolean isAvailable;
	
	public Bed(int num, int roomNum, float price, boolean isAvailable)
	{
		this.num = num;
		this.roomNum = roomNum;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	//public DateFormat getDate() {
	//	return date;
	//}
	//public void setDate(DateFormat date) {
	//	this.date = date;
	//}
	
	
	
	
	
}
