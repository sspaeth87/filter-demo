
package de.xdevsoftware.filterdemo.domain;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;

import de.xdevsoftware.filterdemo.dal.ComputerDAO;


@Entity
@DAO(ComputerDAO.class)
@Cacheable(true)
@Table(name = "COMPUTER")
@SuppressWarnings("unused")
public class Computer implements Serializable
{

	private int       id;
	private String    computerName;
	private IpAddress ipAddress;
	private IpAddress ipAddress2;
	private IpAddress ipAddress3;
	
	private String ipAddressTransient;
	private String ipAddressTransient2;
	private String ipAddressTransient3;
	
	public Computer()
	{
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public int getId()
	{
		return this.id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}
	
	@Column(name = "COMPUTERNAME")
	@Caption("Computer")
	public String getComputerName()
	{
		return this.computerName;
	}
	
	public void setComputerName(final String noname)
	{
		this.computerName = noname;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IPADDRESS_ID")
	public IpAddress getIpAddress()
	{
		return this.ipAddress;
	}
	
	public void setIpAddress(final IpAddress ipAddress)
	{
		this.ipAddress = ipAddress;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IPADDRESS2_ID")
	public IpAddress getIpAddress2()
	{
		return this.ipAddress2;
	}
	
	public void setIpAddress2(final IpAddress ipAddress2)
	{
		this.ipAddress2 = ipAddress2;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IPADDRESS3_ID")
	public IpAddress getIpAddress3()
	{
		return this.ipAddress3;
	}
	
	public void setIpAddress3(final IpAddress ipAddress3)
	{
		this.ipAddress3 = ipAddress3;
	}
	
	@Transient
	@Column(name = "IPADDRESSTRANSIENT")
	@Caption("IP Address 1")
	public String getIpAddressTransient()
	{
		return this.ipAddress.getIpAddress();
	}
	
	public void setIpAddressTransient(final String noname)
	{
		this.ipAddressTransient = noname;
	}
	
	@Transient
	@Column(name = "IPADDRESSTRANSIENT2")
	@Caption("IP Address 2")
	public String getIpAddressTransient2()
	{
		return this.ipAddress2.getIpAddress();
	}
	
	public void setIpAddressTransient2(final String noname)
	{
		this.ipAddressTransient2 = noname;
	}
	
	@Transient
	@Column(name = "IPADDRESSTRANSIENT3")
	@Caption("IP Address 3")
	public String getIpAddressTransient3()
	{
		return this.ipAddress3.getIpAddress();
	}
	
	public void setIpAddressTransient3(final String noname)
	{
		this.ipAddressTransient3 = noname;
	}

}
