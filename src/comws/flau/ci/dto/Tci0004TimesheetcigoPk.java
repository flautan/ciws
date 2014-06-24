/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package comws.flau.ci.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the tci0004_timesheetcigo table.
 */
public class Tci0004TimesheetcigoPk implements Serializable
{
	protected int iddipendente;

	protected int idcalendario;

	/** 
	 * This attribute represents whether the primitive attribute iddipendente is null.
	 */
	protected boolean iddipendenteNull;

	/** 
	 * This attribute represents whether the primitive attribute idcalendario is null.
	 */
	protected boolean idcalendarioNull;

	/** 
	 * Sets the value of iddipendente
	 */
	public void setIddipendente(int iddipendente)
	{
		this.iddipendente = iddipendente;
	}

	/** 
	 * Gets the value of iddipendente
	 */
	public int getIddipendente()
	{
		return iddipendente;
	}

	/** 
	 * Sets the value of idcalendario
	 */
	public void setIdcalendario(int idcalendario)
	{
		this.idcalendario = idcalendario;
	}

	/** 
	 * Gets the value of idcalendario
	 */
	public int getIdcalendario()
	{
		return idcalendario;
	}

	/**
	 * Method 'Tci0004TimesheetcigoPk'
	 * 
	 */
	public Tci0004TimesheetcigoPk()
	{
	}

	/**
	 * Method 'Tci0004TimesheetcigoPk'
	 * 
	 * @param iddipendente
	 * @param idcalendario
	 */
	public Tci0004TimesheetcigoPk(final int iddipendente, final int idcalendario)
	{
		this.iddipendente = iddipendente;
		this.idcalendario = idcalendario;
	}

	/** 
	 * Sets the value of iddipendenteNull
	 */
	public void setIddipendenteNull(boolean iddipendenteNull)
	{
		this.iddipendenteNull = iddipendenteNull;
	}

	/** 
	 * Gets the value of iddipendenteNull
	 */
	public boolean isIddipendenteNull()
	{
		return iddipendenteNull;
	}

	/** 
	 * Sets the value of idcalendarioNull
	 */
	public void setIdcalendarioNull(boolean idcalendarioNull)
	{
		this.idcalendarioNull = idcalendarioNull;
	}

	/** 
	 * Gets the value of idcalendarioNull
	 */
	public boolean isIdcalendarioNull()
	{
		return idcalendarioNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Tci0004TimesheetcigoPk)) {
			return false;
		}
		
		final Tci0004TimesheetcigoPk _cast = (Tci0004TimesheetcigoPk) _other;
		if (iddipendente != _cast.iddipendente) {
			return false;
		}
		
		if (idcalendario != _cast.idcalendario) {
			return false;
		}
		
		if (iddipendenteNull != _cast.iddipendenteNull) {
			return false;
		}
		
		if (idcalendarioNull != _cast.idcalendarioNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + iddipendente;
		_hashCode = 29 * _hashCode + idcalendario;
		_hashCode = 29 * _hashCode + (iddipendenteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idcalendarioNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "comws.flau.ci.dto.Tci0004TimesheetcigoPk: " );
		ret.append( "iddipendente=" + iddipendente );
		ret.append( ", idcalendario=" + idcalendario );
		return ret.toString();
	}

}