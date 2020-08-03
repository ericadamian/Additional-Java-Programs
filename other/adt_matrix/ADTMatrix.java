// java program by Eric Adamian
// searches hardcoded abstract data type(ADT) matrices for largest element

public class ADTMatrix<T extends Comparable<T>>{

    T[][] array;
    int row = 0, column = 0;

    public ADTMatrix(T[][] array){
        this.array = array;
    }

    public static void main(String[] args){
        // integer matrix

        // ADTMatrix 3x4 matrix of integers ((0,0) to (2,3))
        ADTMatrix<Integer> matrixInt = new ADTMatrix<Integer>(new Integer[][]{{ 1, 2, 6, 4 }, 
                                                                              { 5, 9, 4, 2 }, 
                                                                              { 3, 1, 11, 5 }});
        // find_max call for row and column
        int[] search = matrixInt.find_max();

        System.out.print("The first occurence of the largest element is ");
        System.out.print(matrixInt.array[search[0]][search[1]]);
        System.out.print(" at position/indices (" + search[0] + ", " + search[1] + ").\n");

        // *********************************************************************************************************************
        // string matrix

        // ADTMatrix 2x5 matrix of name strings ((0,0) to (1,4))
        ADTMatrix<String> matrixString = new ADTMatrix<String>(new String[][]{{ "David", "Kelin", "Peter", "Zephyr", "Diana" },
                                                                               { "Elin", "Adam", "Young", "Peter", "Zag" }});

        search = matrixString.find_max();

        System.out.print("The first occurence of the largest element is ");
        System.out.print(matrixString.array[search[0]][search[1]]);
        System.out.print(" at position/indices (" + search[0] + ", " + search[1] + ").");
    }

    // scans i(row), then j(column) through i(row)
    // searches for greatest value in our array, sets greatest value
    public int[] find_max() {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[row][column].compareTo(array[i][j]) < 0){
                    row = i;
                    column = j;
                }
            }
        }
        return new int[] {row, column};
    }
}