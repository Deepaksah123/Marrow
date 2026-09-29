package com.marrow.data.api.models.request.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.io.Serializable;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;

/* JADX INFO: loaded from: classes.dex */
public class TrackUserRequestBody implements Serializable {

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_CITY)
    public String city;

    @JsonProperty("coordinates")
    public double[] coordinates;

    @JsonProperty("country")
    public String country;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_STATE)
    public String state;

    @JsonProperty(ArchiveStreamFactory.ZIP)
    public String zip;
}
