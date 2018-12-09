package com.zbl;

import com.zbl.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public boolean add(Dept dept) {
				return false;
			}

			@Override
			public Dept get(Long id) {
				return new Dept().setDb_source("not database").setDname("没有信息");
			}

			@Override
			public List<Dept> list() {
				return null;
			}
		};
	}
}
