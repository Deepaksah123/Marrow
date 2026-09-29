package kotlin;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import in.juspay.hyper.constants.Labels;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.lambdaonPlaybackSuppressionReasonChanged37;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\nJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R(\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u001b\"\u0004\b\u001a\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\""}, d2 = {"Lo/lambdaonLoadError26;", "", "Lo/getProvider;", "p0", "Lo/lambdaonLoadCanceled25;", "p1", "<init>", "(Lo/getProvider;Lo/lambdaonLoadCanceled25;)V", "", "IconCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "", "AudioAttributesImplApi21Parcelizer", "()Z", "Lcom/facebook/AccessToken$RemoteActionCompatParcelizer;", "AudioAttributesImplApi26Parcelizer", "write", "(Lcom/facebook/AccessToken$RemoteActionCompatParcelizer;)V", "Lcom/facebook/AccessToken;", "(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V", "RemoteActionCompatParcelizer", "(Lcom/facebook/AccessToken;Z)V", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/lambdaonLoadCanceled25;", "read", "()Lcom/facebook/AccessToken;", "(Lcom/facebook/AccessToken;)V", "Lcom/facebook/AccessToken;", "Ljava/util/Date;", "Ljava/util/Date;", "Lo/getProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {1, 4, 0})
public final class lambdaonLoadError26 {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static lambdaonLoadError26 write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private AccessToken write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final AtomicBoolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final lambdaonLoadCanceled25 read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getProvider AudioAttributesCompatParcelizer;
    private Date RemoteActionCompatParcelizer;

    public lambdaonLoadError26(getProvider getprovider, lambdaonLoadCanceled25 lambdaonloadcanceled25) {
        toMagicModuleMetaRepoModel.write(getprovider, "");
        toMagicModuleMetaRepoModel.write(lambdaonloadcanceled25, "");
        this.AudioAttributesCompatParcelizer = getprovider;
        this.read = lambdaonloadcanceled25;
        this.MediaBrowserCompatItemReceiver = new AtomicBoolean(false);
        this.RemoteActionCompatParcelizer = new Date(0L);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final AccessToken getWrite() {
        return this.write;
    }

    public final void read(AccessToken accessToken) {
        RemoteActionCompatParcelizer(accessToken, true);
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        AccessToken accessTokenWrite = this.read.write();
        if (accessTokenWrite == null) {
            return false;
        }
        RemoteActionCompatParcelizer(accessTokenWrite, false);
        return true;
    }

    public final void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer(getWrite(), getWrite());
    }

    private final void RemoteActionCompatParcelizer(AccessToken p0, boolean p1) {
        AccessToken accessToken = this.write;
        this.write = p0;
        this.MediaBrowserCompatItemReceiver.set(false);
        this.RemoteActionCompatParcelizer = new Date(0L);
        if (p1) {
            if (p0 != null) {
                this.read.write(p0);
            } else {
                this.read.IconCompatParcelizer();
                Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer);
            }
        }
        if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(accessToken, p0)) {
            return;
        }
        AudioAttributesCompatParcelizer(accessToken, p0);
        AudioAttributesImplBaseParcelizer();
    }

    private final void AudioAttributesCompatParcelizer(AccessToken p0, AccessToken p1) {
        Intent intent = new Intent(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer(), (Class<?>) lambdaonMaxSeekToPreviousPositionChanged47.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", p0);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", p1);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(intent);
    }

    private static void AudioAttributesImplBaseParcelizer() {
        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AccessToken.RemoteActionCompatParcelizer;
        AccessToken accessToken = AccessToken.AudioAttributesCompatParcelizer.read();
        AlarmManager alarmManager = (AlarmManager) contextAudioAttributesCompatParcelizer.getSystemService("alarm");
        AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = AccessToken.RemoteActionCompatParcelizer;
        if (AccessToken.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
            if ((accessToken != null ? accessToken.getAudioAttributesImplBaseParcelizer() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextAudioAttributesCompatParcelizer, (Class<?>) lambdaonMaxSeekToPreviousPositionChanged47.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessToken.getAudioAttributesImplBaseParcelizer().getTime(), PendingIntent.getBroadcast(contextAudioAttributesCompatParcelizer, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    private final boolean MediaBrowserCompatCustomActionResultReceiver() {
        AccessToken write2 = getWrite();
        if (write2 == null) {
            return false;
        }
        long time = new Date().getTime();
        return write2.getMediaDescriptionCompat().getRead() && time - this.RemoteActionCompatParcelizer.getTime() > 3600000 && time - write2.getMediaMetadataCompat().getTime() > 86400000;
    }

    static final class RemoteActionCompatParcelizer {
        private String AudioAttributesCompatParcelizer;
        private Long IconCompatParcelizer;
        private int read;
        private String write;

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(String str) {
            this.AudioAttributesCompatParcelizer = str;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }

        public final void write(int i) {
            this.read = i;
        }

        public final void read(Long l) {
            this.IconCompatParcelizer = l;
        }

        public final Long write() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.write;
        }

        public final void write(String str) {
            this.write = str;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        AccessToken.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.getMainLooper(), Looper.myLooper())) {
            write((AccessToken.RemoteActionCompatParcelizer) null);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(remoteActionCompatParcelizer) { // from class: o.lambdaonLoadError26.4
                private /* synthetic */ AccessToken.RemoteActionCompatParcelizer $IconCompatParcelizer = null;

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
                            lambdaonLoadError26.this.write(this.$IconCompatParcelizer);
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    } catch (Throwable th2) {
                        getMinWindowSequenceNumber.read(th2, this);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(final AccessToken.RemoteActionCompatParcelizer p0) {
        final AccessToken write2 = getWrite();
        if (write2 == null) {
            if (p0 != null) {
                new lambdaonMetadata50("No current access token to refresh");
            }
        } else {
            if (!this.MediaBrowserCompatItemReceiver.compareAndSet(false, true)) {
                if (p0 != null) {
                    new lambdaonMetadata50("Refresh already in progress");
                    return;
                }
                return;
            }
            this.RemoteActionCompatParcelizer = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
            lambdaonPlaybackSuppressionReasonChanged37 lambdaonplaybacksuppressionreasonchanged37 = new lambdaonPlaybackSuppressionReasonChanged37(Companion.write(write2, new GraphRequest.write() { // from class: o.lambdaonLoadError26.1
                @Override // com.facebook.GraphRequest.write
                public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                    JSONArray jSONArrayOptJSONArray;
                    toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                    JSONObject audioAttributesImplBaseParcelizer = lambdaonplayererror41.getAudioAttributesImplBaseParcelizer();
                    if (audioAttributesImplBaseParcelizer == null || (jSONArrayOptJSONArray = audioAttributesImplBaseParcelizer.optJSONArray("data")) == null) {
                        return;
                    }
                    atomicBoolean.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString(Labels.System.PERMISSION);
                            String strOptString2 = jSONObjectOptJSONObject.optString("status");
                            if (!DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strOptString) && !DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strOptString2)) {
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
                                Locale locale = Locale.US;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                                if (strOptString2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                String lowerCase = strOptString2.toLowerCase(locale);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                                if (lowerCase != null) {
                                    int iHashCode = lowerCase.hashCode();
                                    if (iHashCode != -1309235419) {
                                        if (iHashCode == 280295099) {
                                            if (lowerCase.equals("granted")) {
                                                hashSet.add(strOptString);
                                            }
                                        } else if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                            hashSet2.add(strOptString);
                                        }
                                    } else if (lowerCase.equals("expired")) {
                                        hashSet3.add(strOptString);
                                    }
                                }
                            }
                        }
                    }
                }
            }), Companion.AudioAttributesCompatParcelizer(write2, new GraphRequest.write() { // from class: o.lambdaonLoadError26.3
                @Override // com.facebook.GraphRequest.write
                public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                    toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                    JSONObject audioAttributesImplBaseParcelizer = lambdaonplayererror41.getAudioAttributesImplBaseParcelizer();
                    if (audioAttributesImplBaseParcelizer != null) {
                        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.optString("access_token"));
                        remoteActionCompatParcelizer.write(audioAttributesImplBaseParcelizer.optInt("expires_at"));
                        remoteActionCompatParcelizer.read(Long.valueOf(audioAttributesImplBaseParcelizer.optLong("data_access_expiration_time")));
                        remoteActionCompatParcelizer.write(audioAttributesImplBaseParcelizer.optString("graph_domain", null));
                    }
                }
            }));
            lambdaonplaybacksuppressionreasonchanged37.RemoteActionCompatParcelizer(new lambdaonPlaybackSuppressionReasonChanged37.IconCompatParcelizer() { // from class: o.lambdaonLoadError26.5
                /* JADX WARN: Removed duplicated region for block: B:49:0x0117 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:3:0x0021, B:5:0x002d, B:7:0x0039, B:11:0x0042, B:14:0x004c, B:18:0x0058, B:20:0x005c, B:24:0x0070, B:26:0x0084, B:28:0x008d, B:30:0x0098, B:32:0x00a1, B:34:0x00ac, B:36:0x00b5, B:38:0x00c8, B:40:0x00dc, B:42:0x00e3, B:44:0x00f7, B:43:0x00f0, B:39:0x00d6, B:35:0x00af, B:31:0x009b, B:27:0x0087, B:23:0x0069, B:47:0x0113, B:49:0x0117), top: B:53:0x0021 }] */
                @Override // o.lambdaonPlaybackSuppressionReasonChanged37.IconCompatParcelizer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void RemoteActionCompatParcelizer(kotlin.lambdaonPlaybackSuppressionReasonChanged37 r20) {
                    /*
                        Method dump skipped, instruction units count: 298
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaonLoadError26.AnonymousClass5.RemoteActionCompatParcelizer(o.lambdaonPlaybackSuppressionReasonChanged37):void");
                }
            });
            lambdaonplaybacksuppressionreasonchanged37.read();
        }
    }

    /* JADX INFO: renamed from: o.lambdaonLoadError26$read, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f"}, d2 = {"Lo/lambdaonLoadError26$read;", "", "<init>", "()V", "Lcom/facebook/AccessToken;", "p0", "Lcom/facebook/GraphRequest$write;", "p1", "Lcom/facebook/GraphRequest;", "AudioAttributesCompatParcelizer", "(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;", "write", "Lo/lambdaonLoadError26;", "read", "()Lo/lambdaonLoadError26;", "Lo/lambdaonLoadError26;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final lambdaonLoadError26 read() {
            lambdaonLoadError26 lambdaonloaderror26;
            lambdaonLoadError26 lambdaonloaderror262 = lambdaonLoadError26.write;
            if (lambdaonloaderror262 != null) {
                return lambdaonloaderror262;
            }
            synchronized (this) {
                lambdaonloaderror26 = lambdaonLoadError26.write;
                if (lambdaonloaderror26 == null) {
                    getProvider getprovider = getProvider.getInstance(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getprovider, "");
                    lambdaonLoadError26 lambdaonloaderror263 = new lambdaonLoadError26(getprovider, new lambdaonLoadCanceled25());
                    lambdaonLoadError26.write = lambdaonloaderror263;
                    lambdaonloaderror26 = lambdaonloaderror263;
                }
            }
            return lambdaonloaderror26;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static GraphRequest write(AccessToken p0, GraphRequest.write p1) {
            return new GraphRequest(p0, "me/permissions", new Bundle(), lambdaonPlayWhenReadyChanged36.GET, p1, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static GraphRequest AudioAttributesCompatParcelizer(AccessToken p0, GraphRequest.write p1) {
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", "fb_extend_sso_token");
            bundle.putString(PaymentConstants.CLIENT_ID, p0.getAudioAttributesCompatParcelizer());
            return new GraphRequest(p0, "oauth/access_token", bundle, lambdaonPlayWhenReadyChanged36.GET, p1, null, 32, null);
        }
    }

    @getMagicModuleMeta
    public static final lambdaonLoadError26 read() {
        return INSTANCE.read();
    }
}
