package lk.codelabs.samples.dbmetadata.model;

import java.io.Serializable;

public class Column implements Serializable {

    String name;
    String type;

    int size;
    boolean unique;

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    boolean nullable;
    boolean primatyKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public boolean isPrimatyKey() {
        return primatyKey;
    }

    public void setPrimatyKey(boolean primatyKey) {
        this.primatyKey = primatyKey;
    }
}
