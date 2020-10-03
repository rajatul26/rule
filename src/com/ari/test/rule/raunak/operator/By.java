package com.ari.test.rule.raunak.operator;

import com.ari.test.rule.raunak.Expression;
import com.ari.test.rule.raunak.Operable;

public class By implements Operable {


    @Override
    public String operate(String expr) {

        //use double

        String lhs = expr.split("/")[0];
        String rhs = expr.split("/")[1];

        int val = Integer.parseInt(lhs) / Integer.parseInt(rhs) ;

        return String.valueOf(val);
    }
}
