
package SDAproject;

public class PackageFactory {
    public Package getPackage(String package_type){
        if(package_type == null){
            return null;
        }
        if(package_type.equalsIgnoreCase("basic")){
            return new Basic();
        }
        else if(package_type.equalsIgnoreCase("standard")){
            return new Standard();
        }
        else if(package_type.equalsIgnoreCase("premium")){
            return new Premium();
        }
        return null;
    }
}
