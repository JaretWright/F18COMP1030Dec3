import java.util.*;

public class WarmupExercise {
    public static void main(String[] args)
    {
        int[] numbers = new int[5];

        for (int i=0; i<numbers.length; i++)
        {
            numbers[i]=getUserInput();
        }

        ArrayList<Integer> arrayList=new ArrayList();
        for(int num:numbers)
            arrayList.add(num);

        System.out.print("original list: ");
        displayList(arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.print("\nsorted list: ");
        displayList(arrayList);

    }

    public static void displayList(ArrayList<Integer> list)
    {
        System.out.print("{");
        for (int i=0; i<list.size(); i++)
        {
            if (i==list.size()-1)
                System.out.printf("%d}",list.get(i));
            else
                System.out.printf("%d,",list.get(i));
        }
    }


    public static int getUserInput()
    {
        boolean keepAsking=true;
        int num=-1;
        while(keepAsking)
        {
            System.out.print("Enter a number greater than 0: ");
            Scanner keyboard = new Scanner(System.in);
            try {
                num = keyboard.nextInt();
                if (num > 0)
                    keepAsking = false;
            }catch (InputMismatchException e)
            {
                System.out.println("You must enter numbers only");
            }
        }
        return num;
    }
}
