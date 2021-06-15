package com.cadastroestudantes.entities;

/*
export interface Student {
    id: number
    ra: number;
    name: string;
    age: number;
    studentClass: string;
    parentName: string;
}*/

public class Student {
    private Long id;
    private Long ra;
    private String name;
    private Long age;
    private String studentClass;
    private String parentName;

    //id
    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    //ra
    public Long getRa(){
        return ra;
    }

    public void setRa(Long ra){
        this.ra = ra;
    }

    //name
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    //age
    public Long getAge() {

        return age;
    }

    public void setAge(Long age) {

        this.age = age;
    }
    
    //studentClass
    public String getStudentClass() {

        return studentClass;
    }

    public void setStudentClass(String studentClass) {

        this.studentClass = studentClass;
    }

    //parentName
    public String getParentName() {

        return parentName;
    }

    public void setParentName(String parentName) {

        this.parentName = parentName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }    
}
