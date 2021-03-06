/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package comws.flau.ci.jdbc;

import comws.flau.ci.dao.*;
import comws.flau.ci.factory.*;
import java.util.Date;
import comws.flau.ci.dto.*;
import comws.flau.ci.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Tsa1010UtenzaDaoImpl extends AbstractDAO implements Tsa1010UtenzaDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT PRG_UTE, DES_UTE, COD_FISCALE, DES_IND_EMAIL, DES_IND_EMAIL_ALT, DES_PSW, DES_FILE_LDAP, COD_PGM_ULT_MOV, COD_UTE_ULT_MOV, DAT_ORA_ULT_MOV, FLG_VAL_UTE, DES_COG, DES_NOM FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( PRG_UTE, DES_UTE, COD_FISCALE, DES_IND_EMAIL, DES_IND_EMAIL_ALT, DES_PSW, DES_FILE_LDAP, COD_PGM_ULT_MOV, COD_UTE_ULT_MOV, DAT_ORA_ULT_MOV, FLG_VAL_UTE, DES_COG, DES_NOM ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET PRG_UTE = ?, DES_UTE = ?, COD_FISCALE = ?, DES_IND_EMAIL = ?, DES_IND_EMAIL_ALT = ?, DES_PSW = ?, DES_FILE_LDAP = ?, COD_PGM_ULT_MOV = ?, COD_UTE_ULT_MOV = ?, DAT_ORA_ULT_MOV = ?, FLG_VAL_UTE = ?, DES_COG = ?, DES_NOM = ? WHERE PRG_UTE = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE PRG_UTE = ?";

	/** 
	 * Index of column PRG_UTE
	 */
	protected static final int COLUMN_PRG_UTE = 1;

	/** 
	 * Index of column DES_UTE
	 */
	protected static final int COLUMN_DES_UTE = 2;

	/** 
	 * Index of column COD_FISCALE
	 */
	protected static final int COLUMN_COD_FISCALE = 3;

	/** 
	 * Index of column DES_IND_EMAIL
	 */
	protected static final int COLUMN_DES_IND_EMAIL = 4;

	/** 
	 * Index of column DES_IND_EMAIL_ALT
	 */
	protected static final int COLUMN_DES_IND_EMAIL_ALT = 5;

	/** 
	 * Index of column DES_PSW
	 */
	protected static final int COLUMN_DES_PSW = 6;

	/** 
	 * Index of column DES_FILE_LDAP
	 */
	protected static final int COLUMN_DES_FILE_LDAP = 7;

	/** 
	 * Index of column COD_PGM_ULT_MOV
	 */
	protected static final int COLUMN_COD_PGM_ULT_MOV = 8;

	/** 
	 * Index of column COD_UTE_ULT_MOV
	 */
	protected static final int COLUMN_COD_UTE_ULT_MOV = 9;

	/** 
	 * Index of column DAT_ORA_ULT_MOV
	 */
	protected static final int COLUMN_DAT_ORA_ULT_MOV = 10;

	/** 
	 * Index of column FLG_VAL_UTE
	 */
	protected static final int COLUMN_FLG_VAL_UTE = 11;

	/** 
	 * Index of column DES_COG
	 */
	protected static final int COLUMN_DES_COG = 12;

	/** 
	 * Index of column DES_NOM
	 */
	protected static final int COLUMN_DES_NOM = 13;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 13;

	/** 
	 * Index of primary-key column PRG_UTE
	 */
	protected static final int PK_COLUMN_PRG_UTE = 1;

	/** 
	 * Inserts a new row in the tsa1010_utenza table.
	 */
	public Tsa1010UtenzaPk insert(Tsa1010Utenza dto) throws Tsa1010UtenzaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getPrgUte() );
			stmt.setString( index++, dto.getDesUte() );
			stmt.setString( index++, dto.getCodFiscale() );
			stmt.setString( index++, dto.getDesIndEmail() );
			stmt.setString( index++, dto.getDesIndEmailAlt() );
			stmt.setString( index++, dto.getDesPsw() );
			stmt.setString( index++, dto.getDesFileLdap() );
			stmt.setString( index++, dto.getCodPgmUltMov() );
			stmt.setString( index++, dto.getCodUteUltMov() );
			stmt.setDate(index++, dto.getDatOraUltMov()==null ? null : new java.sql.Date( dto.getDatOraUltMov().getTime() ) );
			stmt.setString( index++, dto.getFlgValUte() );
			stmt.setString( index++, dto.getDesCog() );
			stmt.setString( index++, dto.getDesNom() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new Tsa1010UtenzaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the tsa1010_utenza table.
	 */
	public void update(Tsa1010UtenzaPk pk, Tsa1010Utenza dto) throws Tsa1010UtenzaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getPrgUte() );
			stmt.setString( index++, dto.getDesUte() );
			stmt.setString( index++, dto.getCodFiscale() );
			stmt.setString( index++, dto.getDesIndEmail() );
			stmt.setString( index++, dto.getDesIndEmailAlt() );
			stmt.setString( index++, dto.getDesPsw() );
			stmt.setString( index++, dto.getDesFileLdap() );
			stmt.setString( index++, dto.getCodPgmUltMov() );
			stmt.setString( index++, dto.getCodUteUltMov() );
			stmt.setDate(index++, dto.getDatOraUltMov()==null ? null : new java.sql.Date( dto.getDatOraUltMov().getTime() ) );
			stmt.setString( index++, dto.getFlgValUte() );
			stmt.setString( index++, dto.getDesCog() );
			stmt.setString( index++, dto.getDesNom() );
			stmt.setInt( 14, pk.getPrgUte() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new Tsa1010UtenzaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the tsa1010_utenza table.
	 */
	public void delete(Tsa1010UtenzaPk pk) throws Tsa1010UtenzaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getPrgUte() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new Tsa1010UtenzaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the tsa1010_utenza table that matches the specified primary-key value.
	 */
	public Tsa1010Utenza findByPrimaryKey(Tsa1010UtenzaPk pk) throws Tsa1010UtenzaDaoException
	{
		return findByPrimaryKey( pk.getPrgUte() );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'PRG_UTE = :prgUte'.
	 */
	public Tsa1010Utenza findByPrimaryKey(int prgUte) throws Tsa1010UtenzaDaoException
	{
		Tsa1010Utenza ret[] = findByDynamicSelect( SQL_SELECT + " WHERE PRG_UTE = ?", new Object[] {  new Integer(prgUte) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria ''.
	 */
	public Tsa1010Utenza[] findAll() throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY PRG_UTE", null );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'PRG_UTE = :prgUte'.
	 */
	public Tsa1010Utenza[] findWherePrgUteEquals(int prgUte) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRG_UTE = ? ORDER BY PRG_UTE", new Object[] {  new Integer(prgUte) } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_UTE = :desUte AND DES_PSW = :desPsw'.
	 */
	public Tsa1010Utenza[] findWhereDesUteEquals(String desUte, String desPsw) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DES_UTE = ? AND DES_PSW = ? ORDER BY DES_UTE", new Object[] { desUte, desPsw } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'COD_FISCALE = :codFiscale'.
	 */
	public Tsa1010Utenza[] findWhereCodFiscaleEquals(String codFiscale) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COD_FISCALE = ? ORDER BY COD_FISCALE", new Object[] { codFiscale } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_IND_EMAIL = :desIndEmail'.
	 */
	public Tsa1010Utenza[] findWhereDesIndEmailEquals(String desIndEmail) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DES_IND_EMAIL = ? ORDER BY DES_IND_EMAIL", new Object[] { desIndEmail } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_IND_EMAIL_ALT = :desIndEmailAlt'.
	 */
	public Tsa1010Utenza[] findWhereDesIndEmailAltEquals(String desIndEmailAlt) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DES_IND_EMAIL_ALT = ? ORDER BY DES_IND_EMAIL_ALT", new Object[] { desIndEmailAlt } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_PSW = :desPsw'.
	 */
	public Tsa1010Utenza[] findWhereDesPswEquals(String desPsw) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DES_PSW = ? ORDER BY DES_PSW", new Object[] { desPsw } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_FILE_LDAP = :desFileLdap'.
	 */
	public Tsa1010Utenza[] findWhereDesFileLdapEquals(String desFileLdap) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DES_FILE_LDAP = ? ORDER BY DES_FILE_LDAP", new Object[] { desFileLdap } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'COD_PGM_ULT_MOV = :codPgmUltMov'.
	 */
	public Tsa1010Utenza[] findWhereCodPgmUltMovEquals(String codPgmUltMov) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COD_PGM_ULT_MOV = ? ORDER BY COD_PGM_ULT_MOV", new Object[] { codPgmUltMov } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'COD_UTE_ULT_MOV = :codUteUltMov'.
	 */
	public Tsa1010Utenza[] findWhereCodUteUltMovEquals(String codUteUltMov) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COD_UTE_ULT_MOV = ? ORDER BY COD_UTE_ULT_MOV", new Object[] { codUteUltMov } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DAT_ORA_ULT_MOV = :datOraUltMov'.
	 */
	public Tsa1010Utenza[] findWhereDatOraUltMovEquals(Date datOraUltMov) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DAT_ORA_ULT_MOV = ? ORDER BY DAT_ORA_ULT_MOV", new Object[] { datOraUltMov==null ? null : new java.sql.Date( datOraUltMov.getTime() ) } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'FLG_VAL_UTE = :flgValUte'.
	 */
	public Tsa1010Utenza[] findWhereFlgValUteEquals(String flgValUte) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FLG_VAL_UTE = ? ORDER BY FLG_VAL_UTE", new Object[] { flgValUte } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_COG = :desCog'.
	 */
	public Tsa1010Utenza[] findWhereDesCogEquals(String desCog) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DES_COG = ? ORDER BY DES_COG", new Object[] { desCog } );
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the criteria 'DES_NOM = :desNom'.
	 */
	public Tsa1010Utenza[] findWhereDesNomEquals(String desNom) throws Tsa1010UtenzaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DES_NOM = ? ORDER BY DES_NOM", new Object[] { desNom } );
	}

	/**
	 * Method 'Tsa1010UtenzaDaoImpl'
	 * 
	 */
	public Tsa1010UtenzaDaoImpl()
	{
	}

	/**
	 * Method 'Tsa1010UtenzaDaoImpl'
	 * 
	 * @param userConn
	 */
	public Tsa1010UtenzaDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "group700_fig.tsa1010_utenza";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Tsa1010Utenza fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Tsa1010Utenza dto = new Tsa1010Utenza();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Tsa1010Utenza[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Tsa1010Utenza dto = new Tsa1010Utenza();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Tsa1010Utenza ret[] = new Tsa1010Utenza[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Tsa1010Utenza dto, ResultSet rs) throws SQLException
	{
		dto.setPrgUte( rs.getInt( COLUMN_PRG_UTE ) );
		dto.setDesUte( rs.getString( COLUMN_DES_UTE ) );
		dto.setCodFiscale( rs.getString( COLUMN_COD_FISCALE ) );
		dto.setDesIndEmail( rs.getString( COLUMN_DES_IND_EMAIL ) );
		dto.setDesIndEmailAlt( rs.getString( COLUMN_DES_IND_EMAIL_ALT ) );
		dto.setDesPsw( rs.getString( COLUMN_DES_PSW ) );
		dto.setDesFileLdap( rs.getString( COLUMN_DES_FILE_LDAP ) );
		dto.setCodPgmUltMov( rs.getString( COLUMN_COD_PGM_ULT_MOV ) );
		dto.setCodUteUltMov( rs.getString( COLUMN_COD_UTE_ULT_MOV ) );
		dto.setDatOraUltMov( rs.getDate(COLUMN_DAT_ORA_ULT_MOV ) );
		dto.setFlgValUte( rs.getString( COLUMN_FLG_VAL_UTE ) );
		dto.setDesCog( rs.getString( COLUMN_DES_COG ) );
		dto.setDesNom( rs.getString( COLUMN_DES_NOM ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Tsa1010Utenza dto)
	{
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the specified arbitrary SQL statement
	 */
	public Tsa1010Utenza[] findByDynamicSelect(String sql, Object[] sqlParams) throws Tsa1010UtenzaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new Tsa1010UtenzaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the tsa1010_utenza table that match the specified arbitrary SQL statement
	 */
	public Tsa1010Utenza[] findByDynamicWhere(String sql, Object[] sqlParams) throws Tsa1010UtenzaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new Tsa1010UtenzaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
