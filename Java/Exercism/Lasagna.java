package Exercism;

public class Lasagna {
    //exercise Lasagna

    public static void main(String[] args) {
        var response = new Lasagna().expectedMinutesInOven();
        System.out.println(response);

        var response2 = new Lasagna().remainingMinutesInOven(25);
        System.out.println(response2);

        var response3 = new Lasagna().preparationTimeInMinutes(4);
        System.out.println(response3);

        var response4 = new Lasagna().totalTimeInMinutes(4,8);
        System.out.println(response4);
    }




    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    };
    //int respose = new Lasagna().expectedMinutesInOven();

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int min){
        return expectedMinutesInOven() - min;
    }
    //int response2 = new Lasagna().remainingMinutesInOven(30);

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    //int response3 = new Lasagna().preparationTimeInMinutes(2);

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int min){
        int total = new Lasagna().preparationTimeInMinutes(layers) + min;

        return total;
    }
     //int response4 = new Lasagna().totalTimeInMinutes(3, 20);

}


