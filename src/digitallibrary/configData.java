/*
 * configData.java
 *
 * Created on 27 September 2005, 13:07
 */

package digitallibrary;
import java.util.prefs.Preferences;

/**
 *
 * @author brad
 */
public class configData {
    private Preferences prefs;
    private String Server;
    private String ServerType;
    private String LocalUploadDir;
    private String LocalDbUsername;
    private String LocalDbPassword;

    /** Creates a new instance of configData */
    public configData() {
        prefs = Preferences.userRoot().node(this.getClass().getName());
        try {
            Server          = prefs.get("Server", "localhost");
            ServerType      = prefs.get("ServerType", "DbMySQL");
            LocalUploadDir  = prefs.get("LocalUploadDir","");
            LocalDbUsername = prefs.get("LocalDbUsername","");
            LocalDbPassword = prefs.get("LocalDbPassword","");
        } catch(java.lang.NullPointerException e) {/* first use */}
    }
    
    String getServer(){
        return Server;
    }

    String getServerType(){
        return ServerType;
    }
    
    String getLocalUploadDir(){
        return LocalUploadDir;
    }
    
    String getLocalDbUsername(){
        return LocalDbUsername;
    }

    String getLocalDbPassword(){
        return LocalDbPassword;
    }

    void SetServer(String in){
        prefs.put("Server", in);
        Server = in;
    }
    
    void SetLocalUploadDir(String in){
        prefs.put("LocalUploadDir", in);
        LocalUploadDir = in;
    }
    
    void SetLocalDbUsername(String in){
        prefs.put("LocalDbUsername", in);
        LocalDbUsername = in;
    }

    void SetLocalDbPassword(String in){
        prefs.put("LocalDbPassword", in);
        LocalDbPassword = in;

    }

    public String toString() {
        return "Todo, print all configuratoin details.";
    }

}

    
    
    