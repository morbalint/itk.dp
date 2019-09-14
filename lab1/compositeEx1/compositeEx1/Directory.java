package compositeEx1;

import java.util.ArrayList;

public class Directory implements Listable {
    private String name;
    private ArrayList<Listable> includedFiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Listable listable) {
        includedFiles.add(listable);
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for (Listable listable: includedFiles) {
            listable.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}