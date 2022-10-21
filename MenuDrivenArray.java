
import java.util.*;

public class MenuDrivenArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements of the array");
        // MenuDrivenArray[] a = new MenuDrivenArray[size];
        int a[] = new int[size];
        System.out.println("Enter elements in array");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int ch;
        do {
            System.out.println(
                    "1: Print Array \n2: Maximum and Minimum of the array \n3:Addition of elements in array \n4: Odd element and its count \n5:Even element and its count \n6: Perfect Number \n7: Armstrong Number \n8: Palindrome Number \n9:Bubble sort \n10: Strong Numbers in array \n11:Insertion Sort \n12: Reverse array \n13:Linear Search \n14: Binary Search \n15: Selection Sort");
            System.out.println("----------------------------------------");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Given array is \n");
                    for (int i = 0; i < size; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println("\n----------------------------------------");
                    break;

                case 2:
                    int max = a[0];
                    int min = a[0];
                    for (int i = 1; i < size; i++) {
                        if (a[i] > max) {
                            max = a[i];
                        }
                    }
                    for (int i = 1; i < size; i++) {
                        if (a[i] < min) {
                            min = a[i];
                        }
                    }
                    System.out.println("Maximum element is " + max);
                    System.out.println("Minimum element is " + min);
                    System.out.println("----------------------------------------");
                    break;

                case 3:
                    int sum = 0;
                    for (int i = 0; i < size; i++) {
                        sum = sum + a[i];
                    }
                    System.out.println("Addition of array elements is " + sum);
                    System.out.println("----------------------------------------");
                    break;

                case 4:
                    int count = 0;
                    System.out.print("Odd Numbes in the array are ");
                    for (int i = 0; i < size; i++) {
                        if (a[i] % 2 != 0) {
                            count++;
                            System.out.println(a[i] + " ");
                        }
                    }
                    System.out.println("Count is" + count);
                    System.out.println("----------------------------------------");
                    break;

                case 5:
                    count = 0;
                    System.out.print("Even Numbers in the array are\n");
                    for (int i = 0; i < size; i++) {
                        if (a[i] % 2 == 0) {
                            count++;
                            System.out.println(a[i] + " ");
                        }
                    }
                    System.out.println("Count is" + count);
                    System.out.println("----------------------------------------");
                    break;

                case 6:

                    for (int k = 0; k < size; k++) {
                        int temp = a[k];
                        sum = 0;
                        for (int j = 1; j <= (temp / 2); j++) {
                            if (temp % j == 0) {
                                sum += j;
                            }
                        }
                        if (sum == temp) {
                            System.out.println("Perfect numbers: " + temp);
                        }
                    }

                    System.out.println("----------------------------------------");
                    break;

                case 7:
                    for (int i = 0; i < size; i++) {
                        sum = 0;
                        int temp = a[i];
                        int t = temp;
                        while (temp > 0) {
                            int r = temp % 10;
                            sum = sum + (r * r * r);
                            temp = temp /= 10;
                        }
                        if (t == sum) {
                            System.out.println("Armstrong Number is " + sum);
                        }
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 8:
                    for (int i = 0; i < size; i++) {
                        int t, temp;
                        t = temp = a[i];
                        sum = 0;
                        int r = 0;
                        while (t > 0) {
                            r = t % 10;
                            sum = sum * 10 + r;
                            t = t / 10;
                        }
                        if (temp == sum) {
                            System.out.println("Palindrome numbers from the array are " + temp);
                        }
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 9:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = 0; j < size - 1 - i; j++) {
                            if (a[j] > a[j + 1]) {
                                int temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Sorted array is ");
                    for (int i = 0; i < size; i++) {
                        System.out.println(a[i]);
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 10:
                    for (int i = 0; i < a.length; i++) {
                        sum = 0;
                        int fact = 1;
                        int j = 1;
                        int temp = a[i];
                        int r = temp % 10;
                        while (i <= r) {
                            fact = fact * i;
                            i++;
                        }
                        sum = sum + fact;
                        temp = temp / 10;
                        if (a[i] == sum) {
                            System.out.println("\n" + a[i] + " is a Strong Number");
                        }

                    }
                    System.out.println("----------------------------------------");
                    break;

                case 11:
                    int j;
                    int t = 0;
                    for (int i = 1; i < size; i++) {
                        t = a[i];
                        for (j = i - 1; j >= 0 && t < a[j]; j--) {
                            a[j + 1] = a[j];
                        }
                        a[j + 1] = t;
                    }
                    System.out.println("Sorted array is ");
                    for (int i = 0; i < size; i++) {
                        System.out.println(a[i]);
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 12:
                    for (int i = 0; i < a.length / 2; i++) {
                        int temp = 0;
                        temp = a[i];
                        a[i] = a[a.length - 1 - i];
                        a[a.length - 1 - i] = temp;
                    }
                    System.out.println("Reverse array is ");
                    for (int i = 0; i < size; i++) {

                        System.out.println(a[i]);
                    }
                    System.out.println("----------------------------------------");
                    break;
                case 13:

                    System.out.println("Enter value to be searched");
                    int val = sc.nextInt();
                    int found = 0;
                    for (int i = 0; i < size; i++) {
                        if (a[i] == val) {
                            System.out.println("Element found at index " + i);
                            found = 1;
                            break;
                        } else {
                            System.out.println("Element not found");
                        }
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 14:
                    int flag = 0;
                    System.out.println("Enter value to be searched");
                    int value = sc.nextInt();
                    int l = 0;
                    int u = size - 1;
                    while (l <= u) {
                        int m = (l + u) / 2;
                        if (value == a[m]) {
                            System.out.println("Elements found at" + m + " index");
                            flag = 1;
                            break;
                        } else if (value > a[m]) {
                            l = m + 1;
                        } else {
                            u = m - 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Element not found");
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 15:
                    for (int i = 0; i < size; i++) {
                        int minimum = i;

                        for (j = i + 1; j < size; j++) {
                            if (a[j] < a[minimum]) {
                                minimum = j;
                            }
                        }
                        int temp = a[i];
                        a[i] = a[minimum];
                        a[minimum] = temp;
                    }
                    System.out.println("Sorted array is");
                    for (int i = 0; i < a.length; i++) {
                        System.out.println(a[i]);
                    }
                    System.out.println("----------------------------------------");
                    break;
                default:
                    System.out.println("Enter right choice");
            }
        } while (ch != 16);
    }
}
