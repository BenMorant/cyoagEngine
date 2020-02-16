package fr.benhowl.cyoag.entity;

import java.io.Serializable;

public class Image implements Serializable{

	private static final long serialVersionUID = 1L;

    private String name;
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

