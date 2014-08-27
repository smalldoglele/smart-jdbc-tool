package org.hmy.test.bean;

public class User {
    
    private String name;
    
    private String job;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public static void main(String[] args) {
        String s = "timestamp(6)";
        System.out.println(s.replaceAll("\\([0-9]+?\\)$", ""));
    }
}
