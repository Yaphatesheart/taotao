package com.rou.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ouyra@yonyou.com
 *         Create Date   ${DATE}
 *         version       ${Version}
 *         Comments      comments function of the class or method
 */
@Data
public class EasyUIDataGridResult implements Serializable {

    private Long total;

    /**
     * 另外由于rows集合可能是各种不同的对象，因此我们便不再使用泛型，直接用List表示类型，它可以装任意类型的对象
     */
    private List rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
