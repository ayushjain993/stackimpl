package com.example.stackimpl.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stackimpl.model.StackModel;
import com.example.stackimpl.repository.StackInterface;


@RestController
@RequestMapping("/stack")
public class StackController {

    @Autowired
    private StackInterface stackInterface;

   
    @GetMapping
    public void TopOfStack() {
    	long top_stack_id=stackInterface.count();
    	System.out.println(top_stack_id);
		Optional<StackModel> model= stackInterface.findById(top_stack_id);
		System.out.println(model);
		
    }
    
    @PostMapping
    public void push(@RequestBody StackModel val) {
    	System.out.println(val.getValue());
        stackInterface.save(val);
        
        
        
    }
    
    @DeleteMapping
    public void pop()   {
   
    	long value_to_pop=stackInterface.count();
		System.out.println(value_to_pop);
		stackInterface.deleteById(value_to_pop);
		
    	
    	
    
    }
    

    /*@PostMapping("/questions/{questionId}/answers")
    public int pop(@PathVariable Long questionId,
                            @Valid @RequestBody Answer answer) {
        return questionRepository.findById(questionId)
                .map(question -> {
                    answer.setQuestion(question);
                    return answerRepository.save(answer);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
    }*/
}
