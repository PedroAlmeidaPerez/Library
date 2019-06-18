package validation;

public class ValidatePerson {

    public boolean ValidateName (String name){
        boolean validation = false;
        for (int i = 0; i < name.length (); i++) {
            char c = name.charAt (i);
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
}
