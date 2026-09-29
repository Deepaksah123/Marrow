package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.BinarySearchSeekerBinarySearchSeekMap;
import kotlin.UIntDeserializer;
import kotlin.deserializeKeylj4SQcc;
import kotlin.isSeekable;
import kotlin.skipInputUntilPosition;

/* JADX INFO: loaded from: classes5.dex */
public class FlexboxLayoutManager extends RecyclerView.MediaBrowserCompatItemReceiver implements BinarySearchSeekerBinarySearchSeekMap, RecyclerView.onCustomAction.RemoteActionCompatParcelizer {
    private static final Rect write = new Rect();
    private int AudioAttributesImplApi21Parcelizer;
    private int RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCommand;
    private boolean onCustomAction;
    private UIntDeserializer onFastForward;
    private read onPlay;
    private View onPlayFromSearch;
    private SavedState onPlayFromUri;
    private boolean onPrepareFromSearch;
    private UIntDeserializer onPrepareFromUri;
    private RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onRemoveQueueItem;
    private RecyclerView.MediaDescriptionCompat onSeekTo;
    private final Context read;
    private int onPause = -1;
    private List<skipInputUntilPosition> MediaBrowserCompatItemReceiver = new ArrayList();
    private final isSeekable MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new isSeekable(this);
    private AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(this, 0);
    private int onPrepareFromMediaId = -1;
    private int onPrepare = Integer.MIN_VALUE;
    private int onPlayFromMediaId = Integer.MIN_VALUE;
    private int onMediaButtonEvent = Integer.MIN_VALUE;
    private SparseArray<View> onRemoveQueueItemAt = new SparseArray<>();
    private int AudioAttributesCompatParcelizer = -1;
    private isSeekable.read MediaBrowserCompatCustomActionResultReceiver = new isSeekable.read();

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final void IconCompatParcelizer(skipInputUntilPosition skipinputuntilposition) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean RatingCompat() {
        return true;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int write() {
        return 5;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.MediaBrowserCompatItemReceiver.write writeVar = read(context, attributeSet, i, i2);
        int i3 = writeVar.write;
        if (i3 != 0) {
            if (i3 == 1) {
                if (writeVar.RemoteActionCompatParcelizer) {
                    MediaMetadataCompat(3);
                } else {
                    MediaMetadataCompat(2);
                }
            }
        } else if (writeVar.RemoteActionCompatParcelizer) {
            MediaMetadataCompat(1);
        } else {
            MediaMetadataCompat(0);
        }
        MediaSessionCompatToken();
        ParcelableVolumeInfo();
        this.read = context;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private void MediaMetadataCompat(int i) {
        if (this.AudioAttributesImplApi21Parcelizer != i) {
            onSetPlaybackSpeed();
            this.AudioAttributesImplApi21Parcelizer = i;
            this.onFastForward = null;
            this.onPrepareFromUri = null;
            MediaMetadataCompat();
            onSetRating();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int MediaBrowserCompatItemReceiver() {
        return this.onCommand;
    }

    private void MediaSessionCompatToken() {
        int i = this.onCommand;
        if (i != 1) {
            if (i == 0) {
                onSetPlaybackSpeed();
                MediaMetadataCompat();
            }
            this.onCommand = 1;
            this.onFastForward = null;
            this.onPrepareFromUri = null;
            onSetRating();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private void ParcelableVolumeInfo() {
        if (this.RemoteActionCompatParcelizer != 4) {
            onSetPlaybackSpeed();
            MediaMetadataCompat();
            this.RemoteActionCompatParcelizer = 4;
            onSetRating();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.onPause;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int IconCompatParcelizer(View view, int i, int i2) {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iAudioAttributesImplApi26Parcelizer;
        if (MediaBrowserCompatMediaItem()) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaBrowserCompatSearchResultReceiver(view);
            iAudioAttributesImplApi26Parcelizer = handleMediaPlayPauseIfPendingOnHandler(view);
        } else {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view);
            iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(view);
        }
        return iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + iAudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int IconCompatParcelizer(View view) {
        int iMediaBrowserCompatSearchResultReceiver;
        int iHandleMediaPlayPauseIfPendingOnHandler;
        if (MediaBrowserCompatMediaItem()) {
            iMediaBrowserCompatSearchResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view);
            iHandleMediaPlayPauseIfPendingOnHandler = AudioAttributesImplApi26Parcelizer(view);
        } else {
            iMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(view);
            iHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler(view);
        }
        return iMediaBrowserCompatSearchResultReceiver + iHandleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final void RemoteActionCompatParcelizer(View view, int i, int i2, skipInputUntilPosition skipinputuntilposition) {
        AudioAttributesCompatParcelizer(view, write);
        if (MediaBrowserCompatMediaItem()) {
            int iMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(view) + handleMediaPlayPauseIfPendingOnHandler(view);
            skipinputuntilposition.RatingCompat += iMediaBrowserCompatSearchResultReceiver;
            skipinputuntilposition.RemoteActionCompatParcelizer += iMediaBrowserCompatSearchResultReceiver;
        } else {
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view) + AudioAttributesImplApi26Parcelizer(view);
            skipinputuntilposition.RatingCompat += iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            skipinputuntilposition.RemoteActionCompatParcelizer += iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int AudioAttributesCompatParcelizer() {
        return this.onRemoveQueueItem.read();
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final View AudioAttributesCompatParcelizer(int i) {
        View view = this.onRemoveQueueItemAt.get(i);
        return view != null ? view : this.onSeekTo.RemoteActionCompatParcelizer(i);
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final View IconCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        return write(onPrepare(), onSeekTo(), i2, i3, AudioAttributesImplApi26Parcelizer());
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int write(int i, int i2, int i3) {
        return write(onMediaButtonEvent(), onFastForward(), i2, i3, AudioAttributesImplApi21Parcelizer());
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int AudioAttributesImplBaseParcelizer() {
        if (this.MediaBrowserCompatItemReceiver.size() == 0) {
            return 0;
        }
        int size = this.MediaBrowserCompatItemReceiver.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.MediaBrowserCompatItemReceiver.get(i).RatingCompat);
        }
        return iMax;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int MediaDescriptionCompat() {
        int size = this.MediaBrowserCompatItemReceiver.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.MediaBrowserCompatItemReceiver.get(i2).write;
        }
        return i;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public void setFlexLines(List<skipInputUntilPosition> list) {
        this.MediaBrowserCompatItemReceiver = list;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final List<skipInputUntilPosition> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final void AudioAttributesCompatParcelizer(int i, View view) {
        this.onRemoveQueueItemAt.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction.RemoteActionCompatParcelizer
    public final PointF RemoteActionCompatParcelizer(int i) {
        View viewMediaBrowserCompatCustomActionResultReceiver;
        if (onPlay() == 0 || (viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(0)) == null) {
            return null;
        }
        int i2 = i < MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver) ? -1 : 1;
        if (MediaBrowserCompatMediaItem()) {
            return new PointF(BitmapDescriptorFactory.HUE_RED, i2);
        }
        return new PointF(i2, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final RecyclerView.LayoutParams read() {
        return new LayoutParams();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final RecyclerView.LayoutParams AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean RemoteActionCompatParcelizer(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView.IconCompatParcelizer iconCompatParcelizer, RecyclerView.IconCompatParcelizer iconCompatParcelizer2) {
        onSetPlaybackSpeed();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final Parcelable onAddQueueItem() {
        if (this.onPlayFromUri != null) {
            return new SavedState(this.onPlayFromUri, (byte) 0);
        }
        SavedState savedState = new SavedState();
        if (onPlay() > 0) {
            View viewOnSkipToPrevious = onSkipToPrevious();
            savedState.write = MediaDescriptionCompat(viewOnSkipToPrevious);
            savedState.RemoteActionCompatParcelizer = this.onFastForward.AudioAttributesCompatParcelizer(viewOnSkipToPrevious) - this.onFastForward.AudioAttributesImplApi21Parcelizer();
            return savedState;
        }
        savedState.write();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.onPlayFromUri = (SavedState) parcelable;
            onSetRating();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        super.RemoteActionCompatParcelizer(recyclerView, i, i2);
        MediaDescriptionCompat(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.write(recyclerView, i, i2, obj);
        MediaDescriptionCompat(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        super.IconCompatParcelizer(recyclerView, i, i2);
        MediaDescriptionCompat(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        super.AudioAttributesCompatParcelizer(recyclerView, i, i2);
        MediaDescriptionCompat(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2, int i3) {
        super.IconCompatParcelizer(recyclerView, i, i2, i3);
        MediaDescriptionCompat(Math.min(i, i2));
    }

    private void MediaDescriptionCompat(int i) {
        if (i < MediaSessionCompatQueueItem()) {
            int iOnPlay = onPlay();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(iOnPlay);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(iOnPlay);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(iOnPlay);
            if (i < this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer.length) {
                this.AudioAttributesCompatParcelizer = i;
                View viewOnSkipToPrevious = onSkipToPrevious();
                if (viewOnSkipToPrevious == null) {
                    return;
                }
                this.onPrepareFromMediaId = MediaDescriptionCompat(viewOnSkipToPrevious);
                if (!MediaBrowserCompatMediaItem() && this.handleMediaPlayPauseIfPendingOnHandler) {
                    this.onPrepare = this.onFastForward.IconCompatParcelizer(viewOnSkipToPrevious) + this.onFastForward.AudioAttributesCompatParcelizer();
                } else {
                    this.onPrepare = this.onFastForward.AudioAttributesCompatParcelizer(viewOnSkipToPrevious) - this.onFastForward.AudioAttributesImplApi21Parcelizer();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int i;
        int i2;
        this.onSeekTo = mediaDescriptionCompat;
        this.onRemoveQueueItem = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        if (i3 == 0 && mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
            return;
        }
        onSkipToQueueItem();
        onCommand();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(i3);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(i3);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(i3);
        this.onPlay.AudioAttributesImplApi21Parcelizer = false;
        SavedState savedState = this.onPlayFromUri;
        if (savedState != null && savedState.read(i3)) {
            this.onPrepareFromMediaId = this.onPlayFromUri.write;
        }
        if (!this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer || this.onPrepareFromMediaId != -1 || this.onPlayFromUri != null) {
            this.IconCompatParcelizer.read();
            IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.IconCompatParcelizer);
            AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
        }
        write(mediaDescriptionCompat);
        if (this.IconCompatParcelizer.write) {
            read(this.IconCompatParcelizer, false, true);
        } else {
            AudioAttributesCompatParcelizer(this.IconCompatParcelizer, false, true);
        }
        MediaBrowserCompatMediaItem(i3);
        read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPlay);
        if (this.IconCompatParcelizer.write) {
            i2 = this.onPlay.AudioAttributesImplBaseParcelizer;
            AudioAttributesCompatParcelizer(this.IconCompatParcelizer, true, false);
            read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPlay);
            i = this.onPlay.AudioAttributesImplBaseParcelizer;
        } else {
            i = this.onPlay.AudioAttributesImplBaseParcelizer;
            read(this.IconCompatParcelizer, true, false);
            read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPlay);
            i2 = this.onPlay.AudioAttributesImplBaseParcelizer;
        }
        if (onPlay() > 0) {
            if (this.IconCompatParcelizer.write) {
                RemoteActionCompatParcelizer(i2 + AudioAttributesCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true), mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            } else {
                AudioAttributesCompatParcelizer(i + RemoteActionCompatParcelizer(i2, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true), mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            }
        }
    }

    private int RemoteActionCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        int iAudioAttributesCompatParcelizer;
        int iAudioAttributesImplApi21Parcelizer;
        if (!MediaBrowserCompatMediaItem() && this.handleMediaPlayPauseIfPendingOnHandler) {
            int iRemoteActionCompatParcelizer = this.onFastForward.RemoteActionCompatParcelizer() - i;
            if (iRemoteActionCompatParcelizer <= 0) {
                return 0;
            }
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(-iRemoteActionCompatParcelizer, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        } else {
            int iAudioAttributesImplApi21Parcelizer2 = i - this.onFastForward.AudioAttributesImplApi21Parcelizer();
            if (iAudioAttributesImplApi21Parcelizer2 <= 0) {
                return 0;
            }
            iAudioAttributesCompatParcelizer = -AudioAttributesCompatParcelizer(iAudioAttributesImplApi21Parcelizer2, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        if (!z || (iAudioAttributesImplApi21Parcelizer = (i + iAudioAttributesCompatParcelizer) - this.onFastForward.AudioAttributesImplApi21Parcelizer()) <= 0) {
            return iAudioAttributesCompatParcelizer;
        }
        this.onFastForward.read(-iAudioAttributesImplApi21Parcelizer);
        return iAudioAttributesCompatParcelizer - iAudioAttributesImplApi21Parcelizer;
    }

    private int AudioAttributesCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        int iAudioAttributesCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        if (!MediaBrowserCompatMediaItem() && this.handleMediaPlayPauseIfPendingOnHandler) {
            int iAudioAttributesImplApi21Parcelizer = i - this.onFastForward.AudioAttributesImplApi21Parcelizer();
            if (iAudioAttributesImplApi21Parcelizer <= 0) {
                return 0;
            }
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesImplApi21Parcelizer, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        } else {
            int iRemoteActionCompatParcelizer2 = this.onFastForward.RemoteActionCompatParcelizer() - i;
            if (iRemoteActionCompatParcelizer2 <= 0) {
                return 0;
            }
            iAudioAttributesCompatParcelizer = -AudioAttributesCompatParcelizer(-iRemoteActionCompatParcelizer2, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        if (!z || (iRemoteActionCompatParcelizer = this.onFastForward.RemoteActionCompatParcelizer() - (i + iAudioAttributesCompatParcelizer)) <= 0) {
            return iAudioAttributesCompatParcelizer;
        }
        this.onFastForward.read(iRemoteActionCompatParcelizer);
        return iRemoteActionCompatParcelizer + iAudioAttributesCompatParcelizer;
    }

    private void MediaBrowserCompatMediaItem(int i) {
        int i2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(onPrepare(), onSeekTo());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(onMediaButtonEvent(), onFastForward());
        int iOnPrepare = onPrepare();
        int iOnMediaButtonEvent = onMediaButtonEvent();
        boolean z = false;
        if (MediaBrowserCompatMediaItem()) {
            int i3 = this.onPlayFromMediaId;
            if (i3 != Integer.MIN_VALUE && i3 != iOnPrepare) {
                z = true;
            }
            i2 = this.onPlay.AudioAttributesCompatParcelizer ? this.read.getResources().getDisplayMetrics().heightPixels : this.onPlay.IconCompatParcelizer;
        } else {
            int i4 = this.onMediaButtonEvent;
            if (i4 != Integer.MIN_VALUE && i4 != iOnMediaButtonEvent) {
                z = true;
            }
            i2 = this.onPlay.AudioAttributesCompatParcelizer ? this.read.getResources().getDisplayMetrics().widthPixels : this.onPlay.IconCompatParcelizer;
        }
        int i5 = i2;
        this.onPlayFromMediaId = iOnPrepare;
        this.onMediaButtonEvent = iOnMediaButtonEvent;
        int i6 = this.AudioAttributesCompatParcelizer;
        if (i6 != -1 || (this.onPrepareFromMediaId == -1 && !z)) {
            int iMin = i6 != -1 ? Math.min(i6, this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer) : this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
            if (MediaBrowserCompatMediaItem()) {
                if (this.MediaBrowserCompatItemReceiver.size() > 0) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, iMin);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec, iMakeMeasureSpec2, i5, iMin, this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
                } else {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(i);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.MediaBrowserCompatItemReceiver);
                }
            } else if (this.MediaBrowserCompatItemReceiver.size() > 0) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, iMin);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec2, iMakeMeasureSpec, i5, iMin, this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
            } else {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(i);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec, iMakeMeasureSpec2, i5, 0, this.MediaBrowserCompatItemReceiver);
            }
            this.MediaBrowserCompatItemReceiver = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(iMin);
            return;
        }
        if (this.IconCompatParcelizer.write) {
            return;
        }
        this.MediaBrowserCompatItemReceiver.clear();
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        if (MediaBrowserCompatMediaItem()) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
        } else {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec, iMakeMeasureSpec2, i5, this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
        }
        this.MediaBrowserCompatItemReceiver = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer();
        this.IconCompatParcelizer.IconCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer];
        this.onPlay.read = this.IconCompatParcelizer.IconCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        super.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.onPlayFromUri = null;
        this.onPrepareFromMediaId = -1;
        this.onPrepare = Integer.MIN_VALUE;
        this.AudioAttributesCompatParcelizer = -1;
        this.IconCompatParcelizer.read();
        this.onRemoveQueueItemAt.clear();
    }

    private void onSkipToQueueItem() {
        int iOnPlayFromSearch = onPlayFromSearch();
        int i = this.AudioAttributesImplApi21Parcelizer;
        if (i == 0) {
            this.handleMediaPlayPauseIfPendingOnHandler = iOnPlayFromSearch == 1;
            this.onCustomAction = this.onCommand == 2;
            return;
        }
        if (i == 1) {
            this.handleMediaPlayPauseIfPendingOnHandler = iOnPlayFromSearch != 1;
            this.onCustomAction = this.onCommand == 2;
            return;
        }
        if (i == 2) {
            boolean z = iOnPlayFromSearch == 1;
            this.handleMediaPlayPauseIfPendingOnHandler = z;
            if (this.onCommand == 2) {
                this.handleMediaPlayPauseIfPendingOnHandler = !z;
            }
            this.onCustomAction = false;
            return;
        }
        if (i == 3) {
            boolean z2 = iOnPlayFromSearch == 1;
            this.handleMediaPlayPauseIfPendingOnHandler = z2;
            if (this.onCommand == 2) {
                this.handleMediaPlayPauseIfPendingOnHandler = !z2;
            }
            this.onCustomAction = true;
            return;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.onCustomAction = false;
    }

    private void IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, audioAttributesCompatParcelizer, this.onPlayFromUri) || read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, audioAttributesCompatParcelizer)) {
            return;
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = 0;
        audioAttributesCompatParcelizer.IconCompatParcelizer = 0;
    }

    private boolean AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, SavedState savedState) {
        int i;
        View viewMediaBrowserCompatCustomActionResultReceiver;
        int iAudioAttributesCompatParcelizer;
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write() && (i = this.onPrepareFromMediaId) != -1) {
            if (i < 0 || i >= mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read()) {
                this.onPrepareFromMediaId = -1;
                this.onPrepare = Integer.MIN_VALUE;
            } else {
                audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = this.onPrepareFromMediaId;
                audioAttributesCompatParcelizer.IconCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer];
                SavedState savedState2 = this.onPlayFromUri;
                if (savedState2 == null || !savedState2.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read())) {
                    if (this.onPrepare == Integer.MIN_VALUE) {
                        View viewWrite = write(this.onPrepareFromMediaId);
                        if (viewWrite != null) {
                            if (this.onFastForward.RemoteActionCompatParcelizer(viewWrite) <= this.onFastForward.MediaBrowserCompatItemReceiver()) {
                                if (this.onFastForward.AudioAttributesCompatParcelizer(viewWrite) - this.onFastForward.AudioAttributesImplApi21Parcelizer() >= 0) {
                                    if (this.onFastForward.RemoteActionCompatParcelizer() - this.onFastForward.IconCompatParcelizer(viewWrite) < 0) {
                                        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = this.onFastForward.RemoteActionCompatParcelizer();
                                        audioAttributesCompatParcelizer.write = true;
                                        return true;
                                    }
                                    if (audioAttributesCompatParcelizer.write) {
                                        iAudioAttributesCompatParcelizer = this.onFastForward.IconCompatParcelizer(viewWrite) + this.onFastForward.AudioAttributesImplApi26Parcelizer();
                                    } else {
                                        iAudioAttributesCompatParcelizer = this.onFastForward.AudioAttributesCompatParcelizer(viewWrite);
                                    }
                                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer;
                                } else {
                                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = this.onFastForward.AudioAttributesImplApi21Parcelizer();
                                    audioAttributesCompatParcelizer.write = false;
                                    return true;
                                }
                            } else {
                                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                                return true;
                            }
                        } else {
                            if (onPlay() > 0 && (viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(0)) != null) {
                                audioAttributesCompatParcelizer.write = this.onPrepareFromMediaId < MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver);
                            }
                            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                        }
                        return true;
                    }
                    if (MediaBrowserCompatMediaItem() || !this.handleMediaPlayPauseIfPendingOnHandler) {
                        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = this.onFastForward.AudioAttributesImplApi21Parcelizer() + this.onPrepare;
                    } else {
                        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = this.onPrepare - this.onFastForward.AudioAttributesCompatParcelizer();
                    }
                    return true;
                }
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = this.onFastForward.AudioAttributesImplApi21Parcelizer() + savedState.RemoteActionCompatParcelizer;
                AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
                audioAttributesCompatParcelizer.IconCompatParcelizer = -1;
                return true;
            }
        }
        return false;
    }

    private boolean read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        View viewAudioAttributesImplApi21Parcelizer;
        int iAudioAttributesImplApi21Parcelizer;
        if (onPlay() == 0) {
            return false;
        }
        if (audioAttributesCompatParcelizer.write) {
            viewAudioAttributesImplApi21Parcelizer = RatingCompat(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read());
        } else {
            viewAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read());
        }
        if (viewAudioAttributesImplApi21Parcelizer == null) {
            return false;
        }
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(viewAudioAttributesImplApi21Parcelizer);
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write() || !M_()) {
            return true;
        }
        if (this.onFastForward.AudioAttributesCompatParcelizer(viewAudioAttributesImplApi21Parcelizer) < this.onFastForward.RemoteActionCompatParcelizer() && this.onFastForward.IconCompatParcelizer(viewAudioAttributesImplApi21Parcelizer) >= this.onFastForward.AudioAttributesImplApi21Parcelizer()) {
            return true;
        }
        if (audioAttributesCompatParcelizer.write) {
            iAudioAttributesImplApi21Parcelizer = this.onFastForward.RemoteActionCompatParcelizer();
        } else {
            iAudioAttributesImplApi21Parcelizer = this.onFastForward.AudioAttributesImplApi21Parcelizer();
        }
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = iAudioAttributesImplApi21Parcelizer;
        return true;
    }

    private View AudioAttributesImplApi21Parcelizer(int i) {
        View viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0, onPlay(), i);
        if (viewAudioAttributesCompatParcelizer == null) {
            return null;
        }
        int i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[MediaDescriptionCompat(viewAudioAttributesCompatParcelizer)];
        if (i2 == -1) {
            return null;
        }
        return RemoteActionCompatParcelizer(viewAudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.get(i2));
    }

    private View RatingCompat(int i) {
        View viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(onPlay() - 1, -1, i);
        if (viewAudioAttributesCompatParcelizer == null) {
            return null;
        }
        return read(viewAudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.get(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[MediaDescriptionCompat(viewAudioAttributesCompatParcelizer)]));
    }

    private View AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        int iMediaDescriptionCompat;
        onCommand();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int iAudioAttributesImplApi21Parcelizer = this.onFastForward.AudioAttributesImplApi21Parcelizer();
        int iRemoteActionCompatParcelizer = this.onFastForward.RemoteActionCompatParcelizer();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
            if (viewMediaBrowserCompatCustomActionResultReceiver != null && (iMediaDescriptionCompat = MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver)) >= 0 && iMediaDescriptionCompat < i3) {
                if (((RecyclerView.LayoutParams) viewMediaBrowserCompatCustomActionResultReceiver.getLayoutParams()).Q_()) {
                    if (view2 == null) {
                        view2 = viewMediaBrowserCompatCustomActionResultReceiver;
                    }
                } else {
                    if (this.onFastForward.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) >= iAudioAttributesImplApi21Parcelizer && this.onFastForward.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) <= iRemoteActionCompatParcelizer) {
                        return viewMediaBrowserCompatCustomActionResultReceiver;
                    }
                    if (view == null) {
                        view = viewMediaBrowserCompatCustomActionResultReceiver;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private View onSkipToPrevious() {
        return MediaBrowserCompatCustomActionResultReceiver(0);
    }

    private int read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, read readVar) {
        if (readVar.AudioAttributesImplApi26Parcelizer != Integer.MIN_VALUE) {
            if (readVar.IconCompatParcelizer < 0) {
                read.MediaBrowserCompatCustomActionResultReceiver(readVar, readVar.IconCompatParcelizer);
            }
            IconCompatParcelizer(mediaDescriptionCompat, readVar);
        }
        int i = readVar.IconCompatParcelizer;
        int iAudioAttributesCompatParcelizer = readVar.IconCompatParcelizer;
        boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        int iIconCompatParcelizer = 0;
        while (true) {
            if ((iAudioAttributesCompatParcelizer <= 0 && !this.onPlay.AudioAttributesCompatParcelizer) || !readVar.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatItemReceiver)) {
                break;
            }
            skipInputUntilPosition skipinputuntilposition = this.MediaBrowserCompatItemReceiver.get(readVar.read);
            readVar.MediaBrowserCompatItemReceiver = skipinputuntilposition.MediaBrowserCompatItemReceiver;
            iIconCompatParcelizer += IconCompatParcelizer(skipinputuntilposition, readVar);
            if (zMediaBrowserCompatMediaItem || !this.handleMediaPlayPauseIfPendingOnHandler) {
                read.IconCompatParcelizer(readVar, skipinputuntilposition.AudioAttributesCompatParcelizer() * readVar.MediaBrowserCompatCustomActionResultReceiver);
            } else {
                read.write(readVar, skipinputuntilposition.AudioAttributesCompatParcelizer() * readVar.MediaBrowserCompatCustomActionResultReceiver);
            }
            iAudioAttributesCompatParcelizer -= skipinputuntilposition.AudioAttributesCompatParcelizer();
        }
        read.read(readVar, iIconCompatParcelizer);
        if (readVar.AudioAttributesImplApi26Parcelizer != Integer.MIN_VALUE) {
            read.MediaBrowserCompatCustomActionResultReceiver(readVar, iIconCompatParcelizer);
            if (readVar.IconCompatParcelizer < 0) {
                read.MediaBrowserCompatCustomActionResultReceiver(readVar, readVar.IconCompatParcelizer);
            }
            IconCompatParcelizer(mediaDescriptionCompat, readVar);
        }
        return i - readVar.IconCompatParcelizer;
    }

    private void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, read readVar) {
        if (readVar.AudioAttributesImplApi21Parcelizer) {
            if (readVar.MediaBrowserCompatCustomActionResultReceiver == -1) {
                AudioAttributesCompatParcelizer(mediaDescriptionCompat, readVar);
            } else {
                RemoteActionCompatParcelizer(mediaDescriptionCompat, readVar);
            }
        }
    }

