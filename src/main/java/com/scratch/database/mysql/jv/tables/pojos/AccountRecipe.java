/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


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
public class AccountRecipe implements Serializable {

    private static final long serialVersionUID = 910902211;

    private final ULong     id;
    private final ULong     recipeId;
    private final ULong     accountId;
    private final Timestamp createdTs;

    public AccountRecipe(AccountRecipe value) {
        this.id = value.id;
        this.recipeId = value.recipeId;
        this.accountId = value.accountId;
        this.createdTs = value.createdTs;
    }

    public AccountRecipe(
        ULong     id,
        ULong     recipeId,
        ULong     accountId,
        Timestamp createdTs
    ) {
        this.id = id;
        this.recipeId = recipeId;
        this.accountId = accountId;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public ULong getRecipeId() {
        return this.recipeId;
    }

    public ULong getAccountId() {
        return this.accountId;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AccountRecipe (");

        sb.append(id);
        sb.append(", ").append(recipeId);
        sb.append(", ").append(accountId);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}
