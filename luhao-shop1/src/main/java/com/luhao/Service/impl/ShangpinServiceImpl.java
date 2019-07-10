package com.luhao.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luhao.Dao.ShangpinDao;
import com.luhao.Service.ShangpinService;
import com.luhao.pojo.Shangpin;

@Service
public class ShangpinServiceImpl implements ShangpinService {
	@Autowired
	private ShangpinDao shangpinDao;

	@Override
	public List<Shangpin> querty() {
		// TODO Auto-generated method stub
		return shangpinDao.querty();
	}
}
