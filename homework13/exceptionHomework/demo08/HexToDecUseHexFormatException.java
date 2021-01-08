package endTermHomeWork.homework13.exceptionHomework.demo08;

public class HexToDecUseHexFormatException {
    String hexString;
    public HexToDecUseHexFormatException(String hexString) throws HexFormatException {
        setHexString(hexString);
    }
    public void setHexString(String hexString) throws HexFormatException {
        for (int i = 0; i < hexString.length(); i++) {
            if(judge(hexString.charAt(i))==-1){
                throw new HexFormatException(hexString+" is not a hex string");
            }
        }
        this.hexString=hexString;
    }
    public String getHexString(){
        return hexString;
    }
    private int judge(char ch){
        if((ch>='0') && (ch<='9')){
            return (ch-'0');
        }else if ((ch>='A')&&(ch<='F')){
            return (ch-'A'+10);
        }else {
            return -1;
        }
    }
    public int hex2Dec() {
        int result = 0;
        for (int i = hexString.length() - 1; i >= 0; i--) {
            result += judge(hexString.charAt(i)) * (Math.pow(16, (hexString.length() - i - 1)));
        }
        return result;
    }
}
