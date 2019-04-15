package com.yiibai.springmvc;


import com.sun.xml.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

// 注意这里
@XmlRootElement(name ="user")
public class User {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    // 注意这里
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }
}
