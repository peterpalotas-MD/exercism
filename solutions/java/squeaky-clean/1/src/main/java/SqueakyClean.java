class SqueakyClean {


    public static char leetToNormal(char leet){
        if(leet=='4'){
            return 'a';
        } else if (leet=='3') {
            return 'e';
        }else if (leet=='0') {
            return 'o';
        }else if (leet=='1') {
            return 'l';
        }else if (leet=='7') {
            return 't';
        }
        System.out.println("Error");
        return 'x';
    }
    public static boolean isLeet(char c){
        return c == '4' || c == '3' ||c == '0' ||c == '1' ||c == '7';
    }
    static String clean(String identifier) {
        char[] identifierArr = identifier.toCharArray();
        StringBuilder s = new StringBuilder();
        boolean kebab = false;
        for(char c : identifierArr){



            if(Character.isWhitespace(c)){
                s.append('_');
            }

            else if(c == '-'){
                kebab = true;
                continue;
            }
            else if(kebab){
                kebab=false;
                s.append(Character.toUpperCase(c));
            }else if(isLeet(c)){
                s.append(leetToNormal(c));
            }
            else if(Character.isAlphabetic(c)){
                s.append(c);
            }

        }
        return s.toString();
    }
}
