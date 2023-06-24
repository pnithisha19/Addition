package com.example.AddTwoNumbers.AddController;

import com.example.AddTwoNumbers.utility.AdditionUtility;
import org.springframework.ui.Model;
import com.example.AddTwoNumbers.domain.Addition;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/calculator")
@Controller
public class AdditionController
{
    @PostMapping("/add")
    @ResponseBody
    public AdditionResult addNumbers(@RequestBody Addition addition)
    {
        AdditionResult result = new AdditionResult();
        result.setNumber1(addition.getNum1());
        result.setNumber2(addition.getNum2());

        int addResult = AdditionUtility.add(addition.getNum1(), addition.getNum2());
        result.setSum(addResult);
        return result;
    }
}