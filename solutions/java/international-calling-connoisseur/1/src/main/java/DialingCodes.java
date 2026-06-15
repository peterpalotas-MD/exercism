import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    public Map<Integer, String> m = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return m;
    }

    public void setDialingCode(Integer code, String country) {
        m.put(code, country);
    }


    public String getCountry(Integer code) {
        return m.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!(m.containsKey(code)) && !(m.containsValue(country))){
            m.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {

        for(int c : m.keySet()){
            if(m.get(c) == country){
                return c;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(m.containsValue(country)){

            for(int c : m.keySet()){
                if(m.get(c) == country){
                    m.remove(c, country);
                    m.put(code, country);
                }
            }
        }
    }
}
