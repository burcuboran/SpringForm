package org.netjs.model;

import java.util.List;
import java.util.Set;

public class UserPreferences {

	private Integer cityId;
	private City SelectedCity;
	private List<Integer> selectedOptions;
	private Integer squareMeter;
	private List<Option> options;
	private int totalCost;

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public City getSelectedCity() {
		return SelectedCity;
	}

	public void setSelectedCity(City selectedCity) {
		SelectedCity = selectedCity;
	}

	private List<City> cities;

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public Integer getSquareMeter() {
		return squareMeter;
	}

	public void setSquareMeter(Integer squareMeter) {
		this.squareMeter = squareMeter;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer city) {
		this.cityId = city;
	}

	public List<Integer> getSelectedOptions() {
		return selectedOptions;
	}

	public void setSelectedOptions(List<Integer> selectedOptions) {
		this.selectedOptions = selectedOptions;
	}


}
