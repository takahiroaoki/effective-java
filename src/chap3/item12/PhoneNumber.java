package chap3.item12;

public class PhoneNumber {
    private String prefix;
    private String areaCode;
    private String lineNum;

    public PhoneNumber(String prefix, String areaCode, String lineNum) {
        this.prefix = prefix;
        this.areaCode = areaCode;
        this.lineNum = lineNum;
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
