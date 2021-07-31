package com.mezzp.service.impl;

import com.mezzp.entity.Fruit;
import com.mezzp.mapper.FruitMapper;
import com.mezzp.service.FruitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaozhipeng
 * @since 2021-07-31
 */
@Service
public class FruitServiceImpl extends ServiceImpl<FruitMapper, Fruit> implements FruitService {

}
