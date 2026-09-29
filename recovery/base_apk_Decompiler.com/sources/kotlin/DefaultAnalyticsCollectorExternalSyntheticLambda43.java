package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda43;", "", "<init>", "()V", "Lo/lambdaonUpstreamDiscarded27;", "p0", "", "IconCompatParcelizer", "(Lo/lambdaonUpstreamDiscarded27;)Z", "()Z", "", "p1", "", "read", "(Ljava/lang/String;Lo/lambdaonUpstreamDiscarded27;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "", "RemoteActionCompatParcelizer", "Ljava/util/Set;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda43 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda43 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda43();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final Set<String> IconCompatParcelizer = getKycMessage.IconCompatParcelizer("fb_mobile_purchase", "StartTrial", "Subscribe");

    private DefaultAnalyticsCollectorExternalSyntheticLambda43() {
    }

    @getMagicModuleMeta
    public static final boolean IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda43.class)) {
            return false;
        }
        try {
            if (!lambdaonMediaMetadataChanged48.IconCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()) && !DefaultAnalyticsCollectorMediaPeriodQueueTracker.MediaBrowserCompatCustomActionResultReceiver()) {
                if (DefaultAnalyticsCollectorExternalSyntheticLambda45.write()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda43.class);
            return false;
        }
    }

    @getMagicModuleMeta
    public static final void read(final String p0, final String p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda43.class)) {
            return;
        }
        try {
            final Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            if (contextAudioAttributesCompatParcelizer == null || p0 == null) {
                return;
            }
            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda43.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = contextAudioAttributesCompatParcelizer.getSharedPreferences(p1, 0);
                        StringBuilder sb = new StringBuilder();
                        sb.append(p0);
                        sb.append("pingForOnDevice");
                        String string = sb.toString();
                        if (sharedPreferences.getLong(string, 0L) == 0) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda45.AudioAttributesCompatParcelizer(p0);
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(string, System.currentTimeMillis());
                            editorEdit.apply();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        getMinWindowSequenceNumber.read(th2, this);
                        return;
                    }
                    getMinWindowSequenceNumber.read(th, this);
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda43.class);
        }
    }

    @getMagicModuleMeta
    public static final void read(final String p0, final lambdaonUpstreamDiscarded27 p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda43.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (INSTANCE.IconCompatParcelizer(p1)) {
                lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda43.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                return;
                            }
                            try {
                                DefaultAnalyticsCollectorExternalSyntheticLambda45.AudioAttributesCompatParcelizer(p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(p1));
                            } catch (Throwable th) {
                                getMinWindowSequenceNumber.read(th, this);
                            }
                        } catch (Throwable th2) {
                            getMinWindowSequenceNumber.read(th2, this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda43.class);
        }
    }

    private final boolean IconCompatParcelizer(lambdaonUpstreamDiscarded27 p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return false;
        }
        try {
            return !p0.getAudioAttributesCompatParcelizer() || (p0.getAudioAttributesCompatParcelizer() && IconCompatParcelizer.contains(p0.getAudioAttributesImplApi26Parcelizer()));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return false;
        }
    }
}
