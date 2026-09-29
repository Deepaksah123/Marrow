package com.clevertap.android.sdk.inapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.PlayerPlaybackSuppressionReason;
import kotlin.RendererWakeupListener;
import kotlin.isHdPlaybackError;
import kotlin.lambdaupdateStateAndInformListeners38;
import kotlin.lambdaupdateStateAndInformListeners41;
import kotlin.onSeekStarted;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ-\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001e2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001fH\u0002¢\u0006\u0004\b\u001c\u0010!J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001a\u0010\"R(\u0010\u0013\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010\u001c\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u0013\u0010&R(\u0010\u0016\u001a\u0004\u0018\u00010(2\b\u0010\u0003\u001a\u0004\u0018\u00010(8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0011R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0011\u00105\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b3\u00104R\"\u00101\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R$\u00108\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b#\u0010\fR\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020:0=8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010>R$\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\bA\u0010\u0011R$\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u0010\u0011R(\u0010F\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bD\u0010$\u001a\u0004\bE\u0010&R(\u0010'\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\bG\u0010&R$\u0010M\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020H8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bN\u00107\u001a\u0004\b-\u0010\fR$\u00103\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bO\u0010\fR$\u0010G\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bO\u0010.\u001a\u0004\bN\u0010\u0011R$\u0010P\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bM\u0010.\u001a\u0004\b<\u0010\u0011R$\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\bD\u0010\u0011R(\u0010-\u001a\u0004\u0018\u00010\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u00158\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b?\u0010Q\u001a\u0004\b8\u0010RR(\u0010T\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bS\u0010$\u001a\u0004\b@\u0010&R$\u0010E\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b\u0016\u0010&R$\u0010K\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\b\u001c\u0010\fR(\u0010@\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b1\u00104R(\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b5\u0010&R$\u0010B\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bE\u0010.\u001a\u0004\bU\u0010\u0011R$\u0010W\u001a\u0004\u0018\u00010\u001e8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bF\u0010$\u001a\u0004\b2\u0010&\"\u0004\b\u0013\u0010VR$\u0010O\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\b?\u0010\fR$\u0010A\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b'\u0010\fR$\u0010U\u001a\u00020X2\u0006\u0010\u0003\u001a\u00020X8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b5\u0010Y\u001a\u0004\b\u001a\u0010ZR$\u0010[\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bT\u0010.\u001a\u0004\b6\u0010\u0011R(\u0010/\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bP\u0010$\u001a\u0004\bF\u0010&R$\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b[\u0010.\u001a\u0004\b\\\u0010\u0011R$\u0010I\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bK\u0010.\u001a\u0004\b[\u0010\u0011R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0012098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00120=8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010>R$\u0010\\\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bU\u0010$\u001a\u0004\bM\u0010&R$\u0010C\u001a\u00020]2\u0006\u0010\u0003\u001a\u00020]8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b/\u0010^\u001a\u0004\b)\u0010_R$\u0010`\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bW\u0010.\u001a\u0004\bI\u0010\u0011R$\u0010a\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\\\u0010$\u001a\u0004\bT\u0010&R\u001e\u0010b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R$\u0010c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\ba\u00107\u001a\u0004\bW\u0010\fR$\u0010S\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bc\u00107\u001a\u0004\bB\u0010\f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "p0", "", "p1", "<init>", "(Lorg/json/JSONObject;Z)V", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "onPrepareFromMediaId", "()Z", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "RemoteActionCompatParcelizer", "(I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "write", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "IconCompatParcelizer", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V", "AudioAttributesCompatParcelizer", "(Lorg/json/JSONObject;)V", "read", "Landroid/os/Bundle;", "", "Lo/isHdPlaybackError;", "p2", "(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z", "(Landroid/os/Bundle;)Z", "onCommand", "Ljava/lang/String;", "MediaDescriptionCompat", "()Ljava/lang/String;", "RatingCompat", "Lo/lambdaupdateStateAndInformListeners41;", "onPlayFromMediaId", "Lo/lambdaupdateStateAndInformListeners41;", "MediaBrowserCompatMediaItem", "()Lo/lambdaupdateStateAndInformListeners41;", "onFastForward", "Z", "onSeekTo", "Lorg/json/JSONObject;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "onCustomAction", "()Lorg/json/JSONObject;", "AudioAttributesImplBaseParcelizer", "onPrepareFromUri", "I", "MediaBrowserCompatItemReceiver", "Ljava/util/ArrayList;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "Ljava/util/ArrayList;", "AudioAttributesImplApi21Parcelizer", "", "()Ljava/util/List;", "MediaBrowserCompatSearchResultReceiver", "onPlayFromSearch", "onRemoveQueueItem", "onPlayFromUri", "onSetRepeatMode", "onSetShuffleMode", "onPlay", "MediaMetadataCompat", "handleMediaPlayPauseIfPendingOnHandler", "", "onSetCaptioningEnabled", "J", "onMediaButtonEvent", "()J", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onSetPlaybackSpeed", "onPrepare", "onAddQueueItem", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "setSessionImpl", "onPause", "onRemoveQueueItemAt", "(Ljava/lang/String;)V", "onPrepareFromSearch", "", "D", "()D", "onRewind", "onSetRating", "", "C", "()C", "onSkipToPrevious", "onSkipToQueueItem", "onSkipToNext", "onStop"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CTInAppNotification implements Parcelable {
    private JSONObject AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private ArrayList<CTInAppNotificationMedia> onSetShuffleMode;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String onPlay;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private double onRemoveQueueItemAt;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private JSONObject AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int onMediaButtonEvent;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private String onPrepareFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private CustomTemplateInAppData onFastForward;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private boolean onAddQueueItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private JSONObject onPlayFromSearch;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private String onPrepareFromSearch;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public boolean onSkipToNext;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int onPrepare;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private String onSeekTo;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private int onRemoveQueueItem;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private boolean onSetCaptioningEnabled;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private boolean onRewind;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private boolean onPlayFromUri;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private lambdaupdateStateAndInformListeners41 write;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private boolean onPlayFromMediaId;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private boolean onSkipToPrevious;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private String RatingCompat;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private String onSetRating;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private boolean onPrepareFromUri;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private char onSetRepeatMode;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private int onCommand;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private String onSkipToQueueItem;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private int onCustomAction;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private String MediaMetadataCompat;

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private int onStop;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private int setSessionImpl;

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private String onPause;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private ArrayList<CTInAppNotificationButton> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CTInAppNotification> CREATOR = new RemoteActionCompatParcelizer();

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[lambdaupdateStateAndInformListeners41.values().length];
            try {
                iArr[lambdaupdateStateAndInformListeners41.AudioAttributesImplBaseParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners41.MediaBrowserCompatMediaItem.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners41.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners41.MediaBrowserCompatItemReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners41.read.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners41.MediaBrowserCompatSearchResultReceiver.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[lambdaupdateStateAndInformListeners41.handleMediaPlayPauseIfPendingOnHandler.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            write = iArr;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final lambdaupdateStateAndInformListeners41 getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: onSeekTo, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final JSONObject onCustomAction() {
        return PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<CTInAppNotificationButton> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from getter */
    public final boolean getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final String getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final long getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from getter */
    public final boolean getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final CustomTemplateInAppData getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final String getOnPause() {
        return this.onPause;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final JSONObject getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getOnPrepareFromMediaId() {
        return this.onPrepareFromMediaId;
    }

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
    public final boolean getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.onPrepareFromSearch = str;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final int getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getOnRemoveQueueItem() {
        return this.onRemoveQueueItem;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final double getOnRemoveQueueItemAt() {
        return this.onRemoveQueueItemAt;
    }

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from getter */
    public final boolean getOnRewind() {
        return this.onRewind;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getOnSeekTo() {
        return this.onSeekTo;
    }

    /* JADX INFO: renamed from: onSetRating, reason: from getter */
    public final boolean getOnPrepareFromUri() {
        return this.onPrepareFromUri;
    }

    /* JADX INFO: renamed from: onRewind, reason: from getter */
    public final boolean getOnSetCaptioningEnabled() {
        return this.onSetCaptioningEnabled;
    }

    public final List<CTInAppNotificationMedia> onAddQueueItem() {
        return this.onSetShuffleMode;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final String getOnSetRating() {
        return this.onSetRating;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final char getOnSetRepeatMode() {
        return this.onSetRepeatMode;
    }

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from getter */
    public final boolean getOnSkipToPrevious() {
        return this.onSkipToPrevious;
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final String getOnSkipToQueueItem() {
        return this.onSkipToQueueItem;
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final int getOnStop() {
        return this.onStop;
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final int getSetSessionImpl() {
        return this.setSessionImpl;
    }

    public CTInAppNotification(JSONObject jSONObject, boolean z) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        this.onPlay = "#FFFFFF";
        this.onRemoveQueueItemAt = -1.0d;
        this.onSetShuffleMode = new ArrayList<>();
        this.onSetRating = "#000000";
        this.onSkipToQueueItem = "#000000";
        this.onSkipToNext = z;
        this.AudioAttributesImplApi26Parcelizer = jSONObject;
        try {
            String strWrite = onSeekStarted.write(jSONObject, "type");
            this.onPause = strWrite;
            if (strWrite != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) "custom-html")) {
                AudioAttributesCompatParcelizer(jSONObject);
                return;
            }
            read(jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Invalid JSON: ");
            sb.append(e.getLocalizedMessage());
            this.onPrepareFromSearch = sb.toString();
        }
    }

    private CTInAppNotification(Parcel parcel) {
        JSONObject jSONObject;
        this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        this.onPlay = "#FFFFFF";
        this.onRemoveQueueItemAt = -1.0d;
        this.onSetShuffleMode = new ArrayList<>();
        this.onSetRating = "#000000";
        this.onSkipToQueueItem = "#000000";
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        Object value = parcel.readValue(lambdaupdateStateAndInformListeners41.class.getClassLoader());
        JSONObject jSONObject2 = null;
        this.write = value instanceof lambdaupdateStateAndInformListeners41 ? (lambdaupdateStateAndInformListeners41) value : null;
        this.onSeekTo = parcel.readString();
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.onSkipToPrevious = parcel.readByte() != 0;
        this.onPlayFromUri = parcel.readByte() != 0;
        this.MediaBrowserCompatItemReceiver = parcel.readInt();
        this.onCustomAction = parcel.readInt();
        this.onCommand = parcel.readInt();
        this.onSetRepeatMode = (char) parcel.readInt();
        this.onPrepare = parcel.readInt();
        this.onRemoveQueueItem = parcel.readInt();
        this.onStop = parcel.readInt();
        this.setSessionImpl = parcel.readInt();
        String string = parcel.readString();
        this.AudioAttributesImplApi26Parcelizer = new JSONObject(string == null ? "{}" : string);
        this.onPrepareFromSearch = parcel.readString();
        if (parcel.readByte() == 0) {
            jSONObject = null;
        } else {
            String string2 = parcel.readString();
            jSONObject = new JSONObject(string2 == null ? "{}" : string2);
        }
        this.onPlayFromSearch = jSONObject;
        if (parcel.readByte() != 0) {
            String string3 = parcel.readString();
            jSONObject2 = new JSONObject(string3 != null ? string3 : "{}");
        }
        this.AudioAttributesCompatParcelizer = jSONObject2;
        this.onPause = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        String string4 = parcel.readString();
        this.onSkipToQueueItem = string4 == null ? this.onSkipToQueueItem : string4;
        String string5 = parcel.readString();
        this.onPlay = string5 == null ? this.onPlay : string5;
        this.RatingCompat = parcel.readString();
        String string6 = parcel.readString();
        this.onSetRating = string6 == null ? this.onSetRating : string6;
        try {
            ArrayList<CTInAppNotificationButton> arrayListCreateTypedArrayList = parcel.createTypedArrayList(CTInAppNotificationButton.CREATOR);
            this.AudioAttributesImplApi21Parcelizer = arrayListCreateTypedArrayList == null ? new ArrayList<>() : arrayListCreateTypedArrayList;
        } catch (Throwable unused) {
        }
        try {
            ArrayList<CTInAppNotificationMedia> arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(CTInAppNotificationMedia.CREATOR);
            this.onSetShuffleMode = arrayListCreateTypedArrayList2 == null ? new ArrayList<>() : arrayListCreateTypedArrayList2;
        } catch (Throwable unused2) {
        }
        this.onRewind = parcel.readByte() != 0;
        this.onMediaButtonEvent = parcel.readInt();
        this.onPrepareFromUri = parcel.readByte() != 0;
        this.onPrepareFromMediaId = parcel.readString();
        this.onSetCaptioningEnabled = parcel.readByte() != 0;
        this.MediaBrowserCompatMediaItem = parcel.readByte() != 0;
        this.MediaDescriptionCompat = parcel.readByte() != 0;
        this.handleMediaPlayPauseIfPendingOnHandler = parcel.readByte() != 0;
        this.onAddQueueItem = parcel.readByte() != 0;
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readString();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = parcel.readLong();
        this.onFastForward = (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader());
        this.onRemoveQueueItemAt = parcel.readDouble();
        this.onPlayFromMediaId = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.read);
        p0.writeValue(this.write);
        p0.writeString(this.onSeekTo);
        p0.writeByte(this.IconCompatParcelizer ? (byte) 1 : (byte) 0);
        p0.writeByte(this.onSkipToPrevious ? (byte) 1 : (byte) 0);
        p0.writeByte(this.onPlayFromUri ? (byte) 1 : (byte) 0);
        p0.writeInt(this.MediaBrowserCompatItemReceiver);
        p0.writeInt(this.onCustomAction);
        p0.writeInt(this.onCommand);
        p0.writeInt(this.onSetRepeatMode);
        p0.writeInt(this.onPrepare);
        p0.writeInt(this.onRemoveQueueItem);
        p0.writeInt(this.onStop);
        p0.writeInt(this.setSessionImpl);
        p0.writeString(this.AudioAttributesImplApi26Parcelizer.toString());
        p0.writeString(this.onPrepareFromSearch);
        if (this.onPlayFromSearch == null) {
            p0.writeByte((byte) 0);
        } else {
            p0.writeByte((byte) 1);
            p0.writeString(String.valueOf(this.onPlayFromSearch));
        }
        if (this.AudioAttributesCompatParcelizer == null) {
            p0.writeByte((byte) 0);
        } else {
            p0.writeByte((byte) 1);
            p0.writeString(String.valueOf(this.AudioAttributesCompatParcelizer));
        }
        p0.writeString(this.onPause);
        p0.writeString(this.MediaMetadataCompat);
        p0.writeString(this.onSkipToQueueItem);
        p0.writeString(this.onPlay);
        p0.writeString(this.RatingCompat);
        p0.writeString(this.onSetRating);
        p0.writeTypedList(this.AudioAttributesImplApi21Parcelizer);
        p0.writeTypedList(this.onSetShuffleMode);
        p0.writeByte(this.onRewind ? (byte) 1 : (byte) 0);
        p0.writeInt(this.onMediaButtonEvent);
        p0.writeByte(this.onPrepareFromUri ? (byte) 1 : (byte) 0);
        p0.writeString(this.onPrepareFromMediaId);
        p0.writeByte(this.onSetCaptioningEnabled ? (byte) 1 : (byte) 0);
        p0.writeByte(this.MediaBrowserCompatMediaItem ? (byte) 1 : (byte) 0);
        p0.writeByte(this.MediaDescriptionCompat ? (byte) 1 : (byte) 0);
        p0.writeByte(this.handleMediaPlayPauseIfPendingOnHandler ? (byte) 1 : (byte) 0);
        p0.writeByte(this.onAddQueueItem ? (byte) 1 : (byte) 0);
        p0.writeString(this.MediaBrowserCompatCustomActionResultReceiver);
        p0.writeLong(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        p0.writeParcelable(this.onFastForward, p1);
        p0.writeDouble(this.onRemoveQueueItemAt);
        p0.writeByte(this.onPlayFromMediaId ? (byte) 1 : (byte) 0);
    }

    public final boolean onPrepareFromMediaId() {
        return !this.onSetShuffleMode.isEmpty() && this.onSetShuffleMode.get(0).MediaBrowserCompatCustomActionResultReceiver();
    }

    public final CTInAppNotificationMedia RemoteActionCompatParcelizer(int p0) {
        Iterator<CTInAppNotificationMedia> it = this.onSetShuffleMode.iterator();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
        while (it.hasNext()) {
            CTInAppNotificationMedia next = it.next();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
            CTInAppNotificationMedia cTInAppNotificationMedia = next;
            if (p0 == cTInAppNotificationMedia.getAudioAttributesCompatParcelizer()) {
                return cTInAppNotificationMedia;
            }
        }
        return null;
    }

    public final CTInAppNotification write(CustomTemplateInAppData p0) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ti", this.RemoteActionCompatParcelizer);
            jSONObject.put("wzrk_id", this.read);
            jSONObject.put("type", lambdaupdateStateAndInformListeners38.write.toString());
            jSONObject.put("efc", 1);
            jSONObject.put("excludeGlobalFCaps", 1);
            jSONObject.put("wzrk_ttl", this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (this.AudioAttributesImplApi26Parcelizer.has("wzrk_pivot")) {
                jSONObject.put("wzrk_pivot", this.AudioAttributesImplApi26Parcelizer.optString("wzrk_pivot"));
            }
            if (this.AudioAttributesImplApi26Parcelizer.has("wzrk_cgId")) {
                jSONObject.put("wzrk_cgId", this.AudioAttributesImplApi26Parcelizer.optString("wzrk_cgId"));
            }
            CTInAppNotification cTInAppNotification = new CTInAppNotification(jSONObject, this.onSkipToNext);
            cTInAppNotification.IconCompatParcelizer(p0);
            return cTInAppNotification;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void IconCompatParcelizer(CustomTemplateInAppData p0) throws JSONException {
        this.onFastForward = p0;
        if (p0 != null) {
            p0.write(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    private final void AudioAttributesCompatParcelizer(JSONObject p0) {
        try {
            this.RemoteActionCompatParcelizer = p0.optString("ti", "");
            this.read = p0.optString("wzrk_id", "");
            this.onPause = p0.getString("type");
            this.handleMediaPlayPauseIfPendingOnHandler = p0.optBoolean("isLocalInApp", false);
            this.onAddQueueItem = p0.optBoolean("fallbackToNotificationSettings", false);
            int i = -1;
            this.IconCompatParcelizer = p0.optInt("efc", -1) == 1 || p0.optInt("excludeGlobalFCaps", -1) == 1;
            this.onCustomAction = p0.optInt("tlc", -1);
            this.onCommand = p0.optInt("tdc", -1);
            this.MediaBrowserCompatItemReceiver = p0.optInt("mdc", -1);
            lambdaupdateStateAndInformListeners41.Companion companion = lambdaupdateStateAndInformListeners41.INSTANCE;
            this.write = lambdaupdateStateAndInformListeners41.Companion.AudioAttributesCompatParcelizer(this.onPause);
            this.onPrepareFromUri = p0.optBoolean("tablet", false);
            this.onPlay = p0.optString("bg", this.onPlay);
            this.MediaBrowserCompatMediaItem = !p0.has("hasPortrait") || p0.getBoolean("hasPortrait");
            this.MediaDescriptionCompat = p0.optBoolean("hasLandscape", false);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p0.optLong("wzrk_ttl", Companion.RemoteActionCompatParcelizer());
            JSONObject jSONObjectOptJSONObject = p0.optJSONObject("title");
            if (jSONObjectOptJSONObject != null) {
                this.MediaMetadataCompat = jSONObjectOptJSONObject.optString("text", "");
                this.onSkipToQueueItem = jSONObjectOptJSONObject.optString(TtmlNode.ATTR_TTS_COLOR, this.onSkipToQueueItem);
            }
            JSONObject jSONObjectOptJSONObject2 = p0.optJSONObject("message");
            if (jSONObjectOptJSONObject2 != null) {
                this.RatingCompat = jSONObjectOptJSONObject2.optString("text", "");
                this.onSetRating = jSONObjectOptJSONObject2.optString(TtmlNode.ATTR_TTS_COLOR, this.onSetRating);
            }
            this.onRewind = p0.optBoolean("close", false);
            JSONObject jSONObjectOptJSONObject3 = p0.optJSONObject("media");
            if (jSONObjectOptJSONObject3 != null) {
                CTInAppNotificationMedia.Companion writeVar = CTInAppNotificationMedia.INSTANCE;
                CTInAppNotificationMedia cTInAppNotificationMediaIconCompatParcelizer = CTInAppNotificationMedia.Companion.IconCompatParcelizer(jSONObjectOptJSONObject3, 1);
                if (cTInAppNotificationMediaIconCompatParcelizer != null) {
                    this.onSetShuffleMode.add(cTInAppNotificationMediaIconCompatParcelizer);
                }
            }
            JSONObject jSONObjectOptJSONObject4 = p0.optJSONObject("mediaLandscape");
            if (jSONObjectOptJSONObject4 != null) {
                CTInAppNotificationMedia.Companion writeVar2 = CTInAppNotificationMedia.INSTANCE;
                CTInAppNotificationMedia cTInAppNotificationMediaIconCompatParcelizer2 = CTInAppNotificationMedia.Companion.IconCompatParcelizer(jSONObjectOptJSONObject4, 2);
                if (cTInAppNotificationMediaIconCompatParcelizer2 != null) {
                    this.onSetShuffleMode.add(cTInAppNotificationMediaIconCompatParcelizer2);
                }
            }
            JSONArray jSONArrayOptJSONArray = p0.optJSONArray("buttons");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject5 != null) {
                        this.AudioAttributesImplApi21Parcelizer.add(new CTInAppNotificationButton(jSONObjectOptJSONObject5));
                        this.onMediaButtonEvent++;
                    }
                }
            }
            this.onPlayFromMediaId = p0.optBoolean("rfp", false);
            CustomTemplateInAppData.Companion companion2 = CustomTemplateInAppData.INSTANCE;
            this.onFastForward = CustomTemplateInAppData.Companion.IconCompatParcelizer(p0);
            lambdaupdateStateAndInformListeners41 lambdaupdatestateandinformlisteners41 = this.write;
            if (lambdaupdatestateandinformlisteners41 != null) {
                i = AudioAttributesCompatParcelizer.write[lambdaupdatestateandinformlisteners41.ordinal()];
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    Iterator<CTInAppNotificationMedia> it = this.onSetShuffleMode.iterator();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
                    while (it.hasNext()) {
                        CTInAppNotificationMedia next = it.next();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                        CTInAppNotificationMedia cTInAppNotificationMedia = next;
                        if (cTInAppNotificationMedia.AudioAttributesCompatParcelizer() || cTInAppNotificationMedia.read() || cTInAppNotificationMedia.AudioAttributesImplBaseParcelizer()) {
                            cTInAppNotificationMedia.write("");
                            RendererWakeupListener.MediaBrowserCompatItemReceiver();
                        }
                    }
                    break;
                case 5:
                case 6:
                case 7:
                    if (!this.onSetShuffleMode.isEmpty()) {
                        Iterator<CTInAppNotificationMedia> it2 = this.onSetShuffleMode.iterator();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it2, "");
                        while (it2.hasNext()) {
                            CTInAppNotificationMedia next2 = it2.next();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next2, "");
                            CTInAppNotificationMedia cTInAppNotificationMedia2 = next2;
                            if (cTInAppNotificationMedia2.AudioAttributesCompatParcelizer() || cTInAppNotificationMedia2.read() || cTInAppNotificationMedia2.AudioAttributesImplBaseParcelizer() || !cTInAppNotificationMedia2.AudioAttributesImplApi21Parcelizer()) {
                                this.onPrepareFromSearch = "Wrong media type for template";
                                break;
                            }
                        }
                    } else {
                        this.onPrepareFromSearch = "No media type for template";
                    }
                    break;
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Invalid JSON: ");
            sb.append(e.getLocalizedMessage());
            this.onPrepareFromSearch = sb.toString();
        }
    }

    private final void read(JSONObject p0) {
        JSONObject jSONObject;
        if (!AudioAttributesCompatParcelizer(INSTANCE.AudioAttributesCompatParcelizer(p0))) {
            this.onPrepareFromSearch = "Invalid JSON";
            return;
        }
        try {
            this.RemoteActionCompatParcelizer = p0.optString("ti", "");
            this.read = p0.optString("wzrk_id", "");
            boolean z = true;
            if (p0.optInt("efc", -1) != 1 && p0.optInt("excludeGlobalFCaps", -1) != 1) {
                z = false;
            }
            this.IconCompatParcelizer = z;
            this.onCustomAction = p0.optInt("tlc", -1);
            this.onCommand = p0.optInt("tdc", -1);
            this.onSetCaptioningEnabled = p0.optBoolean("isJsEnabled", false);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p0.optLong("wzrk_ttl", Companion.RemoteActionCompatParcelizer());
            this.onPlayFromMediaId = p0.optBoolean("rfp", false);
            JSONObject jSONObjectOptJSONObject = p0.optJSONObject("d");
            if (jSONObjectOptJSONObject != null) {
                this.onSeekTo = jSONObjectOptJSONObject.getString("html");
                this.onPrepareFromMediaId = jSONObjectOptJSONObject.optString("url", "");
                if (jSONObjectOptJSONObject.optJSONObject("kv") != null) {
                    jSONObject = jSONObjectOptJSONObject.getJSONObject("kv");
                } else {
                    jSONObject = new JSONObject();
                }
                this.onPlayFromSearch = jSONObject;
                JSONObject jSONObjectOptJSONObject2 = p0.optJSONObject("w");
                if (jSONObjectOptJSONObject2 != null) {
                    this.onPlayFromUri = jSONObjectOptJSONObject2.getBoolean("dk");
                    this.onSkipToPrevious = jSONObjectOptJSONObject2.getBoolean("sc");
                    this.onSetRepeatMode = jSONObjectOptJSONObject2.getString("pos").charAt(0);
                    this.onStop = jSONObjectOptJSONObject2.optInt("xdp", 0);
                    this.setSessionImpl = jSONObjectOptJSONObject2.optInt("xp", 0);
                    this.onPrepare = jSONObjectOptJSONObject2.optInt("ydp", 0);
                    this.onRemoveQueueItem = jSONObjectOptJSONObject2.optInt("yp", 0);
                    this.MediaBrowserCompatItemReceiver = jSONObjectOptJSONObject2.optInt("mdc", -1);
                    double dOptDouble = jSONObjectOptJSONObject2.optDouble("aspectRatio", -1.0d);
                    this.onRemoveQueueItemAt = dOptDouble;
                    if (dOptDouble <= 0.0d) {
                        this.onRemoveQueueItemAt = -1.0d;
                    }
                }
                if (this.onSeekTo != null) {
                    char c = this.onSetRepeatMode;
                    if (c == 't') {
                        if (this.onRemoveQueueItemAt != -1.0d || (this.setSessionImpl == 100 && this.onRemoveQueueItem <= 30)) {
                            this.write = lambdaupdateStateAndInformListeners41.RatingCompat;
                            return;
                        }
                        return;
                    }
                    if (c == 'b') {
                        if (this.onRemoveQueueItemAt != -1.0d || (this.setSessionImpl == 100 && this.onRemoveQueueItem <= 30)) {
                            this.write = lambdaupdateStateAndInformListeners41.MediaBrowserCompatCustomActionResultReceiver;
                            return;
                        }
                        return;
                    }
                    if (c == 'c') {
                        int i = this.setSessionImpl;
                        if (i == 90 && this.onRemoveQueueItem == 85) {
                            this.write = lambdaupdateStateAndInformListeners41.onCustomAction;
                            return;
                        }
                        if (i == 100 && this.onRemoveQueueItem == 100) {
                            this.write = lambdaupdateStateAndInformListeners41.RemoteActionCompatParcelizer;
                        } else if (i == 90 && this.onRemoveQueueItem == 50) {
                            this.write = lambdaupdateStateAndInformListeners41.MediaMetadataCompat;
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            this.onPrepareFromSearch = "Invalid JSON";
        }
    }

    private static boolean read(Bundle p0, String p1, isHdPlaybackError<?> p2) {
        return p0.containsKey(p1) && p2.AudioAttributesCompatParcelizer(p0.get(p1));
    }

    private static boolean AudioAttributesCompatParcelizer(Bundle p0) {
        try {
            Bundle bundle = p0.getBundle("w");
            Bundle bundle2 = p0.getBundle("d");
            if (bundle == null || bundle2 == null || !(read(bundle, "xdp", toMagicModuleMetaDataUcModel.write(Integer.class)) || read(bundle, "xp", toMagicModuleMetaDataUcModel.write(Integer.class)))) {
                return false;
            }
            if ((read(bundle, "ydp", toMagicModuleMetaDataUcModel.write(Integer.class)) || read(bundle, "yp", toMagicModuleMetaDataUcModel.write(Integer.class))) && read(bundle, "dk", toMagicModuleMetaDataUcModel.write(Boolean.TYPE)) && read(bundle, "sc", toMagicModuleMetaDataUcModel.write(Boolean.TYPE)) && read(bundle2, "html", toMagicModuleMetaDataUcModel.write(String.class)) && read(bundle, "pos", toMagicModuleMetaDataUcModel.write(String.class))) {
                String string = bundle.getString("pos");
                toMagicModuleMetaRepoModel.write((Object) string);
                char cCharAt = string.charAt(0);
                return cCharAt == 't' || cCharAt == 'r' || cCharAt == 'b' || cCharAt == 'l' || cCharAt == 'c';
            }
            return false;
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "()J", "Lorg/json/JSONObject;", "p0", "Landroid/os/Bundle;", "AudioAttributesCompatParcelizer", "(Lorg/json/JSONObject;)Landroid/os/Bundle;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "CREATOR", "Landroid/os/Parcelable$Creator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static long RemoteActionCompatParcelizer() {
            return (System.currentTimeMillis() + 172800000) / 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle AudioAttributesCompatParcelizer(JSONObject p0) {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = p0.keys();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                toMagicModuleMetaRepoModel.read(next, "");
                String str = next;
                try {
                    Object obj = p0.get(str);
                    if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Character) {
                        bundle.putChar(str, ((Character) obj).charValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof JSONObject) {
                        bundle.putBundle(str, AudioAttributesCompatParcelizer((JSONObject) obj));
                    }
                } catch (JSONException unused) {
                    RendererWakeupListener.MediaMetadataCompat();
                }
            }
            return bundle;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<CTInAppNotification> {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppNotification createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppNotification[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static CTInAppNotification AudioAttributesCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new CTInAppNotification(parcel, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        private static CTInAppNotification[] AudioAttributesCompatParcelizer(int i) {
            return new CTInAppNotification[i];
        }
    }

    public /* synthetic */ CTInAppNotification(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parcel);
    }
}
