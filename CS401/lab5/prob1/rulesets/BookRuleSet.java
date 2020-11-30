package prob1.rulesets;

import java.awt.Component;

import prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
    RuleSet() {};

    @Override
    public void applyRules(Component ob) throws RuleException {
        BookWindow book = (BookWindow) ob;
        allFieldNonNullRule(book);
        checkIsbnRule(book.getIsbnValue());
        checkPriceRule(book.getPriceValue());
    }
    private void allFieldNonNullRule(BookWindow book) throws RuleException {
        // 1. All fields must be nonempty
        if (
            book.getIsbnValue().isEmpty() ||
            book.getTitleValue().isEmpty() ||
            book.getPriceValue().isEmpty()
        ) {
            throw new RuleException("All fields must be nonempty");
        }
    }

    private void checkIsbnRule(String isbn) throws RuleException {
        // 2. Isbn must be numeric and consist of either 10 or 13 characters
        try {
            Long.parseInt(isbn);
        } catch(NumberFormatException e) {
            throw new RuleException("Isbn must be numeric");
        }
        int isbnLen = isbn.length();
        if(!(isbnLen == 10 || isbnLen == 10)) {
            throw new RuleException("Isbn consist of either 10 or 13 characters");
        }

        if(isbnLen == 10) {
            // 3. If Isbn has length 10, the first digit must be 0 or 1
            if(!(isbn.startsWith("0") || isbn.startsWith("1"))) {
                throw new RuleException("Isbn: the first digit must be 0 or 1");
            }
        } else {
            // 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
            if(!(isbn.startsWith("978") || isbn.startsWith("979"))) {
                throw new RuleException("Isbn: the first 3 digits must be either 978 or 979");
            }
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
