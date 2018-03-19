package com.taotao.service.impl;

import com.rou.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ouyra@yonyou.com
 *         Create Date   ${DATE}
 *         version       ${Version}
 *         Comments      comments function of the class or method
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;


    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        /**
         *  根据父节点id查询子节点列表
         */
        TbItemCatExample catExample = new TbItemCatExample();

        /**
         * 设置查询条件
         */
        TbItemCatExample.Criteria criteria = catExample.createCriteria();

        /**
         * 设置parentId
         */
        criteria.andParentIdEqualTo(parentId);

        /**
         * 执行查询
         */
        List<TbItemCat> tbItemCatList = itemCatMapper.selectByExample(catExample);

        /**
         * 将TbItemCat集合转换成EasyUITreeNode集合
         */
        List<EasyUITreeNode> easyUITreeNodeList = new ArrayList<>();
        for (TbItemCat itemCat : tbItemCatList) {
            EasyUITreeNode easyUITreeNode = new EasyUITreeNode();
            easyUITreeNode.setId(itemCat.getId());
            easyUITreeNode.setState(itemCat.getIsParent() ? "closed" : "open");
            easyUITreeNode.setText(itemCat.getName());
            easyUITreeNodeList.add(easyUITreeNode);
        }

        return easyUITreeNodeList;
    }

}
