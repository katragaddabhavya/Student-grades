package com.BookStore;

public class Students {
    public int calculateMarks(int math,int physics,int chemistry,int biology){
        int sum=math+physics+chemistry+biology;
        return sum;
    }
    public float calculateMarks(int math,float physics,int chemistry){
        float sum=math+physics+chemistry;
        return sum;
    }

    public int calculateMarks(int businessStudies,int finance,int accounting){
        int sum = businessStudies+finance+accounting;
        return sum;
    }

}