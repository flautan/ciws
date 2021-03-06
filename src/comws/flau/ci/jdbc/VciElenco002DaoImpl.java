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

public class VciElenco002DaoImpl extends AbstractDAO implements VciElenco002Dao
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
	protected final String SQL_SELECT = "SELECT PRG_UTE, id, giorno, anno, mesenum, meselett, giornosett, giornosettlett, hh, idsettimana FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column PRG_UTE
	 */
	protected static final int COLUMN_PRG_UTE = 1;

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 2;

	/** 
	 * Index of column giorno
	 */
	protected static final int COLUMN_GIORNO = 3;

	/** 
	 * Index of column anno
	 */
	protected static final int COLUMN_ANNO = 4;

	/** 
	 * Index of column mesenum
	 */
	protected static final int COLUMN_MESENUM = 5;

	/** 
	 * Index of column meselett
	 */
	protected static final int COLUMN_MESELETT = 6;

	/** 
	 * Index of column giornosett
	 */
	protected static final int COLUMN_GIORNOSETT = 7;

	/** 
	 * Index of column giornosettlett
	 */
	protected static final int COLUMN_GIORNOSETTLETT = 8;

	/** 
	 * Index of column hh
	 */
	protected static final int COLUMN_HH = 9;

	/** 
	 * Index of column idsettimana
	 */
	protected static final int COLUMN_IDSETTIMANA = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria ''.
	 */
	public VciElenco002[] findAll() throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'PRG_UTE = :prgUte'.
	 */
	public VciElenco002[] findWherePrgUteEquals(int prgUte) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRG_UTE = ? ORDER BY PRG_UTE", new Object[] {  new Integer(prgUte) } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'id = :id'.
	 */
	public VciElenco002[] findWhereIdEquals(int id) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'giorno = :giorno'.
	 */
	public VciElenco002[] findWhereGiornoEquals(Date giorno) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE giorno = ? ORDER BY giorno", new Object[] { giorno==null ? null : new java.sql.Timestamp( giorno.getTime() ) } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'anno = :anno'.
	 */
	public VciElenco002[] findWhereAnnoEquals(int anno) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE anno = ? ORDER BY anno", new Object[] {  new Integer(anno) } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'mesenum = :mesenum'.
	 */
	public VciElenco002[] findWhereMesenumEquals(int mesenum) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE mesenum = ? ORDER BY mesenum", new Object[] {  new Integer(mesenum) } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'meselett = :meselett'.
	 */
	public VciElenco002[] findWhereMeselettEquals(String meselett) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE meselett = ? ORDER BY meselett", new Object[] { meselett } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'giornosett = :giornosett'.
	 */
	public VciElenco002[] findWhereGiornosettEquals(int giornosett) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE giornosett = ? ORDER BY giornosett", new Object[] {  new Integer(giornosett) } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'giornosettlett = :giornosettlett'.
	 */
	public VciElenco002[] findWhereGiornosettlettEquals(String giornosettlett) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE giornosettlett = ? ORDER BY giornosettlett", new Object[] { giornosettlett } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'hh = :hh'.
	 */
	public VciElenco002[] findWhereHhEquals(int hh) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE hh = ? ORDER BY hh", new Object[] {  new Integer(hh) } );
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the criteria 'idsettimana = :idsettimana'.
	 */
	public VciElenco002[] findWhereIdsettimanaEquals(int idsettimana) throws VciElenco002DaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idsettimana = ? ORDER BY idsettimana", new Object[] {  new Integer(idsettimana) } );
	}

	/**
	 * Method 'VciElenco002DaoImpl'
	 * 
	 */
	public VciElenco002DaoImpl()
	{
	}

	/**
	 * Method 'VciElenco002DaoImpl'
	 * 
	 * @param userConn
	 */
	public VciElenco002DaoImpl(final java.sql.Connection userConn)
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
		return "group700_fig.vci_elenco002";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VciElenco002 fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VciElenco002 dto = new VciElenco002();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VciElenco002[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VciElenco002 dto = new VciElenco002();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VciElenco002 ret[] = new VciElenco002[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VciElenco002 dto, ResultSet rs) throws SQLException
	{
		dto.setPrgUte( rs.getInt( COLUMN_PRG_UTE ) );
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setGiorno( rs.getTimestamp(COLUMN_GIORNO ) );
		dto.setAnno( rs.getInt( COLUMN_ANNO ) );
		if (rs.wasNull()) {
			dto.setAnnoNull( true );
		}
		
		dto.setMesenum( rs.getInt( COLUMN_MESENUM ) );
		if (rs.wasNull()) {
			dto.setMesenumNull( true );
		}
		
		dto.setMeselett( rs.getString( COLUMN_MESELETT ) );
		dto.setGiornosett( rs.getInt( COLUMN_GIORNOSETT ) );
		if (rs.wasNull()) {
			dto.setGiornosettNull( true );
		}
		
		dto.setGiornosettlett( rs.getString( COLUMN_GIORNOSETTLETT ) );
		dto.setHh( rs.getInt( COLUMN_HH ) );
		if (rs.wasNull()) {
			dto.setHhNull( true );
		}
		
		dto.setIdsettimana( rs.getInt( COLUMN_IDSETTIMANA ) );
		if (rs.wasNull()) {
			dto.setIdsettimanaNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VciElenco002 dto)
	{
	}

	/** 
	 * Returns all rows from the vci_elenco002 table that match the specified arbitrary SQL statement
	 */
	public VciElenco002[] findByDynamicSelect(String sql, Object[] sqlParams) throws VciElenco002DaoException
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
			throw new VciElenco002DaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vci_elenco002 table that match the specified arbitrary SQL statement
	 */
	public VciElenco002[] findByDynamicWhere(String sql, Object[] sqlParams) throws VciElenco002DaoException
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
			throw new VciElenco002DaoException( "Exception: " + _e.getMessage(), _e );
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
