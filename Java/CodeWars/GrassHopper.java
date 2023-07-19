package CodeWars;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        var medium = (s1 + s2 + s3) / 3;

        return medium >= 90 ? 'A' : medium >= 80 ? 'B' : medium >= 70 ? 'C' : medium >= 60 ? 'D' : 'F';
    }
}
