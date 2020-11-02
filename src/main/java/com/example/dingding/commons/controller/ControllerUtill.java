package com.example.dingding.commons.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dingding.commons.entity.BaseEntity;
import com.example.dingding.commons.pagehelper.PageHelperParam;
import com.example.dingding.commons.service.BaseService;
import com.example.dingding.vo.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @description
 * @className: ControllerUtill
 * @package: com.example.dingding.commons.controller
 * @author: Stephen Shen
 * @date: 2020/10/31 下午2:38
 */
public class ControllerUtill {

    /**
     * 插入一条记录
     *
     * @param e
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult save(S s, E e) {
        boolean save = s.save(e);
        return result(save);
    }

    /**
     * 根据Id修改一条记录
     *
     * @param e
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult updateById(S s, E e) {
        boolean update = s.updateById(e);
        return result(update);
    }


    /**
     * 根据entity+条件修改一条记录
     *
     * @param e
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult updateByIdAndQW(S s, E e, QueryWrapper<E> queryWrapper) {
        boolean update = s.update(e, queryWrapper);
        return result(update);
    }



    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult removeById(S s, Serializable id) {
        boolean removeById = s.removeById(id);
        return result(removeById);
    }

    /**
     * 查询
     *
     * @param queryWrapper
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult list(S s, Wrapper<E> queryWrapper) {
        List<E> list = s.list(queryWrapper);
        return result(list);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult getById(S s, Serializable id) {
        E byId = s.getById(id);
        return result(byId);
    }

    /**
     * 分页查询
     *
     * @param queryWrapper
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult pageList(S s, Wrapper<E> queryWrapper, PageHelperParam pageHelperParam) {

        PageHelper.startPage(pageHelperParam.getPageNum(), pageHelperParam.getPageSize());
        List<E> list = s.list(queryWrapper);
        PageInfo<E> result = new PageInfo<>(list);
        return result(result);
    }


    /**
     * 根据 Wrapper，查询一条记录
     *
     * @param queryWrapper
     * @return
     */
    public <S extends BaseService<E>, E extends BaseEntity> ResponseResult getOne(S s, Wrapper<E> queryWrapper) {
        E one = s.getOne(queryWrapper,false);
        return result(one);
    }

    public ResponseResult result(boolean flag) {
        if (flag) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }


    public ResponseResult result(PageInfo pageInfo) {
        return ResponseResult.ok(pageInfo);
    }

    public ResponseResult result(List list) {
        return ResponseResult.ok(list);
    }


    public <E extends BaseEntity> ResponseResult result(E e) {
        if (e != null) {
            return ResponseResult.ok(e);
        }
        return ResponseResult.fail();
    }


}
