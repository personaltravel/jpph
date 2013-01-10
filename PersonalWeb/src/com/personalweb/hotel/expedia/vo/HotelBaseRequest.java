package com.personalweb.hotel.expedia.vo;

/*
 * <xs:element name="apiKey" type="xs:string"/>
<xs:element name="cid" type="xs:long"/>
<xs:element name="customerIpAddress" type="xs:string"/>
<xs:element minOccurs="0" name="customerSessionId" type="xs:string"/>
<xs:element name="customerUserAgent" type="xs:string"/>
<xs:element minOccurs="0" name="locale" type="tns:LocaleType"/>
<xs:element minOccurs="0" name="currencyCode" type="xs:string"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="additionalData" type="tns:mapEntry"/>
<xs:element minOccurs="0" name="sig" type="xs:string"/>
<xs:element minOccurs="0" name="debug" type="xs:boolean"/>
<xs:element minOccurs="0" name="test" type="xs:boolean"/>
 */
public class HotelBaseRequest {
	
	private String apiKey;
	
	private long cid;
	
	private String customerIpAddress;
	
	private String customerSessionId;
	
	private String localeType; //TO DO.. Change this to Enum if Jibx allows
	
	private String currencyCode;

	private String minorRev;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getCustomerIpAddress() {
		return customerIpAddress;
	}

	public void setCustomerIpAddress(String customerIpAddress) {
		this.customerIpAddress = customerIpAddress;
	}

	public String getCustomerSessionId() {
		return customerSessionId;
	}

	public void setCustomerSessionId(String customerSessionId) {
		this.customerSessionId = customerSessionId;
	}

	public String getLocaleType() {
		return localeType;
	}

	public void setLocaleType(String localeType) {
		this.localeType = localeType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getMinorRev() {
		return minorRev;
	}

	public void setMinorRev(String minorRev) {
		this.minorRev = minorRev;
	}
	
	
}
