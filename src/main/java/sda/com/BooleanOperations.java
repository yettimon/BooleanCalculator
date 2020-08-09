package sda.com;

import java.util.logging.Logger;

public class BooleanOperations {
    private Boolean firstOne;
    private Boolean secondOne;

    public BooleanOperations(Boolean firstOne, Boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    public BooleanOperations() {
    }
    private static final Logger LOGGER =
            Logger.getLogger(BooleanOperations.class.getName());

    public Boolean conjunction(){
        LOGGER.info("CONJUNCTION: ");
        boolean result = false;
        if (this.firstOne && this.secondOne){
            result = true;
        }
        return result;
    }
    public Boolean disjunction (){
        LOGGER.info("CONJUNCTION: ");
        if (this.firstOne == null && this.secondOne == null) return null;
        if (this.firstOne == null) return secondOne;
        if (this.secondOne == null) return firstOne;
        return this.firstOne || this.secondOne;
    }


}


