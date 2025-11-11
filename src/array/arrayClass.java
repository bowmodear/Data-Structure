package array;

public class arrayClass {
int[] arr;
int counter;

boolean isFull(){
    return (counter==arr.length);
}

    public arrayClass(int size) {
        counter = 0;
        arr = new int[size];

    }

    void append(int a){
        if(isFull()){
            System.out.println("Array is Full !!!");
            return;
        }
        arr[counter++]= a;
    }

    void traverse(){
        for(int i = 0;i<counter;i++){
            System.out.println(arr[i]+" At Index "+i);
        }
    }
    void search(int x){
        for(int i=0;i<counter;i++){
            if(x==arr[i]){
                System.out.println(x +" Found at index "+i);
                return;
            }
        }
        System.out.println(x+ " Not Found!");
    }
    void insert(int index,int item){
        if(isFull()){
            System.out.println("Array is Full!");
            return;}
        for(int i = counter;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=item;
        counter++;
    }
    void delete(){
        arr[counter--]=0;
    }
    void delete(int index){
        for(int i = index;i<(counter-1);i++){
            arr[i]=arr[i+1];
        }
        counter--;
    }
    void enlargeArray(int size){
        if(size<=arr.length){
            System.out.println("Can't enlarge the array");
            return;
        }
        int[] newarr = new int[size];

        for(int i = 0;i<arr.length;i++){
            newarr[i] = arr[i];
        }
        arr =newarr;
    }
}
