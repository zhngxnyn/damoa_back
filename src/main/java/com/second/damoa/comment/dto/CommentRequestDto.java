//package com.second.damoa.comment.dto;
//
//import com.second.damoa.board.FreeBoard.model.FreeBoard;
//import com.second.damoa.comment.model.Comment;
//import com.second.damoa.social.model.User;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class CommentRequestDto {
//    private Long id;
//    private String comment;
//    private String createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
//    private String modifiedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
//    private User user;
//    private FreeBoard freeBoard;
//
//
//
//
//    /* Dto -> Entity */
//    public Comment toEntity() { Comment comments = Comment.builder()
//            .id(id)
//            .comment(comment)
//            .createdDate(createdDate)
//            .modifiedDate(modifiedDate)
//            .user(user)
//            .freeBoard(freeBoard)
//            .build();
//        return comments; } }
//
