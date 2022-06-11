package service;

public class CashierTest{
    
    public void test001(){
        Cashier c = new Cashier();
        double actual = c.getTotal(50.0);
        assert actual == 50.0;
    }
    public void test002(){
        var c = new Cashier();
        double actual = c.getTotal(200.0);
        assert actual == 190.0;
    }
    public void test003(){
        var c = new Cashier();
        double actual = c.getTotal(99.0);
        assert actual == 99.0;
    }
    public void test004(){
        var c = new Cashier();
        double actual = c.getTotal(100.0);
        assert actual == 95.0;
    }
    
    double delta = 0.00000001;
    
    public void test005(){
        var c = new Cashier();
        double actual = c.getTotal(101.0);
        double start = 95.95 - delta;
        double finish = 95.95 + delta;
        assert start <= actual && actual <= finish;
    }
    public void test006(){
        var c = new Cashier();
        double actual = c.getTotal(-7.0);
        assert actual == 0.0;
    }
}