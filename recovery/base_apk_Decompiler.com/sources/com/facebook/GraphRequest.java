package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda66;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda68;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda7;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda8;
import kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.buildSetStopReasonIntent;
import kotlin.getAvcProfileAndLevel;
import kotlin.getMagicModuleMeta;
import kotlin.getMinWindowSequenceNumber;
import kotlin.getOrderDetails;
import kotlin.getRenewGrpId;
import kotlin.getSubmissionTimestamp;
import kotlin.lambdaonAudioUnderrun7;
import kotlin.lambdaonLoadError26;
import kotlin.lambdaonMediaMetadataChanged48;
import kotlin.lambdaonMetadata50;
import kotlin.lambdaonPlayWhenReadyChanged36;
import kotlin.lambdaonPlaybackStateChanged35;
import kotlin.lambdaonPlaybackSuppressionReasonChanged37;
import kotlin.lambdaonPlayerError41;
import kotlin.lambdaonPositionDiscontinuity43;
import kotlin.lambdaonRenderedFirstFrame19;
import kotlin.lambdaonShuffleModeEnabledChanged40;
import kotlin.needsStartedService;
import kotlin.newYearNameItem;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u00132\u00020\u0001:\u0007(*\u0013)&E\u0016BQ\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u0013\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010&\u001a\u00020\u00128\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b(\u0010+R.\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.\"\u0004\b(\u0010/R$\u0010\u0016\u001a\u0004\u0018\u0001008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b\"\u00103\"\u0004\b&\u00104R\u001e\u0010$\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b5\u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010!R.\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b)\u0010;R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010'R\"\u00101\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010=\u001a\u0004\b<\u0010>\"\u0004\b&\u0010?R\u0011\u0010<\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b@\u0010!R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010+R$\u00109\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010B\u001a\u0004\b7\u0010C\"\u0004\b\u0013\u0010DR\u0011\u00105\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b1\u0010!R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\bA\u0010!"}, d2 = {"Lcom/facebook/GraphRequest;", "", "Lcom/facebook/AccessToken;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "Lo/lambdaonPlayWhenReadyChanged36;", "p3", "Lcom/facebook/GraphRequest$write;", "p4", "p5", "<init>", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;)V", "", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()V", "", "IconCompatParcelizer", "(Ljava/lang/String;Z)Ljava/lang/String;", "Lo/lambdaonPlayerError41;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/lambdaonPlayerError41;", "Lo/lambdaonPlaybackStateChanged35;", "AudioAttributesImplApi26Parcelizer", "()Lo/lambdaonPlaybackStateChanged35;", "Lorg/json/JSONArray;", "", "Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;", "(Lorg/json/JSONArray;Ljava/util/Map;)V", "onAddQueueItem", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Lcom/facebook/AccessToken;", "AudioAttributesImplBaseParcelizer", "()Lcom/facebook/AccessToken;", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "Z", "Lcom/facebook/GraphRequest$write;", "MediaBrowserCompatItemReceiver", "()Lcom/facebook/GraphRequest$write;", "(Lcom/facebook/GraphRequest$write;)V", "Lorg/json/JSONObject;", "MediaBrowserCompatMediaItem", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "MediaBrowserCompatSearchResultReceiver", "onCustomAction", "MediaMetadataCompat", "Lo/lambdaonPlayWhenReadyChanged36;", "MediaDescriptionCompat", "()Lo/lambdaonPlayWhenReadyChanged36;", "(Lo/lambdaonPlayWhenReadyChanged36;)V", "RatingCompat", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "handleMediaPlayPauseIfPendingOnHandler", "onCommand", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "ParcelableResourceWithMimeType"}, k = 1, mv = {1, 4, 0})
public final class GraphRequest {
    private static volatile String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String MediaBrowserCompatCustomActionResultReceiver;
    private static final Pattern MediaBrowserCompatItemReceiver;
    private static final String write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public String write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private AccessToken IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private write AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private JSONObject MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private Bundle MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private lambdaonPlayWhenReadyChanged36 AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public boolean read;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private Object MediaDescriptionCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private String onAddQueueItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public String RemoteActionCompatParcelizer;

