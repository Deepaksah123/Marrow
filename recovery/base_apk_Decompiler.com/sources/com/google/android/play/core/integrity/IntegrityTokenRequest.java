package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j);

        public abstract Builder setNonce(String str);
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();

    public static Builder builder() {
        return new am();
    }
}
