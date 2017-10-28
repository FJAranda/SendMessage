package com.example.sendmessage.POJO;

import java.io.Serializable;

/**
 * @author Francisco Javier Aranda Caro
 * @version 1.0
 *
 * Clase POJO que contiene los mensajes.
 */

public class Message implements Serializable{
    private String message;
    private String user;

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message)o;
        result = ((message.equals(message1.message)) &&
                (user.equals(message1.user)));

        return result;

    }

    @Override
    public int hashCode() {
        int result = message.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    public Message(String message, String user) {

        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
