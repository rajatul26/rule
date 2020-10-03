package com.ari.test.rule.raunak;

public class EntryMain {


    public static void main(String[] args) {
        //Assumptions: Precedence form-brackets, few symbols override, true/false-1/0
        String expr = "((((5>3)||1)&&(9<4))&&((9-2)<2))";
        Evaluator.evaluate(expr);
    }
}
