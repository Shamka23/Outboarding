public class TrafficAnalyzer {
    public static void main(String[] args) {
        int[] trafficArray =  {2, 71, 324, 88472, 421};

        getMaxTraffic(trafficArray);
    }
    public static void getMaxTraffic(int[] trafficArrays) {
        int maxTraffic = 0;
        for (int trafficArray : trafficArrays){
            if (trafficArray > maxTraffic){
                maxTraffic = trafficArray;
            }
        }
        System.out.println(maxTraffic);
    }
//        for (int i = 0; i < trafficArrays.length; i++) {
//            if (trafficArrays[i] > maxTraffic){
//                maxTraffic = trafficArrays[i];
//            }
//        }
//        System.out.println(maxTraffic);
//    }
}
