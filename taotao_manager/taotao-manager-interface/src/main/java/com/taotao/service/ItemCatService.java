package com.taotao.service;

import com.rou.common.pojo.EasyUITreeNode;

import java.util.List;


public interface ItemCatService {

    /**
     * 根据父节点id来查询树形结构 因为是懒加载 即最开始只显示第一级目录 只有当点击下一目录 才回去查询第二级目录的内容
     *
     * @param parentId
     * @return
     */
    List<EasyUITreeNode> getItemCatList(long parentId);
}
