package kotlin;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\n\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda62;", "", "<init>", "()V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda62$write;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda62$write;)V", "RemoteActionCompatParcelizer", "read", "", "()Z", "write"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda62 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda62 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda62();

    public interface write {
        void RemoteActionCompatParcelizer(String str);
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda62() {
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (RemoteActionCompatParcelizer()) {
            return;
        }
        AudioAttributesCompatParcelizer(p0);
    }

    private static void AudioAttributesCompatParcelizer(write p0) {
        InstallReferrerClient installReferrerClientAudioAttributesCompatParcelizer = InstallReferrerClient.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer();
        try {
            installReferrerClientAudioAttributesCompatParcelizer.IconCompatParcelizer(new RemoteActionCompatParcelizer(installReferrerClientAudioAttributesCompatParcelizer, p0));
        } catch (Exception unused) {
        }
    }

    public static final class RemoteActionCompatParcelizer implements InstallReferrerStateListener {
        private /* synthetic */ write IconCompatParcelizer;
        private /* synthetic */ InstallReferrerClient RemoteActionCompatParcelizer;

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void RemoteActionCompatParcelizer() {
        }

        RemoteActionCompatParcelizer(InstallReferrerClient installReferrerClient, write writeVar) {
            this.RemoteActionCompatParcelizer = installReferrerClient;
            this.IconCompatParcelizer = writeVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void RemoteActionCompatParcelizer(int i) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                if (i != 0) {
                    if (i == 2) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda62 defaultAnalyticsCollectorExternalSyntheticLambda62 = DefaultAnalyticsCollectorExternalSyntheticLambda62.INSTANCE;
                        DefaultAnalyticsCollectorExternalSyntheticLambda62.read();
                        return;
                    }
                    return;
                }
                try {
                    InstallReferrerClient installReferrerClient = this.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(installReferrerClient, "");
                    ReferrerDetails referrerDetailsRemoteActionCompatParcelizer = installReferrerClient.RemoteActionCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(referrerDetailsRemoteActionCompatParcelizer, "");
                    String str = referrerDetailsRemoteActionCompatParcelizer.read();
                    if (str != null && (TestGroupLSModel.write((CharSequence) str, (CharSequence) "fb", false) || TestGroupLSModel.write((CharSequence) str, (CharSequence) "facebook", false))) {
                        this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
                    }
                    DefaultAnalyticsCollectorExternalSyntheticLambda62 defaultAnalyticsCollectorExternalSyntheticLambda622 = DefaultAnalyticsCollectorExternalSyntheticLambda62.INSTANCE;
                    DefaultAnalyticsCollectorExternalSyntheticLambda62.read();
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read() {
        lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    private static boolean RemoteActionCompatParcelizer() {
        return lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }
}
