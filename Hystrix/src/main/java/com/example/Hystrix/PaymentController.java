package com.example.Hystrix;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@GetMapping
    public ResponseEntity<?> getOrderStatus(){
        int random = (int) (Math.random()*100);
        System.out.println(random);
        if(random%2==0) {
            System.out.println("Bad Request !!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error Occured");

        }else {
            System.out.println("Good request!!");
            return ResponseEntity.status(HttpStatus.OK).body("Payment Successfull !! Order placed ");
        }

    }

}
