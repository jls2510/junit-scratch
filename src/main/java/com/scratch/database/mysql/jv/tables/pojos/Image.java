/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import com.scratch.database.mysql.jv.enums.ImageType;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Image implements Serializable {

    private static final long serialVersionUID = -1799131649;

    private final ULong     id;
    private final ImageType type;
    private final String    relatedId;
    private final String    filename;
    private final Byte      isPrimary;
    private final String    title;
    private final String    alt;
    private final Integer   sequenceNumber;
    private final Byte      isVideo;
    private final Timestamp updatedTs;
    private final Timestamp createdTs;

    public Image(Image value) {
        this.id = value.id;
        this.type = value.type;
        this.relatedId = value.relatedId;
        this.filename = value.filename;
        this.isPrimary = value.isPrimary;
        this.title = value.title;
        this.alt = value.alt;
        this.sequenceNumber = value.sequenceNumber;
        this.isVideo = value.isVideo;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public Image(
        ULong     id,
        ImageType type,
        String    relatedId,
        String    filename,
        Byte      isPrimary,
        String    title,
        String    alt,
        Integer   sequenceNumber,
        Byte      isVideo,
        Timestamp updatedTs,
        Timestamp createdTs
    ) {
        this.id = id;
        this.type = type;
        this.relatedId = relatedId;
        this.filename = filename;
        this.isPrimary = isPrimary;
        this.title = title;
        this.alt = alt;
        this.sequenceNumber = sequenceNumber;
        this.isVideo = isVideo;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public ImageType getType() {
        return this.type;
    }

    public String getRelatedId() {
        return this.relatedId;
    }

    public String getFilename() {
        return this.filename;
    }

    public Byte getIsPrimary() {
        return this.isPrimary;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAlt() {
        return this.alt;
    }

    public Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    public Byte getIsVideo() {
        return this.isVideo;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Image (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(relatedId);
        sb.append(", ").append(filename);
        sb.append(", ").append(isPrimary);
        sb.append(", ").append(title);
        sb.append(", ").append(alt);
        sb.append(", ").append(sequenceNumber);
        sb.append(", ").append(isVideo);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}
