package Assignment23;

public class Assignment23 {

    public static void main(String[] args) {
	int[] arr = { 5, 7, 2, 9, 3 };
	int greatest = arr[0];
	System.out.println(maxVal(arr,greatest));

    }
    public static int maxVal(int arr[],int greatest) {

	if (arr[(arr.length / 2)] > greatest) {

	    greatest = arr[(arr.length / 2)];

	}

	if (arr[arr.length - 1] > greatest) {

	    greatest = arr[arr.length - 1];

	}

	
	return greatest;
    }

    }
