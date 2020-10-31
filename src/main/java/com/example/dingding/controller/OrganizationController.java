package com.example.dingding.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dingding.config.SystemConfig;
import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.entity.TEmployee;
import com.example.dingding.entity.TOrganization;
import com.example.dingding.service.TEmployeeService;
import com.example.dingding.service.TOrganizationService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/30 20:00
 * description:组织管理控制器
 */
@RestController
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    private TOrganizationService tOrganizationService;

    @Autowired
    private TEmployeeService tEmployeeService;

    /**
     * 创建组织
     *
     * @return
     */
    @PostMapping("/add")
    public ResponseResult add(@RequestBody OrganizationDto organizationDto, HttpServletRequest request) {
        return tOrganizationService.add(request.getHeader(SystemConfig.TOKEN_HEADER), organizationDto);
    }

    /**
     * 删除组织
     *
     * @param id
     * @return
     */
    //TODO: 后期会同时删除相关表
    @PostMapping("/delete")
    public ResponseResult deleteOt(Integer id) {
        QueryWrapper<TOrganization> queryWrapper = new QueryWrapper<>();
        //TODO:
        queryWrapper.eq(TOrganization.COL_ID, id);
        queryWrapper.eq(TOrganization.COL_UPDATETIME, new Date());
        queryWrapper.eq(TOrganization.COL_STATUS, 0);

        TOrganization tOrganization = new TOrganization();
        tOrganization.setId(id);

        tOrganization.setUpdatetime(new Date());
        tOrganization.setStatus(0);


        boolean update = tOrganizationService.updateById(tOrganization);
        if (update) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }


    /**
     * 加入组织（用户身份）
     *
     * @param oId
     * @param request
     * @return
     */
    @GetMapping("joinuser/{o_id}/")
    public ResponseResult joinUser(@PathVariable("o_id") Integer oId, HttpServletRequest request) {
        //TODO:假用户

        TEmployee tEmployee =new TEmployee();
        //TODO:假用户
        tEmployee.setUId(1);
        tEmployee.setOId(oId);
        Date date=new Date();
        tEmployee.setCreatetime(date);
        tEmployee.setUpdatetime(date);
        tEmployee.setStatus(1);

        boolean save = tEmployeeService.save(tEmployee);
        if (save) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();

    }

    /**
     * 加入组织（管理员身份）
     *
     * @param oId
     * @param request
     * @return
     */
    //TODO:待写
    @GetMapping("joinadmin/{o_id}/")
    public ResponseResult joinAdmin(@PathVariable("o_id") Integer oId, HttpServletRequest request) {

        return null;
    }
}
