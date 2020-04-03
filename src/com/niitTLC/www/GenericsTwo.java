package com.niitTLC.www;

class TwoGenericClass<P, Q,R>{
    P ob1;
    Q ob2;
    R ob3;

    TwoGenericClass(P o1, Q o2,R o3){
        ob1=o1;
        ob2=o2;
        ob3=o3;
    }

    void getType(){
        System.out.println("Type of P is: " + ob1.getClass().getName());
        System.out.println("Type of Q is: " + ob2.getClass().getName());
        System.out.println("Type of R is: " + ob3.getClass().getName());

    }

    P getobj1(){
        return ob1;
    }

    Q getobj2(){
        return ob2;
    }
    

    R getobj3(){
        return ob3;
    }


}

class GenericsTwo{
    public static void main(String [] args){
        TwoGenericClass<Double, String,Integer> ob = new TwoGenericClass<Double, String,Integer>(100.22,"Generics Demo",10);

        ob.getType();

        double d = ob.getobj1();
        System.out.println("Value: " + d);

        String s = ob.getobj2();
        System.out.println("Value: " + s);
        
        Integer i = ob.getobj3();
        System.out.println("Value: " + i);
    }
}
