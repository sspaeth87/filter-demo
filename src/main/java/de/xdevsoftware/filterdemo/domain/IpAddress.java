package de.xdevsoftware.filterdemo.domain;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rapidclipse.framework.server.data.DAO;

import de.xdevsoftware.filterdemo.dal.IpAddressDAO;

@Entity
@DAO(IpAddressDAO.class)
@Cacheable(true)
@Table(name = "IPADDRESS")
public class IpAddress implements Serializable
{
	
	private int id;
	private String ipAddress;
	
	public IpAddress()
	{
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	@Column(name = "IPADDRESS")
	public String getIpAddress()
	{
		return ipAddress;
	}

	public void setIpAddress(String noname)
	{
		this.ipAddress = noname;
	}
	
}
