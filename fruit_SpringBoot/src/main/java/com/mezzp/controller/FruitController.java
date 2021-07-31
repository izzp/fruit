package com.mezzp.controller;


import com.mezzp.entity.Fruit;
import com.mezzp.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
}

