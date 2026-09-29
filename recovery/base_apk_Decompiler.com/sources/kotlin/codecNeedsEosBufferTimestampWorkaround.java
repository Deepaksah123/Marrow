package kotlin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.messaging.RemoteMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class codecNeedsEosBufferTimestampWorkaround implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage createFromParcel(Parcel parcel) {
        return RemoteActionCompatParcelizer(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage[] newArray(int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    private static RemoteMessage RemoteActionCompatParcelizer(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) == 2) {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new RemoteMessage(bundleCreateBundle);
    }

    private static RemoteMessage[] AudioAttributesCompatParcelizer(int i) {
        return new RemoteMessage[i];
    }

    public static void AudioAttributesCompatParcelizer(RemoteMessage remoteMessage, Parcel parcel) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, remoteMessage.AudioAttributesCompatParcelizer, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
