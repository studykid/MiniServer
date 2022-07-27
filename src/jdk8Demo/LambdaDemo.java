package jdk8Demo;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
            List<Apple> list = new ArrayList<Apple>();
            List<Apple> resultlist = new ArrayList<Apple>();

             resultlist = getApple(list);

    }

    static List<Apple> getApple(List<Apple> list){
        return (List<Apple>) list.stream().filter(apple -> apple.getColor().equals("red"));
    }
}
