package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Cashier{
    // This method will discount by 5%
    // if the price is at least 100 baht
    // or return the original price if
    // the price is less than 100.
    @RequestMapping
    double getTotal(double price){
        if (price < 0) return 0;
//      1st version
//        if(price >=100) return 0.95 * price;
//        else return price;
//      2nd version
        return price >=100 ? 0.95 * price: price;
    }
    
}

// http://127.0.0.1:23000//cashier?price=120 //