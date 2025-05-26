package main.ch16;

interface Expression {
    Expression times(int multiplier);
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
