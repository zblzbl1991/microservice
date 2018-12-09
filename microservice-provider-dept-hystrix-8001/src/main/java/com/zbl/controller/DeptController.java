package com.zbl.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zbl.entity.Dept;
import com.zbl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DeptController
{
	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept)
	{
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "process_get")
	public Dept get(@PathVariable("id") Long id)
	{
		Dept dept = service.get(id);
		if(dept==null){
			throw new RuntimeException("这个id:"+id+"没有查到信息");
		}
		return dept;
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list()
	{
		return service.list();
	}

	public Dept process_get(@PathVariable("id") Long id)
	{
		return new Dept().setDeptNo(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}

}
