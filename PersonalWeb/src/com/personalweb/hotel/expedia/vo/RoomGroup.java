package com.personalweb.hotel.expedia.vo;

import java.util.List;

/*
 * <xs:element maxOccurs="unbounded" name="Room" type="tns:Room"/>
 */
public class RoomGroup {

	private List<Room> rooms;

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	

}
