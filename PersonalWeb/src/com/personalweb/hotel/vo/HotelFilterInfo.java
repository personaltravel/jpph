package com.personalweb.hotel.vo;

import java.math.BigDecimal;

public class HotelFilterInfo {

    private BigDecimal minPrice = BigDecimal.ZERO;
    
    private BigDecimal maxPrice;
    
    private Integer[] starRates = new Integer[0];
    
    private String sortBy;
    
    private String[] amenities = new String[0];

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Integer[] getStarRates() {
		return starRates;
	}

	public void setStarRates(Integer[] starRates) {
		this.starRates = starRates;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public String[] getAmenities() {
		return amenities;
	}

	public void setAmenities(String[] amenities) {
		this.amenities = amenities;
	}
    
}
