package com.robin.mapper;

import com.robin.pojo.Project;

import java.util.List;

public interface ProjectMapper {
    List<Project> getProjectList();
    int addProject(Project project);
}
