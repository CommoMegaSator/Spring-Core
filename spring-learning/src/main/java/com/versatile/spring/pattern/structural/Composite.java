package com.versatile.spring.pattern.structural;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class File{
    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}

class Folder{
    private String name;
    private Date creationDate;
    private List<Folder> folders = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    public String getName(){
        return name;
    }

    public Folder(String name) {
        this.name = name;
    }

    void addFolder(Folder folder){
        folders.add(folder);
    }

    void removeFolder(Folder folder){
        folders.remove(folder);
    }

    List<Folder> getFolders(){
        return folders;
    }

    void addFile(File file){
        files.add(file);
    }

    void removeFile(File file){
        files.remove(file);
    }

    List<File> getFiles(){
        return files;
    }
}

public class Composite {
    public void useComposite(){
        Folder folders = new Folder("Composite Folder");
        folders.addFolder(folders);
        for (Folder folder : folders.getFolders())
        System.out.println(folders.getName());
    }
}
