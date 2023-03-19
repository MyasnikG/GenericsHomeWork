public class Main {
    public static void main(String[] args) {

        Integer [] ints = {5,4,70,100,500};
        Double [] doubles = {51.74, 79.8, 100.90};
        Float [] floats = {40.1f, 89.72f, 56.5f};
        String [] s = {"Hello", "Bye", "Good","Zero"};

        Student s1 = new Student("Aida", 87.5);
        Student s2 = new Student("Asot", 86.1);
        Student s3 = new Student("Vazgen", 79.6);
        Student s4 = new Student("Susanna", 82.3);
        Student s5 = new Student("Karen", 81.1);

        Student [] students = {s1,s2,s3,s4,s5};
        System.out.println(maxValue(students));
        System.out.println(maxValue(doubles));
        System.out.println(maxValue(s));

    }


    public static <T extends Comparable<T>> T maxValue(T [] a){
        T max = a[0];
        for(T x: a){
            if(x.compareTo(max)>0){
                max = x;
            }
        }
        return max;
    }

    static <T extends Comparable<T>> T maxValue(T a, T b, T c){
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
}