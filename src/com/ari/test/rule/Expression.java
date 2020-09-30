package com.ari.test.rule;

import java.util.Map;

public interface Expression
{
     boolean interpret(final Map<String, ?> bindings);
}