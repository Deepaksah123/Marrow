package kotlin;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface peekAvailableContext {

    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z);

        boolean read(onRequestPermissionsResult onrequestpermissionsresult);
    }

    void AudioAttributesCompatParcelizer(boolean z);

    boolean AudioAttributesCompatParcelizer();

    Parcelable AudioAttributesImplApi26Parcelizer();

    int IconCompatParcelizer();

    void IconCompatParcelizer(Parcelable parcelable);

    void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z);

    boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance);

    void read(Context context, onRequestPermissionsResult onrequestpermissionsresult);

    void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    boolean read(onRetainNonConfigurationInstance onretainnonconfigurationinstance);

    boolean write(removeOnTrimMemoryListener removeontrimmemorylistener);
}
