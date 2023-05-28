package com.appspringboot.quadraticEcuation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuadraticEquationResult {
    private double x1;
    private double x2;

    public QuadraticEquationResult(double x) {
        this.x1 = x;
        this.x2 = x;
    }
}
