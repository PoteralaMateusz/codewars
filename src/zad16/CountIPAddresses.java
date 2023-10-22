package zad16;

public class CountIPAddresses {
    
    public static long ipsBetween(String start, String end) {
        
        String[] startArray =  start.split("\\.");
        String[] endArray =  end.split("\\.");
        double startNumber = Integer.parseInt(startArray[0]) * Math.pow(2,24) + Integer.parseInt(startArray[1]) * Math.pow(2,16)
                + Integer.parseInt(startArray[2]) * Math.pow(2,8) + Integer.parseInt(startArray[3]);
        double endNumber = Integer.parseInt(endArray[0]) * Math.pow(2,24) + Integer.parseInt(endArray[1]) * Math.pow(2,16)
                    + Integer.parseInt(endArray[2]) * Math.pow(2,8) + Integer.parseInt(endArray[3]);
        return  Math.round(endNumber - startNumber);
    }

    public static void main(String[] args) {

        System.out.println(CountIPAddresses.ipsBetween( "10.0.0.0", "10.0.0.50" ));

        System.out.println(CountIPAddresses.ipsBetween( "20.0.0.10", "20.0.1.0" ));

        System.out.println(CountIPAddresses.ipsBetween( "0.0.0.0", "255.255.255.255" ));

    }
}
