package org.netjs.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class City implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer baseCost;
	private List<Option> options;

	public City(Integer id, String name, Integer baseCost, List<Option> options) {
		super();
		this.id = id;
		this.name = name;
		this.baseCost = baseCost;
		this.options = options;
	}

	public Integer getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Integer baseCost) {
		this.baseCost = baseCost;
	}



	public City() {
	}

	public City(String name, List<Option> options) {
		this.name = name;
		this.options = options;
	}
	
	public City(Integer id, String name, List<Option> options) {
		super();
		this.id = id;
		this.name = name;
		this.options = options;
	}

	public City(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Option> getOptions() {
		return this.options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

}