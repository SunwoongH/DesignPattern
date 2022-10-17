package StrategyPattern.assignment;

import java.util.Date;

public class FileInfo {
    private final String name;
    private final String type;
    private final int size;
    private final Date modifiedDate;

    public FileInfo(String name, String type, int size, Date modifiedDate) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.modifiedDate = modifiedDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + '\n' + "Type: " + getType() + '\n' +
                "Size: " + getSize() + '\n' + "ModifiedDate: " + getModifiedDate();
    }
}
