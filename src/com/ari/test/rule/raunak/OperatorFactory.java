package com.ari.test.rule.raunak;

import com.ari.test.rule.raunak.operator.*;

public class OperatorFactory {

    public static String[] ALL_SUPPORTED_OPERATORS = {"+", "-", "||", "/" , "*", "&&", ">", "<" , "="};

    public static Operable getEvaluatingOperator(String unitExpr){
        if(unitExpr.length() >= 3){
            for(int i = 0; i < ALL_SUPPORTED_OPERATORS.length ; i++){
                if(unitExpr.indexOf(ALL_SUPPORTED_OPERATORS[i]) > 0){
                    // Operator found
                    String op = ALL_SUPPORTED_OPERATORS[i];
                    switch(op){
                        case  "_" :
                            return new Plus();
                        case  "-" :
                            return new Minus();
                        case  "#" :
                            return new Into();
                        case  "/" :
                            return new By();
                        case  "||" :
                            return new Or();
                        case  "&&" :
                            return new And();
                        case  ">" :
                            return new Gt();
                        case  "<" :
                            return new Lt();
                        case  "=" :
                            return new Eq();

                    }

                }
            }
        }
        return null;
    }


}
