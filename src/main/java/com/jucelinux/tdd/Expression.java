package com.jucelinux.tdd;

public interface Expression {

    Money reduce(Bank bank, String to);
}
