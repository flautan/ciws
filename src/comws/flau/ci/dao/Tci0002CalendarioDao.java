/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package comws.flau.ci.dao;

import java.util.Date;
import comws.flau.ci.dto.*;
import comws.flau.ci.exceptions.*;

public interface Tci0002CalendarioDao
{
	/** 
	 * Inserts a new row in the tci0002_calendario table.
	 */
	public Tci0002CalendarioPk insert(Tci0002Calendario dto) throws Tci0002CalendarioDaoException;

	/** 
	 * Updates a single row in the tci0002_calendario table.
	 */
	public void update(Tci0002CalendarioPk pk, Tci0002Calendario dto) throws Tci0002CalendarioDaoException;

	/** 
	 * Deletes a single row in the tci0002_calendario table.
	 */
	public void delete(Tci0002CalendarioPk pk) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns the rows from the tci0002_calendario table that matches the specified primary-key value.
	 */
	public Tci0002Calendario findByPrimaryKey(Tci0002CalendarioPk pk) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'id = :id'.
	 */
	public Tci0002Calendario findByPrimaryKey(int id) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria ''.
	 */
	public Tci0002Calendario[] findAll() throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'id = :id'.
	 */
	public Tci0002Calendario[] findWhereIdEquals(int id) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'giorno = :giorno'.
	 */
	public Tci0002Calendario[] findWhereGiornoEquals(Date giorno) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'anno = :anno'.
	 */
	public Tci0002Calendario[] findWhereAnnoEquals(int anno) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'mesenum = :mesenum'.
	 */
	public Tci0002Calendario[] findWhereMesenumEquals(int mesenum) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'meselett = :meselett'.
	 */
	public Tci0002Calendario[] findWhereMeselettEquals(String meselett) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'giornosett = :giornosett'.
	 */
	public Tci0002Calendario[] findWhereGiornosettEquals(int giornosett) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the criteria 'giornosettlett = :giornosettlett'.
	 */
	public Tci0002Calendario[] findWhereGiornosettlettEquals(String giornosettlett) throws Tci0002CalendarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tci0002_calendario table that match the specified arbitrary SQL statement
	 */
	public Tci0002Calendario[] findByDynamicSelect(String sql, Object[] sqlParams) throws Tci0002CalendarioDaoException;

	/** 
	 * Returns all rows from the tci0002_calendario table that match the specified arbitrary SQL statement
	 */
	public Tci0002Calendario[] findByDynamicWhere(String sql, Object[] sqlParams) throws Tci0002CalendarioDaoException;

}
