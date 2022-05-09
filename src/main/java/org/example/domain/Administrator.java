package org.example.domain;

public class Administrator {
    private String root;
    private String password;

    @Override
    public String toString() {
        return "Administrator{" +
                "root='" + root + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Administrator() {
    }

    public Administrator(String root, String password) {
        this.root = root;
        this.password = password;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
