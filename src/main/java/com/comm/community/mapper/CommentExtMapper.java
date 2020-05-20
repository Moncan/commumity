package com.comm.community.mapper;

import com.comm.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}