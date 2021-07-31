package com.mezzp.controller;


import com.mezzp.entity.Fruit;
import com.mezzp.service.FruitService;
import com.mezzp.vo.BarVO;
import com.mezzp.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhaozhipeng
 * @since 2021-07-31
 */
@RestController
@RequestMapping("//fruit")
public class FruitController {
    @Autowired
    private FruitService fruitService;

    /**
     * 列出所有
     *
     * @return List<Fruit>
     */
    @GetMapping("/list")
    public List<Fruit> list() {
        return this.fruitService.list();
    }

    /**
     * 根据id删除
     *
     * @param id id
     * @return boolean
     */
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.fruitService.removeById(id);
    }

    /**
     * 根据id查找
     *
     * @param id id
     * @return Fruit
     */
    @GetMapping("/find/{id}")
    public Fruit findFruitById(@PathVariable("id") Integer id) {
        return this.fruitService.getById(id);
    }

    /**
     * 更新数据
     *
     * @param fruit
     * @return
     */
    @PutMapping("/update")
    public boolean updateFruit(@RequestBody Fruit fruit) {
        return this.fruitService.updateById(fruit);
    }

    /**
     * 添加数据
     *
     * @param fruit fruit
     * @return
     */
    @PostMapping("/add")
    public boolean addFruit(@RequestBody Fruit fruit) {
        return this.fruitService.save(fruit);
    }

    /**
     * 用于柱状图
     *
     * @return BarVO
     */
    @GetMapping("/barVO")
    public BarVO barVo() {
        return this.fruitService.barVoList();
    }

    /**
     * 用于饼图
     *
     * @return
     */
    @GetMapping("/pieVO")
    public List<PieVO> pieVO() {
        return this.fruitService.pieVOList();
    }
}

