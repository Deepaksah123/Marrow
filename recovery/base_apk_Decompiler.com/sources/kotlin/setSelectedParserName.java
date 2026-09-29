package kotlin;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.marrow.di.app.data.FirebaseDataModule;

/* JADX INFO: loaded from: classes3.dex */
public final class setSelectedParserName implements getSubmittedOn<FirebaseRemoteConfig> {
    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        return write();
    }

    private static FirebaseRemoteConfig write() {
        return read();
    }

    public static FirebaseRemoteConfig read() {
        return (FirebaseRemoteConfig) setPossibleScore.write(FirebaseDataModule.AudioAttributesCompatParcelizer());
    }
}
