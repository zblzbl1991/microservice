package com.zbl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@NoArgsConstructor
@Data
@Accessors(chain = true )
public class Dept implements Serializable{

	private static final long serialVersionUID = 2239980241870847191L;
	/**
	 * id
	 */
	private Long deptNo;
	/**
	 * 部门名
	 */
	private String dname;
	/**
	 * 数据库名
	 */
	private String db_source;


}
