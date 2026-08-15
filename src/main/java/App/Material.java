
package App;


public class Material {
    private String code;
    private String title;
    private String yearPublished;

    public Material() {
    }

    public Material(String code, String title, String yearPublished) {
        this.code = code;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Material{" + "code=" + code + ", title=" + title + ", yearPublished=" + yearPublished + '}';
    }
    
    
    
}
