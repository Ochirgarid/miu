package prob1.rulesets;

import java.awt.Component;

import prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

    @Override
    public void applyRules(Component ob) throws RuleException {
        CDWindow cd = (CDWindow) ob;
        allFieldNonNullRule(cd);
        checkPriceRule(cd.getPriceValue());
    }

    private void allFieldNonNullRule(CDWindow cd) throws RuleException {
        // 1. All fields must be nonempty
        if (
            cd.getArtistValue().isEmpty() ||
            cd.getTitleValue().isEmpty() ||
            cd.getPriceValue().isEmpty()
        ) {
            throw new RuleException("All fields must be nonempty");
        }
    }
    private void checkPriceRule(String priceStr) throws RuleException {
        // 5. Price must be a floating point number with two decimal places 
        // 6. Price must be a number greater than 0.49.
        double price;
        try {
            price = Double.parseDouble(priceStr);
        } catch (Exception e) {
            throw new RuleException("Price must be a floating point number");
        }
        String floatNum = priceStr.split("\\.")[1];
        if(floatNum.length() != 2 ) {
            throw new RuleException("Price must be with two decimal places");
        }

        if(price <= 0.49) {
            throw new RuleException("Price must be a number greater than 0.49.");
        }
    }
}
