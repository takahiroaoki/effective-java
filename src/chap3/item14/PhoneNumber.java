package chap3.item14;

public class PhoneNumber implements Comparable {
    private String prefix;
    private String areaCode;
    private String lineNum;

    public PhoneNumber(String prefix, String areaCode, String lineNum) {
        this.prefix = prefix;
        this.areaCode = areaCode;
        this.lineNum = lineNum;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getLineNum() {
        return lineNum;
    }

    @Override
    public int compareTo(Object o) {
        PhoneNumber pn = (PhoneNumber) o;
        int result = Short.compare(Short.parseShort(prefix), Short.parseShort(pn.getPrefix()));
        if (result == 0) {
            result = Short.compare(Short.parseShort(areaCode), Short.parseShort(pn.getAreaCode()));
            if (result == 0) {
                result = Short.compare(Short.parseShort(lineNum), Short.parseShort(pn.getLineNum()));
            }
        }
        return result;
    }

    /*
     * "prefix-areaCode-lineNum"という形式で返す。
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(prefix)
                .append("-")
                .append(areaCode)
                .append("-")
                .append(lineNum);
        return sb.toString();
    }
}
