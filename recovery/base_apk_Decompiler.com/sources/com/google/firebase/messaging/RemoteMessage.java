package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.marrow.data.models.custommodule.CustomModule;
import java.util.Map;
import kotlin.areSizeAndRateSupportedV21;
import kotlin.codecNeedsEosBufferTimestampWorkaround;

/* JADX INFO: loaded from: classes5.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new codecNeedsEosBufferTimestampWorkaround();
    public Bundle AudioAttributesCompatParcelizer;
    private Map<String, String> write;

    public RemoteMessage(Bundle bundle) {
        this.AudioAttributesCompatParcelizer = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        codecNeedsEosBufferTimestampWorkaround.AudioAttributesCompatParcelizer(this, parcel);
    }

    public final Map<String, String> IconCompatParcelizer() {
        if (this.write == null) {
            this.write = areSizeAndRateSupportedV21.write.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
        return this.write;
    }

    public final int AudioAttributesCompatParcelizer() {
        String string = this.AudioAttributesCompatParcelizer.getString("google.original_priority");
        if (string == null) {
            string = this.AudioAttributesCompatParcelizer.getString("google.priority");
        }
        return RemoteActionCompatParcelizer(string);
    }

    public final int write() {
        String string = this.AudioAttributesCompatParcelizer.getString("google.delivered_priority");
        if (string == null) {
            if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.AudioAttributesCompatParcelizer.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.AudioAttributesCompatParcelizer.getString("google.priority");
        }
        return RemoteActionCompatParcelizer(string);
    }

    private static int RemoteActionCompatParcelizer(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return CustomModule.DEFAULT_MODULE_OWNER.equals(str) ? 2 : 0;
    }
}
