package com.mezzp.vo;

import lombok.Data;

import java.util.Map;

/**
 * 柱状图数据类型values部分
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/7/31
 */
@Data
public class BarDataVO {
    /**
     * {
     * value: 333,
     * itemStyle: {
     * color: "#3fb1e3"
     * }
     */
    private Integer value;
    private Map<String, String> itemStyle;
}
