package com.qssuper.web.controller.tool;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qssuper.system.dto.LeiPiDto;
import com.qssuper.web.core.base.BaseController;

/**
 * build 表单构建
 * 
 * @author qssuper
 */
//定义控制器
@Controller
//请求map地址 注意大小写区分 这里跟页面请求地址大小写一致
@RequestMapping("/tool/leipi")
public class LeipiController extends BaseController
{
	//这里是指页面文件的路径
    private String prefix = "tool/build";

    /*
     * 页面显示试图
     * */
    @RequiresPermissions("tool:leipi:view")
    @GetMapping()
    public String leipi()
    {
    	//页面文件在tool/build/leipi
        return prefix + "/leipi";
    }
    @PostMapping("testGetLeiPiHtml")
    @ResponseBody
    public String testGetLeiPiHtml(@RequestBody LeiPiDto dto) {
        System.out.println("Received parametes: " + dto.getHtmlStr());
        return dto.getHtmlStr();
    }
}
