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
 * This class represents the primary key of the tsa1005_contutenze table.
 */
public class Tsa1005ContutenzePk implements Serializable
{
	protected int prgCnt;

	protected int prgUte;

	protected int prgPrfFgl;

	protected int prgPrfPdr;

	protected int prgApp;

	protected int ordCnt;

	/** 
	 * This attribute represents whether the primitive attribute prgCnt is null.
	 */
	protected boolean prgCntNull;

	/** 
	 * This attribute represents whether the primitive attribute prgUte is null.
	 */
	protected boolean prgUteNull;

	/** 
	 * This attribute represents whether the primitive attribute prgPrfFgl is null.
	 */
	protected boolean prgPrfFglNull;

	/** 
	 * This attribute represents whether the primitive attribute prgPrfPdr is null.
	 */
	protected boolean prgPrfPdrNull;

	/** 
	 * This attribute represents whether the primitive attribute prgApp is null.
	 */
	protected boolean prgAppNull;

	/** 
	 * This attribute represents whether the primitive attribute ordCnt is null.
	 */
	protected boolean ordCntNull;

	/** 
	 * Sets the value of prgCnt
	 */
	public void setPrgCnt(int prgCnt)
	{
		this.prgCnt = prgCnt;
	}

	/** 
	 * Gets the value of prgCnt
	 */
	public int getPrgCnt()
	{
		return prgCnt;
	}

	/** 
	 * Sets the value of prgUte
	 */
	public void setPrgUte(int prgUte)
	{
		this.prgUte = prgUte;
	}

	/** 
	 * Gets the value of prgUte
	 */
	public int getPrgUte()
	{
		return prgUte;
	}

	/** 
	 * Sets the value of prgPrfFgl
	 */
	public void setPrgPrfFgl(int prgPrfFgl)
	{
		this.prgPrfFgl = prgPrfFgl;
	}

	/** 
	 * Gets the value of prgPrfFgl
	 */
	public int getPrgPrfFgl()
	{
		return prgPrfFgl;
	}

	/** 
	 * Sets the value of prgPrfPdr
	 */
	public void setPrgPrfPdr(int prgPrfPdr)
	{
		this.prgPrfPdr = prgPrfPdr;
	}

	/** 
	 * Gets the value of prgPrfPdr
	 */
	public int getPrgPrfPdr()
	{
		return prgPrfPdr;
	}

	/** 
	 * Sets the value of prgApp
	 */
	public void setPrgApp(int prgApp)
	{
		this.prgApp = prgApp;
	}

	/** 
	 * Gets the value of prgApp
	 */
	public int getPrgApp()
	{
		return prgApp;
	}

	/** 
	 * Sets the value of ordCnt
	 */
	public void setOrdCnt(int ordCnt)
	{
		this.ordCnt = ordCnt;
	}

	/** 
	 * Gets the value of ordCnt
	 */
	public int getOrdCnt()
	{
		return ordCnt;
	}

	/**
	 * Method 'Tsa1005ContutenzePk'
	 * 
	 */
	public Tsa1005ContutenzePk()
	{
	}

	/**
	 * Method 'Tsa1005ContutenzePk'
	 * 
	 * @param prgCnt
	 * @param prgUte
	 * @param prgPrfFgl
	 * @param prgPrfPdr
	 * @param prgApp
	 * @param ordCnt
	 */
	public Tsa1005ContutenzePk(final int prgCnt, final int prgUte, final int prgPrfFgl, final int prgPrfPdr, final int prgApp, final int ordCnt)
	{
		this.prgCnt = prgCnt;
		this.prgUte = prgUte;
		this.prgPrfFgl = prgPrfFgl;
		this.prgPrfPdr = prgPrfPdr;
		this.prgApp = prgApp;
		this.ordCnt = ordCnt;
	}

	/** 
	 * Sets the value of prgCntNull
	 */
	public void setPrgCntNull(boolean prgCntNull)
	{
		this.prgCntNull = prgCntNull;
	}

	/** 
	 * Gets the value of prgCntNull
	 */
	public boolean isPrgCntNull()
	{
		return prgCntNull;
	}

