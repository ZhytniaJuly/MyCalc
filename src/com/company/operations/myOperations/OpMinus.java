package com.company.operations.myOperations;

import com.company.operations.Operation;


public class OpMinus implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
