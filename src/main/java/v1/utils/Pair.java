package v1.utils;

public class Pair<T, T1> {
    private T1 key;
    private T1 value;

    public Pair(T1 key, T1 value) {
        this.key = key;
        this.value = value;
    }

    public T1 getKey() {
        return key;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public T1 getValue() {
        return value;
    }

    public void setValue(T1 value) {
        this.value = value;
    }
}
