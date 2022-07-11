package super_calculator;

import java.util.Stack;

public class Calculator {
    public static final int INFIX = 1, POSTFIX = 2, PREFIX = 3;
    //1 - infix; 2 - postfix; 3 - prefix.

    private int mode;//Indicates the mode this calculator will lead its expression analysis toward result.

    public Calculator(int mode) {
        if (mode < 1 || mode > 3) this.mode = Calculator.INFIX;
        else this.mode = mode;
    }

    public Calculator() {
        this.mode = Calculator.INFIX;
    }

    public int getMode() {
        return this.mode;
    }

    public int getModeByString(final String str) {
        switch (str.toLowerCase()) {
            case "infix":
                return 1;
            case "postfix":
                return 2;
            case "prefix":
                return 3;
            default:
                return -1;
        }
    }

    public void setMode(int newMode) {
        if (newMode < Calculator.INFIX || newMode > Calculator.PREFIX) this.mode = Calculator.INFIX;
        else this.mode = newMode;
    }

    public double eval(String expression) {
        if (!this.isValidExpression(expression)) return -1;
        return switch (this.mode) {
            case Calculator.INFIX -> this.solveInfix(expression);
            case Calculator.POSTFIX -> this.solvePostfix(expression);
            case Calculator.PREFIX -> this.solvePrefix(expression);
            default -> 0; //Unreachable statement due validations done in attribute this.mode.
        };
    }

    public String divideElements(String expression) {
        if (expression.contains(" ")) expression = expression.replace(" ", "");
        StringBuilder newExpression = new StringBuilder();
        for (char ch : expression.toCharArray()) {
            if (this.isOperator(ch)) {
                newExpression.append(" ").append(ch).append(" ");
            } else newExpression.append(ch);
        }
        return newExpression.toString().trim();
    }

    private String calculate(String operand1, char operator, String operand2) {
        //if ( !this.isOperand( operand1 ) || !this.isOperand( operand2 ) || !this.isOperator( operator ) ) return "-10";
        double op1 = Double.parseDouble(operand1), op2 = Double.parseDouble(operand2), result;
        return Double.toString(switch (operator) {
            case '+' -> op1 + op2;
            case '-' -> op1 - op2;
            case '*' -> op1 * op2;
            case '/' -> op1 / op2;
            case '^' -> Math.pow(op1, op2);
            default -> -1;
        });
    }

