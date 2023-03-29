public class java_loop {
    public static void main(String[] args)
    {
        //while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

       //do while loop
        int j=0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

        //for loop
        for (i=0;i<5;i++)
        {
            System.out.println(i);
        }
        //for each loop
        //"for-each" loop, which is used exclusively to loop through elements in an array:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String k : cars) {
            System.out.println(k);
        }


    }


}
