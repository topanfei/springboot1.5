package com.pf.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {

	/**
	 * 第一个接口
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="helloWord",method=RequestMethod.GET)
	public Map<String,Object> helloWord(){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("msg", "helloWord");
		return map;
	}
}
