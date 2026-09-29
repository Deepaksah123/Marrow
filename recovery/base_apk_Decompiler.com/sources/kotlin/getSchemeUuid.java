package kotlin;

import android.graphics.DashPathEffect;
import kotlin.postKeyRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class getSchemeUuid {
    public postKeyRequest.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    public String AudioAttributesImplApi26Parcelizer;
    public float IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public DashPathEffect read;
    public int write;

    public getSchemeUuid() {
        this.AudioAttributesCompatParcelizer = postKeyRequest.RemoteActionCompatParcelizer.DEFAULT;
        this.IconCompatParcelizer = Float.NaN;
        this.RemoteActionCompatParcelizer = Float.NaN;
        this.read = null;
        this.write = 1122867;
    }

    public getSchemeUuid(String str, postKeyRequest.RemoteActionCompatParcelizer remoteActionCompatParcelizer, float f, float f2, DashPathEffect dashPathEffect, int i) {
        postKeyRequest.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = postKeyRequest.RemoteActionCompatParcelizer.DEFAULT;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.read = dashPathEffect;
        this.write = i;
    }
}
