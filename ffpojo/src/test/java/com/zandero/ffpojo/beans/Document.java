package com.zandero.ffpojo.beans;

import com.zandero.ffpojo.metadata.positional.annotation.PositionalField;
import com.zandero.ffpojo.metadata.positional.annotation.PositionalRecord;
import com.zandero.ffpojo.metadata.positional.annotation.extra.DatePositionalField;
import com.zandero.ffpojo.metadata.positional.annotation.extra.RemainPositionalField;

import java.util.Date;

/**
 * Created by William on 02/11/15.
 * @author William Miranda
 */

@PositionalRecord
public class Document {

    @PositionalField(initialPosition = 1, finalPosition = 20)
    private String author;

    @DatePositionalField(initialPosition = 21, finalPosition = 28, dateFormat = "ddMMyyyy")
    private Date creation;

    @PositionalField(initialPosition = 29, finalPosition = 49)
    private String publisher;
    @RemainPositionalField
    private String comments;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Document{" +
                "author='" + author + '\'' +
                ", creation=" + creation +
                ", publisher='" + publisher + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
