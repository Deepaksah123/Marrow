package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zze implements Parcelable.Creator {
    public static int RemoteActionCompatParcelizer;
    public static int read;

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        List listZzk = zzds.zzk();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    zzdVar = (zzd) SafeParcelReader.createParcelable(parcel, header, zzd.CREATOR);
                    break;
                case 8:
                    listZzk = SafeParcelReader.createTypedList(parcel, header, Feature.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzd(i, i2, strCreateString, strCreateString2, strCreateString3, i3, listZzk, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = read;
        int i2 = i % 8624628;
        read = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iMyPid = Process.myPid();
        RemoteActionCompatParcelizer = iMyPid;
        return iMyPid;
    }
}
