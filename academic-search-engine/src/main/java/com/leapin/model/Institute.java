/**
 * 
 */
package com.leapin.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Deepak
 *
 */
@Document
public class Institute {

	@Id
	private String name;//
	private City city;//
	private String state;//
	private String link;
	private List<Program> programes;
	
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
	
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the programes
	 */
	public List<Program> getProgrames() {
		return programes;
	}
	/**
	 * @param programes the programes to set
	 */
	public void setProgrames(List<Program> programes) {
		this.programes = programes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Institute [name=" + name 
				+ ", city=" + city + ", link=" + link
				+ ", programes=" + programes + "]";
	}
	
	
	
}
