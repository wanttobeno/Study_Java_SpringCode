package com;

public class DBParaConstructor {
    // jdbc 驱动类
    public String sqlServerDriverClassName;
    // 连接地址
    public String sqlServerUrl;
    // 用户名
    public String sqlServerUserName;
    // 密码
    public String sqlServerPassword;

    public DBParaConstructor() {}

    public DBParaConstructor(String sqlServerDriverClassName,String sqlServerUrl,
                           String sqlServerUserName,String sqlServerPassword) {
        this.sqlServerDriverClassName = sqlServerDriverClassName;
        this.sqlServerUrl = sqlServerUrl;
        this.sqlServerUserName = sqlServerUserName;
        this.sqlServerPassword = sqlServerPassword;
    }
}
