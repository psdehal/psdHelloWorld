
package us.kbase.psdhelloworld;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: OutParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "phrase"
})
public class OutParams {

    @JsonProperty("phrase")
    private String phrase;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("phrase")
    public String getPhrase() {
        return phrase;
    }

    @JsonProperty("phrase")
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public OutParams withPhrase(String phrase) {
        this.phrase = phrase;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((("OutParams"+" [phrase=")+ phrase)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
