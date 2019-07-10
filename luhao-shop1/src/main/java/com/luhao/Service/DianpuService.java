package com.luhao.Service;

import java.util.List;

import com.luhao.pojo.Dianpu;

public interface DianpuService {
	public List<Dianpu> querty(Dianpu dianpu,int page,int rows);
	
	public int addDianpu(Dianpu dianpu);
	public Dianpu look(int id);
	public int deletes(String[] ids);
}
