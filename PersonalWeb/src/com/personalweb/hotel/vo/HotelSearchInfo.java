package com.personalweb.hotel.vo;

import java.util.Date;

import javax.validation.constraints.Future;

public class HotelSearchInfo {
	
    @Future
    private Date checkin;
    
    @Future
    private Date checkout;
	
    private String destination;

    private int roomsCount = 1;
    
    private RoomInfo roomInfo;
    
	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getRoomsCount() {
		return roomsCount;
	}

	public void setRoomsCount(int roomsCount) {
		this.roomsCount = roomsCount;
	}

	public RoomInfo getRoomInfo() {
		return roomInfo;
	}

	public void setRoomInfo(RoomInfo roomInfo) {
		this.roomInfo = roomInfo;
	}

	public boolean isDatesNotSelected() {
		return datesNotSelected;
	}

	public void setDatesNotSelected(boolean datesNotSelected) {
		this.datesNotSelected = datesNotSelected;
	}

	private boolean datesNotSelected;
	

}