    private double calculate(double operand1, char operator, double operand2) {
        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case 'x' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            case '$' -> Math.pow(operand1, operand2);
            default -> -1;
        };
    }

    public boolean isOperator(char ch) {
        return switch (ch) {
            case '+', '-', '*', '/', '^' -> true;
            default -> false;
        };
    }

    public boolean isOperand(char ch) {
        return Character.isDigit(ch);
    }

    public boolean isAMode(final String str) {
        return str.equalsIgnoreCase("infix") || str.equalsIgnoreCase("postfix") || str.equalsIgnoreCase("prefix");
    }

    public boolean isValidExpression(final String expression) {
        String validCharacters = "0123456789 .()+-*/^";
        for (String str : expression.split("")) if (!validCharacters.contains(str)) return false;
        return true;
    }

    private boolean isPrecedent(char op1, char op2) { //If op1 is precedent than op2 then returns true else false
         return switch (op1) {
            case '+', '-' ->
                switch (op2) {
                    case '+', '-', ')' -> true;
                    default -> false;
                };
            case '*', '/', '^' ->
                switch (op2) {
                    case '*', '/', '+', '-', ')' -> true;
                    default -> false;
                };
            default -> false;
        };
    }

    private double solvePrefix(final String expression) {
        Stack<String> symbols = new Stack<>();
        StringBuilder numBuilder = new StringBuilder();
        String op1, op2;
        char perExp;
        for (int counter = expression.length() - 1; counter >= 0; counter--) {
            perExp = expression.charAt(counter);
            if (perExp == ' ' && !numBuilder.isEmpty()) { //It means that numBuilder has a full number
                symbols.push(numBuilder.toString());
                numBuilder = new StringBuilder();
                continue;
            }
            if (this.isOperand(perExp)) numBuilder.append(perExp).append(numBuilder);
            else if (this.isOperator(perExp)) {
                op1 = symbols.pop();
                op2 = symbols.pop();
                symbols.push(this.calculate(op1, perExp, op2));
            }
        }
        return Double.parseDouble(symbols.pop());
    }

    private double solvePostfix(final String expression) {
        Stack<String> symbols = new Stack<>();
        StringBuilder numBuilder = new StringBuilder();
        String op1, op2;
        for (char perExp : expression.toCharArray()) {
            if (perExp == ' ' && !numBuilder.isEmpty()) {
                symbols.push(numBuilder.toString());
                numBuilder = new StringBuilder();
                continue;
            }
            if (this.isOperand(perExp)) numBuilder.append(perExp);
            else if (this.isOperator(perExp)) {
                op2 = symbols.pop();
                op1 = symbols.pop();
                symbols.push(this.calculate(op1, perExp, op2));
            }
        }
        return Double.parseDouble(symbols.pop());
    }

    private double solveInfix(final String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `x` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `$` factor
            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = expression.substring(startPos, this.pos);
                    x = parseFactor();
                    x = switch (func) {
                        case "sqrt" -> Math.sqrt(x);
                        case "sin" -> Math.sin(Math.toRadians(x));
                        case "cos" -> Math.cos(Math.toRadians(x));
                        case "tan" -> Math.tan(Math.toRadians(x));
                        default -> throw new RuntimeException("Unknown function: " + func);
                    };
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
        }.parse();
    }

    public String getAnotherNotations(String rootExpression) {
        String anotherNotations;
        switch (this.mode) {
            case Calculator.INFIX -> {
                anotherNotations = "Prefix: " + this.convertInToPre(rootExpression) + "\nPostfix: " + this.convertInToPos(rootExpression);
            }
            case Calculator.POSTFIX -> {
                anotherNotations = "Infix: " + this.convertPosToIn(rootExpression) + "\nPrefix: " + this.convertPosToPre(rootExpression);
            }
            case Calculator.PREFIX -> {
                anotherNotations = "Infix: " + this.convertPreToIn(rootExpression) + "\nPostfix: " + this.convertPreToPos(rootExpression);
            }
            default -> anotherNotations = "Type not found";
        }
        return anotherNotations;
    }

    private String convertInToPre(String rootExpression) {

        return "";
    }

    public String convertInToPos(String rootExpression) {
       // rootExpression = this.divideElements(rootExpression);
        Stack<Character> symbols = new Stack<>();
        StringBuilder result = new StringBuilder(), numBuilder = new StringBuilder();
        for (char perExp : rootExpression.toCharArray()) {
            if (perExp == ' ' && !numBuilder.isEmpty()) {
                result.append(numBuilder).append(" ");
                numBuilder = new StringBuilder();
                continue;
            }
            if (this.isOperand(perExp)) numBuilder.append(perExp);
            else if (perExp == '(') symbols.push(perExp);
            else if (this.isOperator(perExp)) { //+ - * / ^
                if (!symbols.isEmpty()) {
                    while (this.isPrecedent(symbols.peek(), perExp)) {
                        result.append(symbols.pop()).append(" ");
                        if (symbols.isEmpty()) break;
                    }
                }
                symbols.push(perExp);
            } else if (perExp == ')') {
                while (symbols.peek() != '(') result.append(symbols.pop()).append(" ");
                symbols.pop();
            }
        }
        result.append(numBuilder).append(" ");
        while (!symbols.isEmpty()) result.append(symbols.pop()).append(" ");
        return result.toString().trim();
    }

    private String convertPosToIn(String rootExpression) {
        return "";
    }

    private String convertPosToPre(String rootExpression) {
        return "";
    }

    private String convertPreToIn(String rootExpression) {
        return "";
    }

    private String convertPreToPos(String rootExpression) {
        return "";
    }
}
