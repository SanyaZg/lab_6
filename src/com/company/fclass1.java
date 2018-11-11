package com.company;

public class fclass1 {
    public String str_public="Это открытое поле!";
    protected String str_protected="Это защищенное поле!";
    private String str_private="Это закрытое поле!";

    public static void main(String[] args) {
	    fclass2 fclass2=new fclass2();
	    fclass2.Encapsulate();
    }

    public void setStr_private(String str){
        this.str_private=str;
    }
    public String getStr_private(){
        return this.str_private;
    }
    public void setStr_protected(String str){
        this.str_protected=str;
    }
    public String getStr_protected(){
        return this.str_protected;
    }
}
