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

public class Vsa1002UtefunzDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return Vsa1002UtefunzDao
	 */
	public static Vsa1002UtefunzDao create()
	{
		return new Vsa1002UtefunzDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return Vsa1002UtefunzDao
	 */
	public static Vsa1002UtefunzDao create(Connection conn)
	{
		return new Vsa1002UtefunzDaoImpl( conn );
	}

}
