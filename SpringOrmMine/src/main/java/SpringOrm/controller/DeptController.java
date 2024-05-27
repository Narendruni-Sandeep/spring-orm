package SpringOrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SpringOrm.dao.DeptDAO;
import SpringOrm.model.Dept;

@Controller
public class DeptController {

	private DeptDAO ddao;

	@Autowired
	public DeptController(DeptDAO dptdao) {
		ddao = dptdao;
	}

	@RequestMapping(value = "/deptlist", method = RequestMethod.GET)
	public String getAllDepts(Model model) {
		System.out.println("Departments List JSP Requested");
		List<Dept> deptList = ddao.findAll();
		model.addAttribute("dlist", deptList);
		return "dept";
	}
}
