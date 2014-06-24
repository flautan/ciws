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

public class Tci2000Documenti implements Serializable
{
	/** 
	 * This attribute maps to the column PRG_DOC in the tci2000_documenti table.
	 */
	protected int prgDoc;

	/** 
	 * This attribute maps to the column DES_DOC in the tci2000_documenti table.
	 */
	protected String desDoc;

	/** 
	 * This attribute maps to the column DOC in the tci2000_documenti table.
	 */
	protected byte[] doc;

	/**
	 * Method 'Tci2000Documenti'
	 * 
	 */
	public Tci2000Documenti()
	{
	}

	/**
	 * Method 'getPrgDoc'
	 * 
	 * @return int
	 */
	public int getPrgDoc()
	{
		return prgDoc;
	}

	/**
	 * Method 'setPrgDoc'
	 * 
	 * @param prgDoc
	 */
	public void setPrgDoc(int prgDoc)
	{
		this.prgDoc = prgDoc;
	}

	/**
	 * Method 'getDesDoc'
	 * 
	 * @return String
	 */
	public String getDesDoc()
	{
		return desDoc;
	}

	/**
	 * Method 'setDesDoc'
	 * 
	 * @param desDoc
	 */
	public void setDesDoc(String desDoc)
	{
		this.desDoc = desDoc;
	}

	/**
	 * Method 'getDoc'
	 * 
	 * @return byte[]
	 */
	public byte[] getDoc()
	{
		return doc;
	}

	/**
	 * Method 'setDoc'
	 * 
	 * @param doc
	 */
	public void setDoc(byte[] doc)
	{
		this.doc = doc;
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
		
		if (!(_other instanceof Tci2000Documenti)) {
			return false;
		}
		
		final Tci2000Documenti _cast = (Tci2000Documenti) _other;
		if (prgDoc != _cast.prgDoc) {
			return false;
		}
		
		if (desDoc == null ? _cast.desDoc != desDoc : !desDoc.equals( _cast.desDoc )) {
			return false;
		}
		
		if (doc == null ? _cast.doc != doc : !doc.equals( _cast.doc )) {
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
		_hashCode = 29 * _hashCode + prgDoc;
		if (desDoc != null) {
			_hashCode = 29 * _hashCode + desDoc.hashCode();
		}
		
		if (doc != null) {
			_hashCode = 29 * _hashCode + doc.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return Tci2000DocumentiPk
	 */
	public Tci2000DocumentiPk createPk()
	{
		return new Tci2000DocumentiPk(prgDoc);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "comws.flau.ci.dto.Tci2000Documenti: " );
		ret.append( "prgDoc=" + prgDoc );
		ret.append( ", desDoc=" + desDoc );
		ret.append( ", doc=" + doc );
		return ret.toString();
	}

}
