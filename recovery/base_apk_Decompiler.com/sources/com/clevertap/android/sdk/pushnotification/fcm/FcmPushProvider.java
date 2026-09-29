package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.Timeline1;
import kotlin.TimelinePeriod;
import kotlin.getAdsId;
import kotlin.getDurationMs;
import kotlin.hasPlayedAdGroup;

/* JADX INFO: loaded from: classes4.dex */
public class FcmPushProvider implements Timeline1 {
    private hasPlayedAdGroup handler;

    @Override // kotlin.Timeline1
    public int minSDKSupportVersionCode() {
        return 0;
    }

    public FcmPushProvider(TimelinePeriod timelinePeriod, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.handler = new getDurationMs(timelinePeriod, context, cleverTapInstanceConfig);
    }

    @Override // kotlin.Timeline1
    public getAdsId getPushType() {
        return this.handler.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.Timeline1
    public boolean isAvailable() {
        return this.handler.write();
    }

    @Override // kotlin.Timeline1
    public boolean isSupported() {
        return this.handler.IconCompatParcelizer();
    }

    @Override // kotlin.Timeline1
    public void requestToken() {
        this.handler.AudioAttributesCompatParcelizer();
    }

    void setHandler(hasPlayedAdGroup hasplayedadgroup) {
        this.handler = hasplayedadgroup;
    }
}
