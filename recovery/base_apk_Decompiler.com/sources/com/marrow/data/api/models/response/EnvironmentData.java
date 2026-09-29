package com.marrow.data.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnvironmentData {
    private static final String KEY_VERSION_UPGRADE = "version_update";
    public VersionUpdateData versionData;

    @JsonSetter(KEY_VERSION_UPGRADE)
    public void setKeyVersionUpgrade(JsonNode jsonNode) {
        VersionUpdateData versionUpdateData = new VersionUpdateData();
        this.versionData = versionUpdateData;
        if (jsonNode != null) {
            versionUpdateData.fromJSON(jsonNode);
            this.versionData.setForBuild(496);
        }
    }
}
