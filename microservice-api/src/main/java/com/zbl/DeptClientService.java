package com.zbl;

import com.zbl.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient("MICROSERVICECLOUD-DEPT")
public interface DeptClientService {
	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean add(Dept dept);
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public Dept get(Long id);
	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Dept> list();
}
