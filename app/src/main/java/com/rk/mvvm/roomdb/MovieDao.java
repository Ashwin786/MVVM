package com.rk.mvvm.roomdb;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by user1 on 29/6/19.
 */
@Dao
public interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(Movie movie);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    long update(Movie movie);

    @Query("Select * from Movie where movie_name = :movieName limit 1")
    Movie findMovie(String movieName);

    @Delete
    void delete(int id);

    @Query("Select * from Movie")
    List<Movie> getAllMovie();
}
