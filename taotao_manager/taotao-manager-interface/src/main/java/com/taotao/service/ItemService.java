package com.taotao.service;

import com.taotao.pojo.TbItem;


public interface ItemService {
    /**根据ID查商品*/
    TbItem getItemById(long itemId);
}
