package kotlin;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class _parse4D {
    public static byte[] write(List<getDefaultImpl> list, long j) {
        ArrayList<Bundle> arrayListWrite = TypeResolverBuilder.write(list, new parseMvhd() { // from class: o.pad2
            @Override // kotlin.parseMvhd
            public final Object apply(Object obj) {
                return ((getDefaultImpl) obj).read();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListWrite);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
