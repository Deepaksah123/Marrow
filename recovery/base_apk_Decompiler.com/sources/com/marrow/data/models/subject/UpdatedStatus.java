package com.marrow.data.models.subject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/marrow/data/models/subject/UpdatedStatus;", "Ljava/io/Serializable;", "<init>", "()V", "", "isActive", "Z", "()Z", "setActive", "(Z)V", "", "expiresOn", "J", "getExpiresOn", "()J", "setExpiresOn", "(J)V", "", "activeEdition", "I", "getActiveEdition", "()I", "setActiveEdition", "(I)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpdatedStatus implements Serializable {
    private static final String KEY_ACTIVE_EDITION = "active_edition";
    private static final String KEY_EXPIRES_ON = "expires_on";
    private static final String KEY_IS_ACTIVE = "is_active";

    @JsonProperty(KEY_ACTIVE_EDITION)
    private int activeEdition;

    @JsonProperty(KEY_EXPIRES_ON)
    private long expiresOn;

    @JsonProperty("is_active")
    private boolean isActive;

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final long getExpiresOn() {
        return this.expiresOn;
    }

    public final void setExpiresOn(long j) {
        this.expiresOn = j;
    }

    public final int getActiveEdition() {
        return this.activeEdition;
    }

    public final void setActiveEdition(int i) {
        this.activeEdition = i;
    }
}
