package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Map;
import kotlin.Metadata;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JB{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u000202J\u000e\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005J\u000e\u00104\u001a\u00020/2\u0006\u00100\u001a\u000205J\u000e\u00106\u001a\u00020/2\u0006\u00107\u001a\u000202J\u000e\u00108\u001a\u00020/2\u0006\u00100\u001a\u000209J\u000e\u0010:\u001a\u00020/2\u0006\u00100\u001a\u00020;J\u0010\u0010<\u001a\u0004\u0018\u00010\u00052\u0006\u00107\u001a\u000202J\u000e\u0010=\u001a\u00020\u00052\u0006\u00107\u001a\u000202J\u000e\u0010>\u001a\u0002022\u0006\u00107\u001a\u000202JB\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010C\u001a\u0002022\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$H\u0002J \u0010E\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u000202H\u0002J\f\u0010G\u001a\u00020H*\u00020HH\u0002J\f\u0010I\u001a\u00020H*\u00020HH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006K"}, d2 = {"Lcom/clevertap/android/sdk/network/api/CtApi;", "", "httpClient", "Lcom/clevertap/android/sdk/network/http/CtHttpClient;", "defaultDomain", "", "cachedDomain", "cachedSpikyDomain", TtmlNode.TAG_REGION, "proxyDomain", "spikyProxyDomain", "customHandshakeDomain", "accountId", "accountToken", PaymentConstants.SDK_VERSION, "logger", "Lcom/clevertap/android/sdk/Logger;", "logTag", "<init>", "(Lcom/clevertap/android/sdk/network/http/CtHttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/clevertap/android/sdk/Logger;Ljava/lang/String;)V", "getDefaultDomain", "()Ljava/lang/String;", "getCachedDomain", "setCachedDomain", "(Ljava/lang/String;)V", "getCachedSpikyDomain", "setCachedSpikyDomain", "getRegion", "setRegion", "getProxyDomain", "setProxyDomain", "getSpikyProxyDomain", "setSpikyProxyDomain", "getCustomHandshakeDomain", "setCustomHandshakeDomain", "defaultHeaders", "", "defaultQueryParams", "encryptionHeader", "Lkotlin/Pair;", "spikyRegionSuffix", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "currentRequestTimestampSeconds", "getCurrentRequestTimestampSeconds", "()I", "sendQueue", "Lcom/clevertap/android/sdk/network/http/Response;", "body", "isEncrypted", "", "sendImpressions", "sendContentFetch", "Lcom/clevertap/android/sdk/network/api/ContentFetchRequestBody;", "performHandshakeForDomain", "isViewedEvent", "defineVars", "Lcom/clevertap/android/sdk/network/api/SendQueueRequestBody;", "defineTemplates", "Lcom/clevertap/android/sdk/network/api/DefineTemplatesRequestBody;", "getActualDomain", "getHandshakeDomain", "needsHandshake", "createRequest", "Lcom/clevertap/android/sdk/network/http/Request;", "baseUrl", "relativeUrl", "includeTs", "headers", "getUriForPath", "Landroid/net/Uri;", "appendDefaultQueryParams", "Landroid/net/Uri$Builder;", "appendTsQueryParam", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateVolumeAndNotifyIfChanged {
    public static final read write = new read(null);
    private String AudioAttributesCompatParcelizer;
    private final Pair<String, String> AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final Map<String, String> AudioAttributesImplBaseParcelizer;
    private String IconCompatParcelizer;
    private final Map<String, String> MediaBrowserCompatCustomActionResultReceiver;
    private final StreamVolumeManagerVolumeChangeReceiver MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private String MediaBrowserCompatSearchResultReceiver;
    private String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final RendererWakeupListener RatingCompat;
    private int RemoteActionCompatParcelizer;
    private final String onCustomAction;
    private String read;

    public updateVolumeAndNotifyIfChanged(StreamVolumeManagerVolumeChangeReceiver streamVolumeManagerVolumeChangeReceiver, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, RendererWakeupListener rendererWakeupListener, String str11) {
        toMagicModuleMetaRepoModel.write(streamVolumeManagerVolumeChangeReceiver, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        toMagicModuleMetaRepoModel.write(str11, "");
        this.MediaBrowserCompatItemReceiver = streamVolumeManagerVolumeChangeReceiver;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.MediaBrowserCompatSearchResultReceiver = str5;
        this.MediaDescriptionCompat = str6;
        this.IconCompatParcelizer = str7;
        this.RatingCompat = rendererWakeupListener;
        this.MediaMetadataCompat = str11;
        this.MediaBrowserCompatCustomActionResultReceiver = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(RtspHeaders.CONTENT_TYPE, "application/json; charset=utf-8"), setAction.write("X-CleverTap-Account-ID", str8), setAction.write("X-CleverTap-Token", str9));
        this.AudioAttributesImplBaseParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("os", "Android"), setAction.write("t", str10), setAction.write(CompressorStreamFactory.Z, str8));
        this.AudioAttributesImplApi21Parcelizer = setAction.write("X-CleverTap-Encryption-Enabled", "true");
        this.onCustomAction = "-spiky";
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.AudioAttributesCompatParcelizer = str;
    }

    public final void read(String str) {
        this.read = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/updateVolumeAndNotifyIfChanged$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Timeline write(String str, boolean z) {
        Map<String, String> map;
        toMagicModuleMetaRepoModel.write(str, "");
        StreamVolumeManagerVolumeChangeReceiver streamVolumeManagerVolumeChangeReceiver = this.MediaBrowserCompatItemReceiver;
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(false);
        if (strAudioAttributesCompatParcelizer == null) {
            strAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        }
        String str2 = strAudioAttributesCompatParcelizer;
        if (z) {
            map = VideoTimelineResponseBody.read(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer);
        } else {
            map = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return streamVolumeManagerVolumeChangeReceiver.read(write(this, str2, "a1", str, false, map, 8));
    }

    public final Timeline write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        StreamVolumeManagerVolumeChangeReceiver streamVolumeManagerVolumeChangeReceiver = this.MediaBrowserCompatItemReceiver;
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(true);
        if (strAudioAttributesCompatParcelizer == null) {
            strAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        }
        return streamVolumeManagerVolumeChangeReceiver.read(write(this, strAudioAttributesCompatParcelizer, "a1", str, false, this.MediaBrowserCompatCustomActionResultReceiver, 8));
    }

    public final Timeline read(decreaseVolume decreasevolume) {
        toMagicModuleMetaRepoModel.write(decreasevolume, "");
        StreamVolumeManagerVolumeChangeReceiver streamVolumeManagerVolumeChangeReceiver = this.MediaBrowserCompatItemReceiver;
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(false);
        if (strAudioAttributesCompatParcelizer == null) {
            strAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        }
        return streamVolumeManagerVolumeChangeReceiver.read(write(this, strAudioAttributesCompatParcelizer, "content", decreasevolume.toString(), false, null, 24));
    }

    public final Timeline write(boolean z) {
        Map<String, String> map;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(z);
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(this.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strRemoteActionCompatParcelizer, (Object) this.IconCompatParcelizer)) {
            Map<String, String> map2 = this.MediaBrowserCompatCustomActionResultReceiver;
            String str = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write((Object) str);
            map = VideoTimelineResponseBody.read(map2, setAction.write("X-CleverTap-Handshake-Domain", str));
        } else {
            map = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        lambdaonReceive0 lambdaonreceive0Write = write(strRemoteActionCompatParcelizer, "hello", null, false, map);
        RendererWakeupListener rendererWakeupListener = this.RatingCompat;
        String str2 = this.MediaMetadataCompat;
        StringBuilder sb = new StringBuilder("Performing handshake with ");
        sb.append(lambdaonreceive0Write.IconCompatParcelizer());
        rendererWakeupListener.write(str2, sb.toString());
        return this.MediaBrowserCompatItemReceiver.read(lambdaonreceive0Write);
    }

    public final Timeline RemoteActionCompatParcelizer(r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq) {
        toMagicModuleMetaRepoModel.write(r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq, "");
        StreamVolumeManagerVolumeChangeReceiver streamVolumeManagerVolumeChangeReceiver = this.MediaBrowserCompatItemReceiver;
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(false);
        if (strAudioAttributesCompatParcelizer == null) {
            strAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        }
        return streamVolumeManagerVolumeChangeReceiver.read(write(this, strAudioAttributesCompatParcelizer, "defineVars", r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq.toString(), false, null, 24));
    }

    private String AudioAttributesCompatParcelizer(boolean z) {
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append(z ? this.onCustomAction : "");
            sb.append(".");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            String string = sb.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }
        String str = z ? this.MediaDescriptionCompat : this.MediaBrowserCompatSearchResultReceiver;
        return PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(str) ? str : z ? this.read : this.AudioAttributesCompatParcelizer;
    }

    private String RemoteActionCompatParcelizer(boolean z) {
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append(z ? this.onCustomAction : "");
            sb.append(".");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            String string = sb.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }
        String str = z ? this.MediaDescriptionCompat : this.MediaBrowserCompatSearchResultReceiver;
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(str)) {
            return str;
        }
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)) {
            String str2 = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write((Object) str2);
            return str2;
        }
        String str3 = z ? this.read : this.AudioAttributesCompatParcelizer;
        return PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(str3) ? str3 : this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean read(boolean z) {
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem)) {
            return false;
        }
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(z ? this.MediaDescriptionCompat : this.MediaBrowserCompatSearchResultReceiver)) {
            return false;
        }
        String str = z ? this.read : this.AudioAttributesCompatParcelizer;
        return str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ lambdaonReceive0 write(updateVolumeAndNotifyIfChanged updatevolumeandnotifyifchanged, String str, String str2, String str3, boolean z, Map map, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            map = updatevolumeandnotifyifchanged.MediaBrowserCompatCustomActionResultReceiver;
        }
        return updatevolumeandnotifyifchanged.write(str, str2, str3, z2, map);
    }

    private final lambdaonReceive0 write(String str, String str2, String str3, boolean z, Map<String, String> map) {
        return new lambdaonReceive0(AudioAttributesCompatParcelizer(str, str2, z), map, str3);
    }

    private final Uri AudioAttributesCompatParcelizer(String str, String str2, boolean z) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority(str).appendPath(str2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(builderAppendPath, "");
        Uri.Builder builderAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(builderAppendPath);
        if (z) {
            IconCompatParcelizer(builderAudioAttributesCompatParcelizer);
        }
        Uri uriBuild = builderAudioAttributesCompatParcelizer.build();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uriBuild, "");
        return uriBuild;
    }

    private final Uri.Builder AudioAttributesCompatParcelizer(Uri.Builder builder) {
        for (Map.Entry<String, String> entry : this.AudioAttributesImplBaseParcelizer.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builder;
    }

    private final Uri.Builder IconCompatParcelizer(Uri.Builder builder) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.RemoteActionCompatParcelizer = iCurrentTimeMillis;
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter("ts", String.valueOf(iCurrentTimeMillis));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(builderAppendQueryParameter, "");
        return builderAppendQueryParameter;
    }
}
