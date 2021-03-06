package com.mybatis.plus.join;

import com.mybatis.plus.join.column.Column;
import lombok.Data;

import java.io.Serializable;

/**
 * 列=值的判断条件
 *
 * @author by zhaojin
 * @since 2021/6/18 9:49
 */
@Data
public class ValueCondition implements Condition {
    private ConditionEnum sqlKeyword;
    private Column column;
    private Object value;
    private int index;
    private int joinIndex;

    public ValueCondition() {
    }

    public ValueCondition(ConditionEnum sqlKeyword, Column column, Object value, int index, int joinIndex) {
        this.sqlKeyword = sqlKeyword;
        this.column = column;
        this.value = value;
        this.index = index;
        this.joinIndex = joinIndex;
    }

    @Override
    public String toString() {
        return column.selectColumn() + sqlKeyword.getSqlSegment() + " #{ew.joinList[" + joinIndex + "].conditions[" + index + "].value}";
    }
}
