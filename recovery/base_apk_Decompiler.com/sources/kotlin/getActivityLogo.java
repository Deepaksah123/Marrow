package kotlin;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;

/* JADX INFO: loaded from: classes2.dex */
public class getActivityLogo {
    private getActivityLogo() {
    }

    private static Parcelable RemoteActionCompatParcelizer(getApplicationInfo getapplicationinfo) {
        return new ParcelImpl(getapplicationinfo);
    }

    private static <T extends getApplicationInfo> T read(Parcelable parcelable) {
        if (!(parcelable instanceof ParcelImpl)) {
            throw new IllegalArgumentException("Invalid parcel");
        }
        return (T) ((ParcelImpl) parcelable).AudioAttributesCompatParcelizer();
    }

    public static void write(Bundle bundle, String str, getApplicationInfo getapplicationinfo) {
        if (getapplicationinfo == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, RemoteActionCompatParcelizer(getapplicationinfo));
        bundle.putParcelable(str, bundle2);
    }

    public static <T extends getApplicationInfo> T AudioAttributesCompatParcelizer(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(getActivityLogo.class.getClassLoader());
            return (T) read(bundle2.getParcelable(CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
