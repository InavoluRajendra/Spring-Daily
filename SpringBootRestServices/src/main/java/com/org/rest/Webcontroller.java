package com.org.rest;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.rest.req.PosrResponse;
import com.org.rest.req.Postreq;

@RestController //indicates this class will have rest end points
public class Webcontroller {
	
	@RequestMapping("/sample") //maps sample endpoint to sample function
	public SampleResponse Sample(@RequestParam(value="name",defaultValue="Rest Service")String name)
	{
		SampleResponse res=new SampleResponse();
		res.setId(101);
		res.setMessage("you are learning "+name);
		return res;
	}
	
	@RequestMapping("/hello")
	public String sayhi()
	{
		return "hello boys";
	}
	
	@RequestMapping("/ph")
	public int phno()
	{
		return 998767;
	}
	
	//post request
	@RequestMapping(value="/req",method=RequestMethod.POST)
	public PosrResponse Test(@RequestBody Postreq input)
	{
		PosrResponse rep=new PosrResponse();
		rep.setId(input.getId());
		rep.setMessage("post response"+input.getName());
		rep.setExtra("extra matter");
		return rep;
	}
	
	

}

//@requestparam  indicate the endpoint/sample will have one query parameter called name and default value is "RestService"
