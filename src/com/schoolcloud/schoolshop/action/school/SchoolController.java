package com.schoolcloud.schoolshop.action.school;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.school.School;
import com.schoolcloud.schoolshop.service.school.SchoolService;
/**
 * school控制层
 * @author 长润
 */
@Controller
@RequestMapping("admin/school")
public class SchoolController {
@Resource(name="schoolService")
private SchoolService schoolService;

public SchoolService getSchoolService() {
	return schoolService;
}

public void setSchoolService(SchoolService schoolService) {
	this.schoolService = schoolService;
}
/**
 * 校园列表
 * @param start
 * @param limit
 * @param visible
 * @param schoolName
 * @return
 */
@RequestMapping(value="schoolList.htm"/*,method=RequestMethod.POST*/)
@ResponseBody
public QueryResult<School> schoolList(Integer start,Integer limit,Boolean visible,String schoolName,String schoolAddress) {
	QueryResult<School> qr = schoolService.getScrollSchoolDataCache(start, limit, visible, schoolName,schoolAddress, "desc");
	return qr;
}
/**
 * 添加或者更新School
 * @param school
 * @return
 */
@RequestMapping(value="saveOrUpdateSchool.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult saveOrUpdateSchool(@ModelAttribute("schoolForm") School school) {
	DataResult result = new DataResult();
	if(school.getSchoolName()==null&&"".equals(school.getSchoolName())){
		result.setSuccess(false);
		result.setObj("校园名称为NULL或者“”！");
		return result;
	}
	
	if(school.getId()!=null&&school.getId()>0){
		schoolService.update(school);
		result.setSuccess(true);
		result.setObj("校园更新成功！");
	}else {
		if(schoolService.isExistSchoolBySchoolName(school.getSchoolName())){
			result.setSuccess(false);
			result.setObj("校园已经存在或者校园名重复！");
			return result;
		}
		schoolService.save(school);
		result.setSuccess(true);
		result.setObj("校园添加成功！");
	}
	return result;
}

/**
 * 删除School
 * @param school
 * @return
 */
@RequestMapping(value="deleteSchool.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult deleteSchool(Integer id) {
	DataResult result = new DataResult();
	try {
		if(id!=null&&id>0){
			schoolService.delete(id);
			result.setSuccess(true);
			result.setObj("校园删除成功！");
		} 
	} catch (Exception e) {
		// TODO: handle exception
		result.setSuccess(false);
		result.setObj("服务器出错！");
	}
	return result;
}
/**
 * 上下架School
 * @param school
 * @return
 */
@RequestMapping(value="updateSchoolVisible.htm",method=RequestMethod.POST)
@ResponseBody
public DataResult updateSchoolVisible(Integer id,Boolean visible) {
	DataResult result = new DataResult();
	if(id!=null&&id>0&&visible!=null){
	  School school =	schoolService.find(id);
	  result.setSuccess(true);
	  if(visible){
		  school.setVisible(!visible);
		  result.setObj("学校下架成功！");
	  }else {
		  school.setVisible(!visible);
		  result.setObj("学校上架成功！"); 
	  }
	  schoolService.update(school);
	  return result;
	}else {
	  result.setSuccess(false);
	  result.setObj("传值错误或服务器异常！");
	  return result;
	}
}
}
