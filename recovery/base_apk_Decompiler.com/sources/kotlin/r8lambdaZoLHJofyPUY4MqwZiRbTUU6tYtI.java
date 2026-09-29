package kotlin;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI;", "", "Lo/clearVideoOutput;", "p0", "Lo/getCurrentPeriodIndexInternal;", "p1", "Lo/getSubscriptionExpiresOn;", "", "", "p2", "<init>", "(Lo/clearVideoOutput;Lo/getCurrentPeriodIndexInternal;Lo/getSubscriptionExpiresOn;)V", "", "Lo/SimpleExoPlayer;", "read", "(Ljava/lang/String;)Lo/SimpleExoPlayer;", "Ljava/net/URL;", "Ljava/net/HttpURLConnection;", "AudioAttributesCompatParcelizer", "(Ljava/net/URL;)Ljava/net/HttpURLConnection;", "Lo/clearVideoOutput;", "IconCompatParcelizer", "Lo/getCurrentPeriodIndexInternal;", "write", "AudioAttributesImplApi21Parcelizer", "Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "", "J", "Ljava/net/HttpURLConnection;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getCurrentPeriodIndexInternal write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Pair<Boolean, Integer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private HttpURLConnection read;
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final clearVideoOutput IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    public r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(clearVideoOutput clearvideooutput, getCurrentPeriodIndexInternal getcurrentperiodindexinternal, Pair<Boolean, Integer> pair) {
        toMagicModuleMetaRepoModel.write(clearvideooutput, "");
        toMagicModuleMetaRepoModel.write(getcurrentperiodindexinternal, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        this.IconCompatParcelizer = clearvideooutput;
        this.write = getcurrentperiodindexinternal;
        this.RemoteActionCompatParcelizer = pair;
    }

    public /* synthetic */ r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI(clearVideoOutput clearvideooutput, getCurrentPeriodIndexInternal getcurrentperiodindexinternal, Pair pair, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(clearvideooutput, getcurrentperiodindexinternal, (i & 4) != 0 ? new Pair(Boolean.FALSE, 0) : pair);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[PHI: r6 r7
      0x0042: PHI (r6v5 java.net.HttpURLConnection) = (r6v3 java.net.HttpURLConnection), (r6v4 java.net.HttpURLConnection), (r6v6 java.net.HttpURLConnection) binds: [B:22:0x0086, B:18:0x0072, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r7v14 o.SimpleExoPlayer) = (r7v8 o.SimpleExoPlayer), (r7v11 o.SimpleExoPlayer), (r7v17 o.SimpleExoPlayer) binds: [B:22:0x0086, B:18:0x0072, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[PHI: r7
      0x0088: PHI (r7v12 o.SimpleExoPlayer) = (r7v8 o.SimpleExoPlayer), (r7v11 o.SimpleExoPlayer), (r7v17 o.SimpleExoPlayer) binds: [B:22:0x0086, B:18:0x0072, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.SimpleExoPlayer read(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI.read(java.lang.String):o.SimpleExoPlayer");
    }

    private final HttpURLConnection AudioAttributesCompatParcelizer(URL p0) {
        URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(p0.openConnection());
        toMagicModuleMetaRepoModel.read(uRLConnection, "");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setConnectTimeout(this.IconCompatParcelizer.getRemoteActionCompatParcelizer());
        httpURLConnection.setReadTimeout(this.IconCompatParcelizer.getRead());
        httpURLConnection.setUseCaches(this.IconCompatParcelizer.getAudioAttributesCompatParcelizer());
        httpURLConnection.setDoInput(this.IconCompatParcelizer.getWrite());
        for (Map.Entry<String, String> entry : this.IconCompatParcelizer.RemoteActionCompatParcelizer().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }
}
