package com.luhao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.luhao.Service.DianpuService;
import com.luhao.Service.ShangpinService;
import com.luhao.Service.ZhongService;
import com.luhao.pojo.Dianpu;
import com.luhao.pojo.Shangpin;
import com.luhao.pojo.Zhong;

@Controller
public class DianpuController {
	@Autowired
	private DianpuService dianpuService;
	
	@Autowired
	private ShangpinService shangpinService;
	
	@Autowired
	private ZhongService zhongService;
	
	@RequestMapping("/querty")
	public ModelAndView querty(Dianpu dianpu,@RequestParam(defaultValue="1",required=false)int page,@RequestParam(defaultValue="2",required=false)int rows){
		ModelAndView mv = new ModelAndView();
		List<Dianpu> querty = dianpuService.querty(dianpu,page, rows);
		mv.addObject("Dp",new PageInfo<Dianpu>(querty));
		mv.addObject("dianpu",dianpu);
		mv.addObject("page",page);
		mv.addObject("rows",rows);
		mv.setViewName("list");
		return mv;
	}
	
	@RequestMapping("/look")
	public ModelAndView look(int id){
		ModelAndView mv = new ModelAndView();
		Dianpu look = dianpuService.look(id);
		mv.addObject("shop",look);
		mv.setViewName("show");
		return mv;
	}
	
	@RequestMapping("/quertyShangpin")
	public ModelAndView shangpin(){
		ModelAndView mv = new ModelAndView();
		List<Shangpin> querty = shangpinService.querty();
		mv.addObject("s", querty);
		mv.setViewName("add");
		return mv;
	}
	
	@RequestMapping("/add")
	public String add(Dianpu dianpu,String[] shop){
		dianpuService.addDianpu(dianpu);
		for (String string : shop) {
			Zhong z=new Zhong();
			z.setDid(dianpu.getDid());
			z.setSid(Integer.parseInt(string));
			zhongService.add(z);
		}
		
		return "redirect:querty";
	}
	
	@RequestMapping("/deletes")
	public String deletes(String ids){
		String[] split = ids.split(",");
		dianpuService.deletes(split);
		zhongService.deletes(split);
		return "redirect:querty";
	}
	
}
