// java program by Eric Adamian
// dynamic/static binding for area calculation

public class Area{

    public static void main(String[] args){
      
        // square object for parent class Rectangle
        Rectangle square = new Square();

        // ************************************************************************

        // dynamically bound method (iterate 100000 times, calculate time)

        long startTime1 = System.nanoTime();

        for(int i = 0; i < 100000; i++){
            double area1 = square.dynamic_binding(i, i);
        }

        long endTime1 = System.nanoTime();

        // calculating time (nanoseconds to milliseconds)
        double time1 = (double)(endTime1 - startTime1) / 1000000;

        System.out.println("Execution time for dynamic binding: " + time1 + " ms");

        // ************************************************************************

        // statically bound method (iterate 100000 times, calculate time)

        long startTime2 = System.nanoTime();

        for(int i = 0; i < 100000; i++){
            double area2 = square.static_binding(i, i);
        }

        long endTime2 = System.nanoTime();

        // calculating time (nanoseconds to milliseconds)
        double time2 = (double)(endTime2 - startTime2)/1000000;

        System.out.println("Execution time for static binding: " + time2 + " ms");

        // final result
        if(time1 < time2){
            System.out.println("\nDynamic binding is faster than static binding.\n");
        }else{
            System.out.println("\nStatic binding is faster than dynamic binding.\n");
        }
    }
}


// parent class Rectangle (dynamic/static binding for calcluations)
class Rectangle{
    double dynamic_binding(double length, double width){
        return length * width;
    }

    static double static_binding(double length, double width){
        return length * width;
    }    
}

// child class Square (extends parent class with new dynamic binding)
class Square extends Rectangle{
    double dynamic_binding(double length, double width){
        return length * width;
    }
}