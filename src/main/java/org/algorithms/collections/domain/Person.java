package org.algorithms.collections.domain;

public class Person {

    private String credential;
    private String name;

    public Person(String credential,String name) {
        this.credential = credential;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj == null) return false;
       if(this == obj) return true;
       if(this.getClass() != obj.getClass()) return false;
       Person person = (Person) obj;
       return credential != null && credential.equals(person.credential);
    }

    @Override
    public int hashCode() {
        return credential == null ? 0 : this.credential.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "credential='" + credential + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
