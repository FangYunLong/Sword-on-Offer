package cn.fyl.second;

/**
 * 细节问题
 * Created by Fang on 2017/9/21.
 */
public class SuperiorAnswer {
    public String replaceSpace(StringBuffer str) {
        if(str == null){
            return null;
        }
        StringBuilder newStr = new StringBuilder();
        //char[] strChar = str.toString().toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==' '){
                newStr.append("%");
                newStr.append("2");
                newStr.append("0");
            }
            else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();

    }
}
