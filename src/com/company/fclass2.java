package com.company;

public class fclass2 extends fclass3 {
    public void Encapsulate (){
        //пробуем вывести значение открытого поля класса родителя
        System.out.println(str_public);
        //пробуем изменить значение поля класса родителя
        super.str_public="Новое значение открытого поля";
        System.out.println(str_public);
        //пробуем вывести защищенное поле
        System.out.println(str_protected);
        //изменяем поле успешно, так как классы находятся в одном пакете, а также данный класс является наследником
        super.str_protected="новое значение защищённого поля";
        System.out.println(str_protected);

        //пробуем вывести значение закрытого поля
        //напрямую не получается, поэтому для получения и изменения закрытого поля используем методы доступа
        System.out.println(getStr_private());
        setStr_private("Новое значение закрытого поля");
        System.out.println(getStr_private());


    }
}
