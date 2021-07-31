package com.mezzp.vo;

import lombok.Data;

import java.util.List;

/**
 * 柱状图的数据类型
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/7/31
 */
@Data
public class BarVO {
    private List<String> names;
    private List<BarDataVO> values;
}
