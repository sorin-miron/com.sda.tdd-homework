package com.sda.tdd.homework;

import java.util.LinkedList;
import java.util.List;

public class CustomStack {

    private List<Integer> stack = new LinkedList<Integer>();

    public boolean empty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public Integer peek(){
        if(!empty()){
            return stack.get(stack.size()-1);
        }
        return null;
    }

    public Integer pop(){
        Integer element;
        int topElementPosition = stack.size() - 1;
        if(!empty()){
           element = stack.get(topElementPosition);
           stack.remove(topElementPosition);
           return element;
        }
        return null;
    }

    public Integer push(Integer element){
        stack.add(element);
        return element;
    }

    public int search(Integer element){
        if(stack.contains(element)){
            return stack.indexOf(element);
        }
        return -1;
    }

    public int getSize(){
        return stack.size();
    }

}
