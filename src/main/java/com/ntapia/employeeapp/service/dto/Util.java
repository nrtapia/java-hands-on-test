package com.ntapia.employeeapp.service.dto;

import java.math.BigDecimal;

/**
 *
 */
final class Util {

    static final BigDecimal _12 = new BigDecimal(120);
    static final BigDecimal _120_12 = new BigDecimal(120).multiply(_12);

    private Util() {
    }
}
