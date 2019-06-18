package com.HP.CustomerSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CTMUSER")
public class ctmuser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "USER_ID", nullable = false)
	private String USER_ID;
	@Column(name = "USERNAME")
	private String USERNAME;
	@Column(name = "PASSWORD")
	private String PASSWORD;
	
	public ctmuser() {
		
	}
	public ctmuser( String uSER_ID, String uSERNAME, String pASSWORD) {
		super();
		USER_ID = uSER_ID;
		USERNAME = uSERNAME;
		PASSWORD = pASSWORD;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the uSER_ID
	 */
	public String getUSER_ID() {
		return USER_ID;
	}
	/**
	 * @param uSER_ID the uSER_ID to set
	 */
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	/**
	 * @return the uSERNAME
	 */
	public String getUSERNAME() {
		return USERNAME;
	}
	/**
	 * @param uSERNAME the uSERNAME to set
	 */
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	/**
	 * @return the pASSWORD
	 */
	public String getPASSWORD() {
		return PASSWORD;
	}
	/**
	 * @param pASSWORD the pASSWORD to set
	 */
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
	
}
