package com.airbnb.epoxy;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExoPlayerImplExternalSyntheticLambda0;
import kotlin.ExoPlayerImplExternalSyntheticLambda13;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.getContentBufferedPosition;
import kotlin.getCreatedOnDateMs;
import kotlin.getCurrentAdGroupIndex;
import kotlin.getCurrentPeriodIndex;
import kotlin.getCurrentTimeline;
import kotlin.getShowPopup;
import kotlin.moveMediaItems;
import kotlin.setMaxInputSize;
import kotlin.setPlaylistMetadata;
import kotlin.setThrowsWhenUsingWrongThread;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateAvailableCommands;
import kotlin.updatePlayWhenReady;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 H2\u00020\u0001:\u0005H>X;YB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001c\u0010\u0015J\u001d\u0010\u001e\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010%J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b(\u0010%J\u0019\u0010)\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J!\u00100\u001a\u00020\n2\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0.H\u0016¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\n2\u0006\u0010\u0003\u001a\u000202¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u0010\fJ\u000f\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u0010\fR\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010A\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R&\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010@R\u001c\u0010Q\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010W\u001a\u00020R8\u0005X\u0084\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFastForward", "()V", "onPause", "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;", "onPrepareFromMediaId", "()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;", "Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;", "onCustomAction", "()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;", "RatingCompat", "(I)I", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPlay", "onAttachedToWindow", "onDetachedFromWindow", "onMediaButtonEvent", "requestLayout", "MediaDescriptionCompat", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V", "Lo/getContentBufferedPosition;", "setController", "(Lo/getContentBufferedPosition;)V", "setControllerAndBuildModels", "setDelayMsWhenRemovingAdapterOnDetach", "(I)V", "setItemSpacingDp", "setItemSpacingPx", "setItemSpacingRes", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V", "Landroid/view/ViewGroup$LayoutParams;", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "", "Lo/getCurrentPeriodIndex;", "setModels", "(Ljava/util/List;)V", "", "setRemoveAdapterWhenDetachedFromWindow", "(Z)V", "IconCompatParcelizer", "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V", "onPlayFromMediaId", "onPrepare", "onSkipToNext", "I", "AudioAttributesCompatParcelizer", "setSessionImpl", "Lo/getContentBufferedPosition;", "read", "onStop", "Z", "write", "", "Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;", "onSkipToQueueItem", "Ljava/util/List;", "Lo/setThrowsWhenUsingWrongThread;", "MediaSessionCompatResultReceiverWrapper", "RemoteActionCompatParcelizer", "Ljava/lang/Runnable;", "ParcelableVolumeInfo", "Ljava/lang/Runnable;", "AudioAttributesImplApi21Parcelizer", "MediaSessionCompatQueueItem", "AudioAttributesImplApi26Parcelizer", "MediaSessionCompatToken", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "AudioAttributesImplBaseParcelizer", "Lo/getCurrentTimeline;", "PlaybackStateCompat", "Lo/getCurrentTimeline;", "onCommand", "()Lo/getCurrentTimeline;", "MediaBrowserCompatCustomActionResultReceiver", "ModelBuilderCallbackController", "WithModelsController"}, k = 1, mv = {1, 4, 2})
public class EpoxyRecyclerView extends RecyclerView {
    private static final updateAvailableCommands onSkipToPrevious = new updateAvailableCommands();

    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from kotlin metadata */
    private final List<setThrowsWhenUsingWrongThread<?>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from kotlin metadata */
    private RecyclerView.IconCompatParcelizer<?> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: from kotlin metadata */
    private final Runnable AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from kotlin metadata */
    private final getCurrentTimeline MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private final List<AudioAttributesCompatParcelizer<?, ?, ?>> IconCompatParcelizer;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private getContentBufferedPosition read;

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$read;", "", "Lo/getContentBufferedPosition;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/getContentBufferedPosition;)V"}, k = 1, mv = {1, 4, 2})
    public interface read {
        void AudioAttributesCompatParcelizer(getContentBufferedPosition p0);
    }

    public /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.MediaBrowserCompatCustomActionResultReceiver = new getCurrentTimeline();
        this.AudioAttributesImplApi26Parcelizer = true;
        this.AudioAttributesCompatParcelizer = 2000;
        this.AudioAttributesImplApi21Parcelizer = new Runnable() { // from class: com.airbnb.epoxy.EpoxyRecyclerView.2
            @Override // java.lang.Runnable
            public final void run() {
                if (EpoxyRecyclerView.this.write) {
                    EpoxyRecyclerView.this.write = false;
                    EpoxyRecyclerView.this.onMediaButtonEvent();
                }
            }
        };
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.IconCompatParcelizer = new ArrayList();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMaxInputSize.write.EpoxyRecyclerView, i, 0);
            setItemSpacingPx(typedArrayObtainStyledAttributes.getDimensionPixelSize(setMaxInputSize.write.EpoxyRecyclerView_itemSpacing, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    protected final getCurrentTimeline getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    static final class AudioAttributesCompatParcelizer<T extends getCurrentPeriodIndex<?>, U extends ExoPlayerImplExternalSyntheticLambda13, P extends ExoPlayerImplExternalSyntheticLambda0> {
        private final int AudioAttributesCompatParcelizer;
        private final setPlaylistMetadata<T, U, P> IconCompatParcelizer;
        private final MagicModuleSubmissionRequestBody<Context, RuntimeException, getShowPopup> RemoteActionCompatParcelizer;
        private final getCreatedOnDateMs<P> read;

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final MagicModuleSubmissionRequestBody<Context, RuntimeException, getShowPopup> write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final setPlaylistMetadata<T, U, P> AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final getCreatedOnDateMs<P> read() {
            return this.read;
        }
    }

    private final void onPrepare() {
        setThrowsWhenUsingWrongThread<?> setthrowswhenusingwrongthreadIconCompatParcelizer;
        Iterator<T> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            write((setThrowsWhenUsingWrongThread) it.next());
        }
        this.RemoteActionCompatParcelizer.clear();
        RecyclerView.IconCompatParcelizer IconCompatParcelizer = IconCompatParcelizer();
        if (IconCompatParcelizer != null) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(IconCompatParcelizer, "");
            Iterator<T> it2 = this.IconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) it2.next();
                if (IconCompatParcelizer instanceof getCurrentAdGroupIndex) {
                    setThrowsWhenUsingWrongThread.IconCompatParcelizer iconCompatParcelizer = setThrowsWhenUsingWrongThread.AudioAttributesCompatParcelizer;
                    setthrowswhenusingwrongthreadIconCompatParcelizer = setThrowsWhenUsingWrongThread.IconCompatParcelizer.IconCompatParcelizer((getCurrentAdGroupIndex) IconCompatParcelizer, audioAttributesCompatParcelizer.read(), audioAttributesCompatParcelizer.write(), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
                } else {
                    getContentBufferedPosition getcontentbufferedposition = this.read;
                    if (getcontentbufferedposition != null) {
                        setThrowsWhenUsingWrongThread.IconCompatParcelizer iconCompatParcelizer2 = setThrowsWhenUsingWrongThread.AudioAttributesCompatParcelizer;
                        setthrowswhenusingwrongthreadIconCompatParcelizer = setThrowsWhenUsingWrongThread.IconCompatParcelizer.read(getcontentbufferedposition, audioAttributesCompatParcelizer.read(), audioAttributesCompatParcelizer.write(), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
                    } else {
                        setthrowswhenusingwrongthreadIconCompatParcelizer = null;
                    }
                }
                if (setthrowswhenusingwrongthreadIconCompatParcelizer != null) {
                    this.RemoteActionCompatParcelizer.add(setthrowswhenusingwrongthreadIconCompatParcelizer);
                    RemoteActionCompatParcelizer(setthrowswhenusingwrongthreadIconCompatParcelizer);
                }
            }
        }
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean p0) {
        this.AudioAttributesImplApi26Parcelizer = p0;
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int p0) {
        this.AudioAttributesCompatParcelizer = p0;
    }

    protected void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        setClipToPadding(false);
        onPlay();
    }

    private final void onPlay() {
        updateAvailableCommands updateavailablecommands = onSkipToPrevious;
        Context context = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        setRecycledViewPool(updateavailablecommands.read(context, new AnonymousClass1()).getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.EpoxyRecyclerView$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;", "AudioAttributesCompatParcelizer", "()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<RecyclerView.MediaMetadataCompat> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final RecyclerView.MediaMetadataCompat invoke() {
            return EpoxyRecyclerView.onCustomAction();
        }

        AnonymousClass1() {
            super(0);
        }
    }

    protected static RecyclerView.MediaMetadataCompat onCustomAction() {
        return new moveMediaItems();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(p0);
        if (z && AudioAttributesImplApi21Parcelizer() == null) {
            setLayoutManager(onPrepareFromMediaId());
        }
    }

    private RecyclerView.MediaBrowserCompatItemReceiver onPrepareFromMediaId() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams.height == -1 || layoutParams.height == 0) {
            if (layoutParams.width == -1 || layoutParams.width == 0) {
                setHasFixedSize(true);
            }
            getContext();
            return new LinearLayoutManager();
        }
        getContext();
        return new LinearLayoutManager(0, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.MediaBrowserCompatItemReceiver p0) {
        super.setLayoutManager(p0);
        onPlayFromMediaId();
    }

    private final void onPlayFromMediaId() {
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        getContentBufferedPosition getcontentbufferedposition = this.read;
        if (!(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer instanceof GridLayoutManager) || getcontentbufferedposition == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer;
        if (getcontentbufferedposition.getSpanCount() == gridLayoutManager.IconCompatParcelizer() && gridLayoutManager.AudioAttributesCompatParcelizer() == getcontentbufferedposition.getSpanSizeLookup()) {
            return;
        }
        getcontentbufferedposition.setSpanCount(gridLayoutManager.IconCompatParcelizer());
        gridLayoutManager.read(getcontentbufferedposition.getSpanSizeLookup());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        onPlayFromMediaId();
        super.requestLayout();
    }

    public final void setItemSpacingRes(int p0) {
        setItemSpacingPx(MediaDescriptionCompat(p0));
    }

    public final void setItemSpacingDp(int p0) {
        setItemSpacingPx(RatingCompat(p0));
    }

    public void setItemSpacingPx(int p0) {
        RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(p0);
        if (p0 > 0) {
            AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    public void setModels(List<? extends getCurrentPeriodIndex<?>> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getContentBufferedPosition getcontentbufferedposition = this.read;
        if (!(getcontentbufferedposition instanceof SimpleEpoxyController)) {
            getcontentbufferedposition = null;
        }
        SimpleEpoxyController simpleEpoxyController = (SimpleEpoxyController) getcontentbufferedposition;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(p0);
    }

    public final void setController(getContentBufferedPosition p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = p0;
        setAdapter(p0.getAdapter());
        onPlayFromMediaId();
    }

    public final void setControllerAndBuildModels(getContentBufferedPosition p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.requestModelBuild();
        setController(p0);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Lo/getContentBufferedPosition;", "<init>", "()V", "", "buildModels", "Lkotlin/Function1;", "callback", "Lo/getAnswerMap;", "getCallback", "()Lo/getAnswerMap;", "setCallback", "(Lo/getAnswerMap;)V"}, k = 1, mv = {1, 4, 2})
    static final class WithModelsController extends getContentBufferedPosition {
        private getAnswerMap<? super getContentBufferedPosition, getShowPopup> callback = AnonymousClass3.RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$3, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getContentBufferedPosition;", "", "RemoteActionCompatParcelizer", "(Lo/getContentBufferedPosition;)V"}, k = 3, mv = {1, 4, 2})
        static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<getContentBufferedPosition, getShowPopup> {
            public static final AnonymousClass3 RemoteActionCompatParcelizer = new AnonymousClass3();

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(getContentBufferedPosition getcontentbufferedposition) {
                RemoteActionCompatParcelizer(getcontentbufferedposition);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass3() {
                super(1);
            }

            public final void RemoteActionCompatParcelizer(getContentBufferedPosition getcontentbufferedposition) {
                toMagicModuleMetaRepoModel.write(getcontentbufferedposition, "");
            }
        }

        public final getAnswerMap<getContentBufferedPosition, getShowPopup> getCallback() {
            return this.callback;
        }

        public final void setCallback(getAnswerMap<? super getContentBufferedPosition, getShowPopup> getanswermap) {
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            this.callback = getanswermap;
        }

        @Override // kotlin.getContentBufferedPosition
        public final void buildModels() {
            this.callback.invoke(this);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Lo/getContentBufferedPosition;", "<init>", "()V", "", "buildModels", "Lcom/airbnb/epoxy/EpoxyRecyclerView$read;", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$read;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$read;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$read;)V"}, k = 1, mv = {1, 4, 2})
    static final class ModelBuilderCallbackController extends getContentBufferedPosition {
        private read callback = new RemoteActionCompatParcelizer();

        public static final class RemoteActionCompatParcelizer implements read {
            RemoteActionCompatParcelizer() {
            }

            @Override // com.airbnb.epoxy.EpoxyRecyclerView.read
            public final void AudioAttributesCompatParcelizer(getContentBufferedPosition getcontentbufferedposition) {
                toMagicModuleMetaRepoModel.write(getcontentbufferedposition, "");
            }
        }

        public final read getCallback() {
            return this.callback;
        }

        public final void setCallback(read readVar) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            this.callback = readVar;
        }

        @Override // kotlin.getContentBufferedPosition
        public final void buildModels() {
            this.callback.AudioAttributesCompatParcelizer(this);
        }
    }

    protected final int RatingCompat(int p0) {
        Resources resources = getResources();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
        return (int) TypedValue.applyDimension(1, p0, resources.getDisplayMetrics());
    }

    protected final int MediaDescriptionCompat(int p0) {
        return getResources().getDimensionPixelOffset(p0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.IconCompatParcelizer<?> p0) {
        super.setAdapter(p0);
        onPause();
        onPrepare();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void IconCompatParcelizer(RecyclerView.IconCompatParcelizer<?> p0, boolean p1) {
        super.IconCompatParcelizer(p0, p1);
        onPause();
        onPrepare();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (iconCompatParcelizer != null) {
            IconCompatParcelizer((RecyclerView.IconCompatParcelizer) iconCompatParcelizer, false);
        }
        onPause();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((setThrowsWhenUsingWrongThread) it.next()).RemoteActionCompatParcelizer();
        }
        if (this.AudioAttributesImplApi26Parcelizer) {
            int i = this.AudioAttributesCompatParcelizer;
            if (i > 0) {
                this.write = true;
                postDelayed(this.AudioAttributesImplApi21Parcelizer, i);
            } else {
                onMediaButtonEvent();
            }
        }
        onFastForward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        RecyclerView.IconCompatParcelizer<?> IconCompatParcelizer = IconCompatParcelizer();
        if (IconCompatParcelizer != null) {
            IconCompatParcelizer((RecyclerView.IconCompatParcelizer) null, true);
            this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer;
        }
        onFastForward();
    }

    private final void onPause() {
        this.AudioAttributesImplBaseParcelizer = null;
        if (this.write) {
            removeCallbacks(this.AudioAttributesImplApi21Parcelizer);
            this.write = false;
        }
    }

    private final void onFastForward() {
        if (updatePlayWhenReady.AudioAttributesCompatParcelizer(getContext())) {
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer();
        }
    }

    public EpoxyRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }
}
