/*
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Copyrights:
 *
 *  Copyright - 1999 Sun Microsystems, Inc. All rights reserved.
 *  901 San Antonio Road, Palo Alto, California 94043, U.S.A.
 *
 *  This product and related documentation are protected by copyright and
 *  distributed under licenses restricting its use, copying, distribution, and
 *  decompilation. No part of this product or related documentation may be
 *  reproduced in any form by any means without prior written authorization of
 *  Sun and its licensors, if any.
 *
 *  RESTRICTED RIGHTS LEGEND: Use, duplication, or disclosure by the United
 *  States Government is subject to the restrictions set forth in DFARS
 *  252.227-7013 (c)(1)(ii) and FAR 52.227-19.
 *
 *  The product described in this manual may be protected by one or more U.S.
 *  patents, foreign patents, or pending applications.
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Author:
 *
 *  Mahindra British Telecom
 *  155 , Bombay - Pune Road 
 *  Pimpri ,
 *  Pune - 411 018.
 *
 *  Module Name   : JAIN INAP API
 *  File Name     : OAbandon.java
 *  Approver      : Jain Inap Edit Group
 *  Version       : 1.0
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


package javax.jain.ss7.inap.operation;

import java.io.*;
import java.util.*;
import javax.jain.ss7.inap.datatype.*;
import javax.jain.ss7.inap.constants.*;
import javax.jain.*;


/**
This class represents the OAbandon Operation.
*/

public class OAbandon  extends Operation   implements java.io.Serializable
{
       

       private DPSpecificCommonParameters dPSpecificCommonParameters;
       
       private int callSegmentID;
       
       private Cause releaseCause;
       private boolean isReleaseCause = false ;	
       
	private ExtensionField extensions[];
  private boolean isExtensions = false ; 

/**
Constructor For OAbandon
*/
	public OAbandon(DPSpecificCommonParameters dPSpecificCommonParameters,int callSegmentID)
	{
		operationCode = OperationCode. O_ABANDON;
		setDPSpecificCommonParameters(dPSpecificCommonParameters);
		setCallSegmentID(callSegmentID);
	}

//----------------------------------------------    
/**
Gets Operation Code
*/
    public OperationCode getOperationCode() 
    {
        return operationCode;
    }

//-----------------------

/*
Gets the DP Specific Common Parameter
*/
    public DPSpecificCommonParameters getDPSpecificCommonParameters() 
    {
        return dPSpecificCommonParameters;
    }

/**
Sets the DP Specific Common Parameter
*/
    public void setDPSpecificCommonParameters(DPSpecificCommonParameters dPSpecificCommonParameters)
    {
        this.dPSpecificCommonParameters = dPSpecificCommonParameters;
    }


//----------------------------------------------    

/*
Gets the Call Segment ID 
*/
    public int getCallSegmentID()
    {
        return callSegmentID;
    }
    
/**
Sets the Call Segment ID 
*/
    public void setCallSegmentID(int callSegmentID)
    {
		this.callSegmentID = callSegmentID;
    }

//----------------------------------------------    

/**
Gets the Release Cause 
*/
    public Cause getReleaseCause() throws ParameterNotSetException
    {
        if(isReleaseCausePresent())
             return releaseCause;
        else
             throw new ParameterNotSetException();
    }

/**
Sets the Release Cause 
*/
    public void setReleaseCause(Cause releaseCause)
    {
        this.releaseCause = releaseCause;
        isReleaseCause = true;
    }

/**
Indicates if the Release Cause optional parameter is present .
Returns: TRUE if present, FALSE otherwise.
*/
    public boolean isReleaseCausePresent()
    {
        return isReleaseCause;
    }


//----------------------------------------------    

/**
Gets Extensions Parameter
*/

    public ExtensionField[] getExtensions() throws ParameterNotSetException
    {
        if(isExtensionsPresent())
             return extensions;
        else
             throw new ParameterNotSetException();
        
    }

/**
Gets a particular  Extension Parameter
*/

    public ExtensionField getExtension(int index) 
    {
        return extensions[index];
    }

/**
Sets Extensions Parameter
*/

    public void  setExtensions (ExtensionField extensions[])
    {
        this.extensions = extensions ;
        isExtensions = true;
    }

/**
Sets a particular Extensions Parameter
*/

    public void  setExtension (int index , ExtensionField extension)
    {
        this.extensions[index] = extension ;
    }

/**
Indicates if the Extensions optional parameter is present .
Returns: TRUE if present, FALSE otherwise.
*/
    public boolean isExtensionsPresent()
    {
        return isExtensions;
    }
    
//-----------------------


}
