package com.tutorialspoint;

public class DBParaConstructor {
    //jdbc sqlserver 驱动类
    public String sqlServerDriverClassName;
    //sqlserver 连接地址
    public String sqlServerUrl;
    //sqlserver 用户名
    public String sqlServerUserName;
    //sqlserver 密码
    public String sqlServerPassword;

    public DBParaConstructor(){}

    public DBParaConstructor(String sqlServerDriverClassName,String sqlServerUrl,String sqlServerUserName,String sqlServerPassword){
        this.sqlServerDriverClassName = sqlServerDriverClassName;
        this.sqlServerUrl = sqlServerUrl;
        this.sqlServerUserName = sqlServerUserName;
        this.sqlServerPassword = sqlServerPassword;
    }
}