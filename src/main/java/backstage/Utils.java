package backstage;

public  final class Utils {

    private Utils(){}
    public static final String PROJECT_PATH= SubmissionHandler.class.getProtectionDomain().getCodeSource().getLocation().toString().replaceFirst("target.*", "/").replace("file:", "");
    public static final String UN_ZIPPING_PATH =PROJECT_PATH+"unzipped/";
    public static final String UPLOAD_PATH = System.getProperty("catalina.base") + "/uploaded/";
    private static String folderName;

    public static void setFolderName(String folderName) {
        Utils.folderName = folderName;
    }

    public static String getFolderName() {
        return folderName;
    }
}
