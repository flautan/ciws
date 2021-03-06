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

public interface Tsa1010UtenzaDao
{
	/** 
	 * Inserts a new row in the tsa1010_utenza table.
	 */
	public Tsa1010UtenzaPk insert(Tsa1010Utenza dto) throws Tsa1010UtenzaDaoException;

	/** 
	 * Updates a single row in the tsa1010_utenza table.
	 */
	public void update(Tsa1010UtenzaPk pk, Tsa1010Utenza dto) throws Tsa1010UtenzaDaoException;

	/** 
	 * Deletes a single row in the tsa1010_utenza table.
	 */
	public void delete(Tsa1010UtenzaPk pk) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns the rows from the tsa1010_utenza table that matches the specified primary-key value.
	 */
	public Tsa1010Utenza findByPrimaryKey(Tsa1010UtenzaPk pk) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'PRG_UTE = :prgUte'.
	 */
	public Tsa1010Utenza findByPrimaryKey(int prgUte) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria ''.
	 */
	public Tsa1010Utenza[] findAll() throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'PRG_UTE = :prgUte'.
	 */
	public Tsa1010Utenza[] findWherePrgUteEquals(int prgUte) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_UTE = :desUte AND DES_PSW = :desPsw'.
	 */
	public Tsa1010Utenza[] findWhereDesUteEquals(String desUte, String desPsw) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'COD_FISCALE = :codFiscale'.
	 */
	public Tsa1010Utenza[] findWhereCodFiscaleEquals(String codFiscale) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_IND_EMAIL = :desIndEmail'.
	 */
	public Tsa1010Utenza[] findWhereDesIndEmailEquals(String desIndEmail) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_IND_EMAIL_ALT = :desIndEmailAlt'.
	 */
	public Tsa1010Utenza[] findWhereDesIndEmailAltEquals(String desIndEmailAlt) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_PSW = :desPsw'.
	 */
	public Tsa1010Utenza[] findWhereDesPswEquals(String desPsw) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_FILE_LDAP = :desFileLdap'.
	 */
	public Tsa1010Utenza[] findWhereDesFileLdapEquals(String desFileLdap) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'COD_PGM_ULT_MOV = :codPgmUltMov'.
	 */
	public Tsa1010Utenza[] findWhereCodPgmUltMovEquals(String codPgmUltMov) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'COD_UTE_ULT_MOV = :codUteUltMov'.
	 */
	public Tsa1010Utenza[] findWhereCodUteUltMovEquals(String codUteUltMov) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DAT_ORA_ULT_MOV = :datOraUltMov'.
	 */
	public Tsa1010Utenza[] findWhereDatOraUltMovEquals(Date datOraUltMov) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'FLG_VAL_UTE = :flgValUte'.
	 */
	public Tsa1010Utenza[] findWhereFlgValUteEquals(String flgValUte) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_COG = :desCog'.
	 */
	public Tsa1010Utenza[] findWhereDesCogEquals(String desCog) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_NOM = :desNom'.
	 */
	public Tsa1010Utenza[] findWhereDesNomEquals(String desNom) throws Tsa1010UtenzaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the specified arbitrary SQL statement
	 */
	public Tsa1010Utenza[] findByDynamicSelect(String sql, Object[] sqlParams) throws Tsa1010UtenzaDaoException;

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the specified arbitrary SQL statement
	 */
	public Tsa1010Utenza[] findByDynamicWhere(String sql, Object[] sqlParams) throws Tsa1010UtenzaDaoException;

}
