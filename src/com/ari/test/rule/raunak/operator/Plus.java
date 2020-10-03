package com.ari.test.rule.raunak.operator;

import com.ari.test.rule.raunak.Operable;

public class Plus implements Operable {



    @Override
    public String operate(String expr) {

        String lhs = expr.split("_")[0];
        String rhs = expr.split("_")[1];

        int val = Integer.parseInt(lhs) + Integer.parseInt(rhs) ;

        return String.valueOf(val);
    }
}
