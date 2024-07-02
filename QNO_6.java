public class QNO_6 {
    public static void main(String[] args) {
        System.out.println(ans(115));
    }
    static int ans(int n){
        String[] arr={"one","two","three","four","five","six","seven","eight","nine"};
        StringBuilder ans = new StringBuilder();
        int count=0;
        while(n>0){
            int digit=n%10;
            ans.append(arr[digit-1]);
            count++;
            n=n/10;
        }
        if(count==0){
            return 0;
        }
       else if(count==1){
           return ans.length();
       }
       else if(count==2){
           return ans.length()+2;
       }
       else if(count==3){
           return ans.length()+11;
       }
       else{
           return ans.length()+9;
       }
    }
}
