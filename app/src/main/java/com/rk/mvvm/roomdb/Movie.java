package com.rk.mvvm.roomdb;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by user1 on 29/6/19.
 */
@Entity
public class Movie {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "movie_id")
    int id;
    @ColumnInfo(name = "movie_name")
    String name;
    @ColumnInfo(name = "hero_name")
    String hero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }
}
