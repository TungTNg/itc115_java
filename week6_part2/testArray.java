public class testArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, -7, 2, 42, 2};
        
        int result = count(numbers, 2);
        System.out.println(result);
        
        int anotherResult = indexOf(numbers, -7);
        System.out.println(anotherResult);
    }
    
    public static int count(int[] list, int target) {
        int count = 0;
        for(int n : list) {
            if(n == target) {
                count++;
            }
        }
        return count;
    }
    
    public static int indexOf(int[] list, int target) {
        for(int i = 0; i < list.length; i++) {
            if(list[i] == target) {
                return i;
            }
        }
        return -1;
    }
}