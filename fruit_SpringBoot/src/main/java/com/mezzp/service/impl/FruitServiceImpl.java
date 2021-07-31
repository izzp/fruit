package com.mezzp.service.impl;

import com.mezzp.entity.Fruit;
import com.mezzp.mapper.FruitMapper;
import com.mezzp.service.FruitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mezzp.util.DataUtil;
import com.mezzp.vo.BarDataVO;
import com.mezzp.vo.BarVO;
import com.mezzp.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhaozhipeng
 * @since 2021-07-31
 */
@Service
public class FruitServiceImpl extends ServiceImpl<FruitMapper, Fruit> implements FruitService {

    @Autowired
    private FruitMapper fruitMapper;

    /**
     * 用于柱状图
     *
     * @return BarVO
     */
    @Override
    public BarVO barVoList() {
        BarVO barVo = new BarVO();
        List<String> names = new ArrayList<>();
        List<BarDataVO> values = new ArrayList<>();
        //先查数据
        List<Fruit> fruits = this.fruitMapper.selectList(null);
        for (Fruit fruit : fruits) {
            names.add(fruit.getName());
            BarDataVO barDataVo = new BarDataVO();
            barDataVo.setValue(fruit.getSale());
            barDataVo.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
            values.add(barDataVo);
        }
        barVo.setNames(names);
        barVo.setValues(values);
        //转化vo
        return barVo;
    }

    /**
     * 用于饼图
     *
     * @return List<PieVO>
     */
    @Override
    public List<PieVO> pieVOList() {
        List<PieVO> pieVOList = new ArrayList<>();
        List<Fruit> fruits = this.fruitMapper.selectList(null);
        for (Fruit fruit : fruits) {
            PieVO pieVO = new PieVO();
            pieVO.setValue(fruit.getSale());
            pieVO.setName(fruit.getName());
            pieVO.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
            pieVOList.add(pieVO);
        }
        return pieVOList;
    }
}
