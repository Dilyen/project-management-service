package io.turntabl.project.v1.Transfers;

public class ProjectTO {
    private Integer project_id;
    private String project_name;
    private String project_description;

    public ProjectTO() {

    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    @Override
    public String toString() {
        return "ProjectTO{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", project_description='" + project_description + '\'' +
                '}';
    }
}
