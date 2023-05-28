package com.appspringboot.quadraticEcuation.controller;

import com.appspringboot.quadraticEcuation.exceptions.NoRealRootsException;
import com.appspringboot.quadraticEcuation.model.QuadraticEquationRequest;
import com.appspringboot.quadraticEcuation.model.QuadraticEquationResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.appspringboot.quadraticEcuation.service.QuadraticEquationCalculator;

@CrossOrigin
@RestController
public class QuadraticEquationController {

    @PostMapping("/quadratic-equation")
    public QuadraticEquationResult calculateEquation(@RequestBody QuadraticEquationRequest equationRequest) {
        double a = equationRequest.getA();
        double b = equationRequest.getB();
        double c = equationRequest.getC();

        return QuadraticEquationCalculator.calculate(a, b, c);
    }

    @ExceptionHandler(NoRealRootsException.class)
    public ResponseEntity<String> handleNoRealRootsException(NoRealRootsException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}