package fengdecong.model;

public class DuckFactory {
    public static Duck creat(){
        Duck d = new Duck();
        d.setName("秀才");
        d.setAge(3);
        return d;
    }

    public Duck creat1(){
        Duck d = new Duck();
        d.setName("举人");
        d.setAge(5);
        return d;
    }
}
