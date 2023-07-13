package de.xdevsoftware.filterdemo.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;

import de.xdevsoftware.filterdemo.domain.Computer;

public class ComputerDAO extends JpaDataAccessObject.Default<Computer, Integer>
{
	
	public final static ComputerDAO INSTANCE = new ComputerDAO();
	
	public ComputerDAO()
	{
		super(Computer.class);
	}
	
}
