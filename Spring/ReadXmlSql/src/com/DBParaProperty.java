package com;

// https://www.jb51.net/article/126310.htm
// 类的属性注入
public class DBParaProperty {
    // jdbc sqlserver 驱动类
    String sqlServerDriverClassName;
    // sqlserver 连接地址
    String sqlServerUrl;
    // 用户名
    String sqlServerUserName;
    // 密码
    String sqlServerPassword;

    public String getSqlServerDriverClassName() {
        return sqlServerDriverClassName;
    }

    public void setSqlServerDriverClassName(String sqlServerDriverClassName) {
        this.sqlServerDriverClassName = sqlServerDriverClassName;
    }

    public String getSqlServerUrl() {
        return sqlServerUrl;
    }

    public void setSqlServerUrl(String sqlServerUrl) {
        this.sqlServerUrl = sqlServerUrl;
    }

    public String getSqlServerUserName() {
        return sqlServerUserName;
    }

    public void setSqlServerUserName(String sqlServerUserName) {
        this.sqlServerUserName = sqlServerUserName;
    }

    public String getSqlServerPassword() {
        return sqlServerPassword;
    }

    public void setSqlServerPassword(String sqlServerPassword) {
        this.sqlServerPassword = sqlServerPassword;
    }
}
