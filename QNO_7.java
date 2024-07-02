public class QNO_7 {
    public static void main(String[] args) {
        //testcase1
        int[] arr1={1,2,3,4,5,6,1};
        int k1=3;
        System.out.println(max(arr1,k1));
        //testcase2
        int[] arr2={2,2,2};
        int k2=2;
        System.out.println(max(arr2,k2));
        //testcase3;
        int[] arr3={9,7,7,9,7,7,9};
        int k3=7;
        System.out.println(max(arr3,k3));

    }
    static int max(int[] arr,int k){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<k;i++){
           sum1+=arr[i];
        }
        for(int i=arr.length-1;i>=arr.length-k;i--){
            sum2+=arr[i];
        }
        return Math.max(sum1,sum2);
    }
}
