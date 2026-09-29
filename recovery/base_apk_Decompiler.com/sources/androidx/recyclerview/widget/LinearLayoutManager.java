package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.UIntDeserializer;
import kotlin.deserializeKeylj4SQcc;
import kotlin.serializedjbwkw;

/* JADX INFO: loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.MediaBrowserCompatItemReceiver implements RecyclerView.onCustomAction.RemoteActionCompatParcelizer {
    private boolean AudioAttributesCompatParcelizer;
    UIntDeserializer AudioAttributesImplApi21Parcelizer;
    private int IconCompatParcelizer;
    boolean MediaBrowserCompatCustomActionResultReceiver;
    SavedState MediaBrowserCompatItemReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final read RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private int[] onCommand;
    private RemoteActionCompatParcelizer onCustomAction;
    private boolean onFastForward;
    private boolean onMediaButtonEvent;
    private boolean onPlay;
    final IconCompatParcelizer read;
    int write;

    void AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, IconCompatParcelizer iconCompatParcelizer, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public boolean RatingCompat() {
        return true;
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.write = 1;
        this.onFastForward = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.onPlay = false;
        this.onMediaButtonEvent = true;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Integer.MIN_VALUE;
        this.MediaBrowserCompatItemReceiver = null;
        this.read = new IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = new read();
        this.IconCompatParcelizer = 2;
        this.onCommand = new int[2];
        AudioAttributesImplApi21Parcelizer(i);
        IconCompatParcelizer(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.write = 1;
        this.onFastForward = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.onPlay = false;
        this.onMediaButtonEvent = true;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Integer.MIN_VALUE;
        this.MediaBrowserCompatItemReceiver = null;
        this.read = new IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = new read();
        this.IconCompatParcelizer = 2;
        this.onCommand = new int[2];
        RecyclerView.MediaBrowserCompatItemReceiver.write writeVar = read(context, attributeSet, i, i2);
        AudioAttributesImplApi21Parcelizer(writeVar.write);
        IconCompatParcelizer(writeVar.RemoteActionCompatParcelizer);
        write(writeVar.IconCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public RecyclerView.LayoutParams read() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(RecyclerView recyclerView, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        super.read(recyclerView, mediaDescriptionCompat);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void RemoteActionCompatParcelizer(AccessibilityEvent accessibilityEvent) {
        super.RemoteActionCompatParcelizer(accessibilityEvent);
        if (onPlay() > 0) {
            accessibilityEvent.setFromIndex(MediaBrowserCompatItemReceiver());
            accessibilityEvent.setToIndex(MediaMetadataCompat());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public Parcelable onAddQueueItem() {
        if (this.MediaBrowserCompatItemReceiver != null) {
            return new SavedState(this.MediaBrowserCompatItemReceiver);
        }
        SavedState savedState = new SavedState();
        if (onPlay() > 0) {
            AudioAttributesImplBaseParcelizer();
            boolean z = this.AudioAttributesCompatParcelizer ^ this.MediaBrowserCompatCustomActionResultReceiver;
            savedState.write = z;
            if (z) {
                View viewOnSkipToQueueItem = onSkipToQueueItem();
                savedState.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewOnSkipToQueueItem);
                savedState.IconCompatParcelizer = MediaDescriptionCompat(viewOnSkipToQueueItem);
                return savedState;
            }
            View viewOnSkipToPrevious = onSkipToPrevious();
            savedState.IconCompatParcelizer = MediaDescriptionCompat(viewOnSkipToPrevious);
            savedState.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewOnSkipToPrevious) - this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
            return savedState;
        }
        savedState.RemoteActionCompatParcelizer();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public void IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.MediaBrowserCompatItemReceiver = savedState;
            if (this.handleMediaPlayPauseIfPendingOnHandler != -1) {
                savedState.RemoteActionCompatParcelizer();
            }
            onSetRating();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.write == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public boolean AudioAttributesImplApi21Parcelizer() {
        return this.write == 1;
    }

    public void write(boolean z) {
        IconCompatParcelizer((String) null);
        if (this.onPlay == z) {
            return;
        }
        this.onPlay = z;
        onSetRating();
    }

    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.write;
    }

    public final void AudioAttributesImplApi21Parcelizer(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i)));
        }
        IconCompatParcelizer((String) null);
        if (i != this.write || this.AudioAttributesImplApi21Parcelizer == null) {
            UIntDeserializer uIntDeserializerWrite = UIntDeserializer.write(this, i);
            this.AudioAttributesImplApi21Parcelizer = uIntDeserializerWrite;
            this.read.write = uIntDeserializerWrite;
            this.write = i;
            onSetRating();
        }
    }

    private void PlaybackStateCompat() {
        if (this.write == 1 || !MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaBrowserCompatCustomActionResultReceiver = this.onFastForward;
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = !this.onFastForward;
        }
    }

    public final boolean MediaDescriptionCompat() {
        return this.onFastForward;
    }

    private void IconCompatParcelizer(boolean z) {
        IconCompatParcelizer((String) null);
        if (z == this.onFastForward) {
            return;
        }
        this.onFastForward = z;
        onSetRating();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final View write(int i) {
        int iOnPlay = onPlay();
        if (iOnPlay == 0) {
            return null;
        }
        int iMediaDescriptionCompat = i - MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0));
        if (iMediaDescriptionCompat >= 0 && iMediaDescriptionCompat < iOnPlay) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iMediaDescriptionCompat);
            if (MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver) == i) {
                return viewMediaBrowserCompatCustomActionResultReceiver;
            }
        }
        return super.write(i);
    }

    @Deprecated
    private int MediaDescriptionCompat(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer()) {
            return this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver();
        }
        return 0;
    }

    public void RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int[] iArr) {
        int i;
        int iMediaDescriptionCompat = MediaDescriptionCompat(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver == -1) {
            i = 0;
        } else {
            i = iMediaDescriptionCompat;
            iMediaDescriptionCompat = 0;
        }
        iArr[0] = iMediaDescriptionCompat;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        deserializeKeylj4SQcc deserializekeylj4sqcc = new deserializeKeylj4SQcc(recyclerView.getContext());
        deserializekeylj4sqcc.RemoteActionCompatParcelizer(i);
        RemoteActionCompatParcelizer(deserializekeylj4sqcc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction.RemoteActionCompatParcelizer
    public PointF RemoteActionCompatParcelizer(int i) {
        if (onPlay() == 0) {
            return null;
        }
        int i2 = (i < MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0))) != this.MediaBrowserCompatCustomActionResultReceiver ? -1 : 1;
        if (this.write == 0) {
            return new PointF(i2, BitmapDescriptorFactory.HUE_RED);
        }
        return new PointF(BitmapDescriptorFactory.HUE_RED, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int i;
        int i2;
        int i3;
        int i4;
        int iWrite;
        int i5;
        View viewWrite;
        int iAudioAttributesCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        int i6 = -1;
        if ((this.MediaBrowserCompatItemReceiver != null || this.handleMediaPlayPauseIfPendingOnHandler != -1) && mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() == 0) {
            RemoteActionCompatParcelizer(mediaDescriptionCompat);
            return;
        }
        SavedState savedState = this.MediaBrowserCompatItemReceiver;
        if (savedState != null && savedState.write()) {
            this.handleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer;
        }
        AudioAttributesImplBaseParcelizer();
        this.onCustomAction.RatingCompat = false;
        PlaybackStateCompat();
        View viewOnPlayFromMediaId = onPlayFromMediaId();
        if (!this.read.read || this.handleMediaPlayPauseIfPendingOnHandler != -1 || this.MediaBrowserCompatItemReceiver != null) {
            this.read.RemoteActionCompatParcelizer();
            this.read.AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver ^ this.onPlay;
            IconCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.read);
            this.read.read = true;
        } else if (viewOnPlayFromMediaId != null && (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewOnPlayFromMediaId) >= this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() || this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewOnPlayFromMediaId) <= this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer())) {
            this.read.write(viewOnPlayFromMediaId, MediaDescriptionCompat(viewOnPlayFromMediaId));
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCustomAction;
        remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer >= 0 ? 1 : -1;
        int[] iArr = this.onCommand;
        iArr[0] = 0;
        iArr[1] = 0;
        RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iArr);
        int iMax = Math.max(0, this.onCommand[0]) + this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        int iMax2 = Math.max(0, this.onCommand[1]) + this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write() && (i5 = this.handleMediaPlayPauseIfPendingOnHandler) != -1 && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != Integer.MIN_VALUE && (viewWrite = write(i5)) != null) {
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                iRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewWrite);
                iAudioAttributesCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            } else {
                iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewWrite) - this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
                iRemoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            }
            int i7 = iRemoteActionCompatParcelizer - iAudioAttributesCompatParcelizer;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        if (!this.read.AudioAttributesCompatParcelizer ? !this.MediaBrowserCompatCustomActionResultReceiver : this.MediaBrowserCompatCustomActionResultReceiver) {
            i6 = 1;
        }
        AudioAttributesCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.read, i6);
        write(mediaDescriptionCompat);
        this.onCustomAction.read = ParcelableVolumeInfo();
        this.onCustomAction.RemoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
        this.onCustomAction.AudioAttributesImplApi26Parcelizer = 0;
        if (this.read.AudioAttributesCompatParcelizer) {
            AudioAttributesCompatParcelizer(this.read);
            this.onCustomAction.IconCompatParcelizer = iMax;
            write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            i2 = this.onCustomAction.AudioAttributesImplBaseParcelizer;
            int i8 = this.onCustomAction.write;
            if (this.onCustomAction.AudioAttributesCompatParcelizer > 0) {
                iMax2 += this.onCustomAction.AudioAttributesCompatParcelizer;
            }
            IconCompatParcelizer(this.read);
            this.onCustomAction.IconCompatParcelizer = iMax2;
            this.onCustomAction.write += this.onCustomAction.MediaBrowserCompatItemReceiver;
            write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            i = this.onCustomAction.AudioAttributesImplBaseParcelizer;
            if (this.onCustomAction.AudioAttributesCompatParcelizer > 0) {
                int i9 = this.onCustomAction.AudioAttributesCompatParcelizer;
                AudioAttributesImplBaseParcelizer(i8, i2);
                this.onCustomAction.IconCompatParcelizer = i9;
                write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
                i2 = this.onCustomAction.AudioAttributesImplBaseParcelizer;
            }
        } else {
            IconCompatParcelizer(this.read);
            this.onCustomAction.IconCompatParcelizer = iMax2;
            write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            i = this.onCustomAction.AudioAttributesImplBaseParcelizer;
            int i10 = this.onCustomAction.write;
            if (this.onCustomAction.AudioAttributesCompatParcelizer > 0) {
                iMax += this.onCustomAction.AudioAttributesCompatParcelizer;
            }
            AudioAttributesCompatParcelizer(this.read);
            this.onCustomAction.IconCompatParcelizer = iMax;
            this.onCustomAction.write += this.onCustomAction.MediaBrowserCompatItemReceiver;
            write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            i2 = this.onCustomAction.AudioAttributesImplBaseParcelizer;
            if (this.onCustomAction.AudioAttributesCompatParcelizer > 0) {
                int i11 = this.onCustomAction.AudioAttributesCompatParcelizer;
                AudioAttributesImplApi26Parcelizer(i10, i);
                this.onCustomAction.IconCompatParcelizer = i11;
                write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
                i = this.onCustomAction.AudioAttributesImplBaseParcelizer;
            }
        }
        if (onPlay() > 0) {
            if (this.MediaBrowserCompatCustomActionResultReceiver ^ this.onPlay) {
                int i12 = read(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true);
                i3 = i2 + i12;
                i4 = i + i12;
                iWrite = write(i3, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            } else {
                int iWrite2 = write(i2, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true);
                i3 = i2 + iWrite2;
                i4 = i + iWrite2;
                iWrite = read(i4, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
            }
            i2 = i3 + iWrite;
            i = i4 + iWrite;
        }
        read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i2, i);
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplBaseParcelizer();
        } else {
            this.read.RemoteActionCompatParcelizer();
        }
        this.AudioAttributesCompatParcelizer = this.onPlay;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public void write(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        super.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.MediaBrowserCompatItemReceiver = null;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Integer.MIN_VALUE;
        this.read.RemoteActionCompatParcelizer();
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i, int i2) {
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer() || onPlay() == 0 || mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write() || !M_()) {
            return;
        }
        List<RecyclerView.onMediaButtonEvent> listAudioAttributesImplApi21Parcelizer = mediaDescriptionCompat.AudioAttributesImplApi21Parcelizer();
        int size = listAudioAttributesImplApi21Parcelizer.size();
        int iMediaDescriptionCompat = MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0));
        int iRemoteActionCompatParcelizer = 0;
        int iRemoteActionCompatParcelizer2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.onMediaButtonEvent onmediabuttonevent = listAudioAttributesImplApi21Parcelizer.get(i3);
            if (!onmediabuttonevent.isRemoved()) {
                if ((onmediabuttonevent.getLayoutPosition() < iMediaDescriptionCompat) != this.MediaBrowserCompatCustomActionResultReceiver) {
                    iRemoteActionCompatParcelizer += this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(onmediabuttonevent.itemView);
                } else {
                    iRemoteActionCompatParcelizer2 += this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(onmediabuttonevent.itemView);
                }
            }
        }
        this.onCustomAction.MediaDescriptionCompat = listAudioAttributesImplApi21Parcelizer;
        if (iRemoteActionCompatParcelizer > 0) {
            AudioAttributesImplBaseParcelizer(MediaDescriptionCompat(onSkipToPrevious()), i);
            this.onCustomAction.IconCompatParcelizer = iRemoteActionCompatParcelizer;
            this.onCustomAction.AudioAttributesCompatParcelizer = 0;
            this.onCustomAction.IconCompatParcelizer();
            write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
        }
        if (iRemoteActionCompatParcelizer2 > 0) {
            AudioAttributesImplApi26Parcelizer(MediaDescriptionCompat(onSkipToQueueItem()), i2);
            this.onCustomAction.IconCompatParcelizer = iRemoteActionCompatParcelizer2;
            this.onCustomAction.AudioAttributesCompatParcelizer = 0;
            this.onCustomAction.IconCompatParcelizer();
            write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
        }
        this.onCustomAction.MediaDescriptionCompat = null;
    }

    private void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, IconCompatParcelizer iconCompatParcelizer) {
        if (IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer) || read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer)) {
            return;
        }
        iconCompatParcelizer.write();
        iconCompatParcelizer.IconCompatParcelizer = this.onPlay ? mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() - 1 : 0;
    }

    private boolean read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, IconCompatParcelizer iconCompatParcelizer) {
        View viewWrite;
        boolean z = false;
        if (onPlay() == 0) {
            return false;
        }
        View viewOnPlayFromMediaId = onPlayFromMediaId();
        if (viewOnPlayFromMediaId != null && IconCompatParcelizer.write(viewOnPlayFromMediaId, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            iconCompatParcelizer.write(viewOnPlayFromMediaId, MediaDescriptionCompat(viewOnPlayFromMediaId));
            return true;
        }
        if (this.AudioAttributesCompatParcelizer != this.onPlay || (viewWrite = write(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer.AudioAttributesCompatParcelizer, this.onPlay)) == null) {
            return false;
        }
        iconCompatParcelizer.RemoteActionCompatParcelizer(viewWrite, MediaDescriptionCompat(viewWrite));
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write() && M_()) {
            int iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewWrite);
            int iIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewWrite);
            int iAudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
            int iRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
            boolean z2 = iIconCompatParcelizer <= iAudioAttributesImplApi21Parcelizer && iAudioAttributesCompatParcelizer < iAudioAttributesImplApi21Parcelizer;
            if (iAudioAttributesCompatParcelizer >= iRemoteActionCompatParcelizer && iIconCompatParcelizer > iRemoteActionCompatParcelizer) {
                z = true;
            }
            if (z2 || z) {
                if (iconCompatParcelizer.AudioAttributesCompatParcelizer) {
                    iAudioAttributesImplApi21Parcelizer = iRemoteActionCompatParcelizer;
                }
                iconCompatParcelizer.RemoteActionCompatParcelizer = iAudioAttributesImplApi21Parcelizer;
            }
        }
        return true;
    }

    private boolean IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, IconCompatParcelizer iconCompatParcelizer) {
        int i;
        int iAudioAttributesCompatParcelizer;
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write() && (i = this.handleMediaPlayPauseIfPendingOnHandler) != -1) {
            if (i < 0 || i >= mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read()) {
                this.handleMediaPlayPauseIfPendingOnHandler = -1;
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Integer.MIN_VALUE;
            } else {
                iconCompatParcelizer.IconCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler;
                SavedState savedState = this.MediaBrowserCompatItemReceiver;
                if (savedState != null && savedState.write()) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.write;
                    if (iconCompatParcelizer.AudioAttributesCompatParcelizer) {
                        iconCompatParcelizer.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
                    } else {
                        iconCompatParcelizer.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer() + this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
                    }
                    return true;
                }
                if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == Integer.MIN_VALUE) {
                    View viewWrite = write(this.handleMediaPlayPauseIfPendingOnHandler);
                    if (viewWrite != null) {
                        if (this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(viewWrite) > this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver()) {
                            iconCompatParcelizer.write();
                            return true;
                        }
                        if (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewWrite) - this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer() < 0) {
                            iconCompatParcelizer.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
                            iconCompatParcelizer.AudioAttributesCompatParcelizer = false;
                            return true;
                        }
                        if (this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewWrite) < 0) {
                            iconCompatParcelizer.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
                            iconCompatParcelizer.AudioAttributesCompatParcelizer = true;
                            return true;
                        }
                        if (iconCompatParcelizer.AudioAttributesCompatParcelizer) {
                            iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewWrite) + this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer();
                        } else {
                            iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewWrite);
                        }
                        iconCompatParcelizer.RemoteActionCompatParcelizer = iAudioAttributesCompatParcelizer;
                    } else {
                        if (onPlay() > 0) {
                            iconCompatParcelizer.AudioAttributesCompatParcelizer = (this.handleMediaPlayPauseIfPendingOnHandler < MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0))) == this.MediaBrowserCompatCustomActionResultReceiver;
                        }
                        iconCompatParcelizer.write();
                    }
                    return true;
                }
                iconCompatParcelizer.AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
                if (this.MediaBrowserCompatCustomActionResultReceiver) {
                    iconCompatParcelizer.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                } else {
                    iconCompatParcelizer.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer() + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                return true;
            }
        }
        return false;
    }

    private int read(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        int iRemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - i;
        if (iRemoteActionCompatParcelizer2 <= 0) {
            return 0;
        }
        int i2 = -AudioAttributesCompatParcelizer(-iRemoteActionCompatParcelizer2, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (!z || (iRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - (i + i2)) <= 0) {
            return i2;
        }
        this.AudioAttributesImplApi21Parcelizer.read(iRemoteActionCompatParcelizer);
        return iRemoteActionCompatParcelizer + i2;
    }

    private int write(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        int iAudioAttributesImplApi21Parcelizer;
        int iAudioAttributesImplApi21Parcelizer2 = i - this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        if (iAudioAttributesImplApi21Parcelizer2 <= 0) {
            return 0;
        }
        int i2 = -AudioAttributesCompatParcelizer(iAudioAttributesImplApi21Parcelizer2, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (!z || (iAudioAttributesImplApi21Parcelizer = (i + i2) - this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer()) <= 0) {
            return i2;
        }
        this.AudioAttributesImplApi21Parcelizer.read(-iAudioAttributesImplApi21Parcelizer);
        return i2 - iAudioAttributesImplApi21Parcelizer;
    }

    private void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        AudioAttributesImplApi26Parcelizer(iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.RemoteActionCompatParcelizer);
    }

    private void AudioAttributesImplApi26Parcelizer(int i, int i2) {
        this.onCustomAction.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() - i2;
        this.onCustomAction.MediaBrowserCompatItemReceiver = this.MediaBrowserCompatCustomActionResultReceiver ? -1 : 1;
        this.onCustomAction.write = i;
        this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver = 1;
        this.onCustomAction.AudioAttributesImplBaseParcelizer = i2;
        this.onCustomAction.MediaBrowserCompatSearchResultReceiver = Integer.MIN_VALUE;
    }

    private void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        AudioAttributesImplBaseParcelizer(iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.RemoteActionCompatParcelizer);
    }

    private void AudioAttributesImplBaseParcelizer(int i, int i2) {
        this.onCustomAction.AudioAttributesCompatParcelizer = i2 - this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        this.onCustomAction.write = i;
        this.onCustomAction.MediaBrowserCompatItemReceiver = this.MediaBrowserCompatCustomActionResultReceiver ? 1 : -1;
        this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.onCustomAction.AudioAttributesImplBaseParcelizer = i2;
        this.onCustomAction.MediaBrowserCompatSearchResultReceiver = Integer.MIN_VALUE;
    }

    protected final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return onPlayFromSearch() == 1;
    }

    final void AudioAttributesImplBaseParcelizer() {
        if (this.onCustomAction == null) {
            this.onCustomAction = MediaSessionCompatToken();
        }
    }

    private static RemoteActionCompatParcelizer MediaSessionCompatToken() {
        return new RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public void read(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Integer.MIN_VALUE;
        SavedState savedState = this.MediaBrowserCompatItemReceiver;
        if (savedState != null) {
            savedState.RemoteActionCompatParcelizer();
        }
        onSetRating();
    }

    public void read(int i, int i2) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2;
        SavedState savedState = this.MediaBrowserCompatItemReceiver;
        if (savedState != null) {
            savedState.RemoteActionCompatParcelizer();
        }
        onSetRating();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int read(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (this.write == 1) {
            return 0;
        }
        return AudioAttributesCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int RemoteActionCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (this.write == 0) {
            return 0;
        }
        return AudioAttributesCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int MediaBrowserCompatItemReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int AudioAttributesImplBaseParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return MediaBrowserCompatCustomActionResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public int read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return MediaBrowserCompatCustomActionResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int AudioAttributesImplApi26Parcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        AudioAttributesImplBaseParcelizer();
        return serializedjbwkw.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.AudioAttributesImplApi21Parcelizer, AudioAttributesCompatParcelizer(!this.onMediaButtonEvent), RemoteActionCompatParcelizer(!this.onMediaButtonEvent), this, this.onMediaButtonEvent, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private int AudioAttributesImplApi21Parcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        AudioAttributesImplBaseParcelizer();
        return serializedjbwkw.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.AudioAttributesImplApi21Parcelizer, AudioAttributesCompatParcelizer(!this.onMediaButtonEvent), RemoteActionCompatParcelizer(!this.onMediaButtonEvent), this, this.onMediaButtonEvent);
    }

    private int MediaBrowserCompatCustomActionResultReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        AudioAttributesImplBaseParcelizer();
        return serializedjbwkw.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.AudioAttributesImplApi21Parcelizer, AudioAttributesCompatParcelizer(!this.onMediaButtonEvent), RemoteActionCompatParcelizer(!this.onMediaButtonEvent), this, this.onMediaButtonEvent);
    }

    public final void onCommand() {
        this.onMediaButtonEvent = false;
    }

    private void IconCompatParcelizer(int i, int i2, boolean z, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int iAudioAttributesImplApi21Parcelizer;
        this.onCustomAction.read = ParcelableVolumeInfo();
        this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver = i;
        int[] iArr = this.onCommand;
        iArr[0] = 0;
        iArr[1] = 0;
        RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iArr);
        int iMax = Math.max(0, this.onCommand[0]);
        int iMax2 = Math.max(0, this.onCommand[1]);
        boolean z2 = i == 1;
        this.onCustomAction.IconCompatParcelizer = z2 ? iMax2 : iMax;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCustomAction;
        if (!z2) {
            iMax = iMax2;
        }
        remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer = iMax;
        if (z2) {
            this.onCustomAction.IconCompatParcelizer += this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
            View viewOnSkipToQueueItem = onSkipToQueueItem();
            this.onCustomAction.MediaBrowserCompatItemReceiver = this.MediaBrowserCompatCustomActionResultReceiver ? -1 : 1;
            this.onCustomAction.write = MediaDescriptionCompat(viewOnSkipToQueueItem) + this.onCustomAction.MediaBrowserCompatItemReceiver;
            this.onCustomAction.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewOnSkipToQueueItem);
            iAudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewOnSkipToQueueItem) - this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        } else {
            View viewOnSkipToPrevious = onSkipToPrevious();
            this.onCustomAction.IconCompatParcelizer += this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
            this.onCustomAction.MediaBrowserCompatItemReceiver = this.MediaBrowserCompatCustomActionResultReceiver ? 1 : -1;
            this.onCustomAction.write = MediaDescriptionCompat(viewOnSkipToPrevious) + this.onCustomAction.MediaBrowserCompatItemReceiver;
            this.onCustomAction.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewOnSkipToPrevious);
            iAudioAttributesImplApi21Parcelizer = (-this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewOnSkipToPrevious)) + this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        }
        this.onCustomAction.AudioAttributesCompatParcelizer = i2;
        if (z) {
            this.onCustomAction.AudioAttributesCompatParcelizer -= iAudioAttributesImplApi21Parcelizer;
        }
        this.onCustomAction.MediaBrowserCompatSearchResultReceiver = iAudioAttributesImplApi21Parcelizer;
    }

    private boolean ParcelableVolumeInfo() {
        return this.AudioAttributesImplApi21Parcelizer.read() == 0 && this.AudioAttributesImplApi21Parcelizer.write() == 0;
    }

    void read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, RemoteActionCompatParcelizer remoteActionCompatParcelizer, RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        int i = remoteActionCompatParcelizer.write;
        if (i < 0 || i >= mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read()) {
            return;
        }
        remoteActionCompatParcelizer2.read(i, Math.max(0, remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(int i, RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        boolean z;
        int i2;
        SavedState savedState = this.MediaBrowserCompatItemReceiver;
        if (savedState != null && savedState.write()) {
            z = this.MediaBrowserCompatItemReceiver.write;
            i2 = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer;
        } else {
            PlaybackStateCompat();
            z = this.MediaBrowserCompatCustomActionResultReceiver;
            i2 = this.handleMediaPlayPauseIfPendingOnHandler;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.IconCompatParcelizer && i2 >= 0 && i2 < i; i4++) {
            remoteActionCompatParcelizer.read(i2, 0);
            i2 += i3;
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(int i, int i2, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.write != 0) {
            i = i2;
        }
        if (onPlay() == 0 || i == 0) {
            return;
        }
        AudioAttributesImplBaseParcelizer();
        IconCompatParcelizer(i > 0 ? 1 : -1, Math.abs(i), true, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction, remoteActionCompatParcelizer);
    }

    private int AudioAttributesCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0 || i == 0) {
            return 0;
        }
        AudioAttributesImplBaseParcelizer();
        this.onCustomAction.RatingCompat = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        IconCompatParcelizer(i2, iAbs, true, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iWrite = this.onCustomAction.MediaBrowserCompatSearchResultReceiver + write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, false);
        if (iWrite < 0) {
            return 0;
        }
        if (iAbs > iWrite) {
            i = i2 * iWrite;
        }
        this.AudioAttributesImplApi21Parcelizer.read(-i);
        this.onCustomAction.AudioAttributesImplApi21Parcelizer = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(String str) {
        if (this.MediaBrowserCompatItemReceiver == null) {
            super.IconCompatParcelizer(str);
        }
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                IconCompatParcelizer(i, mediaDescriptionCompat);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    IconCompatParcelizer(i2, mediaDescriptionCompat);
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int iOnPlay = onPlay();
            if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                for (int i4 = 0; i4 < iOnPlay; i4++) {
                    View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i4);
                    if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) > i3 || this.AudioAttributesImplApi21Parcelizer.read(viewMediaBrowserCompatCustomActionResultReceiver) > i3) {
                        read(mediaDescriptionCompat, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = iOnPlay - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View viewMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(i6);
                if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver2) > i3 || this.AudioAttributesImplApi21Parcelizer.read(viewMediaBrowserCompatCustomActionResultReceiver2) > i3) {
                    read(mediaDescriptionCompat, i5, i6);
                    return;
                }
            }
        }
    }

    private void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i, int i2) {
        int iOnPlay = onPlay();
        if (i >= 0) {
            int iWrite = (this.AudioAttributesImplApi21Parcelizer.write() - i) + i2;
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                for (int i3 = 0; i3 < iOnPlay; i3++) {
                    View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i3);
                    if (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) < iWrite || this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer(viewMediaBrowserCompatCustomActionResultReceiver) < iWrite) {
                        read(mediaDescriptionCompat, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iOnPlay - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(i5);
                if (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver2) < iWrite || this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer(viewMediaBrowserCompatCustomActionResultReceiver2) < iWrite) {
                    read(mediaDescriptionCompat, i4, i5);
                    return;
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (!remoteActionCompatParcelizer.RatingCompat || remoteActionCompatParcelizer.read) {
            return;
        }
        int i = remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
        int i2 = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == -1) {
            write(mediaDescriptionCompat, i, i2);
        } else {
            RemoteActionCompatParcelizer(mediaDescriptionCompat, i, i2);
        }
    }

    private int write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RemoteActionCompatParcelizer remoteActionCompatParcelizer, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        int i = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        if (remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver != Integer.MIN_VALUE) {
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer < 0) {
                remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver += remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            }
            RemoteActionCompatParcelizer(mediaDescriptionCompat, remoteActionCompatParcelizer);
        }
        int i2 = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer + remoteActionCompatParcelizer.IconCompatParcelizer;
        read readVar = this.RemoteActionCompatParcelizer;
        while (true) {
            if ((!remoteActionCompatParcelizer.read && i2 <= 0) || !remoteActionCompatParcelizer.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                break;
            }
            readVar.RemoteActionCompatParcelizer();
            write(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, remoteActionCompatParcelizer, readVar);
            if (!readVar.read) {
                remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer += readVar.AudioAttributesCompatParcelizer * remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                if (!readVar.IconCompatParcelizer || remoteActionCompatParcelizer.MediaDescriptionCompat != null || !mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
                    remoteActionCompatParcelizer.AudioAttributesCompatParcelizer -= readVar.AudioAttributesCompatParcelizer;
                    i2 -= readVar.AudioAttributesCompatParcelizer;
                }
                if (remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver != Integer.MIN_VALUE) {
                    remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver += readVar.AudioAttributesCompatParcelizer;
                    if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer < 0) {
                        remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver += remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
                    }
                    RemoteActionCompatParcelizer(mediaDescriptionCompat, remoteActionCompatParcelizer);
                }
                if (z && readVar.write) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, RemoteActionCompatParcelizer remoteActionCompatParcelizer, read readVar) {
        int i;
        int iWrite;
        int iWrite2;
        int i2;
        View viewAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(mediaDescriptionCompat);
        if (viewAudioAttributesCompatParcelizer == null) {
            readVar.read = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewAudioAttributesCompatParcelizer.getLayoutParams();
        if (remoteActionCompatParcelizer.MediaDescriptionCompat == null) {
            if (this.MediaBrowserCompatCustomActionResultReceiver == (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == -1)) {
                AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer);
            } else {
                read(viewAudioAttributesCompatParcelizer, 0);
            }
        } else {
            if (this.MediaBrowserCompatCustomActionResultReceiver == (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == -1)) {
                RemoteActionCompatParcelizer(viewAudioAttributesCompatParcelizer);
            } else {
                AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer, 0);
            }
        }
        onCommand(viewAudioAttributesCompatParcelizer);
        readVar.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(viewAudioAttributesCompatParcelizer);
        if (this.write == 1) {
            if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                iWrite2 = onPrepare() - getPaddingRight();
                iWrite = iWrite2 - this.AudioAttributesImplApi21Parcelizer.write(viewAudioAttributesCompatParcelizer);
            } else {
                int paddingLeft = getPaddingLeft();
                iWrite2 = this.AudioAttributesImplApi21Parcelizer.write(viewAudioAttributesCompatParcelizer) + paddingLeft;
                iWrite = paddingLeft;
            }
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == -1) {
                i = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                i2 = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer - readVar.AudioAttributesCompatParcelizer;
            } else {
                int i3 = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                i = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer + readVar.AudioAttributesCompatParcelizer;
                i2 = i3;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iWrite3 = this.AudioAttributesImplApi21Parcelizer.write(viewAudioAttributesCompatParcelizer) + paddingTop;
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == -1) {
                int i4 = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                i = iWrite3;
                iWrite = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer - readVar.AudioAttributesCompatParcelizer;
                i2 = paddingTop;
                iWrite2 = i4;
            } else {
                i = iWrite3;
                iWrite = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                iWrite2 = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer + readVar.AudioAttributesCompatParcelizer;
                i2 = paddingTop;
            }
        }
        RemoteActionCompatParcelizer(viewAudioAttributesCompatParcelizer, iWrite, i2, iWrite2, i);
        if (layoutParams.Q_() || layoutParams.P_()) {
            readVar.IconCompatParcelizer = true;
        }
        readVar.write = viewAudioAttributesCompatParcelizer.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return (onFastForward() == 1073741824 || onSeekTo() == 1073741824 || !onRemoveQueueItemAt()) ? false : true;
    }

    final int IconCompatParcelizer(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.write == 1) ? 1 : Integer.MIN_VALUE : this.write == 0 ? 1 : Integer.MIN_VALUE : this.write == 1 ? -1 : Integer.MIN_VALUE : this.write == 0 ? -1 : Integer.MIN_VALUE : (this.write != 1 && MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) ? -1 : 1 : (this.write != 1 && MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) ? 1 : -1;
    }

    private View onSkipToPrevious() {
        return MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver ? onPlay() - 1 : 0);
    }

    private View onSkipToQueueItem() {
        return MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver ? 0 : onPlay() - 1);
    }

    private View AudioAttributesCompatParcelizer(boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return RemoteActionCompatParcelizer(onPlay() - 1, -1, z, true);
        }
        return RemoteActionCompatParcelizer(0, onPlay(), z, true);
    }

    private View RemoteActionCompatParcelizer(boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return RemoteActionCompatParcelizer(0, onPlay(), z, true);
        }
        return RemoteActionCompatParcelizer(onPlay() - 1, -1, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View write(androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat r17, androidx.recyclerview.widget.RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.AudioAttributesImplBaseParcelizer()
            int r1 = r16.onPlay()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.onPlay()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.read()
            o.UIntDeserializer r7 = r0.AudioAttributesImplApi21Parcelizer
            int r7 = r7.AudioAttributesImplApi21Parcelizer()
            o.UIntDeserializer r8 = r0.AudioAttributesImplApi21Parcelizer
            int r8 = r8.RemoteActionCompatParcelizer()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L78
            android.view.View r12 = r0.MediaBrowserCompatCustomActionResultReceiver(r1)
            int r13 = MediaDescriptionCompat(r12)
            o.UIntDeserializer r14 = r0.AudioAttributesImplApi21Parcelizer
            int r14 = r14.AudioAttributesCompatParcelizer(r12)
            o.UIntDeserializer r15 = r0.AudioAttributesImplApi21Parcelizer
            int r15 = r15.IconCompatParcelizer(r12)
            if (r13 < 0) goto L76
            if (r13 >= r6) goto L76
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r13 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r13
            boolean r13 = r13.Q_()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L76
            r11 = r12
            goto L76
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L68
            if (r14 != 0) goto L68
            return r12
        L68:
            if (r19 == 0) goto L6f
            if (r14 != 0) goto L71
            if (r9 != 0) goto L76
            goto L75
        L6f:
            if (r13 == 0) goto L73
        L71:
            r10 = r12
            goto L76
        L73:
            if (r9 != 0) goto L76
        L75:
            r9 = r12
        L76:
            int r1 = r1 + r5
            goto L2b
        L78:
            if (r9 == 0) goto L7b
            return r9
        L7b:
            if (r10 == 0) goto L7e
            return r10
        L7e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.write(androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat, androidx.recyclerview.widget.RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean, boolean):android.view.View");
    }

    private View setSessionImpl() {
        return this.MediaBrowserCompatCustomActionResultReceiver ? AudioAttributesCompatParcelizer() : IconCompatParcelizer();
    }

    private View onStop() {
        return this.MediaBrowserCompatCustomActionResultReceiver ? IconCompatParcelizer() : AudioAttributesCompatParcelizer();
    }

    private View AudioAttributesCompatParcelizer() {
        return AudioAttributesImplApi21Parcelizer(0, onPlay());
    }

    private View IconCompatParcelizer() {
        return AudioAttributesImplApi21Parcelizer(onPlay() - 1, -1);
    }

    public final int MediaBrowserCompatItemReceiver() {
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0, onPlay(), false, true);
        if (viewRemoteActionCompatParcelizer == null) {
            return -1;
        }
        return MediaDescriptionCompat(viewRemoteActionCompatParcelizer);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0, onPlay(), true, false);
        if (viewRemoteActionCompatParcelizer == null) {
            return -1;
        }
        return MediaDescriptionCompat(viewRemoteActionCompatParcelizer);
    }

    public final int MediaMetadataCompat() {
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(onPlay() - 1, -1, false, true);
        if (viewRemoteActionCompatParcelizer == null) {
            return -1;
        }
        return MediaDescriptionCompat(viewRemoteActionCompatParcelizer);
    }

    public final int MediaBrowserCompatMediaItem() {
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(onPlay() - 1, -1, true, false);
        if (viewRemoteActionCompatParcelizer == null) {
            return -1;
        }
        return MediaDescriptionCompat(viewRemoteActionCompatParcelizer);
    }

    private View RemoteActionCompatParcelizer(int i, int i2, boolean z, boolean z2) {
        AudioAttributesImplBaseParcelizer();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.write == 0) {
            return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(i, i2, i3, i4);
        }
        return this.RatingCompat.RemoteActionCompatParcelizer(i, i2, i3, i4);
    }

    private View AudioAttributesImplApi21Parcelizer(int i, int i2) {
        int i3;
        int i4;
        AudioAttributesImplBaseParcelizer();
        if (i2 <= i && i2 >= i) {
            return MediaBrowserCompatCustomActionResultReceiver(i);
        }
        if (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(i)) < this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.write == 0) {
            return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(i, i2, i3, i4);
        }
        return this.RatingCompat.RemoteActionCompatParcelizer(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public View AudioAttributesCompatParcelizer(View view, int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int iIconCompatParcelizer;
        View sessionImpl;
        View viewOnSkipToQueueItem;
        PlaybackStateCompat();
        if (onPlay() == 0 || (iIconCompatParcelizer = IconCompatParcelizer(i)) == Integer.MIN_VALUE) {
            return null;
        }
        AudioAttributesImplBaseParcelizer();
        IconCompatParcelizer(iIconCompatParcelizer, (int) (this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver() * 0.33333334f), false, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.onCustomAction.MediaBrowserCompatSearchResultReceiver = Integer.MIN_VALUE;
        this.onCustomAction.RatingCompat = false;
        write(mediaDescriptionCompat, this.onCustomAction, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true);
        if (iIconCompatParcelizer == -1) {
            sessionImpl = onStop();
        } else {
            sessionImpl = setSessionImpl();
        }
        if (iIconCompatParcelizer == -1) {
            viewOnSkipToQueueItem = onSkipToPrevious();
        } else {
            viewOnSkipToQueueItem = onSkipToQueueItem();
        }
        if (!viewOnSkipToQueueItem.hasFocusable()) {
            return sessionImpl;
        }
        if (sessionImpl == null) {
            return null;
        }
        return viewOnSkipToQueueItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public boolean M_() {
        return this.MediaBrowserCompatItemReceiver == null && this.AudioAttributesCompatParcelizer == this.onPlay;
    }

    static class RemoteActionCompatParcelizer {
        int AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        int MediaBrowserCompatSearchResultReceiver;
        boolean read;
        int write;
        boolean RatingCompat = true;
        int IconCompatParcelizer = 0;
        int AudioAttributesImplApi26Parcelizer = 0;
        boolean RemoteActionCompatParcelizer = false;
        List<RecyclerView.onMediaButtonEvent> MediaDescriptionCompat = null;

        RemoteActionCompatParcelizer() {
        }

        final boolean write(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            int i = this.write;
            return i >= 0 && i < mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        }

        final View AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
            if (this.MediaDescriptionCompat != null) {
                return RemoteActionCompatParcelizer();
            }
            View viewRemoteActionCompatParcelizer = mediaDescriptionCompat.RemoteActionCompatParcelizer(this.write);
            this.write += this.MediaBrowserCompatItemReceiver;
            return viewRemoteActionCompatParcelizer;
        }

        private View RemoteActionCompatParcelizer() {
            int size = this.MediaDescriptionCompat.size();
            for (int i = 0; i < size; i++) {
                View view = this.MediaDescriptionCompat.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.Q_() && this.write == layoutParams.O_()) {
                    AudioAttributesCompatParcelizer(view);
                    return view;
                }
            }
            return null;
        }

        public final void IconCompatParcelizer() {
            AudioAttributesCompatParcelizer((View) null);
        }

        private void AudioAttributesCompatParcelizer(View view) {
            View view2 = read(view);
            if (view2 == null) {
                this.write = -1;
            } else {
                this.write = ((RecyclerView.LayoutParams) view2.getLayoutParams()).O_();
            }
        }

        private View read(View view) {
            int iO_;
            int size = this.MediaDescriptionCompat.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.MediaDescriptionCompat.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.Q_() && (iO_ = (layoutParams.O_() - this.write) * this.MediaBrowserCompatItemReceiver) >= 0 && iO_ < i) {
                    if (iO_ == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = iO_;
                }
            }
            return view2;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return IconCompatParcelizer(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] IconCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        boolean write;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.IconCompatParcelizer = parcel.readInt();
            this.AudioAttributesCompatParcelizer = parcel.readInt();
            this.write = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.IconCompatParcelizer = savedState.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = savedState.AudioAttributesCompatParcelizer;
            this.write = savedState.write;
        }

        final boolean write() {
            return this.IconCompatParcelizer >= 0;
        }

        final void RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
            parcel.writeInt(this.write ? 1 : 0);
        }
    }

    static class IconCompatParcelizer {
        boolean AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        boolean read;
        UIntDeserializer write;

        IconCompatParcelizer() {
            RemoteActionCompatParcelizer();
        }

        final void RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer = -1;
            this.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
            this.AudioAttributesCompatParcelizer = false;
            this.read = false;
        }

        final void write() {
            int iAudioAttributesImplApi21Parcelizer;
            if (this.AudioAttributesCompatParcelizer) {
                iAudioAttributesImplApi21Parcelizer = this.write.RemoteActionCompatParcelizer();
            } else {
                iAudioAttributesImplApi21Parcelizer = this.write.AudioAttributesImplApi21Parcelizer();
            }
            this.RemoteActionCompatParcelizer = iAudioAttributesImplApi21Parcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mCoordinate=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", mValid=");
            sb.append(this.read);
            sb.append('}');
            return sb.toString();
        }

        static boolean write(View view, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.Q_() && layoutParams.O_() >= 0 && layoutParams.O_() < mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        }

        public final void write(View view, int i) {
            int iAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer();
            if (iAudioAttributesImplApi26Parcelizer >= 0) {
                RemoteActionCompatParcelizer(view, i);
                return;
            }
            this.IconCompatParcelizer = i;
            if (this.AudioAttributesCompatParcelizer) {
                int iRemoteActionCompatParcelizer = (this.write.RemoteActionCompatParcelizer() - iAudioAttributesImplApi26Parcelizer) - this.write.IconCompatParcelizer(view);
                this.RemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer() - iRemoteActionCompatParcelizer;
                if (iRemoteActionCompatParcelizer > 0) {
                    int iRemoteActionCompatParcelizer2 = this.write.RemoteActionCompatParcelizer(view);
                    int i2 = this.RemoteActionCompatParcelizer;
                    int iAudioAttributesImplApi21Parcelizer = this.write.AudioAttributesImplApi21Parcelizer();
                    int iMin = (i2 - iRemoteActionCompatParcelizer2) - (iAudioAttributesImplApi21Parcelizer + Math.min(this.write.AudioAttributesCompatParcelizer(view) - iAudioAttributesImplApi21Parcelizer, 0));
                    if (iMin < 0) {
                        this.RemoteActionCompatParcelizer += Math.min(iRemoteActionCompatParcelizer, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(view);
            int iAudioAttributesImplApi21Parcelizer2 = iAudioAttributesCompatParcelizer - this.write.AudioAttributesImplApi21Parcelizer();
            this.RemoteActionCompatParcelizer = iAudioAttributesCompatParcelizer;
            if (iAudioAttributesImplApi21Parcelizer2 > 0) {
                int iRemoteActionCompatParcelizer3 = this.write.RemoteActionCompatParcelizer(view);
                int iRemoteActionCompatParcelizer4 = (this.write.RemoteActionCompatParcelizer() - Math.min(0, (this.write.RemoteActionCompatParcelizer() - iAudioAttributesImplApi26Parcelizer) - this.write.IconCompatParcelizer(view))) - (iAudioAttributesCompatParcelizer + iRemoteActionCompatParcelizer3);
                if (iRemoteActionCompatParcelizer4 < 0) {
                    this.RemoteActionCompatParcelizer -= Math.min(iAudioAttributesImplApi21Parcelizer2, -iRemoteActionCompatParcelizer4);
                }
            }
        }

        public final void RemoteActionCompatParcelizer(View view, int i) {
            if (this.AudioAttributesCompatParcelizer) {
                this.RemoteActionCompatParcelizer = this.write.IconCompatParcelizer(view) + this.write.AudioAttributesImplApi26Parcelizer();
            } else {
                this.RemoteActionCompatParcelizer = this.write.AudioAttributesCompatParcelizer(view);
            }
            this.IconCompatParcelizer = i;
        }
    }

    protected static class read {
        public int AudioAttributesCompatParcelizer;
        public boolean IconCompatParcelizer;
        public boolean read;
        public boolean write;

        protected read() {
        }

        final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = 0;
            this.read = false;
            this.IconCompatParcelizer = false;
            this.write = false;
        }
    }
}
