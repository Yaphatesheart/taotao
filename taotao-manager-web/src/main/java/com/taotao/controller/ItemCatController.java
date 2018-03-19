package com.taotao.controller;

import com.rou.common.pojo.EasyUITreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    private List<EasyUITreeNode> getItemCatList(@RequestParam(name = "id", defaultValue = "0") Long parenId) {
        List<EasyUITreeNode> itemCatList = itemCatService.getItemCatList(parenId);
        return itemCatList;
    }
}
