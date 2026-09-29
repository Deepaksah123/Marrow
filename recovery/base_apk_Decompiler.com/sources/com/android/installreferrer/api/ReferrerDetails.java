package com.android.installreferrer.api;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ReferrerDetails {
    private final Bundle RemoteActionCompatParcelizer;

    public final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getLong("install_begin_timestamp_seconds");
    }

    public final long RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getLong("referrer_click_timestamp_seconds");
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer.getString("install_referrer");
    }

    public ReferrerDetails(Bundle bundle) {
        this.RemoteActionCompatParcelizer = bundle;
    }
}
