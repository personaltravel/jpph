package com.personalweb.hotel.expedia.vo;

/*
 * <xs:element name="numberOfAdults" type="xs:int"/>
<xs:element minOccurs="0" name="numberOfChildren" type="xs:int"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="childAges" type="xs:int"/>
<xs:element minOccurs="0" name="firstName" type="xs:string"/>
<xs:element minOccurs="0" name="lastName" type="xs:string"/>
<xs:element minOccurs="0" name="bedTypeId" type="xs:string"/>
<xs:element minOccurs="0" name="bedTypeDescription" type="xs:string"/>
<xs:element minOccurs="0" name="numberOfBeds" type="xs:int"/>
<xs:element minOccurs="0" name="smokingPreference" type="tns:SmokingPreference"/>
<xs:element minOccurs="0" name="roomTypeCode" type="xs:string"/>
<xs:element minOccurs="0" name="rateCode" type="xs:string"/>
<xs:element minOccurs="0" name="rateKey" type="xs:string"/>
<xs:element minOccurs="0" name="roomDescription" type="xs:string"/>
<xs:element minOccurs="0" name="chargeableRate" type="xs:float"/>
 */
public class Room {
	
	private int numberOfAdults;
	
	private int numberOfChildren;

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

}
