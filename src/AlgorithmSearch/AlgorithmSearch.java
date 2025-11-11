public class AlgorithmSearch {
    /*
        Linear Algorithm:
         1.Start at i=0
         2.Check if the value at i is equal to the search key
         3.if true return i
         4.else increment i and goto step 2
         */
        /*
         Binary Algorithm:
         1.initialize L(Low)=0,H(High)=Length-1
         2.i=(H+L)/2
         3.check if value at i = search key
         4.if true return i
         5.else if L=H return -1
         6.else if key > value at i, L=i+1 then go to step 2.
         7.else H = i-1 then go to step 2.
         */
        /*
         Bubble sort:
         1.initialize i and j to 0
         2.if i < length -1 Goto step 4
         3.else return the array
         4.if j < length -1 -i Goto step 6
         5.else increment i and j =0 goto step 2
         6.if value at j > value at j+1 then swap indicies
         7.increment j and goto step 4.
         */
    public static int Linear(int[] arr,int key){
        for(int i =0; i < arr.length ; i++){if(arr[i]==key)return i;}
        return -1;
    }
    public static int Binary(int[] arr, int key){
        int L =0,H=arr.length -1,i;
        while(L<=H){
            i = (H+L)/2;
            if(arr[i]==key)return i;
            if(key > arr[i]){L=i+1;}
            else{H = i-1;}
        }
        return -1;
    }
    public static void bubble(int[] arr){
        int i=0;
        while(i<arr.length-1){
            for(int j=0;j<(arr.length-1-i);j++){
                if(arr[j]>arr[j+1]){int tmp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;}
            }
            i++;
        }
        for(int k =0;k<arr.length;k++){
            System.out.print("[" + arr[k] + "] ");
        }
    }
    public static void main(String[] args) {
    int[] arr = {5,95,-5,6,8,23,-8};
    int[] sortarr = {1,5,6,8,15,23,63};

    System.out.println(Linear(arr,9));
    System.out.println(Binary(sortarr,15));
    bubble(arr);
    }
}