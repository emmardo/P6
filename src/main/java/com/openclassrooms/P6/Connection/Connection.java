package com.openclassrooms.P6.Connection;

public class Connection {

    private int connectionId;
    private int userId;
    private String connectionEmail;

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getConnectionEmail() {
        return connectionEmail;
    }

    public void setConnectionEmail(String connectionEmail) {
        this.connectionEmail = connectionEmail;
    }
}
