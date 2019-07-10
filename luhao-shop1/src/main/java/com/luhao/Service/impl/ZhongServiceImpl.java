package com.luhao.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luhao.Dao.ShangpinDao;
import com.luhao.Dao.ZhongDao;
import com.luhao.Service.ShangpinService;
import com.luhao.Service.ZhongService;
import com.luhao.pojo.Shangpin;
import com.luhao.pojo.Zhong;

@Service
public class ZhongServiceImpl implements ZhongService {

	@Autowired
	private ZhongDao zhongDao;
	@Override
	public int add(Zhong z) {
		return zhongDao.add(z);
	}

	@Override
	public int deletes(String[] ids) {
		return zhongDao.deletes(ids);
	}
	
}
