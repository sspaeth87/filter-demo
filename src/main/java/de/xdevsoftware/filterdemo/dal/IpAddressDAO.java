package de.xdevsoftware.filterdemo.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;

import de.xdevsoftware.filterdemo.domain.IpAddress;

public class IpAddressDAO extends JpaDataAccessObject.Default<IpAddress, Integer>
{
	
	public final static IpAddressDAO INSTANCE = new IpAddressDAO();
	
	public IpAddressDAO()
	{
		super(IpAddress.class);
	}
	
}
