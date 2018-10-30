package com.qssuper.web.controller.tool;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qssuper.web.core.base.BaseController;

/**
 * swagger 接口
 * 
 * @author qssuper
 */
@Controller
@RequestMapping("/tool/swagger")
public class SwaggerController extends BaseController
{
    @RequiresPermissions("tool:swagger:view")
    @GetMapping()
    public String index()
    {
        //return redirect("/swagger-ui.html");
    	return redirect("/doc.html");
    }
}
