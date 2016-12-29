/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajaybhatia.college.helpers;

/**
 *
 * @author ajay
 */
public class StudentAdapter {
    private Long id;
    private String name;
    private Long courseId;

    public StudentAdapter() {
    }

    public StudentAdapter(Long id, String name, Long courseId) {
        this.id = id;
        this.name = name;
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

}
