package kg.geektech.filmapp.data.models;

import com.google.gson.annotations.SerializedName;

public class Film {
    String id;
    String tittle;
    @SerializedName("original_tittle")
    String originalTittle;
    String image;
    @SerializedName("description")
    String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getOriginalTittle() {
        return originalTittle;
    }

    public void setOriginalTittle(String originalTittle) {
        this.originalTittle = originalTittle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
