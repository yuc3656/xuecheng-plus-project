package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 分页查询参数
 *
 * @author yuc
 * @version 2023/10/2 09:36
 */
@Data
public class PageParams {
    //当前页码
    @ApiModelProperty("页码")
    private Long pageNo = 1L;
    //每页记录数默认值
    @ApiModelProperty("每页记录数")
    private Long pageSize =10L;
    public PageParams(){
    }
    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
