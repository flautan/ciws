/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package comws.flau.ci.factory;

import java.sql.Connection;
import comws.flau.ci.dao.*;
import comws.flau.ci.jdbc.*;

public class Tci0004TimesheetcigoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return Tci0004TimesheetcigoDao
	 */
	public static Tci0004TimesheetcigoDao create()
	{
		return new Tci0004TimesheetcigoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return Tci0004TimesheetcigoDao
	 */
	public static Tci0004TimesheetcigoDao create(Connection conn)
	{
		return new Tci0004TimesheetcigoDaoImpl( conn );
	}

}
