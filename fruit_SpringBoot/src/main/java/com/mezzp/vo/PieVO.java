package com.mezzp.vo;

import lombok.Data;

import java.util.Map;
/**
 * 饼图的数据类型
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/7/31
 */
@Data
public class PieVO {
    private Integer value;
    private Map<String,String> itemStyle;
    private String name;
}
