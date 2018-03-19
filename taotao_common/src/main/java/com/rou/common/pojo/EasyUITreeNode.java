package com.rou.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ouyra@yonyou.com
 * Create Date   ${DATE}
 * version       ${Version}
 * Comments      该类要在服务端和客户端之间传输，因此一定要实现序列化
 */
@Data
public class EasyUITreeNode implements Serializable {
    /**
     * 节点的id
     */
    private long id;

    /**
     * 节点的名称
     */
    private String text;


    /**
     * 节点是否展开
     */
    private String state;

}
