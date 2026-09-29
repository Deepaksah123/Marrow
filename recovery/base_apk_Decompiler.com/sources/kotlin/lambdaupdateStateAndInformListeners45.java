package kotlin;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.SimpleBasePlayerExternalSyntheticLambda14;
import kotlin.getVolumeFromManager;
import kotlin.invalidateState;
import kotlin.lambdaupdateStateAndInformListeners52;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 *2\u00020\u0001:\u00021*B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\"¢\u0006\u0004\b$\u0010%J;\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020(2\b\u0010\t\u001a\u0004\u0018\u00010)2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010\u0003\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020,2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b-\u0010.J!\u0010-\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b-\u0010/J!\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b$\u0010/J\u0015\u00101\u001a\u00020#2\u0006\u0010\u0003\u001a\u000200¢\u0006\u0004\b1\u00102J3\u0010*\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020(2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000204032\b\u0010\u0007\u001a\u0004\u0018\u000105¢\u0006\u0004\b*\u00106JE\u0010-\u001a\u00020#2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000204032\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020403072\b\u0010\u0007\u001a\u0004\u0018\u000105¢\u0006\u0004\b-\u00108J7\u00101\u001a\u00020#2\u001e\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020403032\b\u0010\u0005\u001a\u0004\u0018\u000105¢\u0006\u0004\b1\u00109J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u0002002\b\u0010\u0005\u001a\u0004\u0018\u000105¢\u0006\u0004\b$\u0010:J\r\u0010*\u001a\u00020#¢\u0006\u0004\b*\u0010;J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010;J\u0017\u0010*\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020<H\u0002¢\u0006\u0004\b*\u0010=J\u0019\u0010$\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b$\u0010?J\u000f\u00101\u001a\u00020\"H\u0002¢\u0006\u0004\b1\u0010@J\u0017\u0010-\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\b-\u0010AJ\u0017\u00101\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\b1\u0010AJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020<H\u0002¢\u0006\u0004\b$\u0010=J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020(0B2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u0010CJ\u000f\u0010-\u001a\u00020\"H\u0002¢\u0006\u0004\b-\u0010@J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\b$\u0010AJ\u001f\u00101\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020&H\u0002¢\u0006\u0004\b1\u0010DJ\u0017\u0010E\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\bE\u0010AJ\u0017\u0010*\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010FJ\u0017\u0010G\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\bG\u0010AJ\u0017\u0010H\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\bH\u0010AJ\u0017\u0010*\u001a\u0002002\u0006\u0010\u0003\u001a\u000200H\u0002¢\u0006\u0004\b*\u0010IJ\u0017\u0010-\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020<H\u0002¢\u0006\u0004\b-\u0010JJ!\u00101\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\b1\u0010LR\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010OR\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010E\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010TR\u0014\u0010V\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010UR\u0014\u0010G\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010WR\u0014\u0010H\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010M\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010R\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010P\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010X\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010`\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010eR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020#0f8\u0007¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bE\u0010iR\u0018\u0010m\u001a\u0006*\u00020j0j8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010Z\u001a\u0006*\u00020(0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bb\u0010nR\u0016\u0010c\u001a\u00020o8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020(0B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bm\u0010r"}, d2 = {"Lo/lambdaupdateStateAndInformListeners45;", "Lo/lambdaupdateStateAndInformListeners54;", "Landroid/content/Context;", "p0", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "Lo/isTypeSupported;", "p2", "Lo/getUids;", "p3", "Lo/addAllCommands;", "p4", "Lo/PlaybackParameters;", "p5", "Lo/copyWithPlaceholderTimeline;", "p6", "Lo/RendererState;", "p7", "Lo/getChildTimelines;", "p8", "Lo/lambdaupdateStateAndInformListeners56;", "p9", "Lo/handleSetVideoOutput;", "p10", "Lo/handleRelease;", "p11", "Lo/lambdaupdateStateAndInformListeners39;", "p12", "Lo/lambdaupdateStateAndInformListeners52;", "p13", "Lo/onDroppedVideoFrames;", "p14", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lo/isTypeSupported;Lo/getUids;Lo/addAllCommands;Lo/PlaybackParameters;Lo/copyWithPlaceholderTimeline;Lo/RendererState;Lo/getChildTimelines;Lo/lambdaupdateStateAndInformListeners56;Lo/handleSetVideoOutput;Lo/handleRelease;Lo/lambdaupdateStateAndInformListeners39;Lo/lambdaupdateStateAndInformListeners52;Lo/onDroppedVideoFrames;)V", "", "", "AudioAttributesCompatParcelizer", "(Z)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;)Landroid/os/Bundle;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "read", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;Landroid/content/Context;)Landroid/os/Bundle;", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Landroid/os/Bundle;)V", "Lorg/json/JSONArray;", "write", "(Lorg/json/JSONArray;)V", "", "", "Landroid/location/Location;", "(Ljava/lang/String;Ljava/util/Map;Landroid/location/Location;)V", "", "(Ljava/util/Map;Ljava/util/List;Landroid/location/Location;)V", "(Ljava/util/Map;Landroid/location/Location;)V", "(Lorg/json/JSONArray;Landroid/location/Location;)V", "()V", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "Landroid/app/Activity;", "(Landroid/app/Activity;)Z", "()Z", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "", "(Lo/RendererState;)Ljava/util/Set;", "(Landroid/content/Context;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "IconCompatParcelizer", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)Z", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "(Lorg/json/JSONArray;)Lorg/json/JSONArray;", "(Lorg/json/JSONObject;)Z", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V", "AudioAttributesImplBaseParcelizer", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "MediaBrowserCompatMediaItem", "Lo/isTypeSupported;", "AudioAttributesImplApi26Parcelizer", "Lo/getUids;", "Lo/addAllCommands;", "Lo/PlaybackParameters;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/copyWithPlaceholderTimeline;", "MediaBrowserCompatSearchResultReceiver", "Lo/getChildTimelines;", "onCustomAction", "Lo/lambdaupdateStateAndInformListeners56;", "MediaMetadataCompat", "Lo/handleSetVideoOutput;", "onPlay", "Lo/handleRelease;", "RatingCompat", "Lo/lambdaupdateStateAndInformListeners39;", "MediaDescriptionCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/lambdaupdateStateAndInformListeners52;", "Lo/onDroppedVideoFrames;", "Lkotlin/Function0;", "onPause", "Lo/getCreatedOnDateMs;", "()Lo/getCreatedOnDateMs;", "Lo/RendererWakeupListener;", "onCommand", "Lo/RendererWakeupListener;", "onAddQueueItem", "Ljava/lang/String;", "Lo/lambdaupdateStateAndInformListeners45$write;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/lambdaupdateStateAndInformListeners45$write;", "Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners45 implements lambdaupdateStateAndInformListeners54 {
    public static volatile CTInAppNotification read;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final addAllCommands IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final CleverTapInstanceConfig write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getUids AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Context RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final PlaybackParameters MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final onDroppedVideoFrames RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final copyWithPlaceholderTimeline AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final isTypeSupported read;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getChildTimelines MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final lambdaupdateStateAndInformListeners52 MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final String onCustomAction;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final handleSetVideoOutput AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final lambdaupdateStateAndInformListeners39 MediaDescriptionCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private write MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final Set<String> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final RendererWakeupListener onAddQueueItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final lambdaupdateStateAndInformListeners56 AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> MediaMetadataCompat;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final handleRelease MediaBrowserCompatMediaItem;
    private static final List<CTInAppNotification> write = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] read;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[lambdaupdateStateAndInformListeners38.values().length];
            try {
                iArr[lambdaupdateStateAndInformListeners38.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners38.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners38.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners38.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            read = iArr;
            int[] iArr2 = new int[lambdaupdateStateAndInformListeners41.values().length];
            try {
                iArr2[lambdaupdateStateAndInformListeners41.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.onCustomAction.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.MediaMetadataCompat.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.MediaBrowserCompatItemReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.MediaDescriptionCompat.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.write.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.handleMediaPlayPauseIfPendingOnHandler.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.MediaBrowserCompatSearchResultReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.read.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.RatingCompat.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.AudioAttributesImplBaseParcelizer.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.MediaBrowserCompatMediaItem.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[lambdaupdateStateAndInformListeners41.AudioAttributesImplApi21Parcelizer.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            write = iArr2;
        }
    }

    public lambdaupdateStateAndInformListeners45(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, isTypeSupported istypesupported, getUids getuids, addAllCommands addallcommands, PlaybackParameters playbackParameters, copyWithPlaceholderTimeline copywithplaceholdertimeline, RendererState rendererState, getChildTimelines getchildtimelines, lambdaupdateStateAndInformListeners56 lambdaupdatestateandinformlisteners56, handleSetVideoOutput handlesetvideooutput, handleRelease handlerelease, lambdaupdateStateAndInformListeners39 lambdaupdatestateandinformlisteners39, lambdaupdateStateAndInformListeners52 lambdaupdatestateandinformlisteners52, onDroppedVideoFrames ondroppedvideoframes) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(istypesupported, "");
        toMagicModuleMetaRepoModel.write(getuids, "");
        toMagicModuleMetaRepoModel.write(addallcommands, "");
        toMagicModuleMetaRepoModel.write(playbackParameters, "");
        toMagicModuleMetaRepoModel.write(copywithplaceholdertimeline, "");
        toMagicModuleMetaRepoModel.write(rendererState, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners56, "");
        toMagicModuleMetaRepoModel.write(handlesetvideooutput, "");
        toMagicModuleMetaRepoModel.write(handlerelease, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners39, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners52, "");
        toMagicModuleMetaRepoModel.write(ondroppedvideoframes, "");
        this.RemoteActionCompatParcelizer = context;
        this.write = cleverTapInstanceConfig;
        this.read = istypesupported;
        this.AudioAttributesCompatParcelizer = getuids;
        this.IconCompatParcelizer = addallcommands;
        this.MediaBrowserCompatCustomActionResultReceiver = playbackParameters;
        this.AudioAttributesImplApi21Parcelizer = copywithplaceholdertimeline;
        this.MediaBrowserCompatItemReceiver = getchildtimelines;
        this.AudioAttributesImplBaseParcelizer = lambdaupdatestateandinformlisteners56;
        this.AudioAttributesImplApi26Parcelizer = handlesetvideooutput;
        this.MediaBrowserCompatMediaItem = handlerelease;
        this.MediaDescriptionCompat = lambdaupdatestateandinformlisteners39;
        this.MediaBrowserCompatSearchResultReceiver = lambdaupdatestateandinformlisteners52;
        this.RatingCompat = ondroppedvideoframes;
        this.MediaMetadataCompat = new getCreatedOnDateMs() { // from class: o.lambdaupdateStateAndInformListeners49
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return lambdaupdateStateAndInformListeners45.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        };
        this.onAddQueueItem = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.onCustomAction = cleverTapInstanceConfig.write();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = write.IconCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = write(rendererState);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/lambdaupdateStateAndInformListeners45$write;", "", "<init>", "(Ljava/lang/String;I)V", "read", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write {
        private static final /* synthetic */ write[] RemoteActionCompatParcelizer;
        public static final write read = new write("DISCARDED", 0);
        public static final write write = new write("SUSPENDED", 1);
        public static final write IconCompatParcelizer = new write("RESUMED", 2);

        private write(String str, int i) {
        }

        static {
            write[] writeVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            RemoteActionCompatParcelizer = writeVarArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrAudioAttributesCompatParcelizer);
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) RemoteActionCompatParcelizer.clone();
        }

        private static final /* synthetic */ write[] AudioAttributesCompatParcelizer() {
            return new write[]{read, write, IconCompatParcelizer};
        }
    }

    public final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        Map<String, ? extends Object> mapIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(lambdaupdatestateandinformlisteners45.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
        handleSetVideoOutput handlesetvideooutput = lambdaupdatestateandinformlisteners45.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(mapIconCompatParcelizer);
        JSONArray jSONArrayIconCompatParcelizer = handlesetvideooutput.IconCompatParcelizer(mapIconCompatParcelizer, lambdaupdatestateandinformlisteners45.AudioAttributesImplApi21Parcelizer.onAddQueueItem());
        if (jSONArrayIconCompatParcelizer.length() > 0) {
            lambdaupdatestateandinformlisteners45.write(jSONArrayIconCompatParcelizer);
        }
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(boolean p0) {
        this.MediaDescriptionCompat.write(p0);
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners54
    public final Bundle RemoteActionCompatParcelizer(CTInAppNotification p0, CTInAppAction p1, String p2, Bundle p3, Context p4) {
        Bundle bundle;
        HashMap<String, String> mapIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (p3 != null) {
            bundle = new Bundle(p3);
        } else {
            bundle = new Bundle();
        }
        bundle.putString("wzrk_id", p0.getRead());
        bundle.putString("wzrk_c2a", p2);
        if (!p0.getHandleMediaPlayPauseIfPendingOnHandler()) {
            this.MediaBrowserCompatCustomActionResultReceiver.read(true, p0, bundle);
        }
        lambdaupdateStateAndInformListeners38 remoteActionCompatParcelizer = p1.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
            return bundle;
        }
        int i = AudioAttributesCompatParcelizer.read[remoteActionCompatParcelizer.ordinal()];
        if (i == 1) {
            write(p0, p1.getAudioAttributesCompatParcelizer());
            return bundle;
        }
        if (i != 2) {
            if (i == 3) {
                String iconCompatParcelizer = p1.getIconCompatParcelizer();
                if (iconCompatParcelizer != null) {
                    this.MediaDescriptionCompat.write(iconCompatParcelizer, p4);
                    return bundle;
                }
                RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
                return bundle;
            }
            if (i != 4 || (mapIconCompatParcelizer = p1.IconCompatParcelizer()) == null) {
                return bundle;
            }
            mapIconCompatParcelizer.isEmpty();
        } else if (lambdaupdateStateAndInformListeners41.AudioAttributesImplApi21Parcelizer == p0.getWrite()) {
            this.MediaBrowserCompatMediaItem.write(p0);
        }
        return bundle;
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners54
    public final Bundle read(CTInAppNotification p0, CTInAppNotificationButton p1, Context p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        CTInAppAction cTInAppAction = p1.AudioAttributesImplBaseParcelizer;
        if (cTInAppAction == null) {
            return null;
        }
        return RemoteActionCompatParcelizer(p0, cTInAppAction, p1.getIconCompatParcelizer(), null, p2);
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners54
    public final void read(final CTInAppNotification p0, Bundle p1) {
        HashMap<String, Object> map;
        String remoteActionCompatParcelizer;
        String str = "";
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver() != null) {
            CustomTemplateInAppData onFastForward = p0.getOnFastForward();
            if (onFastForward != null && (remoteActionCompatParcelizer = onFastForward.getRemoteActionCompatParcelizer()) != null) {
                str = remoteActionCompatParcelizer;
            }
            RendererWakeupListener rendererWakeupListener = this.onAddQueueItem;
            String str2 = this.onCustomAction;
            StringBuilder sb = new StringBuilder("InApp Dismissed: ");
            sb.append(p0.getRead());
            sb.append(' ');
            sb.append(str);
            rendererWakeupListener.write(str2, sb.toString());
        } else {
            RendererWakeupListener rendererWakeupListener2 = this.onAddQueueItem;
            String str3 = this.onCustomAction;
            StringBuilder sb2 = new StringBuilder("Not calling InApp Dismissed: ");
            sb2.append(p0.getRead());
            sb2.append(" because InAppFCManager is null");
            rendererWakeupListener2.write(str3, sb2.toString());
        }
        try {
            if (this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() != null) {
                if (p0.getOnPlayFromSearch() != null) {
                    map = RendererCapabilitiesListener.write(p0.getOnPlayFromSearch());
                } else {
                    map = new HashMap<>();
                }
                this.AudioAttributesImplApi21Parcelizer.onFastForward();
                RendererWakeupListener.MediaMetadataCompat();
                if (p1 != null) {
                    RendererCapabilitiesListener.RemoteActionCompatParcelizer(p1);
                }
            }
        } catch (Throwable unused) {
            this.onAddQueueItem.IconCompatParcelizer();
        }
        this.read.AudioAttributesCompatParcelizer("TAG_FEATURE_IN_APPS").read("InappController#inAppNotificationDidDismiss", new Callable() { // from class: o.lambdaupdateStateAndInformListeners46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lambdaupdateStateAndInformListeners45.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, p0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, CTInAppNotification cTInAppNotification) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
        lambdaupdatestateandinformlisteners45.AudioAttributesCompatParcelizer(cTInAppNotification);
        lambdaupdatestateandinformlisteners45.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners54
    public final void AudioAttributesCompatParcelizer(CTInAppNotification p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Rfont rfontMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        if (rfontMediaBrowserCompatItemReceiver != null) {
            rfontMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.read(false, p0, p1);
        try {
            this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        } catch (Throwable unused) {
            RendererWakeupListener.MediaBrowserCompatMediaItem();
        }
    }

    public final void write(JSONArray p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            this.AudioAttributesImplBaseParcelizer.read(RemoteActionCompatParcelizer(p0));
            RemoteActionCompatParcelizer();
        } catch (Exception e) {
            this.onAddQueueItem.write();
        }
    }

    public final void RemoteActionCompatParcelizer(String p0, Map<String, ? extends Object> p1, Location p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Map<String, ? extends Object> mapIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
        mapIconCompatParcelizer.putAll(p1);
        handleSetVideoOutput handlesetvideooutput = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(mapIconCompatParcelizer);
        JSONArray jSONArrayWrite = handlesetvideooutput.write(p0, mapIconCompatParcelizer, p2);
        if (jSONArrayWrite.length() > 0) {
            write(jSONArrayWrite);
        }
    }

    public final void read(Map<String, ? extends Object> p0, List<? extends Map<String, ? extends Object>> p1, Location p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Map<String, ? extends Object> mapIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
        mapIconCompatParcelizer.putAll(p0);
        handleSetVideoOutput handlesetvideooutput = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(mapIconCompatParcelizer);
        JSONArray jSONArray = handlesetvideooutput.read(mapIconCompatParcelizer, p1, p2);
        if (jSONArray.length() > 0) {
            write(jSONArray);
        }
    }

    public final void write(Map<String, ? extends Map<String, ? extends Object>> p0, Location p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Map<String, ? extends Object> mapIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
        handleSetVideoOutput handlesetvideooutput = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(mapIconCompatParcelizer);
        JSONArray jSONArrayWrite = handlesetvideooutput.write(p0, p1, mapIconCompatParcelizer);
        if (jSONArrayWrite.length() > 0) {
            write(jSONArrayWrite);
        }
    }

    public final void AudioAttributesCompatParcelizer(JSONArray p0, Location p1) throws JSONException {
        toMagicModuleMetaRepoModel.write(p0, "");
        Map<String, ? extends Object> mapIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
        List<JSONObject> listAudioAttributesCompatParcelizer = RendererCapabilitiesListener.AudioAttributesCompatParcelizer(p0);
        handleSetVideoOutput handlesetvideooutput = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(listAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(mapIconCompatParcelizer);
        JSONArray jSONArrayWrite = handlesetvideooutput.write(listAudioAttributesCompatParcelizer, mapIconCompatParcelizer, p1);
        if (jSONArrayWrite.length() > 0) {
            write(jSONArrayWrite);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.write.MediaMetadataCompat()) {
            return;
        }
        this.read.AudioAttributesCompatParcelizer("TAG_FEATURE_IN_APPS").read("InappController#showNotificationIfAvailable", new Callable() { // from class: o.lambdaupdateStateAndInformListeners44
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lambdaupdateStateAndInformListeners45.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        lambdaupdatestateandinformlisteners45.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer() {
        JSONObject jSONObject;
        try {
            if (!write()) {
                RendererWakeupListener.MediaMetadataCompat();
                return;
            }
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == write.write) {
                this.onAddQueueItem.IconCompatParcelizer(this.onCustomAction, "InApp Notifications are set to be suspended, not showing the InApp Notification");
                return;
            }
            if (read() || (jSONObject = this.AudioAttributesImplBaseParcelizer.read()) == null) {
                return;
            }
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != write.read) {
                AudioAttributesCompatParcelizer(jSONObject);
            } else {
                this.onAddQueueItem.IconCompatParcelizer(this.onCustomAction, "InApp Notifications are set to be discarded, dropping the InApp Notification");
            }
        } catch (Throwable unused) {
            this.onAddQueueItem.IconCompatParcelizer();
        }
    }

    private final void RemoteActionCompatParcelizer(JSONObject p0) {
        if (read(p0)) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer.read(p0);
        RemoteActionCompatParcelizer();
    }

    private final boolean AudioAttributesCompatParcelizer(Activity p0) {
        if (p0 == null) {
            return true;
        }
        String localClassName = p0.getLocalClassName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(localClassName, "");
        Iterator<String> it = this.handleMediaPlayPauseIfPendingOnHandler.iterator();
        while (it.hasNext()) {
            if (TestGroupLSModel.write((CharSequence) localClassName, (CharSequence) it.next(), false)) {
                return false;
            }
        }
        return true;
    }

    private final boolean write() {
        return AudioAttributesCompatParcelizer(copyWithPlaceholderTimeline.IconCompatParcelizer());
    }

    private final void read(final CTInAppNotification p0) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.myLooper(), Looper.getMainLooper())) {
            this.read.write().read("InAppController:displayNotification", new Callable() { // from class: o.lambdaupdateStateAndInformListeners47
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return lambdaupdateStateAndInformListeners45.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, p0);
                }
            });
            return;
        }
        if (p0.getOnPlayFromMediaId() && this.MediaDescriptionCompat.RemoteActionCompatParcelizer()) {
            this.onAddQueueItem.write(this.onCustomAction, "Not showing push permission request, permission is already granted");
            this.MediaDescriptionCompat.write();
            RemoteActionCompatParcelizer();
        } else {
            IconCompatParcelizer(p0);
            write(this.RemoteActionCompatParcelizer, p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, CTInAppNotification cTInAppNotification) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
        lambdaupdatestateandinformlisteners45.read(cTInAppNotification);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(CTInAppNotification p0) {
        String remoteActionCompatParcelizer;
        if (p0.getOnPrepareFromSearch() != null) {
            RendererWakeupListener rendererWakeupListener = this.onAddQueueItem;
            String str = this.onCustomAction;
            StringBuilder sb = new StringBuilder("Unable to process inapp notification ");
            sb.append(p0.getOnPrepareFromSearch());
            rendererWakeupListener.IconCompatParcelizer(str, sb.toString());
            return;
        }
        CustomTemplateInAppData onFastForward = p0.getOnFastForward();
        updateStateAndInformListeners updatestateandinformlisteners = (onFastForward == null || (remoteActionCompatParcelizer = onFastForward.getRemoteActionCompatParcelizer()) == null) ? null : this.MediaBrowserCompatMediaItem.read(remoteActionCompatParcelizer);
        RendererWakeupListener rendererWakeupListener2 = this.onAddQueueItem;
        String str2 = this.onCustomAction;
        StringBuilder sb2 = new StringBuilder("Notification ready: ");
        sb2.append(p0.onCustomAction());
        rendererWakeupListener2.IconCompatParcelizer(str2, sb2.toString());
        if (updatestateandinformlisteners != null && !updatestateandinformlisteners.getRead()) {
            MediaBrowserCompatItemReceiver(p0);
        } else {
            read(p0);
        }
    }

    private final void AudioAttributesCompatParcelizer(JSONObject p0) {
        this.onAddQueueItem.IconCompatParcelizer(this.onCustomAction, "Preparing In-App for display: ".concat(String.valueOf(p0)));
        this.MediaBrowserCompatSearchResultReceiver.read(p0, "InappController#prepareNotificationForDisplay", new IconCompatParcelizer());
    }

    final /* synthetic */ class IconCompatParcelizer implements lambdaupdateStateAndInformListeners52.read, MagicModuleRepositoryImplExternalSyntheticLambda3 {
        @Override // o.lambdaupdateStateAndInformListeners52.read
        public final void RemoteActionCompatParcelizer(CTInAppNotification cTInAppNotification) {
            toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
            lambdaupdateStateAndInformListeners45.this.write(cTInAppNotification);
        }

        IconCompatParcelizer() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lambdaupdateStateAndInformListeners52.read) && (obj instanceof MagicModuleRepositoryImplExternalSyntheticLambda3)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(read(), ((MagicModuleRepositoryImplExternalSyntheticLambda3) obj).read());
            }
            return false;
        }

        @Override // kotlin.MagicModuleRepositoryImplExternalSyntheticLambda3
        public final setRenewGrpId<?> read() {
            return new MagicModuleRepositoryImpl_Factory(1, lambdaupdateStateAndInformListeners45.this, lambdaupdateStateAndInformListeners45.class, "notificationReady", "notificationReady(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", 0);
        }

        public final int hashCode() {
            return read().hashCode();
        }
    }

    private final Set<String> write(RendererState p0) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String strAudioAttributesImplApi21Parcelizer = p0.AudioAttributesImplApi21Parcelizer();
        if (strAudioAttributesImplApi21Parcelizer != null) {
            Iterator it = TestGroupLSModel.write(strAudioAttributesImplApi21Parcelizer, new String[]{","}, 0, 6).iterator();
            while (it.hasNext()) {
                String string = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) it.next()).toString();
                if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) string)) {
                    linkedHashSet.add(string);
                }
            }
        }
        RendererWakeupListener rendererWakeupListener = this.onAddQueueItem;
        String str = this.onCustomAction;
        StringBuilder sb = new StringBuilder("In-app notifications will not be shown on ");
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(linkedHashSet, null, null, null, 0, null, null, 63));
        rendererWakeupListener.IconCompatParcelizer(str, sb.toString());
        return linkedHashSet;
    }

    private final boolean read() {
        RendererWakeupListener.RatingCompat();
        List<CTInAppNotification> list = write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
        synchronized (list) {
            if (list.isEmpty()) {
                return false;
            }
            CTInAppNotification cTInAppNotificationRemove = list.remove(0);
            toMagicModuleMetaRepoModel.write(cTInAppNotificationRemove);
            IconCompatParcelizer(cTInAppNotificationRemove);
            return true;
        }
    }

    private final void AudioAttributesCompatParcelizer(CTInAppNotification p0) {
        RendererWakeupListener.RatingCompat();
        if (read != null) {
            CTInAppNotification cTInAppNotification = read;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) (cTInAppNotification != null ? cTInAppNotification.getRead() : null), (Object) p0.getRead())) {
                read = null;
                read();
            }
        }
    }

    private final void write(final Context p0, CTInAppNotification p1) {
        if (p1.getHandleMediaPlayPauseIfPendingOnHandler()) {
            this.MediaBrowserCompatItemReceiver.onPlay();
            this.read.IconCompatParcelizer().read("InAppController#incrementLocalInAppCountInPersistentStore", new Callable() { // from class: o.lambdaupdateStateAndInformListeners42
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return lambdaupdateStateAndInformListeners45.read(p0, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Context context, lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        RendererCapabilitiesFormatSupport.read(context, "local_in_app_count", lambdaupdatestateandinformlisteners45.MediaBrowserCompatItemReceiver.MediaMetadataCompat());
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(final CTInAppNotification p0) {
        isTrackSupported istracksupportedIconCompatParcelizer = this.read.IconCompatParcelizer();
        istracksupportedIconCompatParcelizer.RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0() { // from class: o.lambdaupdateStateAndInformListeners43
            @Override // kotlin.TracksGroupExternalSyntheticLambda0
            public final void read(Object obj) {
                lambdaupdateStateAndInformListeners45.RemoteActionCompatParcelizer(this.read, p0, (Boolean) obj);
            }
        });
        istracksupportedIconCompatParcelizer.read("checkLimitsBeforeShowing", new Callable() { // from class: o.lambdaupdateStateAndInformListeners48
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lambdaupdateStateAndInformListeners45.read(this.read, p0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, CTInAppNotification cTInAppNotification, Boolean bool) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
        if (bool.booleanValue()) {
            lambdaupdatestateandinformlisteners45.AudioAttributesImplApi21Parcelizer(cTInAppNotification);
        } else {
            lambdaupdatestateandinformlisteners45.RemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean read(final lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, CTInAppNotification cTInAppNotification) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
        Rfont rfontMediaBrowserCompatItemReceiver = lambdaupdatestateandinformlisteners45.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        Boolean bool = Boolean.FALSE;
        if (rfontMediaBrowserCompatItemReceiver != null) {
            if (!rfontMediaBrowserCompatItemReceiver.write(cTInAppNotification, new MagicModuleSubmissionRequestBody() { // from class: o.lambdaupdateStateAndInformListeners51
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(lambdaupdateStateAndInformListeners45.RemoteActionCompatParcelizer(this.write, (JSONObject) obj, (String) obj2));
                }
            })) {
                RendererWakeupListener rendererWakeupListener = lambdaupdatestateandinformlisteners45.onAddQueueItem;
                String str = lambdaupdatestateandinformlisteners45.onCustomAction;
                StringBuilder sb = new StringBuilder("InApp has been rejected by FC, not showing ");
                sb.append(cTInAppNotification.getRead());
                rendererWakeupListener.write(str, sb.toString());
                return bool;
            }
            return Boolean.TRUE;
        }
        RendererWakeupListener rendererWakeupListener2 = lambdaupdatestateandinformlisteners45.onAddQueueItem;
        String str2 = lambdaupdatestateandinformlisteners45.onCustomAction;
        StringBuilder sb2 = new StringBuilder("InAppFCManager() is null, not showing ");
        sb2.append(cTInAppNotification.getRead());
        rendererWakeupListener2.write(str2, sb2.toString());
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, JSONObject jSONObject, String str) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        invalidateState.Companion iconCompatParcelizer = invalidateState.INSTANCE;
        return !lambdaupdatestateandinformlisteners45.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(invalidateState.Companion.write(jSONObject), str);
    }

    private final boolean RemoteActionCompatParcelizer(CTInAppNotification p0) {
        HashMap<String, Object> map;
        RatingExternalSyntheticLambda0 ratingExternalSyntheticLambda0MediaBrowserCompatCustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        if (ratingExternalSyntheticLambda0MediaBrowserCompatCustomActionResultReceiver == null) {
            return true;
        }
        if (p0.getOnPlayFromSearch() != null) {
            map = RendererCapabilitiesListener.write(p0.getOnPlayFromSearch());
        } else {
            map = new HashMap<>();
        }
        return ratingExternalSyntheticLambda0MediaBrowserCompatCustomActionResultReceiver.read();
    }

    private final void AudioAttributesImplApi21Parcelizer(CTInAppNotification p0) {
        SimpleBasePlayerExternalSyntheticLambda24 simpleBasePlayerExternalSyntheticLambda24;
        Activity activityIconCompatParcelizer = copyWithPlaceholderTimeline.IconCompatParcelizer();
        if (!RemoteActionCompatParcelizer(p0)) {
            RendererWakeupListener rendererWakeupListener = this.onAddQueueItem;
            String str = this.onCustomAction;
            StringBuilder sb = new StringBuilder("Application has decided to not show this in-app notification: ");
            sb.append(p0.getRead());
            rendererWakeupListener.write(str, sb.toString());
            RemoteActionCompatParcelizer();
            return;
        }
        RendererWakeupListener.RatingCompat();
        if (!copyWithPlaceholderTimeline.AudioAttributesImplBaseParcelizer()) {
            write.add(p0);
            RendererWakeupListener.RatingCompat();
            return;
        }
        if (read != null) {
            write.add(p0);
            RendererWakeupListener.RatingCompat();
            return;
        }
        if (!AudioAttributesCompatParcelizer(activityIconCompatParcelizer)) {
            write.add(p0);
            RendererWakeupListener.RatingCompat();
            return;
        }
        if (this.RatingCompat.AudioAttributesCompatParcelizer() / 1000 > p0.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "custom-html", (Object) p0.getOnPause())) {
            getVolumeFromManager.Companion writeVar = getVolumeFromManager.INSTANCE;
            if (!getVolumeFromManager.Companion.write(this.RemoteActionCompatParcelizer)) {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                RemoteActionCompatParcelizer();
                return;
            }
        }
        read = p0;
        lambdaupdateStateAndInformListeners41 write2 = p0.getWrite();
        switch (write2 == null ? -1 : AudioAttributesCompatParcelizer.write[write2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                try {
                    if (activityIconCompatParcelizer == null) {
                        throw new IllegalStateException("Current activity reference not found");
                    }
                    Objects.toString(p0.onCustomAction());
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    Rstyle.RemoteActionCompatParcelizer(activityIconCompatParcelizer, p0, this.write);
                    simpleBasePlayerExternalSyntheticLambda24 = null;
                } catch (Throwable unused) {
                    RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    read = null;
                    return;
                }
                break;
            case 11:
                simpleBasePlayerExternalSyntheticLambda24 = new SimpleBasePlayerExternalSyntheticLambda24();
                break;
            case 12:
                simpleBasePlayerExternalSyntheticLambda24 = new SimpleBasePlayerExternalSyntheticLambda29();
                break;
            case 13:
                simpleBasePlayerExternalSyntheticLambda24 = new SimpleBasePlayerExternalSyntheticLambda37();
                break;
            case 14:
                simpleBasePlayerExternalSyntheticLambda24 = new SimpleBasePlayerExternalSyntheticLambda5();
                break;
            case 15:
                MediaBrowserCompatItemReceiver(p0);
                return;
            default:
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                read = null;
                return;
        }
        if (simpleBasePlayerExternalSyntheticLambda24 != null) {
            Objects.toString(p0.onCustomAction());
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            SimpleBasePlayerExternalSyntheticLambda14.Companion companion = SimpleBasePlayerExternalSyntheticLambda14.INSTANCE;
            toMagicModuleMetaRepoModel.write(activityIconCompatParcelizer);
            CleverTapInstanceConfig cleverTapInstanceConfig = this.write;
            String str2 = this.onCustomAction;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            if (SimpleBasePlayerExternalSyntheticLambda14.Companion.write(simpleBasePlayerExternalSyntheticLambda24, activityIconCompatParcelizer, p0, cleverTapInstanceConfig, str2)) {
                return;
            }
            read = null;
        }
    }

    private final void MediaBrowserCompatItemReceiver(CTInAppNotification p0) {
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(p0, this, SimpleBasePlayerExternalSyntheticLambda6.INSTANCE.read(this.RemoteActionCompatParcelizer, this.onAddQueueItem));
    }

    private final JSONArray RemoteActionCompatParcelizer(JSONArray p0) {
        return onSeekStarted.write(p0, (getAnswerMap<? super JSONObject, Boolean>) new getAnswerMap() { // from class: o.lambdaupdateStateAndInformListeners50
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(lambdaupdateStateAndInformListeners45.read(this.RemoteActionCompatParcelizer, (JSONObject) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        return !lambdaupdatestateandinformlisteners45.read(jSONObject);
    }

    private final boolean read(JSONObject p0) {
        CustomTemplateInAppData.Companion companion = CustomTemplateInAppData.INSTANCE;
        CustomTemplateInAppData customTemplateInAppDataIconCompatParcelizer = CustomTemplateInAppData.Companion.IconCompatParcelizer(p0);
        String remoteActionCompatParcelizer = customTemplateInAppDataIconCompatParcelizer != null ? customTemplateInAppDataIconCompatParcelizer.getRemoteActionCompatParcelizer() : null;
        boolean z = (remoteActionCompatParcelizer == null || this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer)) ? false : true;
        if (z) {
            this.onAddQueueItem.AudioAttributesCompatParcelizer();
        }
        return z;
    }

    private final void write(CTInAppNotification p0, CustomTemplateInAppData p1) {
        String remoteActionCompatParcelizer = p1 != null ? p1.getRemoteActionCompatParcelizer() : null;
        if (remoteActionCompatParcelizer != null) {
            updateStateAndInformListeners updatestateandinformlisteners = this.MediaBrowserCompatMediaItem.read(remoteActionCompatParcelizer);
            if (updatestateandinformlisteners != null) {
                CustomTemplateInAppData customTemplateInAppDataRemoteActionCompatParcelizer = p1.RemoteActionCompatParcelizer();
                customTemplateInAppDataRemoteActionCompatParcelizer.IconCompatParcelizer();
                CTInAppNotification cTInAppNotificationWrite = p0.write(customTemplateInAppDataRemoteActionCompatParcelizer);
                if (cTInAppNotificationWrite == null) {
                    RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
                    return;
                } else if (updatestateandinformlisteners.getRead()) {
                    RemoteActionCompatParcelizer(cTInAppNotificationWrite.onCustomAction());
                    return;
                } else {
                    AudioAttributesCompatParcelizer(cTInAppNotificationWrite.onCustomAction());
                    return;
                }
            }
            RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
    }
}
