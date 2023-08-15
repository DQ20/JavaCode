public class beautifulNum{
    public static void main(String[] args){
        String str="aaaeeeooo";
        System.out.println(longest(str));
    }
    private static int longest(String str) {
        if(str.length()<5){
            return 0;
        }
        int max=0;
        int index=0;
        int i=0;
        String reg="aeiou";
        while(i<str.length()){
            if(max>=(str.length()-i)||str.length()-4<i){
                return max;
            }
            if(str.charAt(i)=='a'){
                for(int j=i+1;j<str.length();j++){
                    if(index==4){
                        if(str.charAt(j)=='u'){
                            max=j-i+1;
                        }
                        else {
                            max=j-i;
                            index=0;
                            i=j;
                        }
                        continue;
                    }
                    if(str.charAt(j)==reg.charAt(index+1)){
                        index++;
                        if(index==4){
                            max=j-i+1;
                        }
                    }
                    else if(str.charAt(j)!=reg.charAt(index)){
                        index=0;
                        i=j;
                        break;
                    }
                }
            }else {
                i++;
            }
        }
        return max;
    }
}