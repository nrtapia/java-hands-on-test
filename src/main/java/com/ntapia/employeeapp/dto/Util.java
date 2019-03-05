package com.ntapia.employeeapp.dto;

import java.math.BigDecimal;

/**
 *
 */
public final class Util {

    public static final BigDecimal _12 = new BigDecimal("12");
    public static final BigDecimal _120_MULTIPLIED_BY_12 = new BigDecimal("120").multiply(_12);

    private Util() {
    }
}
