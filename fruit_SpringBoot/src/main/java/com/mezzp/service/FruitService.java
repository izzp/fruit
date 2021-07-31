package com.mezzp.service;

import com.mezzp.entity.Fruit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mezzp.vo.BarVO;
import com.mezzp.vo.PieVO;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhaozhipeng
 * @since 2021-07-31
 */
public interface FruitService extends IService<Fruit> {
    /**
     * 用于柱状图
     *
     * @return BarVO
     */
    public BarVO barVoList();

    /**
     * 用于饼图
     *
     * @return List<PieVO>
     */
    public List<PieVO> pieVOList();
}
