package com.luhao.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.luhao.Dao.DianpuDao;
import com.luhao.Service.DianpuService;
import com.luhao.pojo.Dianpu;

@Service
public class DianpuServiceImpl implements DianpuService {

	@Autowired
	private DianpuDao dianpuDao;
	

	@Override
	public int addDianpu(Dianpu dianpu) {
		return dianpuDao.addDianpu(dianpu);
	}

	@Override
	public List<Dianpu> querty(Dianpu dianpu,int page, int rows) {
		PageHelper.startPage(page, rows);
		return dianpuDao.querty(dianpu);
	}

	@Override
	public Dianpu look(int id) {
		// TODO Auto-generated method stub
		return dianpuDao.look(id);
	}

	@Override
	public int deletes(String[] ids) {
		return dianpuDao.deletes(ids);
	}
	
}
