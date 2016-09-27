package uriabad.annotationscontries.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Uri Abad on 26/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryEntity {

    @JsonProperty("name") private String name;
    @JsonProperty("capital") private String capital;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
