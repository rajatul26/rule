package com.ari.test.rule;

import java.util.HashMap;
import java.util.Map;

public class Main 
{
    public static void main( String[] args )
    {
        // create a singleton container for operations
       Operations operations = Operations.INSTANCE;

        // register new operations with the previously created container
        operations.registerOperation(new And());
        operations.registerOperation(new Equals());
        operations.registerOperation(new Not());

        // defines the triggers when a rule should fire
        Expression ex1 = ExpressionParser.fromString("VAR_A = 'A' AND VAR_B = 'B' AND VAR_C = 'C'");
        Expression ex2 = ExpressionParser.fromString("VAR_A = 'A' AND VAR_B = 'C'");

        // define the possible actions for rules that fire
        ActionDispatcher eventXDispatcher = new EventXDispatcher();
        NullActionDispatcher nullActionDispatcher=new NullActionDispatcher();

        // create the rules and link them to the accoridng expression and action
        Rule rule1 = new Rule.Builder()
                            .withExpression(ex1)
                            .withDispatcher(eventXDispatcher)
                            .build();
        Rule rule2 = new Rule.Builder()
                .withExpression(ex2)
                .withDispatcher(eventXDispatcher)
                .build();

        // for test purpose define a variable binding ...
        Map<String, String> bindings  = new HashMap<>();
        bindings.put("VAR_A", "'A'");
        bindings.put("VAR_B", "'B'");
        bindings.put("VAR_C","'C'") ;

        boolean ruleOutPut= rule1.eval(bindings);
        System.out.println("Rule 1 fired: "+ruleOutPut);
         ruleOutPut= rule2.eval(bindings);
        System.out.println("Rule 2 fired: "+ruleOutPut);
    }
}