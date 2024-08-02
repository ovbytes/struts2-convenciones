
package beans.actions;

import org.apache.logging.log4j.*;



public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtr;
    
    public String execute(){
        log.info("Executing execute() from struts2");
        this.saludosAtr="Hello World from struts2";
        return "success";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }     
}
