package chap3.item11;

public class PhoneNumber {
    private String areaCode;
    private String prefix;
    private String lineNumber;

    public PhoneNumber(String areaCode, String prefix, String lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(Short.parseShort(areaCode));
        result = 31 * result + Short.hashCode(Short.parseShort(prefix));
        result = 31 * result + Short.hashCode(Short.parseShort(lineNumber));
        return result;
    }
}
