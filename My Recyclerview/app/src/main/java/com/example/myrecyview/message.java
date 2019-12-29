package com.example.myrecyview;

public class message {
    private String name;
    private String content;
    public message(String name,String content){
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }
    public String getContent(){
        return content;
    }
}
