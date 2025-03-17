package a2_CreationalDesignPattern.BuilderPattern.Examples.Example2;

public class CustomStringBuilder {
    private char[] value;
    private int count;
    private static final int DEFAULT_CAPACITY = 16;

    public CustomStringBuilder() {
        value = new char[DEFAULT_CAPACITY];
        count = 0;
    }

    public CustomStringBuilder(int capacity) {
        value = new char[capacity];
        count = 0;
    }

    public CustomStringBuilder append(String str) {
        if (str == null) {
            str = "null";
        }

        int len = str.length();
        ensureCapacity(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    private void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity > value.length) {
            int newCapacity = Math.max(minimumCapacity, 2 * value.length + 2);
            char[] newValue = new char[newCapacity];
            System.arraycopy(value, 0, newValue, 0, count);
            value = newValue;
        }
    }

    public CustomStringBuilder append(char c) {
        ensureCapacity(count + 1);
        value[count++] = c;
        return this;
    }

    public CustomStringBuilder append(int num) {
        return append(String.valueOf(num));
    }

    public int length() {
        return count;
    }

    public int capacity() {
        return value.length;
    }

    public void setLength(int newLength) {
        if (newLength < 0) {
            throw new StringIndexOutOfBoundsException(newLength);
        }
        ensureCapacity(newLength);
        if (count < newLength) {
            for (int i = count; i < newLength; i++) {
                value[i] = '\0';
            }
        }
        count = newLength;
    }

    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}