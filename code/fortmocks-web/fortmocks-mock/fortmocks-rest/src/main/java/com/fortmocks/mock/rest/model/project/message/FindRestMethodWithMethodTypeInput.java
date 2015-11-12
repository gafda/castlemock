package com.fortmocks.mock.rest.model.project.message;

import com.fortmocks.core.model.Input;
import com.fortmocks.mock.rest.model.project.domain.RestMethodType;
import com.fortmocks.core.model.validation.NotNull;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class FindRestMethodWithMethodTypeInput implements Input {

    @NotNull
    private Long restProjectId;
    @NotNull
    private Long restApplicationId;
    @NotNull
    private String restResourceUri;
    @NotNull
    private RestMethodType restMethodType;

    public Long getRestProjectId() {
        return restProjectId;
    }

    public void setRestProjectId(Long restProjectId) {
        this.restProjectId = restProjectId;
    }

    public Long getRestApplicationId() {
        return restApplicationId;
    }

    public void setRestApplicationId(Long restApplicationId) {
        this.restApplicationId = restApplicationId;
    }

    public String getRestResourceUri() {
        return restResourceUri;
    }

    public void setRestResourceUri(String restResourceUri) {
        this.restResourceUri = restResourceUri;
    }

    public RestMethodType getRestMethodType() {
        return restMethodType;
    }

    public void setRestMethodType(RestMethodType restMethodType) {
        this.restMethodType = restMethodType;
    }
}