package com.openclassrooms.P6.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="connection")
@EntityListeners(AuditingEntityListener.class)
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int connectionId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userId;

    @NotBlank
    @Email
    private String connectionEmail;

    public Connection(User userId, String connectionEmail) {

        this.userId = userId;
        this.connectionEmail = connectionEmail;
    }

    public Connection() {
    }

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getConnectionEmail() {
        return connectionEmail;
    }

    public void setConnectionEmail(String connectionEmail) {
        this.connectionEmail = connectionEmail;
    }
}
