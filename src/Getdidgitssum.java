public class Getdidgitssum {
    public static void main(String[] args) {
        String newStr = Integer.toString(Getdidgitssum);
        String[] arrNum = newStr.split("");
        System.out.println(arrays.toString(arrNum));

        int totalNum = 0;

        for(int i = 0; i< arrNum.length; i++){
            totalNum += Integer.parseInt(arrNum[i]);
        }
        return totalNum;
    }
}
