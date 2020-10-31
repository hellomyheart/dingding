package com.example.dingding.commons.pagehelper;

import com.example.dingding.commons.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @description
 * @className: pageHelperParam
 * @package: com.example.dingding.commons.pagehelper
 * @author: Stephen Shen
 * @date: 2020/10/30 下午1:04
 */
@Data
public class PageHelperParam implements BaseEntity {

    private static final long serialVersionUID = -4367906965245231075L;

    private Integer pageNum;
    private Integer pageSize;
}
