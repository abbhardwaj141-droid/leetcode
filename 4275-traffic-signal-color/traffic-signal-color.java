class Solution {
    public String trafficSignal(int timer) {
      String Green = "Green";
        String Orange = "Orange";
        String Red = "Red";
        String Invalid = "Invalid";

        if(timer == 0){
            return Green;
        }
        else if(timer == 30){
            return Orange;
        }
        else if(timer > 30 && timer <= 90 ){
            return Red;
        }
        return Invalid;
    }
}