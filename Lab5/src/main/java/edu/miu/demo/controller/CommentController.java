package edu.miu.demo.controller;

import edu.miu.demo.domain.Comment;
import edu.miu.demo.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {

   private final CommentService commentService;
    @GetMapping
    public List<Comment> getAll(){
        return commentService.findAll();
    }
    @GetMapping("/{id}")
    public Comment getById(@PathVariable("id") long id){
        return commentService.findById(id);
    }
    @PostMapping
    public void create(@RequestBody Comment com){
        commentService.save(com);
    }



}
