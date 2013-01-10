package com.personalweb.hotel.expedia.vo;

/*
 * <xs:element minOccurs="0" name="address" type="xs:string"/>
<xs:element minOccurs="0" name="city" type="xs:string"/>
<xs:element minOccurs="0" name="stateProvinceCode" type="xs:string"/>
<xs:element minOccurs="0" name="postalCode" type="xs:string"/>
<xs:element minOccurs="0" name="countryCode" type="xs:string"/>
<xs:element minOccurs="0" name="destinationId" type="xs:string"/>
<xs:element minOccurs="0" name="destinationString" type="xs:string"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="hotelIdList" type="xs:long"/>
<xs:element minOccurs="0" name="latitude" type="xs:float"/>
<xs:element minOccurs="0" name="longitude" type="xs:float"/>
<xs:element minOccurs="0" name="searchRadius" type="xs:int"/>
<xs:element minOccurs="0" name="searchRadiusUnit" type="tns:SearchRadiusUnitType"/>
<xs:element minOccurs="0" name="sort" type="tns:SortType"/>
<xs:element minOccurs="0" name="propertyName" type="xs:string"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="amenities" type="xs:int"/>
<xs:element minOccurs="0" name="minStarRating" type="xs:float"/>
<xs:element minOccurs="0" name="maxStarRating" type="xs:float"/>
<xs:element minOccurs="0" name="minTripAdvisorRating" type="xs:float"/>
<xs:element minOccurs="0" name="maxTripAdvisorRating" type="xs:float"/>
<xs:element minOccurs="0" name="minRate" type="xs:int"/>
<xs:element minOccurs="0" name="maxRate" type="xs:int"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="propertyCategory" type="tns:PropertyCategory"/>
<xs:element minOccurs="0" name="supplierType" type="xs:string"/>
<xs:element minOccurs="0" name="numberOfBedRooms" type="xs:int"/>
<xs:element minOccurs="0" name="numberOfResults" type="xs:int"/>
<xs:element minOccurs="0" name="maxRatePlanCount" type="xs:int"/>
<xs:element minOccurs="0" name="arrivalDate" type="xs:string"/>
<xs:element minOccurs="0" name="departureDate" type="xs:string"/>
<xs:element minOccurs="0" name="RoomGroup" type="tns:RoomGroup"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="rateType" type="tns:RatePlanType"/>
<xs:element minOccurs="0" name="cacheLocation" type="xs:string"/>
<xs:element minOccurs="0" name="cacheKey" type="xs:string"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="options" type="tns:hotelListOption"/>
<xs:element minOccurs="0" name="multiRoomAvail" type="tns:MultiRoomAvailType"/>
<xs:element minOccurs="0" name="merchantScoringSource" type="xs:string"/>
<xs:element minOccurs="0" name="scoringAlgorithmId" type="xs:int"/>
<xs:element minOccurs="0" name="ignoreMmOverrides" type="xs:boolean"/>
<xs:element minOccurs="0" name="supplierCacheTolerance" type="tns:SupplierCacheTolerance"/>
<xs:element minOccurs="0" name="datelessSupplierSort" type="xs:boolean"/>
 */
public class HotelListRequest {
	
	private int numberOfResults;
	
	private int numberOfBedrooms;
	
	private String arrivalDate;
	
	private String departureDate;
	
	private String address;
	
	private String city;
	
	private String stateProvinceCode;
	
	private String postalCode;
	
	private String countryCode;
	
	private String destinationId;
	
	private String destinationString;
	
	private RoomGroup roomGroup;
	
	private String cacheLocation;
	
	private String cacheKey;
	
	public int getNumberOfResults() {
		return numberOfResults;
	}

	public void setNumberOfResults(int numberOfResults) {
		this.numberOfResults = numberOfResults;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvinceCode() {
		return stateProvinceCode;
	}

	public void setStateProvinceCode(String stateProvinceCode) {
		this.stateProvinceCode = stateProvinceCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	public String getDestinationString() {
		return destinationString;
	}

	public void setDestinationString(String destinationString) {
		this.destinationString = destinationString;
	}

	public RoomGroup getRoomGroup() {
		return roomGroup;
	}

	public void setRoomGroup(RoomGroup roomGroup) {
		this.roomGroup = roomGroup;
	}

	public String getCacheLocation() {
		return cacheLocation;
	}

	public void setCacheLocation(String cacheLocation) {
		this.cacheLocation = cacheLocation;
	}

	public String getCacheKey() {
		return cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

}
