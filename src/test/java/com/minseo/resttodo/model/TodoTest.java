package com.minseo.resttodo.model;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class TodoTest {
    @Test
    public void TodoCreated(){
        Todo todo = Todo.builder()
                .name("할일1")
                .desc("내용1")
                .status(Status.READY)
                .build();
        assertThat(todo).isNotNull();
    }
}