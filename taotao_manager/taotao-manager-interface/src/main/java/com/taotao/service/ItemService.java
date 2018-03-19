package com.taotao.service;

import com.rou.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;


public interface ItemService {
    /**
     * 根据ID查商品
     */
    TbItem getItemById(long itemId);

    /**
     * 商品列表查询功能
     */
    EasyUIDataGridResult getItemList(int page, int rows);
}
