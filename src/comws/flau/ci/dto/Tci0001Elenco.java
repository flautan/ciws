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

public class Tci0001Elenco implements Serializable
{
	/** 
	 * This attribute maps to the column prg_ute in the tci0001_elenco table.
	 */
	protected int prgUte;

	/** 
	 * This attribute maps to the column des_ute in the tci0001_elenco table.
	 */
	protected String desUte;

	/** 
	 * This attribute maps to the column des_cog in the tci0001_elenco table.
	 */
	protected String desCog;

	/** 
	 * This attribute maps to the column des_nom in the tci0001_elenco table.
	 */
	protected String desNom;

	/** 
	 * This attribute maps to the column des_ind_email in the tci0001_elenco table.
	 */
	protected String desIndEmail;

	/** 
	 * This attribute maps to the column des_psw in the tci0001_elenco table.
	 */
	protected String desPsw;

	/**
	 * Method 'Tci0001Elenco'
	 * 
	 */
	public Tci0001Elenco()
	{
	}

	/**
	 * Method 'getPrgUte'
	 * 
	 * @return int
	 */
	public int getPrgUte()
	{
		return prgUte;
	}

	/**
	 * Method 'setPrgUte'
	 * 
	 * @param prgUte
	 */
	public void setPrgUte(int prgUte)
	{
		this.prgUte = prgUte;
	}

	/**
	 * Method 'getDesUte'
	 * 
	 * @return String
	 */
	public String getDesUte()
	{
		return desUte;
	}

	/**
	 * Method 'setDesUte'
	 * 
	 * @param desUte
	 */
	public void setDesUte(String desUte)
	{
		this.desUte = desUte;
	}

	/**
	 * Method 'getDesCog'
	 * 
	 * @return String
	 */
	public String getDesCog()
	{
		return desCog;
	}

	/**
	 * Method 'setDesCog'
	 * 
	 * @param desCog
	 */
	public void setDesCog(String desCog)
	{
		this.desCog = desCog;
	}

	/**
	 * Method 'getDesNom'
	 * 
	 * @return String
	 */
	public String getDesNom()
	{
		return desNom;
	}

	/**
	 * Method 'setDesNom'
	 * 
	 * @param desNom
	 */
	public void setDesNom(String desNom)
	{
		this.desNom = desNom;
	}

	/**
	 * Method 'getDesIndEmail'
	 * 
	 * @return String
	 */
	public String getDesIndEmail()
	{
		return desIndEmail;
	}

	/**
	 * Method 'setDesIndEmail'
	 * 
	 * @param desIndEmail
	 */
	public void setDesIndEmail(String desIndEmail)
	{
		this.desIndEmail = desIndEmail;
	}

	/**
	 * Method 'getDesPsw'
	 * 
	 * @return String
	 */
	public String getDesPsw()
	{
		return desPsw;
	}

	/**
	 * Method 'setDesPsw'
	 * 
	 * @param desPsw
	 */
	public void setDesPsw(String desPsw)
	{
		this.desPsw = desPsw;
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
		
		if (!(_other instanceof Tci0001Elenco)) {
			return false;
		}
		
		final Tci0001Elenco _cast = (Tci0001Elenco) _other;
		if (prgUte != _cast.prgUte) {
			return false;
		}
		
		if (desUte == null ? _cast.desUte != desUte : !desUte.equals( _cast.desUte )) {
			return false;
		}
		
		if (desCog == null ? _cast.desCog != desCog : !desCog.equals( _cast.desCog )) {
			return false;
		}
		
		if (desNom == null ? _cast.desNom != desNom : !desNom.equals( _cast.desNom )) {
			return false;
		}
		
		if (desIndEmail == null ? _cast.desIndEmail != desIndEmail : !desIndEmail.equals( _cast.desIndEmail )) {
			return false;
		}
		
		if (desPsw == null ? _cast.desPsw != desPsw : !desPsw.equals( _cast.desPsw )) {
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
		_hashCode = 29 * _hashCode + prgUte;
		if (desUte != null) {
			_hashCode = 29 * _hashCode + desUte.hashCode();
		}
		
		if (desCog != null) {
			_hashCode = 29 * _hashCode + desCog.hashCode();
		}
		
		if (desNom != null) {
			_hashCode = 29 * _hashCode + desNom.hashCode();
		}
		
		if (desIndEmail != null) {
			_hashCode = 29 * _hashCode + desIndEmail.hashCode();
		}
		
		if (desPsw != null) {
			_hashCode = 29 * _hashCode + desPsw.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return Tci0001ElencoPk
	 */
	public Tci0001ElencoPk createPk()
	{
		return new Tci0001ElencoPk(prgUte);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "comws.flau.ci.dto.Tci0001Elenco: " );
		ret.append( "prgUte=" + prgUte );
		ret.append( ", desUte=" + desUte );
		ret.append( ", desCog=" + desCog );
		ret.append( ", desNom=" + desNom );
		ret.append( ", desIndEmail=" + desIndEmail );
		ret.append( ", desPsw=" + desPsw );
		return ret.toString();
	}

}
