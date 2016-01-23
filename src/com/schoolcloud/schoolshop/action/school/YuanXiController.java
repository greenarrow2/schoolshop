package com.schoolcloud.schoolshop.action.school;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.schoolcloud.schoolshop.bean.page.QueryResult;
import com.schoolcloud.schoolshop.bean.result.DataResult;
import com.schoolcloud.schoolshop.bean.school.YuanXi;
import com.schoolcloud.schoolshop.service.school.YuanXiService;
/**
 * 院系控制层
 * @author 长润
 *
 */
@Controller
@RequestMapping("admin/yuanxi")
public class YuanXiController {
	@Resource(name="yuanXiService")
	private YuanXiService yuanXiService;
    

	public YuanXiService getYuanXiService() {
		return yuanXiService;
	}

	public void setYuanXiService(YuanXiService yuanXiService) {
		this.yuanXiService = yuanXiService;
	}
	/**
	 * 院系列表
	 * @param start
	 * @param limit
	 * @param visible
	 * @param yuanXiName
	 * @return
	 */
    @RequestMapping(value="yuanXiList.htm",method=RequestMethod.POST)
    @ResponseBody
	public QueryResult<YuanXi>  yuanXiList(Integer start,Integer limit,Boolean visible,String yuanXiName) {
		QueryResult<YuanXi> qr = yuanXiService.getScrollYuanXiData(start, limit, visible, yuanXiName, "desc");
        return qr;
	}
    
    /**
     * 添加或者更新School
     * @param school
     * @return
     */
    @RequestMapping(value="saveOrUpdateYuanXi.htm",method=RequestMethod.POST)
    @ResponseBody
    public DataResult saveOrUpdateYuanXi(@ModelAttribute("yuanXiForm") YuanXi yuanXi) {
    	DataResult result = new DataResult();
    	if(yuanXi.getYuanXiName()==null&&"".equals(yuanXi.getYuanXiName())){
    		result.setSuccess(false);
    		result.setObj("院系名称为NULL或者“”！");
    		return result;
    	}
    	
    	if(yuanXi.getId()!=null&&yuanXi.getId()>0){
    		yuanXiService.update(yuanXi);
    		result.setSuccess(true);
    		result.setObj("院系更新成功！");
    	}else {
    		if(yuanXiService.isExistYuanXiByYuanXiName(yuanXi.getYuanXiName())){
    			result.setSuccess(false);
    			result.setObj("院系已经存在或者院系名重复！");
    			return result;
    		}
    		yuanXiService.save(yuanXi);
    		result.setSuccess(true);
    		result.setObj("院系添加成功！");
    	}
    	return result;
    }
     
    /**
     * 删除院系
     * @param school
     * @return
     */
    @RequestMapping(value="deleteYuanXi.htm",method=RequestMethod.POST)
    @ResponseBody
    public DataResult deleteYuanXi(Integer id) {
    	DataResult result = new DataResult();
    	try {
    		if(id!=null&&id>0){
    			yuanXiService.delete(id);
    			result.setSuccess(true);
    			result.setObj("校园删除成功！");
    		}else {
    			result.setSuccess(false);
    			result.setObj("id值为null或值错误！");
			} 
    	} catch (Exception e) {
    		// TODO: handle exception
    		result.setSuccess(false);
    		result.setObj("服务器出错！");
    	}
    	return result;
    }
    
    /**
     * 上下架 院系
     * @param school
     * @return
     */
    @RequestMapping(value="updateSchoolVisible.htm",method=RequestMethod.POST)
    @ResponseBody
    public DataResult updateYuanXiVisible(Integer id,Boolean visible) {
    	DataResult result = new DataResult();
    	if(id!=null&&id>0&&visible!=null){
    		YuanXi yuanXi =	yuanXiService.find(id);
    	  result.setSuccess(true);
    	  if(visible){
    		  yuanXi.setVisible(!visible);
    		  result.setObj("学校下架成功！");
    	  }else {
    		  yuanXi.setVisible(!visible);
    		  result.setObj("学校上架成功！"); 
    	  }
    	  yuanXiService.update(yuanXi);
    	  return result;
    	}else {
    	  result.setSuccess(false);
    	  result.setObj("传值错误或服务器异常！");
    	  return result;
    	}
    }
}
