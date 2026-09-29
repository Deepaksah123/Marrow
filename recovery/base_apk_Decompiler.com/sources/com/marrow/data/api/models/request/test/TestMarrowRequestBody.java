package com.marrow.data.api.models.request.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.models.test.TopUser;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class TestMarrowRequestBody extends MarrowRequestBody implements Serializable {

    @JsonProperty(TopUser.KEY_IS_ANONYMOUS)
    public boolean isAnonymous;

    public TestMarrowRequestBody(int i, boolean z) {
        super(i);
        this.isAnonymous = z;
    }
}
