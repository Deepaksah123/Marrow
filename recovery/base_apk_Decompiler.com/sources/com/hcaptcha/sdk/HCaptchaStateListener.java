package com.hcaptcha.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.FilteringMediaSourceFilteringMediaPeriod;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HCaptchaStateListener implements Parcelable {
    public abstract void AudioAttributesCompatParcelizer(FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod);

    public abstract void RemoteActionCompatParcelizer(String str);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract void write();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