    /* JADX INFO: loaded from: classes2.dex */
    interface AudioAttributesCompatParcelizer {
        void read(String str, String str2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface read extends write {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface write {
        void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41);
    }

    public static final /* synthetic */ String RemoteActionCompatParcelizer() {
        return null;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final AccessToken getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final JSONObject getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void read(JSONObject jSONObject) {
        this.MediaBrowserCompatCustomActionResultReceiver = jSONObject;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final Bundle getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void read(Bundle bundle) {
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.MediaBrowserCompatMediaItem = bundle;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaDescriptionCompat = obj;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final Object getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final String getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final write getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(final write writeVar) {
        if (lambdaonMediaMetadataChanged48.write(lambdaonPositionDiscontinuity43.GRAPH_API_DEBUG_INFO) || lambdaonMediaMetadataChanged48.write(lambdaonPositionDiscontinuity43.GRAPH_API_DEBUG_WARNING)) {
            this.AudioAttributesCompatParcelizer = new write() { // from class: com.facebook.GraphRequest.2
                @Override // com.facebook.GraphRequest.write
                public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                    toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                    JSONObject jSONObjectAudioAttributesCompatParcelizer = lambdaonplayererror41.getRead();
                    JSONObject jSONObjectOptJSONObject = jSONObjectAudioAttributesCompatParcelizer != null ? jSONObjectAudioAttributesCompatParcelizer.optJSONObject("__debug__") : null;
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
                    if (jSONArrayOptJSONArray != null) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : null;
                            String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                            String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                            if (strOptString != null && strOptString2 != null) {
                                lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.GRAPH_API_DEBUG_INFO;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strOptString2, (Object) LogLevel.WARNING)) {
                                    lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strOptString3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(strOptString);
                                    sb.append(" Link: ");
                                    sb.append(strOptString3);
                                    strOptString = sb.toString();
                                }
                                DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
                                Companion companion = GraphRequest.INSTANCE;
                                readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, Companion.read(), strOptString);
                            }
                        }
                    }
                    write writeVar2 = writeVar;
                    if (writeVar2 != null) {
                        writeVar2.IconCompatParcelizer(lambdaonplayererror41);
                    }
                }
            };
        } else {
            this.AudioAttributesCompatParcelizer = writeVar;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class RemoteActionCompatParcelizer {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] AudioAttributesImplApi21Parcelizer;
        private static char AudioAttributesImplBaseParcelizer;
        private static int IconCompatParcelizer;
        private static char[] RemoteActionCompatParcelizer;
        private static int read;
        private final GraphRequest AudioAttributesCompatParcelizer;
        private final Object write;
        private static final byte[] $$a = {111, -63, 80, 27, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        private static final int $$b = 123;
        private static final byte[] MediaBrowserCompatItemReceiver = {93, -16, 105, -74, 13, -10, 14, -3, -6, -5, -54, 70, -15, 19, -4, -70, 19, 45, -10, 14, -3, -6, -5, -33, 37, -7, 17, -17, 2, 17, -15, 13, -2, 15, -39, 28, 9, 0, -3, 3, 13, -10, 14, -3, -6, -5, -54, 70, -15, 19, -4, -70, 38, 17, 19, -4, -31, 31, -11, 3, 7, 5, -10, 1, 19, -41, 23, -9, 21, -21, -51, 62, -11, 13, -7, -57, 21, 37, -7, 17, -31, 18, 12, 4, -16, 9, -11, 2, 13, -10, 14, -3, -6, -5, -54, 65, 4, -69, 37, 38, -6, 1, -15, 8, -42, 41, 3, -12, 8, 7, -11, 15, 3, -14, -1, -18, 19, -4, 11, 8, -11, 4, -8, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 40, 19, -4, 18, -52, 44, -1, -8, 3, -2, 14, -3, -17, 19, -11, 6, -1, -2, 15, -40, 35, -1, -7, -23, 34, -13, 14, 0, -31, 21, 4, -8, 10, 6, -1, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, -9, 21, -21, -51, 62, -11, 13, -7, -57, 38, 20, 10, -3, 8, -22, 1, 10, -7, -2, 15, -49, 30, 20, -2, -14, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -9, 21, -21, -51, 62, -11, 13, -7, -57, 30, 35, -1, -7, 5, -9, -11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 19, 34, 0, 2, 14, 0, -10, -7, 10, -7, -22, 19, 8, -5, -2, 17, -14, 15, -51, 34, 0, 2, 14, 0, -10, -7, 10, -7, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 31, 24, 15, -12, 7, -11, 5, 8, -7, -4, -6, -15, 30, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -57};
        private static final int AudioAttributesImplApi26Parcelizer = 210;

        private static void d(int i, short s, byte b, Object[] objArr) {
            int i2 = i * 2;
            int i3 = 4 - (b * 4);
            byte[] bArr = $$a;
            int i4 = 73 - (s * 4);
            byte[] bArr2 = new byte[20 - i2];
            int i5 = 19 - i2;
            int i6 = -1;
            if (bArr == null) {
                i4 = (-i4) + i5;
                i3++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i4 = (-bArr[i3]) + i4;
                i3++;
                i6 = i7;
            }
        }

        private static void b(char[] cArr, int i, byte b, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            needsStartedService needsstartedservice = new needsStartedService();
            char[] cArr2 = AudioAttributesImplApi21Parcelizer;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getSize(0), 7015 - (ViewConfiguration.getLongPressTimeout() >> 16), 30 - View.MeasureSpec.getSize(0), -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(AudioAttributesImplBaseParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 7015 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29, -626716224, false, "o", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 48195), Color.green(0) + 20126, 20 - (ViewConfiguration.getWindowTouchSlop() >> 8), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 19368, ImageFormat.getBitsPerPixel(0) + 19, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i4 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i4];
                        } else {
                            obj = null;
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i5 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i6 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i5];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i6];
                            } else {
                                int i7 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i8 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i7];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i8];
                            }
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    obj2 = obj;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr4[i9] = (char) (cArr4[i9] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        private static void c(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = RemoteActionCompatParcelizer;
            Object obj = null;
            if (cArr != null) {
                int i6 = $10 + 61;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i8 = 0; i8 < length; i8++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 11613 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getTapTimeout() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                char c = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                    int i9 = $11 + 59;
                    $10 = i9 % 128;
                    if (i9 % 2 == 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 0) {
                        int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "") + 22959, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr3)).charValue();
                    } else {
                        int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31588), 9862 - Process.getGidForName(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, objArr4)).charValue();
                            int i12 = $11 + 47;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37822), (ViewConfiguration.getEdgeSlop() >> 16) + 9754, (ViewConfiguration.getLongPressTimeout() >> 16) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i14 = $10 + 99;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    char[] cArr5 = new char[i3];
                    System.arraycopy(cArr3, 1, cArr5, 0, i3);
                    System.arraycopy(cArr5, 1, cArr3, i3 % i5, i5);
                    System.arraycopy(cArr5, i5, cArr3, 0, i3 * i5);
                } else {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr6, 0, i3);
                    int i15 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr3, i15, i5);
                    System.arraycopy(cArr6, i5, cArr3, 0, i15);
                }
            }
            if (z) {
                char[] cArr7 = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                    cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
                cArr3 = cArr7;
            }
            if (i4 > 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public RemoteActionCompatParcelizer(GraphRequest graphRequest, Object obj) {
            toMagicModuleMetaRepoModel.write(graphRequest, "");
            this.AudioAttributesCompatParcelizer = graphRequest;
            this.write = obj;
        }

        public final GraphRequest RemoteActionCompatParcelizer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 109;
            int i3 = i2 % 128;
            read = i3;
            int i4 = i2 % 2;
            GraphRequest graphRequest = this.AudioAttributesCompatParcelizer;
            int i5 = i3 + 121;
            IconCompatParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                return graphRequest;
            }
            throw null;
        }

        public final Object write() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 37;
            int i3 = i2 % 128;
            read = i3;
            int i4 = i2 % 2;
            Object obj = this.write;
            if (i4 == 0) {
                int i5 = 36 / 0;
            }
            int i6 = i3 + 109;
            IconCompatParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                return obj;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0661  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x066f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void read(android.content.Context r19, long r20, long r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2019
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.RemoteActionCompatParcelizer.read(android.content.Context, long, long):void");
        }

        static {
            AudioAttributesCompatParcelizer();
            IconCompatParcelizer = 0;
            read = 1;
            RemoteActionCompatParcelizer = new char[]{44987};
        }

        static void AudioAttributesCompatParcelizer() {
            AudioAttributesImplApi21Parcelizer = new char[]{11443, 6428, 6404, 6426, 6430, 6417, 11440, 11441, 6431, 6424, 6427, 11446, 6425, 6416, 6429, 6405};
            AudioAttributesImplBaseParcelizer = (char) 11446;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.facebook.GraphRequest.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver
                int r1 = r6 + 4
                int r7 = r7 + 84
                int r5 = r5 + 4
                byte[] r1 = new byte[r1]
                int r6 = r6 + 3
                r2 = 0
                if (r0 != 0) goto L12
                r4 = r6
                r3 = r2
                goto L24
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L20:
                int r3 = r3 + 1
                r4 = r0[r5]
            L24:
                int r7 = r7 + r4
                int r5 = r5 + 1
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.RemoteActionCompatParcelizer.a(short, byte, short, java.lang.Object[]):void");
        }
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final lambdaonPlayWhenReadyChanged36 getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private void AudioAttributesCompatParcelizer(lambdaonPlayWhenReadyChanged36 lambdaonplaywhenreadychanged36) {
        if (lambdaonplaywhenreadychanged36 == null) {
            lambdaonplaywhenreadychanged36 = lambdaonPlayWhenReadyChanged36.GET;
        }
        this.AudioAttributesImplApi26Parcelizer = lambdaonplaywhenreadychanged36;
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$IconCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0011\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0007¢\u0006\u0004\b\u0007\u0010\u0015J\u0017\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0007\u0010\u0017J#\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0011\"\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0018\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u001aJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u001cJ\u0017\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u001eJ\u0017\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010 J\u0017\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010 J\u0017\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u000b\u0010!J\u0019\u0010\u0012\u001a\u00020\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\"J\u0019\u0010\u0007\u001a\u00020\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\"J-\u0010\u0012\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001d2\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b\u0012\u0010&J7\u0010\u0007\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001d2\b\u0010%\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b\u0007\u0010)J\u0019\u0010*\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b*\u0010+J'\u0010\u0007\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020,H\u0002¢\u0006\u0004\b\u0007\u0010.J/\u0010\u000b\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010%\u001a\u00020,2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u000b\u0010/JA\u0010\u0018\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u0001002\u0006\u0010%\u001a\u0002012\u0006\u0010(\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0018\u00105J%\u0010\u0012\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0004\b\u0012\u00106J+\u0010\u000b\u001a\u00020-2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000208072\u0006\u0010\u001b\u001a\u000209H\u0002¢\u0006\u0004\b\u000b\u0010:J'\u0010\u0007\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010\u001b\u001a\u0002092\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010<J9\u0010\u0007\u001a\u00020-2\u0006\u0010\u0005\u001a\u0002092\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u0002080=H\u0002¢\u0006\u0004\b\u0007\u0010>J\u001f\u0010\u000f\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000f\u0010?J\u001f\u0010\u0012\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0012\u0010@J\u0017\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0007\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010*\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\rH\u0001¢\u0006\u0004\b*\u0010DR\u0014\u0010\u0018\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0017\u0010\u0012\u001a\u00020\u001d8\u0007¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\b\u000b\u0010GR\u0014\u0010\u000b\u001a\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010GR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u001d8C@\u0002X\u0083\f¢\u0006\f\n\u0004\bB\u0010E\u001a\u0004\b\u0012\u0010GR\u0018\u0010\u0007\u001a\u0006*\u00020H0H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010J"}, d2 = {"Lcom/facebook/GraphRequest$IconCompatParcelizer;", "", "<init>", "()V", "Ljava/net/URL;", "p0", "Ljava/net/HttpURLConnection;", "AudioAttributesCompatParcelizer", "(Ljava/net/URL;)Ljava/net/HttpURLConnection;", "Lcom/facebook/GraphRequest;", "Lo/lambdaonPlayerError41;", "read", "(Lcom/facebook/GraphRequest;)Lo/lambdaonPlayerError41;", "Lo/lambdaonPlaybackSuppressionReasonChanged37;", "", "write", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;", "", "IconCompatParcelizer", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "", "(Ljava/util/Collection;)Ljava/util/List;", "Lo/lambdaonPlaybackStateChanged35;", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Lo/lambdaonPlaybackStateChanged35;", "RemoteActionCompatParcelizer", "([Lcom/facebook/GraphRequest;)Lo/lambdaonPlaybackStateChanged35;", "(Ljava/util/Collection;)Lo/lambdaonPlaybackStateChanged35;", "p1", "(Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;", "", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/lang/String;", "", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Z", "(Ljava/lang/String;)Z", "(Ljava/lang/Object;)Z", "Lcom/facebook/AccessToken;", "Lcom/facebook/GraphRequest$write;", "p2", "(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;", "Lorg/json/JSONObject;", "p3", "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;", "", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;)V", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;", "", "Ljava/io/OutputStream;", "p4", "p5", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;ILjava/net/URL;Ljava/io/OutputStream;Z)V", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/util/List;)V", "", "Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;", "Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;", "(Ljava/util/Map;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;)V", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Lcom/facebook/GraphRequest;)V", "", "(Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Ljava/util/Collection;Ljava/util/Map;)V", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/net/HttpURLConnection;)V", "(Ljava/net/HttpURLConnection;Z)V", "(Lcom/facebook/GraphRequest;)Z", "AudioAttributesImplBaseParcelizer", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/net/HttpURLConnection;", "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)V", "Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/String;", "Ljava/util/regex/Pattern;", "MediaBrowserCompatItemReceiver", "Ljava/util/regex/Pattern;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static String read() {
            return GraphRequest.MediaBrowserCompatCustomActionResultReceiver;
        }

        @getMagicModuleMeta
        public static GraphRequest AudioAttributesCompatParcelizer(AccessToken p0, String p1, JSONObject p2, write p3) {
            GraphRequest graphRequest = new GraphRequest(p0, p1, null, lambdaonPlayWhenReadyChanged36.POST, p3, null, 32, null);
            graphRequest.read(p2);
            return graphRequest;
        }

        @getMagicModuleMeta
        public static GraphRequest IconCompatParcelizer(AccessToken p0, String p1, write p2) {
            return new GraphRequest(null, p1, null, null, null, null, 32, null);
        }

        @getMagicModuleMeta
        private HttpURLConnection AudioAttributesImplBaseParcelizer(lambdaonPlaybackSuppressionReasonChanged37 p0) throws Throwable {
            URL url;
            toMagicModuleMetaRepoModel.write(p0, "");
            AudioAttributesImplApi26Parcelizer(p0);
            try {
                if (p0.size() == 1) {
                    url = new URL(p0.get(0).MediaBrowserCompatMediaItem());
                } else {
                    url = new URL(DefaultAnalyticsCollectorExternalSyntheticLambda7.read());
                }
                HttpURLConnection httpURLConnectionAudioAttributesCompatParcelizer = null;
                try {
                    Companion companion = this;
                    httpURLConnectionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(url);
                    Companion companion2 = this;
                    write(p0, httpURLConnectionAudioAttributesCompatParcelizer);
                    return httpURLConnectionAudioAttributesCompatParcelizer;
                } catch (IOException e) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(httpURLConnectionAudioAttributesCompatParcelizer);
                    throw new lambdaonMetadata50("could not construct request body", e);
                } catch (JSONException e2) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(httpURLConnectionAudioAttributesCompatParcelizer);
                    throw new lambdaonMetadata50("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new lambdaonMetadata50("could not construct URL for request", e3);
            }
        }

        @getMagicModuleMeta
        public final lambdaonPlayerError41 read(GraphRequest p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            List<lambdaonPlayerError41> listIconCompatParcelizer = IconCompatParcelizer(p0);
            if (listIconCompatParcelizer.size() != 1) {
                throw new lambdaonMetadata50("invalid state: expected a single response");
            }
            return listIconCompatParcelizer.get(0);
        }

        @getMagicModuleMeta
        private List<lambdaonPlayerError41> IconCompatParcelizer(GraphRequest... p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return AudioAttributesCompatParcelizer((Collection<GraphRequest>) getOrderDetails.onCommand(p0));
        }

        @getMagicModuleMeta
        private List<lambdaonPlayerError41> AudioAttributesCompatParcelizer(Collection<GraphRequest> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return write(new lambdaonPlaybackSuppressionReasonChanged37(p0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r5v0, types: [com.facebook.GraphRequest$IconCompatParcelizer] */
        @getMagicModuleMeta
        public final List<lambdaonPlayerError41> write(lambdaonPlaybackSuppressionReasonChanged37 p0) throws Throwable {
            Exception exc;
            ?? AudioAttributesImplBaseParcelizer;
            List<lambdaonPlayerError41> listWrite;
            toMagicModuleMetaRepoModel.write(p0, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda8.AudioAttributesCompatParcelizer(p0, "requests");
            ?? r0 = 0;
            try {
                exc = null;
                AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(p0);
            } catch (Exception e) {
                exc = e;
                AudioAttributesImplBaseParcelizer = 0;
            } catch (Throwable th) {
                th = th;
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.write((URLConnection) r0);
                throw th;
            }
            try {
                if (AudioAttributesImplBaseParcelizer != 0) {
                    listWrite = write(AudioAttributesImplBaseParcelizer, p0);
                } else {
                    lambdaonPlayerError41.Companion audioAttributesCompatParcelizer = lambdaonPlayerError41.INSTANCE;
                    List<lambdaonPlayerError41> listWrite2 = lambdaonPlayerError41.Companion.write(p0.AudioAttributesImplApi21Parcelizer(), null, new lambdaonMetadata50(exc));
                    IconCompatParcelizer(p0, listWrite2);
                    listWrite = listWrite2;
                }
                AudioAttributesImplBaseParcelizer = (URLConnection) AudioAttributesImplBaseParcelizer;
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.write((URLConnection) AudioAttributesImplBaseParcelizer);
                return listWrite;
            } catch (Throwable th2) {
                th = th2;
                r0 = AudioAttributesImplBaseParcelizer;
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.write((URLConnection) r0);
                throw th;
            }
        }

        @getMagicModuleMeta
        public final lambdaonPlaybackStateChanged35 RemoteActionCompatParcelizer(GraphRequest... p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return RemoteActionCompatParcelizer((Collection<GraphRequest>) getOrderDetails.onCommand(p0));
        }

        @getMagicModuleMeta
        private lambdaonPlaybackStateChanged35 RemoteActionCompatParcelizer(Collection<GraphRequest> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return AudioAttributesCompatParcelizer(new lambdaonPlaybackSuppressionReasonChanged37(p0));
        }

        @getMagicModuleMeta
        public static lambdaonPlaybackStateChanged35 AudioAttributesCompatParcelizer(lambdaonPlaybackSuppressionReasonChanged37 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda8.AudioAttributesCompatParcelizer(p0, "requests");
            lambdaonPlaybackStateChanged35 lambdaonplaybackstatechanged35 = new lambdaonPlaybackStateChanged35(p0);
            lambdaonplaybackstatechanged35.executeOnExecutor(lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver(), new Void[0]);
            return lambdaonplaybackstatechanged35;
        }

        @getMagicModuleMeta
        public final List<lambdaonPlayerError41> write(HttpURLConnection p0, lambdaonPlaybackSuppressionReasonChanged37 p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            List<lambdaonPlayerError41> listWrite = lambdaonPlayerError41.INSTANCE.write(p0, p1);
            DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(p0);
            int size = p1.size();
            if (size != listWrite.size()) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listWrite.size()), Integer.valueOf(size)}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                throw new lambdaonMetadata50(str);
            }
            IconCompatParcelizer(p1, listWrite);
            lambdaonLoadError26.INSTANCE.read().AudioAttributesCompatParcelizer();
            return listWrite;
        }

        @getMagicModuleMeta
        private static void IconCompatParcelizer(final lambdaonPlaybackSuppressionReasonChanged37 p0, List<lambdaonPlayerError41> p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            int size = p0.size();
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequestIconCompatParcelizer = p0.get(i);
                if (graphRequestIconCompatParcelizer.getAudioAttributesCompatParcelizer() != null) {
                    arrayList.add(new Pair(graphRequestIconCompatParcelizer.getAudioAttributesCompatParcelizer(), p1.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.GraphRequest.IconCompatParcelizer.1
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
                                for (Pair pair : arrayList) {
                                    write writeVar = (write) pair.first;
                                    Object obj = pair.second;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
                                    writeVar.IconCompatParcelizer((lambdaonPlayerError41) obj);
                                }
                                Iterator<lambdaonPlaybackSuppressionReasonChanged37.IconCompatParcelizer> it = p0.RemoteActionCompatParcelizer().iterator();
                                while (it.hasNext()) {
                                    it.next().RemoteActionCompatParcelizer(p0);
                                }
                            } catch (Throwable th) {
                                getMinWindowSequenceNumber.read(th, this);
                            }
                        } catch (Throwable th2) {
                            getMinWindowSequenceNumber.read(th2, this);
                        }
                    }
                };
                Handler handlerWrite = p0.getRemoteActionCompatParcelizer();
                if (handlerWrite != null) {
                    handlerWrite.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        private final HttpURLConnection AudioAttributesCompatParcelizer(URL p0) throws IOException {
            URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(p0.openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, IconCompatParcelizer());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private static boolean RemoteActionCompatParcelizer(lambdaonPlaybackSuppressionReasonChanged37 p0) {
            Iterator<lambdaonPlaybackSuppressionReasonChanged37.IconCompatParcelizer> it = p0.RemoteActionCompatParcelizer().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof lambdaonPlaybackSuppressionReasonChanged37.read) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = p0.iterator();
            while (it2.hasNext()) {
                if (it2.next().getAudioAttributesCompatParcelizer() instanceof read) {
                    return true;
                }
            }
            return false;
        }

        private final void IconCompatParcelizer(HttpURLConnection p0, boolean p1) {
            if (p1) {
                p0.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                p0.setRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
            } else {
                p0.setRequestProperty(RtspHeaders.CONTENT_TYPE, write());
            }
        }

        private final boolean IconCompatParcelizer(lambdaonPlaybackSuppressionReasonChanged37 p0) {
            for (GraphRequest graphRequest : p0) {
                Iterator<String> it = graphRequest.getMediaBrowserCompatMediaItem().keySet().iterator();
                while (it.hasNext()) {
                    if (IconCompatParcelizer(graphRequest.getMediaBrowserCompatMediaItem().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        @getMagicModuleMeta
        private static boolean AudioAttributesCompatParcelizer(GraphRequest p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String onAddQueueItem = p0.getOnAddQueueItem();
            if (onAddQueueItem == null || onAddQueueItem.length() == 0) {
                return true;
            }
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(onAddQueueItem, "v")) {
                if (onAddQueueItem == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                onAddQueueItem = onAddQueueItem.substring(1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onAddQueueItem, "");
            }
            Object[] array = new newYearNameItem("\\.").read(onAddQueueItem).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return (strArr.length >= 2 && Integer.parseInt(strArr[0]) > 2) || (Integer.parseInt(strArr[0]) >= 2 && Integer.parseInt(strArr[1]) >= 4);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @getMagicModuleMeta
        private void AudioAttributesImplApi26Parcelizer(lambdaonPlaybackSuppressionReasonChanged37 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            for (GraphRequest graphRequest : p0) {
                if (lambdaonPlayWhenReadyChanged36.GET == graphRequest.getAudioAttributesImplApi26Parcelizer()) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(graphRequest, "");
                    if (AudioAttributesCompatParcelizer(graphRequest) && (!graphRequest.getMediaBrowserCompatMediaItem().containsKey("fields") || DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(graphRequest.getMediaBrowserCompatMediaItem().getString("fields")))) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
                        lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.DEVELOPER_ERRORS;
                        String audioAttributesImplBaseParcelizer = graphRequest.getAudioAttributesImplBaseParcelizer();
                        if (audioAttributesImplBaseParcelizer == null) {
                            audioAttributesImplBaseParcelizer = "";
                        }
                        readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", audioAttributesImplBaseParcelizer);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
        @kotlin.getMagicModuleMeta
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void write(kotlin.lambdaonPlaybackSuppressionReasonChanged37 r16, java.net.HttpURLConnection r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.Companion.write(o.lambdaonPlaybackSuppressionReasonChanged37, java.net.HttpURLConnection):void");
        }

        private final void RemoteActionCompatParcelizer(lambdaonPlaybackSuppressionReasonChanged37 p0, DefaultAnalyticsCollectorExternalSyntheticLambda68 p1, int p2, URL p3, OutputStream p4, boolean p5) throws Throwable {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(p4, p1, p5);
            if (p2 == 1) {
                GraphRequest graphRequestIconCompatParcelizer = p0.get(0);
                HashMap map = new HashMap();
                for (String str : graphRequestIconCompatParcelizer.getMediaBrowserCompatMediaItem().keySet()) {
                    Object obj = graphRequestIconCompatParcelizer.getMediaBrowserCompatMediaItem().get(str);
                    if (IconCompatParcelizer(obj)) {
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                        map.put(str, new RemoteActionCompatParcelizer(graphRequestIconCompatParcelizer, obj));
                    }
                }
                if (p1 != null) {
                    p1.AudioAttributesCompatParcelizer("  Parameters:\n");
                }
                AudioAttributesCompatParcelizer(graphRequestIconCompatParcelizer.getMediaBrowserCompatMediaItem(), mediaBrowserCompatCustomActionResultReceiver, graphRequestIconCompatParcelizer);
                if (p1 != null) {
                    p1.AudioAttributesCompatParcelizer("  Attachments:\n");
                }
                read(map, mediaBrowserCompatCustomActionResultReceiver);
                JSONObject mediaBrowserCompatCustomActionResultReceiver2 = graphRequestIconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
                if (mediaBrowserCompatCustomActionResultReceiver2 != null) {
                    String path = p3.getPath();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(path, "");
                    AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver2, path, mediaBrowserCompatCustomActionResultReceiver);
                    return;
                }
                return;
            }
            String str2 = read(p0);
            if (str2.length() == 0) {
                throw new lambdaonMetadata50("App ID was not specified at the request or Settings.");
            }
            mediaBrowserCompatCustomActionResultReceiver.read("batch_app_id", str2);
            HashMap map2 = new HashMap();
            AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, p0, map2);
            if (p1 != null) {
                p1.AudioAttributesCompatParcelizer("  Attachments:\n");
            }
            read(map2, mediaBrowserCompatCustomActionResultReceiver);
        }

        private static boolean read(String p0) {
            Matcher matcher = GraphRequest.MediaBrowserCompatItemReceiver.matcher(p0);
            if (matcher.matches()) {
                p0 = matcher.group(1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p0, "");
            }
            return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "me/") || TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "/me/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void AudioAttributesCompatParcelizer(org.json.JSONObject r8, java.lang.String r9, com.facebook.GraphRequest.AudioAttributesCompatParcelizer r10) {
            /*
                r7 = this;
                r0 = r7
                com.facebook.GraphRequest$IconCompatParcelizer r0 = (com.facebook.GraphRequest.Companion) r0
                boolean r0 = read(r9)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L24
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                java.lang.String r0 = ":"
                r3 = 6
                int r0 = kotlin.TestGroupLSModel.read(r9, r0, r2, r2, r3)
                java.lang.String r4 = "?"
                int r9 = kotlin.TestGroupLSModel.read(r9, r4, r2, r2, r3)
                r3 = 3
                if (r0 <= r3) goto L24
                r3 = -1
                if (r9 == r3) goto L22
                if (r0 >= r9) goto L24
            L22:
                r9 = r1
                goto L25
            L24:
                r9 = r2
            L25:
                java.util.Iterator r0 = r8.keys()
            L29:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L52
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r8.opt(r3)
                if (r9 == 0) goto L45
                java.lang.String r5 = "image"
                boolean r5 = kotlin.TestGroupLSModel.read(r3, r5, r1)
                if (r5 == 0) goto L45
                r5 = r1
                goto L46
            L45:
                r5 = r2
            L46:
                java.lang.String r6 = ""
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r3, r6)
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r4, r6)
                r7.read(r3, r4, r10, r5)
                goto L29
            L52:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.Companion.AudioAttributesCompatParcelizer(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$AudioAttributesCompatParcelizer):void");
        }

        private final void read(String p0, Object p1, AudioAttributesCompatParcelizer p2, boolean p3) {
            Class<?> cls = p1.getClass();
            if (!JSONObject.class.isAssignableFrom(cls)) {
                if (JSONArray.class.isAssignableFrom(cls)) {
                    if (p1 != null) {
                        JSONArray jSONArray = (JSONArray) p1;
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                            String str = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{p0, Integer.valueOf(i)}, 2));
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                            Object objOpt = jSONArray.opt(i);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objOpt, "");
                            read(str, objOpt, p2, p3);
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                }
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                    p2.read(p0, p1.toString());
                    return;
                }
                if (Date.class.isAssignableFrom(cls)) {
                    if (p1 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.util.Date");
                    }
                    String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) p1);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                    p2.read(p0, str2);
                    return;
                }
                return;
            }
            if (p1 != null) {
                JSONObject jSONObject = (JSONObject) p1;
                if (p3) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                        String str3 = String.format("%s[%s]", Arrays.copyOf(new Object[]{p0, next}, 2));
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                        Object objOpt2 = jSONObject.opt(next);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objOpt2, "");
                        read(str3, objOpt2, p2, p3);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
                    read(p0, strOptString, p2, p3);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
                    read(p0, strOptString2, p2, p3);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        read(p0, string, p2, p3);
                        return;
                    }
                    return;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        private final void AudioAttributesCompatParcelizer(Bundle p0, MediaBrowserCompatCustomActionResultReceiver p1, GraphRequest p2) throws Throwable {
            for (String str : p0.keySet()) {
                Object obj = p0.get(str);
                if (AudioAttributesCompatParcelizer(obj)) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                    p1.IconCompatParcelizer(str, obj, p2);
                }
            }
        }

        private static void AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver p0, Collection<GraphRequest> p1, Map<String, RemoteActionCompatParcelizer> p2) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = p1.iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(jSONArray, p2);
            }
            p0.AudioAttributesCompatParcelizer("batch", jSONArray, p1);
        }

        private static String write() {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.write}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }

        private static String IconCompatParcelizer() {
            if (GraphRequest.AudioAttributesImplBaseParcelizer == null) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "11.1.0"}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                GraphRequest.AudioAttributesImplBaseParcelizer = str;
                String strWrite = DefaultAnalyticsCollectorExternalSyntheticLambda66.write();
                if (!DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strWrite)) {
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.AudioAttributesImplBaseParcelizer, strWrite}, 2));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                    GraphRequest.AudioAttributesImplBaseParcelizer = str2;
                }
            }
            return GraphRequest.AudioAttributesImplBaseParcelizer;
        }

        private static String read(lambdaonPlaybackSuppressionReasonChanged37 p0) {
            String strAudioAttributesCompatParcelizer = p0.getRead();
            if (strAudioAttributesCompatParcelizer != null && !p0.isEmpty()) {
                return strAudioAttributesCompatParcelizer;
            }
            Iterator<GraphRequest> it = p0.iterator();
            while (it.hasNext()) {
                AccessToken iconCompatParcelizer = it.next().getIconCompatParcelizer();
                if (iconCompatParcelizer != null) {
                    return iconCompatParcelizer.getAudioAttributesCompatParcelizer();
                }
            }
            GraphRequest.RemoteActionCompatParcelizer();
            String strWrite = lambdaonMediaMetadataChanged48.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
            return strWrite;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean IconCompatParcelizer(Object p0) {
            return (p0 instanceof Bitmap) || (p0 instanceof byte[]) || (p0 instanceof Uri) || (p0 instanceof ParcelFileDescriptor) || (p0 instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean AudioAttributesCompatParcelizer(Object p0) {
            return (p0 instanceof String) || (p0 instanceof Boolean) || (p0 instanceof Number) || (p0 instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String AudioAttributesImplApi26Parcelizer(Object p0) {
            if (p0 instanceof String) {
                return (String) p0;
            }
            if ((p0 instanceof Boolean) || (p0 instanceof Number)) {
                return p0.toString();
            }
            if (p0 instanceof Date) {
                String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) p0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                return str;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        private static void read(Map<String, RemoteActionCompatParcelizer> p0, MediaBrowserCompatCustomActionResultReceiver p1) throws Throwable {
            for (Map.Entry<String, RemoteActionCompatParcelizer> entry : p0.entrySet()) {
                Companion companion = GraphRequest.INSTANCE;
                if (IconCompatParcelizer(entry.getValue())) {
                    p1.IconCompatParcelizer(entry.getKey(), entry.getValue().write(), entry.getValue().RemoteActionCompatParcelizer());
                }
            }
        }
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("GraphRequest", "");
        MediaBrowserCompatCustomActionResultReceiver = "GraphRequest";
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charArray, "");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11);
        for (int i = 0; i < iNextInt + 30; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        write = string;
        MediaBrowserCompatItemReceiver = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, lambdaonPlayWhenReadyChanged36 lambdaonplaywhenreadychanged36, write writeVar, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : lambdaonplaywhenreadychanged36, (i & 16) != 0 ? null : writeVar, (i & 32) != 0 ? null : str2);
    }

    private GraphRequest(AccessToken accessToken, String str, Bundle bundle, lambdaonPlayWhenReadyChanged36 lambdaonplaywhenreadychanged36, write writeVar, String str2) {
        this.read = true;
        this.IconCompatParcelizer = accessToken;
        this.AudioAttributesImplBaseParcelizer = str;
        this.onAddQueueItem = str2;
        RemoteActionCompatParcelizer(writeVar);
        AudioAttributesCompatParcelizer(lambdaonplaywhenreadychanged36);
        if (bundle != null) {
            this.MediaBrowserCompatMediaItem = new Bundle(bundle);
        } else {
            this.MediaBrowserCompatMediaItem = new Bundle();
        }
        if (this.onAddQueueItem == null) {
            int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
            this.onAddQueueItem = (String) lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, -2042269330, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), 2042269331);
        }
    }

    @getRenewGrpId
    public final void onAddQueueItem() {
        this.MediaMetadataCompat = true;
    }

    public final lambdaonPlayerError41 MediaBrowserCompatCustomActionResultReceiver() {
        return INSTANCE.read(this);
    }

    public final lambdaonPlaybackStateChanged35 AudioAttributesImplApi26Parcelizer() {
        return INSTANCE.RemoteActionCompatParcelizer(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.IconCompatParcelizer;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", graphObject: ");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", httpMethod: ");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", parameters: ");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append("}");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        AccessToken accessToken = this.IconCompatParcelizer;
        Bundle bundle = this.MediaBrowserCompatMediaItem;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String ratingCompat = accessToken.getRatingCompat();
                DefaultAnalyticsCollectorExternalSyntheticLambda68.read.IconCompatParcelizer(ratingCompat);
                bundle.putString("access_token", ratingCompat);
            }
        } else if (!this.MediaMetadataCompat && !bundle.containsKey("access_token")) {
            String strWrite = lambdaonMediaMetadataChanged48.write();
            String strAudioAttributesImplApi21Parcelizer = lambdaonMediaMetadataChanged48.AudioAttributesImplApi21Parcelizer();
            if (!DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strWrite) && !DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strAudioAttributesImplApi21Parcelizer)) {
                StringBuilder sb = new StringBuilder();
                sb.append(strWrite);
                sb.append('|');
                sb.append(strAudioAttributesImplApi21Parcelizer);
                bundle.putString("access_token", sb.toString());
            } else {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
            }
        }
        if (!bundle.containsKey("access_token")) {
            DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesImplApi21Parcelizer());
        }
        bundle.putString(PaymentConstants.Category.SDK, LogSubCategory.LifeCycle.ANDROID);
        bundle.putString("format", "json");
        if (lambdaonMediaMetadataChanged48.write(lambdaonPositionDiscontinuity43.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(LogLevel.DEBUG, "info");
        } else if (lambdaonMediaMetadataChanged48.write(lambdaonPositionDiscontinuity43.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(LogLevel.DEBUG, LogLevel.WARNING);
        }
    }

    private final String IconCompatParcelizer(String p0, boolean p1) {
        if (!p1 && this.AudioAttributesImplApi26Parcelizer == lambdaonPlayWhenReadyChanged36.POST) {
            return p0;
        }
        Uri.Builder builderBuildUpon = Uri.parse(p0).buildUpon();
        for (String str : this.MediaBrowserCompatMediaItem.keySet()) {
            Object obj = this.MediaBrowserCompatMediaItem.get(str);
            if (obj == null) {
                obj = "";
            }
            if (!Companion.AudioAttributesCompatParcelizer(obj)) {
                if (this.AudioAttributesImplApi26Parcelizer != lambdaonPlayWhenReadyChanged36.GET) {
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                    String str2 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                    throw new IllegalArgumentException(str2);
                }
            } else {
                builderBuildUpon.appendQueryParameter(str, Companion.AudioAttributesImplApi26Parcelizer(obj).toString());
            }
        }
        String string = builderBuildUpon.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private String handleMediaPlayPauseIfPendingOnHandler() {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{DefaultAnalyticsCollectorExternalSyntheticLambda7.read(), onCustomAction()}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        Uri uri = Uri.parse(IconCompatParcelizer(str, true));
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        String str2 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        return str2;
    }

    public final String MediaBrowserCompatMediaItem() {
        String strIconCompatParcelizer;
        String str = this.AudioAttributesImplBaseParcelizer;
        if (this.AudioAttributesImplApi26Parcelizer == lambdaonPlayWhenReadyChanged36.POST && str != null && TestGroupLSModel.AudioAttributesImplApi21Parcelizer(str, "/videos")) {
            strIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda7.IconCompatParcelizer();
        } else {
            strIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda7.read();
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{strIconCompatParcelizer, onCustomAction()}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        return IconCompatParcelizer(str2, false);
    }

    private final String onCustomAction() {
        if (MediaBrowserCompatItemReceiver.matcher(this.AudioAttributesImplBaseParcelizer).matches()) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.onAddQueueItem, this.AudioAttributesImplBaseParcelizer}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(JSONArray p0, Map<String, RemoteActionCompatParcelizer> p1) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String strHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        jSONObject.put("relative_url", strHandleMediaPlayPauseIfPendingOnHandler);
        jSONObject.put("method", this.AudioAttributesImplApi26Parcelizer);
        AccessToken accessToken = this.IconCompatParcelizer;
        if (accessToken != null) {
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read.IconCompatParcelizer(accessToken.getRatingCompat());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.MediaBrowserCompatMediaItem.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.MediaBrowserCompatMediaItem.get(it.next());
            if (Companion.IconCompatParcelizer(obj)) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(p1.size())}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                arrayList.add(str);
                p1.put(str, new RemoteActionCompatParcelizer(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            INSTANCE.AudioAttributesCompatParcelizer(jSONObject2, strHandleMediaPlayPauseIfPendingOnHandler, new AudioAttributesImplBaseParcelizer(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        p0.put(jSONObject);
    }

    public static final class AudioAttributesImplBaseParcelizer implements AudioAttributesCompatParcelizer {
        private /* synthetic */ ArrayList RemoteActionCompatParcelizer;

        AudioAttributesImplBaseParcelizer(ArrayList arrayList) {
            this.RemoteActionCompatParcelizer = arrayList;
        }

        @Override // com.facebook.GraphRequest.AudioAttributesCompatParcelizer
        public final void read(String str, String str2) throws IOException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            ArrayList arrayList = this.RemoteActionCompatParcelizer;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str3 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, CharsetNames.UTF_8)}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            arrayList.add(str3);
        }
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @getMagicModuleMeta
    public static final GraphRequest AudioAttributesCompatParcelizer(String str) {
        return Companion.IconCompatParcelizer(null, str, null);
    }

    @getMagicModuleMeta
    public static final GraphRequest IconCompatParcelizer(AccessToken accessToken, String str, JSONObject jSONObject, write writeVar) {
        return Companion.AudioAttributesCompatParcelizer(accessToken, str, jSONObject, null);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class MediaBrowserCompatCustomActionResultReceiver implements AudioAttributesCompatParcelizer {
        private final DefaultAnalyticsCollectorExternalSyntheticLambda68 AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private final OutputStream read;
        private final boolean write;

        public MediaBrowserCompatCustomActionResultReceiver(OutputStream outputStream, DefaultAnalyticsCollectorExternalSyntheticLambda68 defaultAnalyticsCollectorExternalSyntheticLambda68, boolean z) {
            toMagicModuleMetaRepoModel.write(outputStream, "");
            this.read = outputStream;
            this.AudioAttributesCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda68;
            this.IconCompatParcelizer = true;
            this.write = z;
        }

        public final void IconCompatParcelizer(String str, Object obj, GraphRequest graphRequest) throws Throwable {
            toMagicModuleMetaRepoModel.write(str, "");
            Closeable closeable = this.read;
            if (closeable instanceof lambdaonShuffleModeEnabledChanged40) {
                if (closeable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
                }
                ((lambdaonShuffleModeEnabledChanged40) closeable).AudioAttributesCompatParcelizer(graphRequest);
            }
            Companion companion = GraphRequest.INSTANCE;
            if (Companion.AudioAttributesCompatParcelizer(obj)) {
                Companion companion2 = GraphRequest.INSTANCE;
                read(str, Companion.AudioAttributesImplApi26Parcelizer(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                AudioAttributesCompatParcelizer(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                write(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                write(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                IconCompatParcelizer(str, (ParcelFileDescriptor) obj, (String) null);
                return;
            }
            if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable parcelableWrite = parcelableResourceWithMimeType.write();
                String remoteActionCompatParcelizer = parcelableResourceWithMimeType.getRemoteActionCompatParcelizer();
                if (parcelableWrite instanceof ParcelFileDescriptor) {
                    IconCompatParcelizer(str, (ParcelFileDescriptor) parcelableWrite, remoteActionCompatParcelizer);
                    return;
                } else {
                    if (parcelableWrite instanceof Uri) {
                        write(str, (Uri) parcelableWrite, remoteActionCompatParcelizer);
                        return;
                    }
                    throw IconCompatParcelizer();
                }
            }
            throw IconCompatParcelizer();
        }

        private static RuntimeException IconCompatParcelizer() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void AudioAttributesCompatParcelizer(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws JSONException, IOException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(jSONArray, "");
            toMagicModuleMetaRepoModel.write(collection, "");
            Closeable closeable = this.read;
            if (!(closeable instanceof lambdaonShuffleModeEnabledChanged40)) {
                String string = jSONArray.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                read(str, string);
                return;
            }
            if (closeable != null) {
                lambdaonShuffleModeEnabledChanged40 lambdaonshufflemodeenabledchanged40 = (lambdaonShuffleModeEnabledChanged40) closeable;
                AudioAttributesCompatParcelizer(str, (String) null, (String) null);
                RemoteActionCompatParcelizer("[", new Object[0]);
                int i = 0;
                for (GraphRequest graphRequest : collection) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    lambdaonshufflemodeenabledchanged40.AudioAttributesCompatParcelizer(graphRequest);
                    if (i > 0) {
                        RemoteActionCompatParcelizer(",%s", jSONObject.toString());
                    } else {
                        RemoteActionCompatParcelizer("%s", jSONObject.toString());
                    }
                    i++;
                }
                RemoteActionCompatParcelizer("]", new Object[0]);
                DefaultAnalyticsCollectorExternalSyntheticLambda68 defaultAnalyticsCollectorExternalSyntheticLambda68 = this.AudioAttributesCompatParcelizer;
                if (defaultAnalyticsCollectorExternalSyntheticLambda68 != null) {
                    String strConcat = "    ".concat(String.valueOf(str));
                    String string2 = jSONArray.toString();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    defaultAnalyticsCollectorExternalSyntheticLambda68.write(strConcat, string2);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
        }

        @Override // com.facebook.GraphRequest.AudioAttributesCompatParcelizer
        public final void read(String str, String str2) throws IOException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            AudioAttributesCompatParcelizer(str, (String) null, (String) null);
            AudioAttributesCompatParcelizer("%s", str2);
            write();
            DefaultAnalyticsCollectorExternalSyntheticLambda68 defaultAnalyticsCollectorExternalSyntheticLambda68 = this.AudioAttributesCompatParcelizer;
            if (defaultAnalyticsCollectorExternalSyntheticLambda68 != null) {
                defaultAnalyticsCollectorExternalSyntheticLambda68.write("    ".concat(String.valueOf(str)), str2);
            }
        }

        private void AudioAttributesCompatParcelizer(String str, Bitmap bitmap) throws IOException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bitmap, "");
            AudioAttributesCompatParcelizer(str, str, MimeTypes.IMAGE_PNG);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.read);
            AudioAttributesCompatParcelizer("", new Object[0]);
            write();
            DefaultAnalyticsCollectorExternalSyntheticLambda68 defaultAnalyticsCollectorExternalSyntheticLambda68 = this.AudioAttributesCompatParcelizer;
            if (defaultAnalyticsCollectorExternalSyntheticLambda68 != null) {
                defaultAnalyticsCollectorExternalSyntheticLambda68.write("    ".concat(String.valueOf(str)), "<Image>");
            }
        }

        private void write(String str, byte[] bArr) throws IOException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bArr, "");
            AudioAttributesCompatParcelizer(str, str, "content/unknown");
            this.read.write(bArr);
            AudioAttributesCompatParcelizer("", new Object[0]);
            write();
            DefaultAnalyticsCollectorExternalSyntheticLambda68 defaultAnalyticsCollectorExternalSyntheticLambda68 = this.AudioAttributesCompatParcelizer;
            if (defaultAnalyticsCollectorExternalSyntheticLambda68 != null) {
                String strConcat = "    ".concat(String.valueOf(str));
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                defaultAnalyticsCollectorExternalSyntheticLambda68.write(strConcat, str2);
            }
        }

        private void write(String str, Uri uri, String str2) throws Throwable {
            int iAudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(uri, "");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            AudioAttributesCompatParcelizer(str, str, str2);
            if (this.read instanceof lambdaonRenderedFirstFrame19) {
                ((lambdaonRenderedFirstFrame19) this.read).read(DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(uri));
                iAudioAttributesCompatParcelizer = 0;
            } else {
                Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
                iAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer.getContentResolver().openInputStream(uri), this.read);
            }
            AudioAttributesCompatParcelizer("", new Object[0]);
            write();
            DefaultAnalyticsCollectorExternalSyntheticLambda68 defaultAnalyticsCollectorExternalSyntheticLambda68 = this.AudioAttributesCompatParcelizer;
            if (defaultAnalyticsCollectorExternalSyntheticLambda68 != null) {
                String strConcat = "    ".concat(String.valueOf(str));
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iAudioAttributesCompatParcelizer)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                defaultAnalyticsCollectorExternalSyntheticLambda68.write(strConcat, str3);
            }
        }

        private void IconCompatParcelizer(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws Throwable {
            int iAudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(parcelFileDescriptor, "");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            AudioAttributesCompatParcelizer(str, str, str2);
            OutputStream outputStream = this.read;
            if (outputStream instanceof lambdaonRenderedFirstFrame19) {
                ((lambdaonRenderedFirstFrame19) outputStream).read(parcelFileDescriptor.getStatSize());
                iAudioAttributesCompatParcelizer = 0;
            } else {
                iAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.read);
            }
            AudioAttributesCompatParcelizer("", new Object[0]);
            write();
            DefaultAnalyticsCollectorExternalSyntheticLambda68 defaultAnalyticsCollectorExternalSyntheticLambda68 = this.AudioAttributesCompatParcelizer;
            if (defaultAnalyticsCollectorExternalSyntheticLambda68 != null) {
                String strConcat = "    ".concat(String.valueOf(str));
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iAudioAttributesCompatParcelizer)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                defaultAnalyticsCollectorExternalSyntheticLambda68.write(strConcat, str3);
            }
        }

        private void write() throws IOException {
            if (!this.write) {
                AudioAttributesCompatParcelizer("--%s", GraphRequest.write);
                return;
            }
            OutputStream outputStream = this.read;
            byte[] bytes = "&".getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            outputStream.write(bytes);
        }

        private void AudioAttributesCompatParcelizer(String str, String str2, String str3) throws IOException {
            if (!this.write) {
                RemoteActionCompatParcelizer("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    RemoteActionCompatParcelizer("; filename=\"%s\"", str2);
                }
                AudioAttributesCompatParcelizer("", new Object[0]);
                if (str3 != null) {
                    AudioAttributesCompatParcelizer("%s: %s", RtspHeaders.CONTENT_TYPE, str3);
                }
                AudioAttributesCompatParcelizer("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.read;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
            Charset charset = getSubmissionTimestamp.IconCompatParcelizer;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str4.getBytes(charset);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            outputStream.write(bytes);
        }

        private void RemoteActionCompatParcelizer(String str, Object... objArr) throws IOException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(objArr, "");
            if (!this.write) {
                if (this.IconCompatParcelizer) {
                    OutputStream outputStream = this.read;
                    byte[] bytes = "--".getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.read;
                    String str2 = GraphRequest.write;
                    Charset charset = getSubmissionTimestamp.IconCompatParcelizer;
                    if (str2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes2 = str2.getBytes(charset);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes2, "");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.read;
                    byte[] bytes3 = "\r\n".getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes3, "");
                    outputStream3.write(bytes3);
                    this.IconCompatParcelizer = false;
                }
                OutputStream outputStream4 = this.read;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                Charset charset2 = getSubmissionTimestamp.IconCompatParcelizer;
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes4 = str3.getBytes(charset2);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes4, "");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.read;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
            Locale locale = Locale.US;
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
            String str4 = String.format(locale, str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
            String strEncode = URLEncoder.encode(str4, CharsetNames.UTF_8);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncode, "");
            Charset charset3 = getSubmissionTimestamp.IconCompatParcelizer;
            if (strEncode != null) {
                byte[] bytes5 = strEncode.getBytes(charset3);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes5, "");
                outputStream5.write(bytes5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        private void AudioAttributesCompatParcelizer(String str, Object... objArr) throws IOException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(objArr, "");
            RemoteActionCompatParcelizer(str, Arrays.copyOf(objArr, objArr.length));
            if (this.write) {
                return;
            }
            RemoteActionCompatParcelizer("\r\n", new Object[0]);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u0017*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0017B\u0011\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "Landroid/os/Parcel;", "p0", "<init>", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "IconCompatParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "write", "Landroid/os/Parcelable;", "()Landroid/os/Parcelable;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new write();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final RESOURCE read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(parcel);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final RESOURCE write() {
            return this.read;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeString(this.RemoteActionCompatParcelizer);
            p0.writeParcelable(this.read, p1);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.RemoteActionCompatParcelizer = parcel.readString();
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            this.read = (RESOURCE) parcel.readParcelable(contextAudioAttributesCompatParcelizer.getClassLoader());
        }

        /* JADX INFO: renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR", "()Landroid/os/Parcelable$Creator;"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }

            public final Parcelable.Creator<ParcelableResourceWithMimeType<?>> getCREATOR() {
                return ParcelableResourceWithMimeType.CREATOR;
            }
        }

        public static final class write implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            write() {
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ParcelableResourceWithMimeType<?> createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ParcelableResourceWithMimeType<?>[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static ParcelableResourceWithMimeType<?> write(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new ParcelableResourceWithMimeType<>(parcel, null);
            }

            private static ParcelableResourceWithMimeType<?>[] RemoteActionCompatParcelizer(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }
    }
}
