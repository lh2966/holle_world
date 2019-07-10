package com.luhao.Dao;

import java.util.List;

import com.luhao.pojo.Dianpu;

public interface DianpuDao {
	public List<Dianpu> querty(Dianpu dianpu);
	
	public int addDianpu(Dianpu dianpu);
	
	public Dianpu look(int id);
	
	public int deletes(String[] ids);
}
