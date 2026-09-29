package com.clevertap.android.sdk.customviews;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import kotlin.MagicModuleRepositoryImpl_Factory;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import kotlin.SimpleBasePlayerPlaylistTimeline;
import kotlin._parseDoublePrimitive;
import kotlin.getCreatedOnDateMs;
import kotlin.getModuleData;
import kotlin.getShowPopup;
import kotlin.lambdaonDownstreamFormatChanged28;
import kotlin.lambdaonDrmKeysLoaded62;
import kotlin.lambdaonDrmSessionManagerError63;
import kotlin.lambdaonDrmSessionReleased66;
import kotlin.lambdaonIsPlayingChanged38;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()V", "onCustomAction", "onCommand", "onPlayFromMediaId", "Lo/SimpleBasePlayerPlaylistTimeline;", "onFastForward", "()Lo/SimpleBasePlayerPlaylistTimeline;", "onMediaButtonEvent", "onPause", "onPrepare", "Landroid/graphics/drawable/Drawable;", "onPlay", "()Landroid/graphics/drawable/Drawable;", "onPlayFromSearch", "onPrepareFromMediaId", "Lo/lambdaonDrmKeysLoaded62;", "RemoteActionCompatParcelizer", "Lo/lambdaonDrmKeysLoaded62;", "IconCompatParcelizer", "Landroid/graphics/Rect;", "setSessionImpl", "Landroid/graphics/Rect;", "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;", "onSkipToNext", "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;", "AudioAttributesCompatParcelizer", "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;", "onStop", "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;", "read", "onSkipToPrevious", "Lo/SimpleBasePlayerPlaylistTimeline;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaPlayerRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final lambdaonDrmKeysLoaded62 IconCompatParcelizer;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private final RecyclerView.MediaBrowserCompatSearchResultReceiver AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private SimpleBasePlayerPlaylistTimeline write;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private final RecyclerView.AudioAttributesImplApi21Parcelizer read;

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private final Rect RemoteActionCompatParcelizer;

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[lambdaonDrmSessionReleased66.values().length];
            try {
                iArr[lambdaonDrmSessionReleased66.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
            toMagicModuleMetaRepoModel.write(recyclerView, "");
            super.AudioAttributesCompatParcelizer(recyclerView, i);
            if (i == 0) {
                MediaPlayerRecyclerView.this.onCommand();
            }
        }
    }

    public static final class IconCompatParcelizer implements RecyclerView.AudioAttributesImplApi21Parcelizer {
        IconCompatParcelizer() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi21Parcelizer
        public final void read(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimeline = MediaPlayerRecyclerView.this.write;
            if (simpleBasePlayerPlaylistTimeline != null) {
                MediaPlayerRecyclerView mediaPlayerRecyclerView = MediaPlayerRecyclerView.this;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(simpleBasePlayerPlaylistTimeline.itemView, view)) {
                    mediaPlayerRecyclerView.onPlayFromMediaId();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi21Parcelizer
        public final void RemoteActionCompatParcelizer(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(Context context) {
        lambdaonDrmSessionManagerError63 lambdaondrmsessionmanagererror63;
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        if (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[lambdaonDownstreamFormatChanged28.write.ordinal()] == 1) {
            lambdaondrmsessionmanagererror63 = new lambdaonIsPlayingChanged38();
        } else {
            lambdaondrmsessionmanagererror63 = new lambdaonDrmSessionManagerError63();
        }
        this.IconCompatParcelizer = lambdaondrmsessionmanagererror63;
        this.RemoteActionCompatParcelizer = new Rect();
        this.AudioAttributesCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver();
        this.read = new IconCompatParcelizer();
        onMediaButtonEvent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(Context context, AttributeSet attributeSet) {
        lambdaonDrmSessionManagerError63 lambdaondrmsessionmanagererror63;
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(attributeSet, "");
        if (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[lambdaonDownstreamFormatChanged28.write.ordinal()] == 1) {
            lambdaondrmsessionmanagererror63 = new lambdaonIsPlayingChanged38();
        } else {
            lambdaondrmsessionmanagererror63 = new lambdaonDrmSessionManagerError63();
        }
        this.IconCompatParcelizer = lambdaondrmsessionmanagererror63;
        this.RemoteActionCompatParcelizer = new Rect();
        this.AudioAttributesCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver();
        this.read = new IconCompatParcelizer();
        onMediaButtonEvent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        lambdaonDrmSessionManagerError63 lambdaondrmsessionmanagererror63;
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(attributeSet, "");
        if (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[lambdaonDownstreamFormatChanged28.write.ordinal()] == 1) {
            lambdaondrmsessionmanagererror63 = new lambdaonIsPlayingChanged38();
        } else {
            lambdaondrmsessionmanagererror63 = new lambdaonDrmSessionManagerError63();
        }
        this.IconCompatParcelizer = lambdaondrmsessionmanagererror63;
        this.RemoteActionCompatParcelizer = new Rect();
        this.AudioAttributesCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver();
        this.read = new IconCompatParcelizer();
        onMediaButtonEvent();
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(false);
    }

    public final void onCustomAction() {
        onMediaButtonEvent();
        onCommand();
    }

    public final void onCommand() {
        SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimelineOnFastForward = onFastForward();
        if (simpleBasePlayerPlaylistTimelineOnFastForward == null) {
            onPrepareFromMediaId();
            return;
        }
        SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimeline = this.write;
        if (simpleBasePlayerPlaylistTimeline != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(simpleBasePlayerPlaylistTimeline.itemView, simpleBasePlayerPlaylistTimelineOnFastForward.itemView)) {
            if (simpleBasePlayerPlaylistTimeline.itemView.getGlobalVisibleRect(this.RemoteActionCompatParcelizer) && this.RemoteActionCompatParcelizer.height() >= 400 && simpleBasePlayerPlaylistTimeline.MediaBrowserCompatItemReceiver()) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(true);
                return;
            } else {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(false);
                return;
            }
        }
        onPrepareFromMediaId();
        onMediaButtonEvent();
        if (simpleBasePlayerPlaylistTimelineOnFastForward.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.lambdahandleReplaceMediaItems30
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return MediaPlayerRecyclerView.MediaBrowserCompatItemReceiver(this.write);
            }
        }, new getModuleData() { // from class: o.lambdaincreaseDeviceVolume25
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return MediaPlayerRecyclerView.read(this.IconCompatParcelizer, (String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            }
        }, this.IconCompatParcelizer.read())) {
            this.write = simpleBasePlayerPlaylistTimelineOnFastForward;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float MediaBrowserCompatItemReceiver(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        toMagicModuleMetaRepoModel.write(mediaPlayerRecyclerView, "");
        mediaPlayerRecyclerView.IconCompatParcelizer.IconCompatParcelizer();
        return Float.valueOf(mediaPlayerRecyclerView.IconCompatParcelizer.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void read(MediaPlayerRecyclerView mediaPlayerRecyclerView, String str, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(mediaPlayerRecyclerView, "");
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaonDrmKeysLoaded62 lambdaondrmkeysloaded62 = mediaPlayerRecyclerView.IconCompatParcelizer;
        Context context = mediaPlayerRecyclerView.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        lambdaondrmkeysloaded62.write(context, str, z, z2);
        return null;
    }

    public final void onPlayFromMediaId() {
        this.IconCompatParcelizer.write();
        this.write = null;
    }

    private final SimpleBasePlayerPlaylistTimeline onFastForward() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) AudioAttributesImplApi21Parcelizer();
        int iMediaBrowserCompatItemReceiver = linearLayoutManager != null ? linearLayoutManager.MediaBrowserCompatItemReceiver() : 0;
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) AudioAttributesImplApi21Parcelizer();
        int iMediaMetadataCompat = linearLayoutManager2 != null ? linearLayoutManager2.MediaMetadataCompat() : 0;
        if (iMediaBrowserCompatItemReceiver > iMediaMetadataCompat) {
            return null;
        }
        int i = iMediaBrowserCompatItemReceiver;
        int i2 = 0;
        SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimeline = null;
        while (true) {
            View childAt = getChildAt(i - iMediaBrowserCompatItemReceiver);
            if (childAt != null) {
                Object tag = childAt.getTag();
                SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimeline2 = tag instanceof SimpleBasePlayerPlaylistTimeline ? (SimpleBasePlayerPlaylistTimeline) tag : null;
                if (simpleBasePlayerPlaylistTimeline2 != null && simpleBasePlayerPlaylistTimeline2.AudioAttributesCompatParcelizer()) {
                    int iHeight = simpleBasePlayerPlaylistTimeline2.itemView.getGlobalVisibleRect(this.RemoteActionCompatParcelizer) ? this.RemoteActionCompatParcelizer.height() : 0;
                    if (iHeight > i2) {
                        simpleBasePlayerPlaylistTimeline = simpleBasePlayerPlaylistTimeline2;
                        i2 = iHeight;
                    }
                }
            }
            if (i == iMediaMetadataCompat) {
                return simpleBasePlayerPlaylistTimeline;
            }
            i++;
        }
    }

    private final void onMediaButtonEvent() {
        lambdaonDrmKeysLoaded62 lambdaondrmkeysloaded62 = this.IconCompatParcelizer;
        Context context = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        lambdaondrmkeysloaded62.AudioAttributesCompatParcelizer(context, new AudioAttributesCompatParcelizer(this), new write(this));
        lambdaonDrmKeysLoaded62 lambdaondrmkeysloaded622 = this.IconCompatParcelizer;
        Context context2 = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        lambdaondrmkeysloaded622.IconCompatParcelizer(context2, new read(this));
        onPlayFromSearch();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            ((MediaPlayerRecyclerView) this.AudioAttributesImplApi26Parcelizer).onPause();
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(0, obj, MediaPlayerRecyclerView.class, "onPause", "onPause()V", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class write extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        public final void RemoteActionCompatParcelizer() {
            ((MediaPlayerRecyclerView) this.AudioAttributesImplApi26Parcelizer).onPrepare();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        write(Object obj) {
            super(0, obj, MediaPlayerRecyclerView.class, "onPrepare", "onPrepare()V", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<Drawable> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return ((MediaPlayerRecyclerView) this.AudioAttributesImplApi26Parcelizer).onPlay();
        }

        read(Object obj) {
            super(0, obj, MediaPlayerRecyclerView.class, "onPlay", "onPlay()Landroid/graphics/drawable/Drawable;", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause() {
        SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimeline = this.write;
        if (simpleBasePlayerPlaylistTimeline != null) {
            simpleBasePlayerPlaylistTimeline.read();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepare() {
        SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimeline = this.write;
        if (simpleBasePlayerPlaylistTimeline != null) {
            simpleBasePlayerPlaylistTimeline.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable onPlay() {
        Drawable drawable = _parseDoublePrimitive.read(getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_audio, null);
        toMagicModuleMetaRepoModel.write(drawable);
        return drawable;
    }

    private final void onPlayFromSearch() {
        write(this.AudioAttributesCompatParcelizer);
        write(this.read);
        RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        read(this.read);
    }

    private final void onPrepareFromMediaId() {
        this.IconCompatParcelizer.write();
        SimpleBasePlayerPlaylistTimeline simpleBasePlayerPlaylistTimeline = this.write;
        if (simpleBasePlayerPlaylistTimeline != null) {
            simpleBasePlayerPlaylistTimeline.AudioAttributesImplApi26Parcelizer();
        }
    }
}
