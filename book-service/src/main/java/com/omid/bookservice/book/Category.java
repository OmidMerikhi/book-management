package com.omid.bookservice.book;

import lombok.Getter;

@Getter
public enum Category {
    NOVEL("رمان"),
    PSYCHOLOGY("روانشناسی"),
    LITERATURE("ادبیات"),
    HISTORICAL("تاریخی"),
    RELIGIOUS("مذهبی");

    final String value;
    Category(String value){
        this.value=value;
    }


}
