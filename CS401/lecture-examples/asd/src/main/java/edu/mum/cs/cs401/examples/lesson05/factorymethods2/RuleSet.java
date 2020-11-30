package edu.mum.cs.cs401.examples.lesson05.factorymethods2;

import java.awt.Component;

import edu.mum.cs.cs401.examples.lesson05.factorymethods2.rulesets.RuleException;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
