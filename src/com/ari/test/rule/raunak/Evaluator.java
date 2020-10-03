package com.ari.test.rule.raunak;

import java.util.Stack;

public class Evaluator {

    private Stack stack;



    public static boolean evaluate(String expression){

        Evaluator evaluator = new Evaluator();
        evaluator.stack = new Stack();
        int stepCouner = 0;

        // Handle validations etc

        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) != ')')
                // Consider single digit for now, For multiple formats, detect types by looping over till next operator
                evaluator.stack.push(expression.charAt(i));
            else if(expression.charAt(i) == ')'){

                String unitExpr = "";

                while(!evaluator.stack.isEmpty()){
                    String poppedVal = evaluator.stack.pop().toString();

                    if(poppedVal.equals("("))
                        break;;

                    unitExpr += poppedVal;
                }
                stepCouner++;
                // Evaluate this unit expression && push again
                StringBuilder reversedStr = new StringBuilder();
                reversedStr.append(unitExpr);
                reversedStr = reversedStr.reverse();
                String unitExprOutput = OperatorFactory.getEvaluatingOperator(reversedStr.toString()).operate(reversedStr.toString());
                System.out.println("Step "+stepCouner+ ": Evaluated "+reversedStr+ "---->  "+unitExprOutput  );
                evaluator.stack.push(unitExprOutput);
            }

        }

        System.out.println("Final value is: " + (evaluator.stack.peek().toString().equalsIgnoreCase("1") ? "True" : "False"));

        return true;
    }
}
