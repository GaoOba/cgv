package com.qfedu.cgv.comment.vo;

import com.qfedu.cgv.entity.Label;
import com.qfedu.cgv.entity.Movie;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 20:21
 * Description: No Description
 */
public class MovieVo {
    private Movie movie;

    private List<Label> labels;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }
}
