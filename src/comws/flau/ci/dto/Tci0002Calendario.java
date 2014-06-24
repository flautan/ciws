/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package comws.flau.ci.dto;

import comws.flau.ci.dao.*;
import comws.flau.ci.factory.*;
import comws.flau.ci.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class Tci0002Calendario implements Serializable
{
	/** 
	 * This attribute maps to the column id in the tci0002_calendario table.
	 */
	protected int id;

	/** 
	 * This attribute maps to the column giorno in the tci0002_calendario table.
	 */
	protected Date giorno;

	/** 
	 * This attribute maps to the column anno in the tci0002_calendario table.
	 */
	protected int anno;

	/** 
	 * This attribute represents whether the primitive attribute anno is null.
	 */
	protected boolean annoNull = true;

	/** 
	 * This attribute maps to the column mesenum in the tci0002_calendario table.
	 */
	protected int mesenum;

	/** 
	 * This attribute represents whether the primitive attribute mesenum is null.
	 */
	protected boolean mesenumNull = true;

	/** 
	 * This attribute maps to the column meselett in the tci0002_calendario table.
	 */
	protected String meselett;

	/** 
	 * This attribute maps to the column giornosett in the tci0002_calendario table.
	 */
	protected int giornosett;

	/** 
	 * This attribute represents whether the primitive attribute giornosett is null.
	 */
	protected boolean giornosettNull = true;

	/** 
	 * This attribute maps to the column giornosettlett in the tci0002_calendario table.
	 */
	protected String giornosettlett;

	/**
	 * Method 'Tci0002Calendario'
	 * 
	 */
	public Tci0002Calendario()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return int
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Method 'getGiorno'
	 * 
	 * @return Date
	 */
	public Date getGiorno()
	{
		return giorno;
	}

	/**
	 * Method 'setGiorno'
	 * 
	 * @param giorno
	 */
	public void setGiorno(Date giorno)
	{
		this.giorno = giorno;
	}

	/**
	 * Method 'getAnno'
	 * 
	 * @return int
	 */
	public int getAnno()
	{
		return anno;
	}

	/**
	 * Method 'setAnno'
	 * 
	 * @param anno
	 */
	public void setAnno(int anno)
	{
		this.anno = anno;
		this.annoNull = false;
	}

	/**
	 * Method 'setAnnoNull'
	 * 
	 * @param value
	 */
	public void setAnnoNull(boolean value)
	{
		this.annoNull = value;
	}

	/**
	 * Method 'isAnnoNull'
	 * 
	 * @return boolean
	 */
	public boolean isAnnoNull()
	{
		return annoNull;
	}

	/**
	 * Method 'getMesenum'
	 * 
	 * @return int
	 */
	public int getMesenum()
	{
		return mesenum;
	}

	/**
	 * Method 'setMesenum'
	 * 
	 * @param mesenum
	 */
	public void setMesenum(int mesenum)
	{
		this.mesenum = mesenum;
		this.mesenumNull = false;
	}

	/**
	 * Method 'setMesenumNull'
	 * 
	 * @param value
	 */
	public void setMesenumNull(boolean value)
	{
		this.mesenumNull = value;
	}

	/**
	 * Method 'isMesenumNull'
	 * 
	 * @return boolean
	 */
	public boolean isMesenumNull()
	{
		return mesenumNull;
	}

	/**
	 * Method 'getMeselett'
	 * 
	 * @return String
	 */
	public String getMeselett()
	{
		return meselett;
	}

	/**
	 * Method 'setMeselett'
	 * 
	 * @param meselett
	 */
	public void setMeselett(String meselett)
	{
		this.meselett = meselett;
	}

	/**
	 * Method 'getGiornosett'
	 * 
	 * @return int
	 */
	public int getGiornosett()
	{
		return giornosett;
	}

	/**
	 * Method 'setGiornosett'
	 * 
	 * @param giornosett
	 */
	public void setGiornosett(int giornosett)
	{
		this.giornosett = giornosett;
		this.giornosettNull = false;
	}

	/**
	 * Method 'setGiornosettNull'
	 * 
	 * @param value
	 */
	public void setGiornosettNull(boolean value)
	{
		this.giornosettNull = value;
	}

	/**
	 * Method 'isGiornosettNull'
	 * 
	 * @return boolean
	 */
	public boolean isGiornosettNull()
	{
		return giornosettNull;
	}

	/**
	 * Method 'getGiornosettlett'
	 * 
	 * @return String
	 */
	public String getGiornosettlett()
	{
		return giornosettlett;
	}

	/**
	 * Method 'setGiornosettlett'
	 * 
	 * @param giornosettlett
	 */
	public void setGiornosettlett(String giornosettlett)
	{
		this.giornosettlett = giornosettlett;
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
		
		if (!(_other instanceof Tci0002Calendario)) {
			return false;
		}
		
		final Tci0002Calendario _cast = (Tci0002Calendario) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (giorno == null ? _cast.giorno != giorno : !giorno.equals( _cast.giorno )) {
			return false;
		}
		
		if (anno != _cast.anno) {
			return false;
		}
		
		if (annoNull != _cast.annoNull) {
			return false;
		}
		
		if (mesenum != _cast.mesenum) {
			return false;
		}
		
		if (mesenumNull != _cast.mesenumNull) {
			return false;
		}
		
		if (meselett == null ? _cast.meselett != meselett : !meselett.equals( _cast.meselett )) {
			return false;
		}
		
		if (giornosett != _cast.giornosett) {
			return false;
		}
		
		if (giornosettNull != _cast.giornosettNull) {
			return false;
		}
		
		if (giornosettlett == null ? _cast.giornosettlett != giornosettlett : !giornosettlett.equals( _cast.giornosettlett )) {
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
		_hashCode = 29 * _hashCode + id;
		if (giorno != null) {
			_hashCode = 29 * _hashCode + giorno.hashCode();
		}
		
		_hashCode = 29 * _hashCode + anno;
		_hashCode = 29 * _hashCode + (annoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + mesenum;
		_hashCode = 29 * _hashCode + (mesenumNull ? 1 : 0);
		if (meselett != null) {
			_hashCode = 29 * _hashCode + meselett.hashCode();
		}
		
		_hashCode = 29 * _hashCode + giornosett;
		_hashCode = 29 * _hashCode + (giornosettNull ? 1 : 0);
		if (giornosettlett != null) {
			_hashCode = 29 * _hashCode + giornosettlett.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return Tci0002CalendarioPk
	 */
	public Tci0002CalendarioPk createPk()
	{
		return new Tci0002CalendarioPk(id);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "comws.flau.ci.dto.Tci0002Calendario: " );
		ret.append( "id=" + id );
		ret.append( ", giorno=" + giorno );
		ret.append( ", anno=" + anno );
		ret.append( ", mesenum=" + mesenum );
		ret.append( ", meselett=" + meselett );
		ret.append( ", giornosett=" + giornosett );
		ret.append( ", giornosettlett=" + giornosettlett );
		return ret.toString();
	}

}
