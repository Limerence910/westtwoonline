package com.example.myrecyview;

public class filelist {
    private String Name;
    private String Message;
    public filelist(){}
    public filelist(String name,String message){
        this.Name = name;
        this.Message = message;
    }
    public String getName(){
        return Name;
    }
    public String getMessage(){
        return Message;
    }
}
