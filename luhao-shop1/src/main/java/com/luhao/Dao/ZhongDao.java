package com.luhao.Dao;

import java.util.List;

import com.luhao.pojo.Dianpu;
import com.luhao.pojo.Shangpin;
import com.luhao.pojo.Zhong;

public interface ZhongDao {
	int add(Zhong z);
	
	int deletes(String[] ids);
}
