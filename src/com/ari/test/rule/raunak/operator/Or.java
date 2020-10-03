package com.ari.test.rule.raunak.operator;

import com.ari.test.rule.raunak.Expression;
import com.ari.test.rule.raunak.Operable;

public class Or implements Operable {

    @Override
    public String operate(String expr) {

        String lhs = expr.split("||")[0];
        String rhs = expr.split("||")[1];

        boolean val = (Integer.parseInt(lhs) == 1 || Integer.parseInt(rhs) == 1) ;

        return val ? "1" : "0" ;
    }
}
