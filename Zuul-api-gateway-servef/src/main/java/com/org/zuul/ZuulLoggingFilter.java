package com.org.zuul;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import ch.qos.logback.classic.Logger;

public class ZuulLoggingFilter extends ZuulFilter{
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	 
    @Override
    public boolean shouldFilter() {
        // TODO Auto-generated method stub
        return true;
    }
 
    @Override
    public Object run() throws ZuulException {
        // TODO Auto-generated method stub
        //getting the current HTTP request that is to be handle
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        //prints the details of the requesting the log 
        logger.info("request->{}request uri->{}",request,request.getRequestURI());

        return null;
    }
 
    @Override
    public String filterType() {
        // TODO Auto-generated method stub
        return "pre";
    }
 
    @Override
    public int filterOrder() {
        // TODO Auto-generated method stub
        return 1;
    }

}
