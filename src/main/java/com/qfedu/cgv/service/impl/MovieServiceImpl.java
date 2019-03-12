package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.MovieVo;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.LabelMapper;
import com.qfedu.cgv.dao.MovieMapper;
import com.qfedu.cgv.entity.Label;
import com.qfedu.cgv.entity.Movie;
import com.qfedu.cgv.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 20:15
 * Description: No Description
 */
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieMapper movieMapper;
    @Autowired
    LabelMapper labelMapper;

    @Override
    public ResultVo findAll() {
        List<Movie> movies = movieMapper.findAll();
        List<MovieVo> movieVos = new ArrayList<>();
        movieVos = movieLable(movieVos, movies);
        return ResultUtil.exec(true,"OK",movieVos);
    }

    @Override
    public ResultVo findByStatus(int status) {
        List<MovieVo> movieVos = new ArrayList<>();
        List<Movie> movies = movieMapper.findByStatus(status);
        movieVos = movieLable(movieVos, movies);
        return ResultUtil.exec(true,"OK",movieVos);
    }

    private List<MovieVo> movieLable(List<MovieVo> movieVos, List<Movie> movies) {
        for (Movie movie:movies) {
            Integer id = movie.getId();
            MovieVo movieVo = new MovieVo();
            movieVo.setMovie(movie);
            List<Label> labels = labelMapper.findById(id);
            movieVo.setLabels(labels);
            movieVos.add(movieVo);
        }
        return movieVos;
    }
}
