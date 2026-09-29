package kotlin;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseDateFromLong {
    public static pad3 IconCompatParcelizer(long j, byte[] bArr, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i, i2);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new pad3(TypeResolverBuilder.AudioAttributesCompatParcelizer(new parseMvhd() { // from class: o._parse2D
            @Override // kotlin.parseMvhd
            public final Object apply(Object obj) {
                return getDefaultImpl.RemoteActionCompatParcelizer((Bundle) obj);
            }
        }, (ArrayList) buildTypeSerializer.IconCompatParcelizer(bundle.getParcelableArrayList("c"))), j, bundle.getLong("d"));
    }
}
