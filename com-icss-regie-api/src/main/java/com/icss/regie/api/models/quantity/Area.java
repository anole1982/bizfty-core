/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.api.models.quantity;

import java.math.BigDecimal;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 *
 * @author Administrator
 */
@Embeddable
public class Area implements Serializable {
    /**
     * 数量
     */
    @Column(name="FIELD_AREA")
    private BigDecimal area;
    /**
     * 单位
     */
    @Column(name="FIELD_UNIT")
    private String unit;
}
