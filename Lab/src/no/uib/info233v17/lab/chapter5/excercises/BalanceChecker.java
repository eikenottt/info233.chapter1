package no.uib.info233v17.lab.chapter5.excercises;

import no.uib.info233v17.lab.chapter5.questions.q1and2.OurStack;
import no.uib.info233v17.lab.chapter5.questions.q1and2.StackInterface;

/**
 * Created by Rune on 29.01.2017.
 * @author Rune
 * @version 0.1
 */
public class BalanceChecker {
    public static boolean checkBalance(String expression) {
        StackInterface<Character> openDelimiterStack = new OurStack<>();
        int characterCount = expression.length();
        boolean isBalanced = true;
        int index = 0;
        char nextCharacter = ' ';

        for (; isBalanced && (index < characterCount); index++) {
            nextCharacter = expression.charAt(index);

            switch (nextCharacter) {
                case '(':case '[':case '{':
                    openDelimiterStack.push(nextCharacter);
                    break;
                case ')':case ']':case '}':
                    if (openDelimiterStack.isEmpty()) isBalanced=false;
                    else {
                        char openDelimiter = openDelimiterStack.pop();
                        isBalanced = isPaired(openDelimiter, nextCharacter);
                    }
                    break;
                default: break;
            }
        }
        if (!openDelimiterStack.isEmpty()) {
            isBalanced = false;
        }
        return isBalanced;
    }

    private static boolean isPaired(char open, char close) {
        return  (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String expression = "a {b[c-d]e])f";
        boolean isBalanced = BalanceChecker.checkBalance(expression);
        if (isBalanced) {
            System.out.println(expression + " is balanced");
        }
        else System.out.println(expression + " is not balanced");
    }
}
