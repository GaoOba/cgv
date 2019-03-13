package com.qfedu.cgv.entity;

public class MovieIntro {
    private Integer id;

    private String director;

    private String actors;

    private String story;

    private Integer mid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors == null ? null : actors.trim();
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story == null ? null : story.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}