    private void RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, read readVar) {
        int iOnPlay;
        View viewMediaBrowserCompatCustomActionResultReceiver;
        if (readVar.AudioAttributesImplApi26Parcelizer < 0 || (iOnPlay = onPlay()) == 0 || (viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(0)) == null) {
            return;
        }
        int i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        skipInputUntilPosition skipinputuntilposition = this.MediaBrowserCompatItemReceiver.get(i);
        int i3 = 0;
        while (true) {
            if (i3 >= iOnPlay) {
                break;
            }
            View viewMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(i3);
            if (viewMediaBrowserCompatCustomActionResultReceiver2 != null) {
                if (!write(viewMediaBrowserCompatCustomActionResultReceiver2, readVar.AudioAttributesImplApi26Parcelizer)) {
                    break;
                }
                if (skipinputuntilposition.AudioAttributesImplApi21Parcelizer != MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver2)) {
                    continue;
                } else if (i >= this.MediaBrowserCompatItemReceiver.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += readVar.MediaBrowserCompatCustomActionResultReceiver;
                    skipinputuntilposition = this.MediaBrowserCompatItemReceiver.get(i);
                    i2 = i3;
                }
            }
            i3++;
        }
        read(mediaDescriptionCompat, 0, i2);
    }

    private boolean write(View view, int i) {
        return (MediaBrowserCompatMediaItem() || !this.handleMediaPlayPauseIfPendingOnHandler) ? this.onFastForward.IconCompatParcelizer(view) <= i : this.onFastForward.write() - this.onFastForward.AudioAttributesCompatParcelizer(view) <= i;
    }

    private void AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, read readVar) {
        int iOnPlay;
        int i;
        View viewMediaBrowserCompatCustomActionResultReceiver;
        int i2;
        if (readVar.AudioAttributesImplApi26Parcelizer < 0 || (iOnPlay = onPlay()) == 0 || (viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iOnPlay - 1)) == null || (i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver)]) == -1) {
            return;
        }
        skipInputUntilPosition skipinputuntilposition = this.MediaBrowserCompatItemReceiver.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View viewMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(i3);
            if (viewMediaBrowserCompatCustomActionResultReceiver2 != null) {
                if (!IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver2, readVar.AudioAttributesImplApi26Parcelizer)) {
                    break;
                }
                if (skipinputuntilposition.MediaBrowserCompatItemReceiver != MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver2)) {
                    continue;
                } else if (i2 <= 0) {
                    iOnPlay = i3;
                    break;
                } else {
                    i2 += readVar.MediaBrowserCompatCustomActionResultReceiver;
                    skipinputuntilposition = this.MediaBrowserCompatItemReceiver.get(i2);
                    iOnPlay = i3;
                }
            }
            i3--;
        }
        read(mediaDescriptionCompat, iOnPlay, i);
    }

    private boolean IconCompatParcelizer(View view, int i) {
        return (MediaBrowserCompatMediaItem() || !this.handleMediaPlayPauseIfPendingOnHandler) ? this.onFastForward.AudioAttributesCompatParcelizer(view) >= this.onFastForward.write() - i : this.onFastForward.IconCompatParcelizer(view) <= i;
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i, int i2) {
        while (i2 >= i) {
            IconCompatParcelizer(i2, mediaDescriptionCompat);
            i2--;
        }
    }

    private int IconCompatParcelizer(skipInputUntilPosition skipinputuntilposition, read readVar) {
        if (MediaBrowserCompatMediaItem()) {
            return read(skipinputuntilposition, readVar);
        }
        return RemoteActionCompatParcelizer(skipinputuntilposition, readVar);
    }

    private int read(skipInputUntilPosition skipinputuntilposition, read readVar) {
        int i;
        LayoutParams layoutParams;
        View view;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iOnPrepare = onPrepare();
        int i2 = readVar.AudioAttributesImplBaseParcelizer;
        if (readVar.MediaBrowserCompatCustomActionResultReceiver == -1) {
            i2 -= skipinputuntilposition.write;
        }
        int i3 = readVar.MediaBrowserCompatItemReceiver;
        float measuredWidth = paddingLeft - this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        float measuredWidth2 = (iOnPrepare - paddingRight) - this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i4 = skipinputuntilposition.read();
        int i5 = 0;
        int i6 = i3;
        while (i6 < i3 + i4) {
            View viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i6);
            if (viewAudioAttributesCompatParcelizer != null) {
                if (readVar.MediaBrowserCompatCustomActionResultReceiver == 1) {
                    AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer, write);
                    AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer);
                } else {
                    AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer, write);
                    read(viewAudioAttributesCompatParcelizer, i5);
                    i5++;
                }
                int i7 = i5;
                long j = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer[i6];
                int i8 = isSeekable.read(j);
                int iRemoteActionCompatParcelizer = isSeekable.RemoteActionCompatParcelizer(j);
                LayoutParams layoutParams2 = (LayoutParams) viewAudioAttributesCompatParcelizer.getLayoutParams();
                if (write(viewAudioAttributesCompatParcelizer, i8, iRemoteActionCompatParcelizer, layoutParams2)) {
                    viewAudioAttributesCompatParcelizer.measure(i8, iRemoteActionCompatParcelizer);
                }
                float fMediaBrowserCompatSearchResultReceiver = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + MediaBrowserCompatSearchResultReceiver(viewAudioAttributesCompatParcelizer);
                float fHandleMediaPlayPauseIfPendingOnHandler = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + handleMediaPlayPauseIfPendingOnHandler(viewAudioAttributesCompatParcelizer));
                int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 + MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(viewAudioAttributesCompatParcelizer);
                if (this.handleMediaPlayPauseIfPendingOnHandler) {
                    i = i2;
                    layoutParams = layoutParams2;
                    view = viewAudioAttributesCompatParcelizer;
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(viewAudioAttributesCompatParcelizer, skipinputuntilposition, Math.round(fHandleMediaPlayPauseIfPendingOnHandler) - viewAudioAttributesCompatParcelizer.getMeasuredWidth(), iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, Math.round(fHandleMediaPlayPauseIfPendingOnHandler), viewAudioAttributesCompatParcelizer.getMeasuredHeight() + iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                } else {
                    i = i2;
                    layoutParams = layoutParams2;
                    view = viewAudioAttributesCompatParcelizer;
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(view, skipinputuntilposition, Math.round(fMediaBrowserCompatSearchResultReceiver), iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, view.getMeasuredWidth() + Math.round(fMediaBrowserCompatSearchResultReceiver), iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + view.getMeasuredHeight());
                }
                measuredWidth = fMediaBrowserCompatSearchResultReceiver + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + handleMediaPlayPauseIfPendingOnHandler(view) + fMax;
                measuredWidth2 = fHandleMediaPlayPauseIfPendingOnHandler - (((view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + MediaBrowserCompatSearchResultReceiver(view)) + fMax);
                i5 = i7;
            } else {
                i = i2;
            }
            i6++;
            i2 = i;
        }
        read.AudioAttributesImplApi21Parcelizer(readVar, this.onPlay.MediaBrowserCompatCustomActionResultReceiver);
        return skipinputuntilposition.AudioAttributesCompatParcelizer();
    }

    private int RemoteActionCompatParcelizer(skipInputUntilPosition skipinputuntilposition, read readVar) {
        LayoutParams layoutParams;
        View view;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int iOnMediaButtonEvent = onMediaButtonEvent();
        int i = readVar.AudioAttributesImplBaseParcelizer;
        int i2 = readVar.AudioAttributesImplBaseParcelizer;
        if (readVar.MediaBrowserCompatCustomActionResultReceiver == -1) {
            i -= skipinputuntilposition.write;
            i2 += skipinputuntilposition.write;
        }
        int i3 = i;
        int i4 = i2;
        int i5 = readVar.MediaBrowserCompatItemReceiver;
        float measuredHeight = paddingTop - this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        float measuredHeight2 = (iOnMediaButtonEvent - paddingBottom) - this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i6 = skipinputuntilposition.read();
        int i7 = 0;
        for (int i8 = i5; i8 < i5 + i6; i8++) {
            View viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i8);
            if (viewAudioAttributesCompatParcelizer != null) {
                long j = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer[i8];
                int i9 = isSeekable.read(j);
                int iRemoteActionCompatParcelizer = isSeekable.RemoteActionCompatParcelizer(j);
                LayoutParams layoutParams2 = (LayoutParams) viewAudioAttributesCompatParcelizer.getLayoutParams();
                if (write(viewAudioAttributesCompatParcelizer, i9, iRemoteActionCompatParcelizer, layoutParams2)) {
                    viewAudioAttributesCompatParcelizer.measure(i9, iRemoteActionCompatParcelizer);
                }
                float fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(viewAudioAttributesCompatParcelizer);
                float fAudioAttributesImplApi26Parcelizer = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + AudioAttributesImplApi26Parcelizer(viewAudioAttributesCompatParcelizer));
                if (readVar.MediaBrowserCompatCustomActionResultReceiver == 1) {
                    AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer, write);
                    AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer);
                } else {
                    AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer, write);
                    read(viewAudioAttributesCompatParcelizer, i7);
                    i7++;
                }
                int i10 = i7;
                int iMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(viewAudioAttributesCompatParcelizer) + i3;
                int iHandleMediaPlayPauseIfPendingOnHandler = i4 - handleMediaPlayPauseIfPendingOnHandler(viewAudioAttributesCompatParcelizer);
                boolean z = this.handleMediaPlayPauseIfPendingOnHandler;
                if (z) {
                    if (this.onCustomAction) {
                        layoutParams = layoutParams2;
                        view = viewAudioAttributesCompatParcelizer;
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(viewAudioAttributesCompatParcelizer, skipinputuntilposition, z, iHandleMediaPlayPauseIfPendingOnHandler - viewAudioAttributesCompatParcelizer.getMeasuredWidth(), Math.round(fAudioAttributesImplApi26Parcelizer) - viewAudioAttributesCompatParcelizer.getMeasuredHeight(), iHandleMediaPlayPauseIfPendingOnHandler, Math.round(fAudioAttributesImplApi26Parcelizer));
                    } else {
                        layoutParams = layoutParams2;
                        view = viewAudioAttributesCompatParcelizer;
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(view, skipinputuntilposition, z, iHandleMediaPlayPauseIfPendingOnHandler - view.getMeasuredWidth(), Math.round(fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), iHandleMediaPlayPauseIfPendingOnHandler, view.getMeasuredHeight() + Math.round(fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                    }
                } else {
                    layoutParams = layoutParams2;
                    view = viewAudioAttributesCompatParcelizer;
                    if (this.onCustomAction) {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(view, skipinputuntilposition, z, iMediaBrowserCompatSearchResultReceiver, Math.round(fAudioAttributesImplApi26Parcelizer) - view.getMeasuredHeight(), iMediaBrowserCompatSearchResultReceiver + view.getMeasuredWidth(), Math.round(fAudioAttributesImplApi26Parcelizer));
                    } else {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(view, skipinputuntilposition, z, iMediaBrowserCompatSearchResultReceiver, Math.round(fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), iMediaBrowserCompatSearchResultReceiver + view.getMeasuredWidth(), view.getMeasuredHeight() + Math.round(fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                    }
                }
                measuredHeight = fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + AudioAttributesImplApi26Parcelizer(view) + fMax;
                measuredHeight2 = fAudioAttributesImplApi26Parcelizer - (((view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view)) + fMax);
                i7 = i10;
            }
        }
        read.AudioAttributesImplApi21Parcelizer(readVar, this.onPlay.MediaBrowserCompatCustomActionResultReceiver);
        return skipinputuntilposition.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final boolean MediaBrowserCompatMediaItem() {
        int i = this.AudioAttributesImplApi21Parcelizer;
        return i == 0 || i == 1;
    }

    private void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z, boolean z2) {
        if (z2) {
            setSessionImpl();
        } else {
            this.onPlay.AudioAttributesCompatParcelizer = false;
        }
        if (!MediaBrowserCompatMediaItem() && this.handleMediaPlayPauseIfPendingOnHandler) {
            this.onPlay.IconCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer - getPaddingRight();
        } else {
            this.onPlay.IconCompatParcelizer = this.onFastForward.RemoteActionCompatParcelizer() - audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        this.onPlay.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
        read.RatingCompat(this.onPlay);
        this.onPlay.MediaBrowserCompatCustomActionResultReceiver = 1;
        this.onPlay.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        this.onPlay.AudioAttributesImplApi26Parcelizer = Integer.MIN_VALUE;
        this.onPlay.read = audioAttributesCompatParcelizer.IconCompatParcelizer;
        if (!z || this.MediaBrowserCompatItemReceiver.size() <= 1 || audioAttributesCompatParcelizer.IconCompatParcelizer < 0 || audioAttributesCompatParcelizer.IconCompatParcelizer >= this.MediaBrowserCompatItemReceiver.size() - 1) {
            return;
        }
        skipInputUntilPosition skipinputuntilposition = this.MediaBrowserCompatItemReceiver.get(audioAttributesCompatParcelizer.IconCompatParcelizer);
        read.IconCompatParcelizer(this.onPlay);
        read.RatingCompat(this.onPlay, skipinputuntilposition.read());
    }

    private void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z, boolean z2) {
        if (z2) {
            setSessionImpl();
        } else {
            this.onPlay.AudioAttributesCompatParcelizer = false;
        }
        if (!MediaBrowserCompatMediaItem() && this.handleMediaPlayPauseIfPendingOnHandler) {
            this.onPlay.IconCompatParcelizer = (this.onPlayFromSearch.getWidth() - audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) - this.onFastForward.AudioAttributesImplApi21Parcelizer();
        } else {
            this.onPlay.IconCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer - this.onFastForward.AudioAttributesImplApi21Parcelizer();
        }
        this.onPlay.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
        read.RatingCompat(this.onPlay);
        this.onPlay.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.onPlay.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        this.onPlay.AudioAttributesImplApi26Parcelizer = Integer.MIN_VALUE;
        this.onPlay.read = audioAttributesCompatParcelizer.IconCompatParcelizer;
        if (!z || audioAttributesCompatParcelizer.IconCompatParcelizer <= 0 || this.MediaBrowserCompatItemReceiver.size() <= audioAttributesCompatParcelizer.IconCompatParcelizer) {
            return;
        }
        skipInputUntilPosition skipinputuntilposition = this.MediaBrowserCompatItemReceiver.get(audioAttributesCompatParcelizer.IconCompatParcelizer);
        read.AudioAttributesImplApi26Parcelizer(this.onPlay);
        read.MediaBrowserCompatSearchResultReceiver(this.onPlay, skipinputuntilposition.read());
    }

    private void setSessionImpl() {
        int iOnSeekTo;
        if (MediaBrowserCompatMediaItem()) {
            iOnSeekTo = onFastForward();
        } else {
            iOnSeekTo = onSeekTo();
        }
        this.onPlay.AudioAttributesCompatParcelizer = iOnSeekTo == 0 || iOnSeekTo == Integer.MIN_VALUE;
    }

    private void onCommand() {
        if (this.onFastForward != null) {
            return;
        }
        if (MediaBrowserCompatMediaItem()) {
            if (this.onCommand == 0) {
                this.onFastForward = UIntDeserializer.IconCompatParcelizer(this);
                this.onPrepareFromUri = UIntDeserializer.AudioAttributesCompatParcelizer(this);
                return;
            } else {
                this.onFastForward = UIntDeserializer.AudioAttributesCompatParcelizer(this);
                this.onPrepareFromUri = UIntDeserializer.IconCompatParcelizer(this);
                return;
            }
        }
        if (this.onCommand == 0) {
            this.onFastForward = UIntDeserializer.AudioAttributesCompatParcelizer(this);
            this.onPrepareFromUri = UIntDeserializer.IconCompatParcelizer(this);
        } else {
            this.onFastForward = UIntDeserializer.IconCompatParcelizer(this);
            this.onPrepareFromUri = UIntDeserializer.AudioAttributesCompatParcelizer(this);
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.onPlay == null) {
            this.onPlay = new read((byte) 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(int i) {
        this.onPrepareFromMediaId = i;
        this.onPrepare = Integer.MIN_VALUE;
        SavedState savedState = this.onPlayFromUri;
        if (savedState != null) {
            savedState.write();
        }
        onSetRating();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        deserializeKeylj4SQcc deserializekeylj4sqcc = new deserializeKeylj4SQcc(recyclerView.getContext());
        deserializekeylj4sqcc.RemoteActionCompatParcelizer(i);
        RemoteActionCompatParcelizer(deserializekeylj4sqcc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView) {
        super.AudioAttributesCompatParcelizer(recyclerView);
        this.onPlayFromSearch = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(RecyclerView recyclerView, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        super.read(recyclerView, mediaDescriptionCompat);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean AudioAttributesImplApi26Parcelizer() {
        if (this.onCommand == 0) {
            return MediaBrowserCompatMediaItem();
        }
        if (!MediaBrowserCompatMediaItem()) {
            return true;
        }
        int iOnPrepare = onPrepare();
        View view = this.onPlayFromSearch;
        return iOnPrepare > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean AudioAttributesImplApi21Parcelizer() {
        if (this.onCommand == 0) {
            return !MediaBrowserCompatMediaItem();
        }
        if (!MediaBrowserCompatMediaItem()) {
            int iOnMediaButtonEvent = onMediaButtonEvent();
            View view = this.onPlayFromSearch;
            if (iOnMediaButtonEvent <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (!MediaBrowserCompatMediaItem() || this.onCommand == 0) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            this.onRemoveQueueItemAt.clear();
            return iAudioAttributesCompatParcelizer;
        }
        int iMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(i);
        AudioAttributesCompatParcelizer.read(this.IconCompatParcelizer, iMediaBrowserCompatSearchResultReceiver);
        this.onPrepareFromUri.read(-iMediaBrowserCompatSearchResultReceiver);
        return iMediaBrowserCompatSearchResultReceiver;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (MediaBrowserCompatMediaItem() || (this.onCommand == 0 && !MediaBrowserCompatMediaItem())) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            this.onRemoveQueueItemAt.clear();
            return iAudioAttributesCompatParcelizer;
        }
        int iMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(i);
        AudioAttributesCompatParcelizer.read(this.IconCompatParcelizer, iMediaBrowserCompatSearchResultReceiver);
        this.onPrepareFromUri.read(-iMediaBrowserCompatSearchResultReceiver);
        return iMediaBrowserCompatSearchResultReceiver;
    }

    private int AudioAttributesCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0 || i == 0) {
            return 0;
        }
        onCommand();
        int i2 = 1;
        this.onPlay.AudioAttributesImplApi21Parcelizer = true;
        boolean z = !MediaBrowserCompatMediaItem() && this.handleMediaPlayPauseIfPendingOnHandler;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        AudioAttributesImplApi21Parcelizer(i2, iAbs);
        int i3 = this.onPlay.AudioAttributesImplApi26Parcelizer + read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPlay);
        if (i3 < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > i3) {
                i = (-i2) * i3;
            }
        } else if (iAbs > i3) {
            i = i2 * i3;
        }
        this.onFastForward.read(-i);
        this.onPlay.RemoteActionCompatParcelizer = i;
        return i;
    }

    private int MediaBrowserCompatSearchResultReceiver(int i) {
        if (onPlay() == 0 || i == 0) {
            return 0;
        }
        onCommand();
        boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        View view = this.onPlayFromSearch;
        int width = zMediaBrowserCompatMediaItem ? view.getWidth() : view.getHeight();
        int iOnPrepare = zMediaBrowserCompatMediaItem ? onPrepare() : onMediaButtonEvent();
        if (onPlayFromSearch() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((iOnPrepare + this.IconCompatParcelizer.RemoteActionCompatParcelizer) - width, iAbs);
            }
            if (this.IconCompatParcelizer.RemoteActionCompatParcelizer + i > 0) {
                return -this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            }
        } else {
            if (i > 0) {
                return Math.min((iOnPrepare - this.IconCompatParcelizer.RemoteActionCompatParcelizer) - width, i);
            }
            if (this.IconCompatParcelizer.RemoteActionCompatParcelizer + i < 0) {
                return -this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            }
        }
        return i;
    }

    private void AudioAttributesImplApi21Parcelizer(int i, int i2) {
        this.onPlay.MediaBrowserCompatCustomActionResultReceiver = i;
        boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(onPrepare(), onSeekTo());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(onMediaButtonEvent(), onFastForward());
        boolean z = !zMediaBrowserCompatMediaItem && this.handleMediaPlayPauseIfPendingOnHandler;
        if (i == 1) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(onPlay() - 1);
            if (viewMediaBrowserCompatCustomActionResultReceiver == null) {
                return;
            }
            this.onPlay.AudioAttributesImplBaseParcelizer = this.onFastForward.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver);
            int iMediaDescriptionCompat = MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver);
            View view = read(viewMediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver.get(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[iMediaDescriptionCompat]));
            read.RatingCompat(this.onPlay);
            read readVar = this.onPlay;
            readVar.MediaBrowserCompatItemReceiver = iMediaDescriptionCompat + readVar.write;
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer.length <= this.onPlay.MediaBrowserCompatItemReceiver) {
                this.onPlay.read = -1;
            } else {
                this.onPlay.read = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[this.onPlay.MediaBrowserCompatItemReceiver];
            }
            if (z) {
                this.onPlay.AudioAttributesImplBaseParcelizer = this.onFastForward.AudioAttributesCompatParcelizer(view);
                this.onPlay.AudioAttributesImplApi26Parcelizer = (-this.onFastForward.AudioAttributesCompatParcelizer(view)) + this.onFastForward.AudioAttributesImplApi21Parcelizer();
                read readVar2 = this.onPlay;
                readVar2.AudioAttributesImplApi26Parcelizer = Math.max(readVar2.AudioAttributesImplApi26Parcelizer, 0);
            } else {
                this.onPlay.AudioAttributesImplBaseParcelizer = this.onFastForward.IconCompatParcelizer(view);
                this.onPlay.AudioAttributesImplApi26Parcelizer = this.onFastForward.IconCompatParcelizer(view) - this.onFastForward.RemoteActionCompatParcelizer();
            }
            if ((this.onPlay.read == -1 || this.onPlay.read > this.MediaBrowserCompatItemReceiver.size() - 1) && this.onPlay.MediaBrowserCompatItemReceiver <= AudioAttributesCompatParcelizer()) {
                int i3 = i2 - this.onPlay.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
                if (i3 > 0) {
                    if (zMediaBrowserCompatMediaItem) {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.onPlay.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatItemReceiver);
                    } else {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.onPlay.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatItemReceiver);
                    }
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(iMakeMeasureSpec, iMakeMeasureSpec2, this.onPlay.MediaBrowserCompatItemReceiver);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.onPlay.MediaBrowserCompatItemReceiver);
                }
            }
        } else {
            View viewMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(0);
            if (viewMediaBrowserCompatCustomActionResultReceiver2 == null) {
                return;
            }
            this.onPlay.AudioAttributesImplBaseParcelizer = this.onFastForward.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver2);
            int iMediaDescriptionCompat2 = MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver2);
            View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver2, this.MediaBrowserCompatItemReceiver.get(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[iMediaDescriptionCompat2]));
            read.RatingCompat(this.onPlay);
            int i4 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[iMediaDescriptionCompat2];
            if (i4 == -1) {
                i4 = 0;
            }
            if (i4 > 0) {
                this.onPlay.MediaBrowserCompatItemReceiver = iMediaDescriptionCompat2 - this.MediaBrowserCompatItemReceiver.get(i4 - 1).read();
            } else {
                this.onPlay.MediaBrowserCompatItemReceiver = -1;
            }
            this.onPlay.read = i4 > 0 ? i4 - 1 : 0;
            if (z) {
                this.onPlay.AudioAttributesImplBaseParcelizer = this.onFastForward.IconCompatParcelizer(viewRemoteActionCompatParcelizer);
                this.onPlay.AudioAttributesImplApi26Parcelizer = this.onFastForward.IconCompatParcelizer(viewRemoteActionCompatParcelizer) - this.onFastForward.RemoteActionCompatParcelizer();
                read readVar3 = this.onPlay;
                readVar3.AudioAttributesImplApi26Parcelizer = Math.max(readVar3.AudioAttributesImplApi26Parcelizer, 0);
            } else {
                this.onPlay.AudioAttributesImplBaseParcelizer = this.onFastForward.AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer);
                this.onPlay.AudioAttributesImplApi26Parcelizer = (-this.onFastForward.AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer)) + this.onFastForward.AudioAttributesImplApi21Parcelizer();
            }
        }
        read readVar4 = this.onPlay;
        readVar4.IconCompatParcelizer = i2 - readVar4.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View RemoteActionCompatParcelizer(android.view.View r6, kotlin.skipInputUntilPosition r7) {
        /*
            r5 = this;
            boolean r0 = r5.MediaBrowserCompatMediaItem()
            int r7 = r7.AudioAttributesImplApi26Parcelizer
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.MediaBrowserCompatCustomActionResultReceiver(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.handleMediaPlayPauseIfPendingOnHandler
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            o.UIntDeserializer r3 = r5.onFastForward
            int r3 = r3.IconCompatParcelizer(r6)
            o.UIntDeserializer r4 = r5.onFastForward
            int r4 = r4.IconCompatParcelizer(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            o.UIntDeserializer r3 = r5.onFastForward
            int r3 = r3.AudioAttributesCompatParcelizer(r6)
            o.UIntDeserializer r4 = r5.onFastForward
            int r4 = r4.AudioAttributesCompatParcelizer(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.RemoteActionCompatParcelizer(android.view.View, o.skipInputUntilPosition):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View read(android.view.View r7, kotlin.skipInputUntilPosition r8) {
        /*
            r6 = this;
            boolean r0 = r6.MediaBrowserCompatMediaItem()
            int r1 = r6.onPlay()
            int r1 = r1 + (-2)
            int r2 = r6.onPlay()
            int r8 = r8.AudioAttributesImplApi26Parcelizer
        L10:
            int r3 = r2 - r8
            int r3 = r3 + (-1)
            if (r1 <= r3) goto L4c
            android.view.View r3 = r6.MediaBrowserCompatCustomActionResultReceiver(r1)
            if (r3 == 0) goto L49
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L25
            goto L49
        L25:
            boolean r4 = r6.handleMediaPlayPauseIfPendingOnHandler
            if (r4 == 0) goto L3a
            if (r0 != 0) goto L3a
            o.UIntDeserializer r4 = r6.onFastForward
            int r4 = r4.AudioAttributesCompatParcelizer(r7)
            o.UIntDeserializer r5 = r6.onFastForward
            int r5 = r5.AudioAttributesCompatParcelizer(r3)
            if (r4 <= r5) goto L49
            goto L48
        L3a:
            o.UIntDeserializer r4 = r6.onFastForward
            int r4 = r4.IconCompatParcelizer(r7)
            o.UIntDeserializer r5 = r6.onFastForward
            int r5 = r5.IconCompatParcelizer(r3)
            if (r4 >= r5) goto L49
        L48:
            r7 = r3
        L49:
            int r1 = r1 + (-1)
            goto L10
        L4c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.read(android.view.View, o.skipInputUntilPosition):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int MediaBrowserCompatItemReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return MediaBrowserCompatCustomActionResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesImplBaseParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return MediaBrowserCompatCustomActionResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int MediaBrowserCompatCustomActionResultReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        int i = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        onCommand();
        View viewAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
        View viewRatingCompat = RatingCompat(i);
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() == 0 || viewAudioAttributesImplApi21Parcelizer == null || viewRatingCompat == null) {
            return 0;
        }
        return Math.min(this.onFastForward.MediaBrowserCompatItemReceiver(), this.onFastForward.IconCompatParcelizer(viewRatingCompat) - this.onFastForward.AudioAttributesCompatParcelizer(viewAudioAttributesImplApi21Parcelizer));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int AudioAttributesImplApi26Parcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        int i = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        View viewAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
        View viewRatingCompat = RatingCompat(i);
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() != 0 && viewAudioAttributesImplApi21Parcelizer != null && viewRatingCompat != null) {
            int iMediaDescriptionCompat = MediaDescriptionCompat(viewAudioAttributesImplApi21Parcelizer);
            int iMediaDescriptionCompat2 = MediaDescriptionCompat(viewRatingCompat);
            int iAbs = Math.abs(this.onFastForward.IconCompatParcelizer(viewRatingCompat) - this.onFastForward.AudioAttributesCompatParcelizer(viewAudioAttributesImplApi21Parcelizer));
            int i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[iMediaDescriptionCompat];
            if (i2 != 0 && i2 != -1) {
                return Math.round((i2 * (iAbs / ((this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer[iMediaDescriptionCompat2] - i2) + 1))) + (this.onFastForward.AudioAttributesImplApi21Parcelizer() - this.onFastForward.AudioAttributesCompatParcelizer(viewAudioAttributesImplApi21Parcelizer)));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int AudioAttributesImplApi21Parcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        int i = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        View viewAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
        View viewRatingCompat = RatingCompat(i);
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() == 0 || viewAudioAttributesImplApi21Parcelizer == null || viewRatingCompat == null) {
            return 0;
        }
        int iOnStop = onStop();
        return (int) ((Math.abs(this.onFastForward.IconCompatParcelizer(viewRatingCompat) - this.onFastForward.AudioAttributesCompatParcelizer(viewAudioAttributesImplApi21Parcelizer)) / ((MediaSessionCompatQueueItem() - iOnStop) + 1)) * mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read());
    }

    private boolean write(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && onRewind() && IconCompatParcelizer(view.getWidth(), i, ((ViewGroup.LayoutParams) layoutParams).width) && IconCompatParcelizer(view.getHeight(), i2, ((ViewGroup.LayoutParams) layoutParams).height)) ? false : true;
    }

    private static boolean IconCompatParcelizer(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private void MediaMetadataCompat() {
        this.MediaBrowserCompatItemReceiver.clear();
        this.IconCompatParcelizer.read();
        AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    private int onPause(View view) {
        return RecyclerView.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    private int onPlay(View view) {
        return RecyclerView.MediaBrowserCompatItemReceiver.MediaMetadataCompat(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    private int onPrepare(View view) {
        return RecyclerView.MediaBrowserCompatItemReceiver.RatingCompat(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    private int onFastForward(View view) {
        return RecyclerView.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private boolean read(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iOnPrepare = onPrepare() - getPaddingRight();
        int iOnMediaButtonEvent = onMediaButtonEvent() - getPaddingBottom();
        int iOnPause = onPause(view);
        int iOnPrepare2 = onPrepare(view);
        return (iOnPause >= iOnPrepare || onPlay(view) >= paddingLeft) && (iOnPrepare2 >= iOnMediaButtonEvent || onFastForward(view) >= paddingTop);
    }

    private int onStop() {
        View view = read(0, onPlay());
        if (view == null) {
            return -1;
        }
        return MediaDescriptionCompat(view);
    }

    private int MediaSessionCompatQueueItem() {
        View view = read(onPlay() - 1, -1);
        if (view == null) {
            return -1;
        }
        return MediaDescriptionCompat(view);
    }

    private View read(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
            if (read(viewMediaBrowserCompatCustomActionResultReceiver, false)) {
                return viewMediaBrowserCompatCustomActionResultReceiver;
            }
            i += i3;
        }
        return null;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LayoutParams createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LayoutParams[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static LayoutParams IconCompatParcelizer(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            private static LayoutParams[] RemoteActionCompatParcelizer(int i) {
                return new LayoutParams[i];
            }
        };
        private float AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int IconCompatParcelizer;
        private float MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private boolean MediaBrowserCompatSearchResultReceiver;
        private int RatingCompat;
        private float read;

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatMediaItem() {
            return 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaMetadataCompat() {
            return ((ViewGroup.LayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int read() {
            return ((ViewGroup.LayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float AudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float write() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaDescriptionCompat() {
            return this.MediaBrowserCompatMediaItem;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void write(int i) {
            this.MediaBrowserCompatMediaItem = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int RatingCompat() {
            return this.RatingCompat;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void RemoteActionCompatParcelizer(int i) {
            this.RatingCompat = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean onCommand() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float IconCompatParcelizer() {
            return this.read;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int AudioAttributesImplApi21Parcelizer() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int AudioAttributesImplApi26Parcelizer() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int AudioAttributesImplBaseParcelizer() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatCustomActionResultReceiver = 1.0f;
            this.IconCompatParcelizer = -1;
            this.read = -1.0f;
            this.MediaBrowserCompatItemReceiver = 16777215;
            this.AudioAttributesImplApi26Parcelizer = 16777215;
        }

        public LayoutParams() {
            super(-2, -2);
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatCustomActionResultReceiver = 1.0f;
            this.IconCompatParcelizer = -1;
            this.read = -1.0f;
            this.MediaBrowserCompatItemReceiver = 16777215;
            this.AudioAttributesImplApi26Parcelizer = 16777215;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.AudioAttributesImplApi21Parcelizer);
            parcel.writeFloat(this.MediaBrowserCompatCustomActionResultReceiver);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeFloat(this.read);
            parcel.writeInt(this.MediaBrowserCompatMediaItem);
            parcel.writeInt(this.RatingCompat);
            parcel.writeInt(this.MediaBrowserCompatItemReceiver);
            parcel.writeInt(this.AudioAttributesImplApi26Parcelizer);
            parcel.writeByte(this.MediaBrowserCompatSearchResultReceiver ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.LayoutParams) this).height);
            parcel.writeInt(((ViewGroup.LayoutParams) this).width);
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatCustomActionResultReceiver = 1.0f;
            this.IconCompatParcelizer = -1;
            this.read = -1.0f;
            this.MediaBrowserCompatItemReceiver = 16777215;
            this.AudioAttributesImplApi26Parcelizer = 16777215;
            this.AudioAttributesImplApi21Parcelizer = parcel.readFloat();
            this.MediaBrowserCompatCustomActionResultReceiver = parcel.readFloat();
            this.IconCompatParcelizer = parcel.readInt();
            this.read = parcel.readFloat();
            this.MediaBrowserCompatMediaItem = parcel.readInt();
            this.RatingCompat = parcel.readInt();
            this.MediaBrowserCompatItemReceiver = parcel.readInt();
            this.AudioAttributesImplApi26Parcelizer = parcel.readInt();
            this.MediaBrowserCompatSearchResultReceiver = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.LayoutParams) this).height = parcel.readInt();
            ((ViewGroup.LayoutParams) this).width = parcel.readInt();
        }
    }

    class AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private boolean read;
        private boolean write;

        private AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer = 0;
        }

        /* synthetic */ AudioAttributesCompatParcelizer(FlexboxLayoutManager flexboxLayoutManager, byte b) {
            this();
        }

        static /* synthetic */ boolean AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizer.read = true;
            return true;
        }

        static /* synthetic */ boolean AudioAttributesImplApi26Parcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = true;
            return true;
        }

        static /* synthetic */ int MediaBrowserCompatItemReceiver(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = 0;
            return 0;
        }

        static /* synthetic */ int read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
            int i2 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer + i;
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = i2;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read() {
            this.AudioAttributesImplBaseParcelizer = -1;
            this.IconCompatParcelizer = -1;
            this.AudioAttributesCompatParcelizer = Integer.MIN_VALUE;
            this.AudioAttributesImplApi26Parcelizer = false;
            this.read = false;
            if (FlexboxLayoutManager.this.MediaBrowserCompatMediaItem()) {
                if (FlexboxLayoutManager.this.onCommand == 0) {
                    this.write = FlexboxLayoutManager.this.AudioAttributesImplApi21Parcelizer == 1;
                    return;
                } else {
                    this.write = FlexboxLayoutManager.this.onCommand == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.onCommand == 0) {
                this.write = FlexboxLayoutManager.this.AudioAttributesImplApi21Parcelizer == 3;
            } else {
                this.write = FlexboxLayoutManager.this.onCommand == 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer() {
            if (!FlexboxLayoutManager.this.MediaBrowserCompatMediaItem() && FlexboxLayoutManager.this.handleMediaPlayPauseIfPendingOnHandler) {
                this.AudioAttributesCompatParcelizer = this.write ? FlexboxLayoutManager.this.onFastForward.RemoteActionCompatParcelizer() : FlexboxLayoutManager.this.onPrepare() - FlexboxLayoutManager.this.onFastForward.AudioAttributesImplApi21Parcelizer();
            } else {
                this.AudioAttributesCompatParcelizer = this.write ? FlexboxLayoutManager.this.onFastForward.RemoteActionCompatParcelizer() : FlexboxLayoutManager.this.onFastForward.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(View view) {
            UIntDeserializer uIntDeserializer = FlexboxLayoutManager.this.onCommand == 0 ? FlexboxLayoutManager.this.onPrepareFromUri : FlexboxLayoutManager.this.onFastForward;
            if (!FlexboxLayoutManager.this.MediaBrowserCompatMediaItem() && FlexboxLayoutManager.this.handleMediaPlayPauseIfPendingOnHandler) {
                if (this.write) {
                    this.AudioAttributesCompatParcelizer = uIntDeserializer.AudioAttributesCompatParcelizer(view) + uIntDeserializer.AudioAttributesImplApi26Parcelizer();
                } else {
                    this.AudioAttributesCompatParcelizer = uIntDeserializer.IconCompatParcelizer(view);
                }
            } else if (this.write) {
                this.AudioAttributesCompatParcelizer = uIntDeserializer.IconCompatParcelizer(view) + uIntDeserializer.AudioAttributesImplApi26Parcelizer();
            } else {
                this.AudioAttributesCompatParcelizer = uIntDeserializer.AudioAttributesCompatParcelizer(view);
            }
            this.AudioAttributesImplBaseParcelizer = FlexboxLayoutManager.MediaDescriptionCompat(view);
            this.read = false;
            int[] iArr = FlexboxLayoutManager.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer;
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i == -1) {
                i = 0;
            }
            int i2 = iArr[i];
            this.IconCompatParcelizer = i2 != -1 ? i2 : 0;
            if (FlexboxLayoutManager.this.MediaBrowserCompatItemReceiver.size() > this.IconCompatParcelizer) {
                this.AudioAttributesImplBaseParcelizer = ((skipInputUntilPosition) FlexboxLayoutManager.this.MediaBrowserCompatItemReceiver.get(this.IconCompatParcelizer)).MediaBrowserCompatItemReceiver;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append(", mFlexLinePosition=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mCoordinate=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.write);
            sb.append(", mValid=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", mAssignedFromSavedState=");
            sb.append(this.read);
            sb.append('}');
            return sb.toString();
        }
    }

    static class read {
        private boolean AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private int read;
        private int write;

        private read() {
            this.write = 1;
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
        }

        /* synthetic */ read(byte b) {
            this();
        }

        static /* synthetic */ int AudioAttributesImplApi21Parcelizer(read readVar, int i) {
            int i2 = readVar.read + i;
            readVar.read = i2;
            return i2;
        }

        static /* synthetic */ int AudioAttributesImplApi26Parcelizer(read readVar) {
            int i = readVar.read;
            readVar.read = i - 1;
            return i;
        }

        static /* synthetic */ int IconCompatParcelizer(read readVar) {
            int i = readVar.read;
            readVar.read = i + 1;
            return i;
        }

        static /* synthetic */ int IconCompatParcelizer(read readVar, int i) {
            int i2 = readVar.AudioAttributesImplBaseParcelizer + i;
            readVar.AudioAttributesImplBaseParcelizer = i2;
            return i2;
        }

        static /* synthetic */ int MediaBrowserCompatCustomActionResultReceiver(read readVar, int i) {
            int i2 = readVar.AudioAttributesImplApi26Parcelizer + i;
            readVar.AudioAttributesImplApi26Parcelizer = i2;
            return i2;
        }

        static /* synthetic */ int MediaBrowserCompatSearchResultReceiver(read readVar, int i) {
            int i2 = readVar.MediaBrowserCompatItemReceiver - i;
            readVar.MediaBrowserCompatItemReceiver = i2;
            return i2;
        }

        static /* synthetic */ int RatingCompat(read readVar) {
            readVar.write = 1;
            return 1;
        }

        static /* synthetic */ int RatingCompat(read readVar, int i) {
            int i2 = readVar.MediaBrowserCompatItemReceiver + i;
            readVar.MediaBrowserCompatItemReceiver = i2;
            return i2;
        }

        static /* synthetic */ int read(read readVar, int i) {
            int i2 = readVar.IconCompatParcelizer - i;
            readVar.IconCompatParcelizer = i2;
            return i2;
        }

        static /* synthetic */ int write(read readVar, int i) {
            int i2 = readVar.AudioAttributesImplBaseParcelizer - i;
            readVar.AudioAttributesImplBaseParcelizer = i2;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, List<skipInputUntilPosition> list) {
            int i;
            int i2 = this.MediaBrowserCompatItemReceiver;
            return i2 >= 0 && i2 < mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() && (i = this.read) >= 0 && i < list.size();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mFlexLinePosition=");
            sb.append(this.read);
            sb.append(", mPosition=");
            sb.append(this.MediaBrowserCompatItemReceiver);
            sb.append(", mOffset=");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append(", mScrollingOffset=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", mLastScrollDelta=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", mItemDirection=");
            sb.append(this.write);
            sb.append(", mLayoutDirection=");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append('}');
            return sb.toString();
        }
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        private int RemoteActionCompatParcelizer;
        private int write;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        /* synthetic */ SavedState(SavedState savedState, byte b) {
            this(savedState);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.write);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.write = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.write = savedState.write;
            this.RemoteActionCompatParcelizer = savedState.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write() {
            this.write = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean read(int i) {
            int i2 = this.write;
            return i2 >= 0 && i2 < i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.write);
            sb.append(", mAnchorOffset=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }
    }
}
