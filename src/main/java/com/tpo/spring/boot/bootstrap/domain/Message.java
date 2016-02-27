package com.tpo.spring.boot.bootstrap.domain;

/**
 * @author Tiberiu
 * @since 27/02/16.
 */
public class Message {
    private String text;
    private String description;

    public Message(String text, String description) {
        this.text = text;
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
