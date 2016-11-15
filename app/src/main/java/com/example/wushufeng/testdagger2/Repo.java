package com.example.wushufeng.testdagger2;

/**
 * Created by wushufeng on 2016/11/15.
 */

public class Repo {
    public String name; // 库的名字
    public String description; // 描述
    public String language; // 语言

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
