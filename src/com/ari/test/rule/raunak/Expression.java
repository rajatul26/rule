package com.ari.test.rule.raunak;



//Assume expression with binary operator only
// In case of unary operator. Make it binary:- ex: !a ~
public class Expression {

    public String lhs;
    public String operator;
    public String rhs;

    public Expression(){}

    public Expression(String expr){

    }

    public Expression(String lhs, String operator, String rhs) {
        this.lhs = lhs;
        this.operator = operator;
        this.rhs = rhs;
    }

}
