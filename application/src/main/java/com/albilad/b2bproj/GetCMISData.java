package com.albilad.b2bproj;

import org.slf4j.Logger;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;

import com.sap.ecm.api.AbstractCmisProxyServlet;

@WebServlet("/getcmis/*")
public class GetCMISData extends AbstractCmisProxyServlet
{
	  private static final long serialVersionUID = 1L;
	    
	    public GetCMISData() {
	        super();
	    }
	    
	    protected boolean supportAtomPubBinding() {
	        return false;
	    }
	    
	    protected boolean supportBrowserBinding() {
	        return true;
	    }
	    
	    protected String getRepositoryKey() {
	        return "B2B_Document_Center";
	    }
	    
	    protected String getRepositoryUniqueName() {
	        return "Yxw4Q4w73B";
	    }
}
