import java.util.Arrays;

public class hafta141 {
    public static void main(String[] args) {
        int[] list1={2,4,6};
        int[] list2={1,2,3,4,5,6};
        System.out.print("New List: ");
        System.out.println(Arrays.toString(Append(list1,list2)));
        System.out.print("New List: ");
        System.out.println(Arrays.toString(Append(list2,list1)));


    }
    public static int[] Append(int[] list1,int[] list2) {
int elemansayisi= list2.length+list1.length;
        int[] list3 = new int[elemansayisi];
    for (int i=0; i<list1.length; i++){
        list3[i]=list1[i];
    }
    for (int a=0; a<list2.length; a++) {
        list3[a + list1.length] = list2[a];
    }
    return list3;
        }

    }

