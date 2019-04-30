package com.eastcom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eastcom.sql.bean.Dept;
import com.eastcom.sql.dao.IDeptDao;

@Service
public class DeptService {
	
	@Autowired
	private IDeptDao deptDao;
	
	public Dept selectById(Integer id) {
		return deptDao.selectById(id);
	} 
	
	public Integer insert(Dept dept) {
		return deptDao.insert(dept);
	}
	
	public Integer update(Integer id,Dept dept) {
		return deptDao.update(id,dept);
	}
	
	public Integer deleteById(Integer id) {
		return deptDao.deleteById(id);
	}
}