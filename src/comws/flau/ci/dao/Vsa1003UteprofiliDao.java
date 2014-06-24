/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package comws.flau.ci.dao;

import comws.flau.ci.dto.*;
import comws.flau.ci.exceptions.*;

public interface Vsa1003UteprofiliDao
{
	/** 
	 * Returns all rows from the vsa1003_uteprofili table that match the criteria ''.
	 */
	public Vsa1003Uteprofili[] findAll() throws Vsa1003UteprofiliDaoException;

	/** 
	 * Returns all rows from the vsa1003_uteprofili table that match the criteria 'PRG_APP = :prgApp AND PRG_UTE = :prgUte AND PRG_PRF_PDR = :prgPrfPdr  AND RG_PRF_FGL = :prgPrfFgl'.
	 */
	public Vsa1003Uteprofili[] findWherePrgAppUtePdrFglEquals(int prgApp, int prgUte, int prgPrfPdr, int prgPrfFgl) throws Vsa1003UteprofiliDaoException;

	/** 
	 * Returns all rows from the vsa1003_uteprofili table that match the criteria 'PRG_UTE = :prgUte'.
	 */
	public Vsa1003Uteprofili[] findWherePrgUteEquals(int prgUte) throws Vsa1003UteprofiliDaoException;

	/** 
	 * Returns all rows from the vsa1003_uteprofili table that match the criteria 'DES_PRF_PDR = :desPrfPdr'.
	 */
	public Vsa1003Uteprofili[] findWhereDesPrfPdrEquals(String desPrfPdr) throws Vsa1003UteprofiliDaoException;

	/** 
	 * Returns all rows from the vsa1003_uteprofili table that match the criteria 'DES_PRF = :desPrf'.
	 */
	public Vsa1003Uteprofili[] findWhereDesPrfEquals(String desPrf) throws Vsa1003UteprofiliDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the vsa1003_uteprofili table that match the specified arbitrary SQL statement
	 */
	public Vsa1003Uteprofili[] findByDynamicSelect(String sql, Object[] sqlParams) throws Vsa1003UteprofiliDaoException;

	/** 
	 * Returns all rows from the vsa1003_uteprofili table that match the specified arbitrary SQL statement
	 */
	public Vsa1003Uteprofili[] findByDynamicWhere(String sql, Object[] sqlParams) throws Vsa1003UteprofiliDaoException;

}