	/** 
	 * Sets the value of prgUteNull
	 */
	public void setPrgUteNull(boolean prgUteNull)
	{
		this.prgUteNull = prgUteNull;
	}

	/** 
	 * Gets the value of prgUteNull
	 */
	public boolean isPrgUteNull()
	{
		return prgUteNull;
	}

	/** 
	 * Sets the value of prgPrfFglNull
	 */
	public void setPrgPrfFglNull(boolean prgPrfFglNull)
	{
		this.prgPrfFglNull = prgPrfFglNull;
	}

	/** 
	 * Gets the value of prgPrfFglNull
	 */
	public boolean isPrgPrfFglNull()
	{
		return prgPrfFglNull;
	}

	/** 
	 * Sets the value of prgPrfPdrNull
	 */
	public void setPrgPrfPdrNull(boolean prgPrfPdrNull)
	{
		this.prgPrfPdrNull = prgPrfPdrNull;
	}

	/** 
	 * Gets the value of prgPrfPdrNull
	 */
	public boolean isPrgPrfPdrNull()
	{
		return prgPrfPdrNull;
	}

	/** 
	 * Sets the value of prgAppNull
	 */
	public void setPrgAppNull(boolean prgAppNull)
	{
		this.prgAppNull = prgAppNull;
	}

	/** 
	 * Gets the value of prgAppNull
	 */
	public boolean isPrgAppNull()
	{
		return prgAppNull;
	}

	/** 
	 * Sets the value of ordCntNull
	 */
	public void setOrdCntNull(boolean ordCntNull)
	{
		this.ordCntNull = ordCntNull;
	}

	/** 
	 * Gets the value of ordCntNull
	 */
	public boolean isOrdCntNull()
	{
		return ordCntNull;
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
		
		if (!(_other instanceof Tsa1005ContutenzePk)) {
			return false;
		}
		
		final Tsa1005ContutenzePk _cast = (Tsa1005ContutenzePk) _other;
		if (prgCnt != _cast.prgCnt) {
			return false;
		}
		
		if (prgUte != _cast.prgUte) {
			return false;
		}
		
		if (prgPrfFgl != _cast.prgPrfFgl) {
			return false;
		}
		
		if (prgPrfPdr != _cast.prgPrfPdr) {
			return false;
		}
		
		if (prgApp != _cast.prgApp) {
			return false;
		}
		
		if (ordCnt != _cast.ordCnt) {
			return false;
		}
		
		if (prgCntNull != _cast.prgCntNull) {
			return false;
		}
		
		if (prgUteNull != _cast.prgUteNull) {
			return false;
		}
		
		if (prgPrfFglNull != _cast.prgPrfFglNull) {
			return false;
		}
		
		if (prgPrfPdrNull != _cast.prgPrfPdrNull) {
			return false;
		}
		
		if (prgAppNull != _cast.prgAppNull) {
			return false;
		}
		
		if (ordCntNull != _cast.ordCntNull) {
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
		_hashCode = 29 * _hashCode + prgCnt;
		_hashCode = 29 * _hashCode + prgUte;
		_hashCode = 29 * _hashCode + prgPrfFgl;
		_hashCode = 29 * _hashCode + prgPrfPdr;
		_hashCode = 29 * _hashCode + prgApp;
		_hashCode = 29 * _hashCode + ordCnt;
		_hashCode = 29 * _hashCode + (prgCntNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (prgUteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (prgPrfFglNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (prgPrfPdrNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (prgAppNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (ordCntNull ? 1 : 0);
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
		ret.append( "comws.flau.ci.dto.Tsa1005ContutenzePk: " );
		ret.append( "prgCnt=" + prgCnt );
		ret.append( ", prgUte=" + prgUte );
		ret.append( ", prgPrfFgl=" + prgPrfFgl );
		ret.append( ", prgPrfPdr=" + prgPrfPdr );
		ret.append( ", prgApp=" + prgApp );
		ret.append( ", ordCnt=" + ordCnt );
		return ret.toString();
	}

}