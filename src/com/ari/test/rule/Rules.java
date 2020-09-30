package com.ari.test.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Rules {
    List<Rule> rules=new ArrayList<>();
    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public boolean eval(Map<String, ?> bindings)
    {
        boolean eval = false;
        for (Rule rule : rules)
        {
          eval=eval ||rule.eval(bindings);
        }
        return eval;
    }
}

