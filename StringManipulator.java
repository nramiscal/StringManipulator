public class StringManipulator {
  public String trimAndConcat(String str1, String str2) {
    String newStr1 = str1.trim();
    String newStr2 = str2.trim();
    String str3 = newStr1.concat(newStr2);
    return str3;
  }

  public Integer getIndexOrNull(String str, char c){
    int i = str.indexOf(c);
    if (i == -1){
      return null;
    }
    else{
      return i;
    }

  }

  public Integer getIndexOrNull(String str1 , String str2){
    int i = str1.indexOf(str2);
    if (i == -1){
      return null;
    }
    else{
      return i;
    }
  }

  public String concatSubstring(String str1, int i, int j, String str2){
    String subStr = str1.substring(i,j);
    return subStr.concat(str2);
  }
}
