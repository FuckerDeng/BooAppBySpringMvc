package df;

import df.servers.FictionsServer;

public class test {
    public static void main(String[] args) {

//        FictionsServer.getFictions(1,20);
        String t = "123123";
        String[] re = t.split(";");
        System.out.println(re.length);
        for( String d:re){
            System.out.println(d);
        }
    }
}
