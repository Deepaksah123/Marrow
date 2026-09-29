package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlin.UIntDeserializer;
import kotlin.deserializeKeylj4SQcc;
import kotlin.erasedType;
import kotlin.serializedjbwkw;

/* JADX INFO: loaded from: classes4.dex */
public class StaggeredGridLayoutManager extends RecyclerView.MediaBrowserCompatItemReceiver implements RecyclerView.onCustomAction.RemoteActionCompatParcelizer {
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final erasedType MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private boolean onCustomAction;
    private BitSet onFastForward;
    private SavedState onPause;
    private int[] onPlayFromMediaId;
    private int onPlayFromUri;
    private UIntDeserializer onPrepareFromMediaId;
    UIntDeserializer read;
    AudioAttributesCompatParcelizer[] write;
    private int onPlayFromSearch = -1;
    boolean IconCompatParcelizer = false;
    private boolean onPrepareFromSearch = false;
    private int onMediaButtonEvent = -1;
    private int onPlay = Integer.MIN_VALUE;
    private LazySpanLookup onCommand = new LazySpanLookup();
    private int AudioAttributesImplApi21Parcelizer = 2;
    private final Rect onRemoveQueueItemAt = new Rect();
    private final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();
    private boolean MediaBrowserCompatItemReceiver = false;
    private boolean onPrepare = true;
    private final Runnable RemoteActionCompatParcelizer = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.4
        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.IconCompatParcelizer();
        }
    };

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.MediaBrowserCompatItemReceiver.write writeVar = read(context, attributeSet, i, i2);
        onCustomAction(writeVar.write);
        handleMediaPlayPauseIfPendingOnHandler(writeVar.AudioAttributesCompatParcelizer);
        RemoteActionCompatParcelizer(writeVar.RemoteActionCompatParcelizer);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new erasedType();
        AudioAttributesCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean RatingCompat() {
        return this.AudioAttributesImplApi21Parcelizer != 0;
    }

    private void AudioAttributesCompatParcelizer() {
        this.read = UIntDeserializer.write(this, this.onAddQueueItem);
        this.onPrepareFromMediaId = UIntDeserializer.write(this, 1 - this.onAddQueueItem);
    }

    final boolean IconCompatParcelizer() {
        int iMediaMetadataCompat;
        if (onPlay() != 0 && this.AudioAttributesImplApi21Parcelizer != 0 && onRemoveQueueItem()) {
            if (this.onPrepareFromSearch) {
                iMediaMetadataCompat = MediaBrowserCompatMediaItem();
                MediaMetadataCompat();
            } else {
                iMediaMetadataCompat = MediaMetadataCompat();
                MediaBrowserCompatMediaItem();
            }
            if (iMediaMetadataCompat == 0 && MediaBrowserCompatSearchResultReceiver() != null) {
                this.onCommand.IconCompatParcelizer();
                onSetShuffleMode();
                onSetRating();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void MediaBrowserCompatItemReceiver(int i) {
        if (i == 0) {
            IconCompatParcelizer();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(RecyclerView recyclerView, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        super.read(recyclerView, mediaDescriptionCompat);
        AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        for (int i = 0; i < this.onPlayFromSearch; i++) {
            this.write[i].AudioAttributesCompatParcelizer();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View MediaBrowserCompatSearchResultReceiver() {
        /*
            r12 = this;
            int r0 = r12.onPlay()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.onPlayFromSearch
            r2.<init>(r3)
            int r3 = r12.onPlayFromSearch
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.onAddQueueItem
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.onCommand()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.onPrepareFromSearch
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto L9b
            android.view.View r7 = r12.MediaBrowserCompatCustomActionResultReceiver(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AudioAttributesCompatParcelizer r9 = r8.read
            int r9 = r9.RemoteActionCompatParcelizer
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L51
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AudioAttributesCompatParcelizer r9 = r8.read
            boolean r9 = r12.IconCompatParcelizer(r9)
            if (r9 != 0) goto L9a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AudioAttributesCompatParcelizer r9 = r8.read
            int r9 = r9.RemoteActionCompatParcelizer
            r2.clear(r9)
        L51:
            boolean r9 = r8.IconCompatParcelizer
            int r1 = r1 + r6
            if (r1 == r0) goto L2c
            android.view.View r9 = r12.MediaBrowserCompatCustomActionResultReceiver(r1)
            boolean r10 = r12.onPrepareFromSearch
            if (r10 == 0) goto L6f
            o.UIntDeserializer r10 = r12.read
            int r10 = r10.IconCompatParcelizer(r7)
            o.UIntDeserializer r11 = r12.read
            int r11 = r11.IconCompatParcelizer(r9)
            if (r10 < r11) goto L9a
            if (r10 != r11) goto L2c
            goto L7f
        L6f:
            o.UIntDeserializer r10 = r12.read
            int r10 = r10.AudioAttributesCompatParcelizer(r7)
            o.UIntDeserializer r11 = r12.read
            int r11 = r11.AudioAttributesCompatParcelizer(r9)
            if (r10 > r11) goto L9a
            if (r10 != r11) goto L2c
        L7f:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AudioAttributesCompatParcelizer r8 = r8.read
            int r8 = r8.RemoteActionCompatParcelizer
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AudioAttributesCompatParcelizer r9 = r9.read
            int r9 = r9.RemoteActionCompatParcelizer
            int r8 = r8 - r9
            if (r8 >= 0) goto L92
            r8 = r5
            goto L93
        L92:
            r8 = r4
        L93:
            if (r3 >= 0) goto L97
            r9 = r5
            goto L98
        L97:
            r9 = r4
        L98:
            if (r8 == r9) goto L2c
        L9a:
            return r7
        L9b:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.MediaBrowserCompatSearchResultReceiver():android.view.View");
    }

    private boolean IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.onPrepareFromSearch) {
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() < this.read.RemoteActionCompatParcelizer()) {
                boolean z = AudioAttributesCompatParcelizer.write(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.get(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.size() - 1)).IconCompatParcelizer;
                return true;
            }
            return false;
        }
        if (audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer() > this.read.AudioAttributesImplApi21Parcelizer()) {
            boolean z2 = AudioAttributesCompatParcelizer.write(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.get(0)).IconCompatParcelizer;
            return true;
        }
        return false;
    }

    private void handleMediaPlayPauseIfPendingOnHandler(int i) {
        IconCompatParcelizer((String) null);
        if (i != this.onPlayFromSearch) {
            MediaDescriptionCompat();
            this.onPlayFromSearch = i;
            this.onFastForward = new BitSet(this.onPlayFromSearch);
            this.write = new AudioAttributesCompatParcelizer[this.onPlayFromSearch];
            for (int i2 = 0; i2 < this.onPlayFromSearch; i2++) {
                this.write[i2] = new AudioAttributesCompatParcelizer(i2);
            }
            onSetRating();
        }
    }

    private void onCustomAction(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        IconCompatParcelizer((String) null);
        if (i == this.onAddQueueItem) {
            return;
        }
        this.onAddQueueItem = i;
        UIntDeserializer uIntDeserializer = this.read;
        this.read = this.onPrepareFromMediaId;
        this.onPrepareFromMediaId = uIntDeserializer;
        onSetRating();
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        IconCompatParcelizer((String) null);
        SavedState savedState = this.onPause;
        if (savedState != null && savedState.IconCompatParcelizer != z) {
            this.onPause.IconCompatParcelizer = z;
        }
        this.IconCompatParcelizer = z;
        onSetRating();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(String str) {
        if (this.onPause == null) {
            super.IconCompatParcelizer(str);
        }
    }

    private void MediaDescriptionCompat() {
        this.onCommand.IconCompatParcelizer();
        onSetRating();
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.onAddQueueItem == 1 || !onCommand()) {
            this.onPrepareFromSearch = this.IconCompatParcelizer;
        } else {
            this.onPrepareFromSearch = !this.IconCompatParcelizer;
        }
    }

    private boolean onCommand() {
        return onPlayFromSearch() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(Rect rect, int i, int i2) {
        int iA_;
        int iA_2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.onAddQueueItem == 1) {
            iA_2 = a_(i2, rect.height() + paddingTop, onPrepareFromSearch());
            iA_ = a_(i, (this.onPlayFromUri * this.onPlayFromSearch) + paddingLeft, onPlayFromUri());
        } else {
            iA_ = a_(i, rect.width() + paddingLeft, onPlayFromUri());
            iA_2 = a_(i2, (this.onPlayFromUri * this.onPlayFromSearch) + paddingTop, onPrepareFromSearch());
        }
        RemoteActionCompatParcelizer(iA_, iA_2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        write(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView.IconCompatParcelizer iconCompatParcelizer, RecyclerView.IconCompatParcelizer iconCompatParcelizer2) {
        this.onCommand.IconCompatParcelizer();
        for (int i = 0; i < this.onPlayFromSearch; i++) {
            this.write[i].AudioAttributesCompatParcelizer();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat r9, androidx.recyclerview.widget.RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.write(androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat, androidx.recyclerview.widget.RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        super.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.onMediaButtonEvent = -1;
        this.onPlay = Integer.MIN_VALUE;
        this.onPause = null;
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        if (this.onPrepareFromMediaId.read() != 1073741824) {
            int iOnPlay = onPlay();
            float fMax = BitmapDescriptorFactory.HUE_RED;
            for (int i = 0; i < iOnPlay; i++) {
                View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
                float fRemoteActionCompatParcelizer = this.onPrepareFromMediaId.RemoteActionCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver);
                if (fRemoteActionCompatParcelizer >= fMax) {
                    if (((LayoutParams) viewMediaBrowserCompatCustomActionResultReceiver.getLayoutParams()).write()) {
                        fRemoteActionCompatParcelizer /= this.onPlayFromSearch;
                    }
                    fMax = Math.max(fMax, fRemoteActionCompatParcelizer);
                }
            }
            int i2 = this.onPlayFromUri;
            int iRound = Math.round(fMax * this.onPlayFromSearch);
            if (this.onPrepareFromMediaId.read() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.onPrepareFromMediaId.MediaBrowserCompatItemReceiver());
            }
            onCommand(iRound);
            if (this.onPlayFromUri != i2) {
                for (int i3 = 0; i3 < iOnPlay; i3++) {
                    View viewMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(i3);
                    LayoutParams layoutParams = (LayoutParams) viewMediaBrowserCompatCustomActionResultReceiver2.getLayoutParams();
                    boolean z = layoutParams.IconCompatParcelizer;
                    if (onCommand() && this.onAddQueueItem == 1) {
                        viewMediaBrowserCompatCustomActionResultReceiver2.offsetLeftAndRight(((-((this.onPlayFromSearch - 1) - layoutParams.read.RemoteActionCompatParcelizer)) * this.onPlayFromUri) - ((-((this.onPlayFromSearch - 1) - layoutParams.read.RemoteActionCompatParcelizer)) * i2));
                    } else {
                        int i4 = layoutParams.read.RemoteActionCompatParcelizer * this.onPlayFromUri;
                        int i5 = layoutParams.read.RemoteActionCompatParcelizer * i2;
                        if (this.onAddQueueItem == 1) {
                            viewMediaBrowserCompatCustomActionResultReceiver2.offsetLeftAndRight(i4 - i5);
                        } else {
                            viewMediaBrowserCompatCustomActionResultReceiver2.offsetTopAndBottom(i4 - i5);
                        }
                    }
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        int iAudioAttributesImplApi21Parcelizer;
        if (this.onPause.MediaBrowserCompatCustomActionResultReceiver > 0) {
            if (this.onPause.MediaBrowserCompatCustomActionResultReceiver == this.onPlayFromSearch) {
                for (int i = 0; i < this.onPlayFromSearch; i++) {
                    this.write[i].AudioAttributesCompatParcelizer();
                    int i2 = this.onPause.AudioAttributesImplApi21Parcelizer[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.onPause.RemoteActionCompatParcelizer) {
                            iAudioAttributesImplApi21Parcelizer = this.read.RemoteActionCompatParcelizer();
                        } else {
                            iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
                        }
                        i2 += iAudioAttributesImplApi21Parcelizer;
                    }
                    this.write[i].read(i2);
                }
            } else {
                this.onPause.AudioAttributesCompatParcelizer();
                SavedState savedState = this.onPause;
                savedState.write = savedState.AudioAttributesImplBaseParcelizer;
            }
        }
        this.onCustomAction = this.onPause.read;
        RemoteActionCompatParcelizer(this.onPause.IconCompatParcelizer);
        MediaBrowserCompatItemReceiver();
        if (this.onPause.write != -1) {
            this.onMediaButtonEvent = this.onPause.write;
            iconCompatParcelizer.read = this.onPause.RemoteActionCompatParcelizer;
        } else {
            iconCompatParcelizer.read = this.onPrepareFromSearch;
        }
        if (this.onPause.AudioAttributesImplApi26Parcelizer > 1) {
            this.onCommand.read = this.onPause.MediaBrowserCompatItemReceiver;
            this.onCommand.IconCompatParcelizer = this.onPause.AudioAttributesCompatParcelizer;
        }
    }

    private void RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, IconCompatParcelizer iconCompatParcelizer) {
        if (IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer)) {
            return;
        }
        read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer);
    }

    private boolean read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, IconCompatParcelizer iconCompatParcelizer) {
        int iAudioAttributesImplApi21Parcelizer;
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            iAudioAttributesImplApi21Parcelizer = MediaBrowserCompatSearchResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read());
        } else {
            iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read());
        }
        iconCompatParcelizer.write = iAudioAttributesImplApi21Parcelizer;
        iconCompatParcelizer.IconCompatParcelizer = Integer.MIN_VALUE;
        return true;
    }

    private boolean IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, IconCompatParcelizer iconCompatParcelizer) {
        int i;
        int iAudioAttributesImplApi21Parcelizer;
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write() && (i = this.onMediaButtonEvent) != -1) {
            if (i < 0 || i >= mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read()) {
                this.onMediaButtonEvent = -1;
                this.onPlay = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.onPause;
                if (savedState == null || savedState.write == -1 || this.onPause.MediaBrowserCompatCustomActionResultReceiver <= 0) {
                    View viewWrite = write(this.onMediaButtonEvent);
                    if (viewWrite != null) {
                        iconCompatParcelizer.write = this.onPrepareFromSearch ? MediaBrowserCompatMediaItem() : MediaMetadataCompat();
                        if (this.onPlay != Integer.MIN_VALUE) {
                            if (iconCompatParcelizer.read) {
                                iconCompatParcelizer.IconCompatParcelizer = (this.read.RemoteActionCompatParcelizer() - this.onPlay) - this.read.IconCompatParcelizer(viewWrite);
                            } else {
                                iconCompatParcelizer.IconCompatParcelizer = (this.read.AudioAttributesImplApi21Parcelizer() + this.onPlay) - this.read.AudioAttributesCompatParcelizer(viewWrite);
                            }
                            return true;
                        }
                        if (this.read.RemoteActionCompatParcelizer(viewWrite) > this.read.MediaBrowserCompatItemReceiver()) {
                            if (iconCompatParcelizer.read) {
                                iAudioAttributesImplApi21Parcelizer = this.read.RemoteActionCompatParcelizer();
                            } else {
                                iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
                            }
                            iconCompatParcelizer.IconCompatParcelizer = iAudioAttributesImplApi21Parcelizer;
                            return true;
                        }
                        int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(viewWrite) - this.read.AudioAttributesImplApi21Parcelizer();
                        if (iAudioAttributesCompatParcelizer < 0) {
                            iconCompatParcelizer.IconCompatParcelizer = -iAudioAttributesCompatParcelizer;
                            return true;
                        }
                        int iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer() - this.read.IconCompatParcelizer(viewWrite);
                        if (iRemoteActionCompatParcelizer < 0) {
                            iconCompatParcelizer.IconCompatParcelizer = iRemoteActionCompatParcelizer;
                            return true;
                        }
                        iconCompatParcelizer.IconCompatParcelizer = Integer.MIN_VALUE;
                    } else {
                        iconCompatParcelizer.write = this.onMediaButtonEvent;
                        int i2 = this.onPlay;
                        if (i2 == Integer.MIN_VALUE) {
                            iconCompatParcelizer.read = IconCompatParcelizer(iconCompatParcelizer.write) == 1;
                            iconCompatParcelizer.read();
                        } else {
                            iconCompatParcelizer.RemoteActionCompatParcelizer(i2);
                        }
                        iconCompatParcelizer.RemoteActionCompatParcelizer = true;
                    }
                } else {
                    iconCompatParcelizer.IconCompatParcelizer = Integer.MIN_VALUE;
                    iconCompatParcelizer.write = this.onMediaButtonEvent;
                }
                return true;
            }
        }
        return false;
    }

    private void onCommand(int i) {
        this.onPlayFromUri = i / this.onPlayFromSearch;
        this.MediaBrowserCompatCustomActionResultReceiver = View.MeasureSpec.makeMeasureSpec(i, this.onPrepareFromMediaId.read());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean M_() {
        return this.onPause == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return MediaBrowserCompatCustomActionResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int MediaBrowserCompatCustomActionResultReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        return serializedjbwkw.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.read, write(!this.onPrepare), read(!this.onPrepare), this, this.onPrepare, this.onPrepareFromSearch);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return MediaBrowserCompatCustomActionResultReceiver(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int MediaBrowserCompatItemReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int AudioAttributesImplApi21Parcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        return serializedjbwkw.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.read, write(!this.onPrepare), read(!this.onPrepare), this, this.onPrepare);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesImplBaseParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi21Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int AudioAttributesImplApi26Parcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0) {
            return 0;
        }
        return serializedjbwkw.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.read, write(!this.onPrepare), read(!this.onPrepare), this, this.onPrepare);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private void AudioAttributesCompatParcelizer(View view, LayoutParams layoutParams) {
        boolean z = layoutParams.IconCompatParcelizer;
        if (this.onAddQueueItem == 1) {
            AudioAttributesCompatParcelizer(view, write(this.onPlayFromUri, onSeekTo(), 0, ((ViewGroup.LayoutParams) layoutParams).width, false), write(onMediaButtonEvent(), onFastForward(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.LayoutParams) layoutParams).height, true), false);
            return;
        }
        AudioAttributesCompatParcelizer(view, write(onPrepare(), onSeekTo(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.LayoutParams) layoutParams).width, true), write(this.onPlayFromUri, onFastForward(), 0, ((ViewGroup.LayoutParams) layoutParams).height, false), false);
    }

    private void AudioAttributesCompatParcelizer(View view, int i, int i2, boolean z) {
        AudioAttributesCompatParcelizer(view, this.onRemoveQueueItemAt);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = read(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + this.onRemoveQueueItemAt.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + this.onRemoveQueueItemAt.right);
        int i4 = read(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.onRemoveQueueItemAt.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + this.onRemoveQueueItemAt.bottom);
        if (read(view, i3, i4, layoutParams)) {
            view.measure(i3, i4);
        }
    }

    private static int read(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.onPause = savedState;
            if (this.onMediaButtonEvent != -1) {
                savedState.read();
                this.onPause.AudioAttributesCompatParcelizer();
            }
            onSetRating();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final Parcelable onAddQueueItem() {
        int iAudioAttributesCompatParcelizer;
        int iAudioAttributesImplApi21Parcelizer;
        if (this.onPause != null) {
            return new SavedState(this.onPause);
        }
        SavedState savedState = new SavedState();
        savedState.IconCompatParcelizer = this.IconCompatParcelizer;
        savedState.RemoteActionCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler;
        savedState.read = this.onCustomAction;
        LazySpanLookup lazySpanLookup = this.onCommand;
        if (lazySpanLookup != null && lazySpanLookup.read != null) {
            savedState.MediaBrowserCompatItemReceiver = this.onCommand.read;
            savedState.AudioAttributesImplApi26Parcelizer = savedState.MediaBrowserCompatItemReceiver.length;
            savedState.AudioAttributesCompatParcelizer = this.onCommand.IconCompatParcelizer;
        } else {
            savedState.AudioAttributesImplApi26Parcelizer = 0;
        }
        if (onPlay() > 0) {
            savedState.write = this.handleMediaPlayPauseIfPendingOnHandler ? MediaBrowserCompatMediaItem() : MediaMetadataCompat();
            savedState.AudioAttributesImplBaseParcelizer = MediaBrowserCompatCustomActionResultReceiver();
            savedState.MediaBrowserCompatCustomActionResultReceiver = this.onPlayFromSearch;
            savedState.AudioAttributesImplApi21Parcelizer = new int[this.onPlayFromSearch];
            for (int i = 0; i < this.onPlayFromSearch; i++) {
                if (this.handleMediaPlayPauseIfPendingOnHandler) {
                    iAudioAttributesCompatParcelizer = this.write[i].IconCompatParcelizer(Integer.MIN_VALUE);
                    if (iAudioAttributesCompatParcelizer != Integer.MIN_VALUE) {
                        iAudioAttributesImplApi21Parcelizer = this.read.RemoteActionCompatParcelizer();
                        iAudioAttributesCompatParcelizer -= iAudioAttributesImplApi21Parcelizer;
                    }
                } else {
                    iAudioAttributesCompatParcelizer = this.write[i].AudioAttributesCompatParcelizer(Integer.MIN_VALUE);
                    if (iAudioAttributesCompatParcelizer != Integer.MIN_VALUE) {
                        iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
                        iAudioAttributesCompatParcelizer -= iAudioAttributesImplApi21Parcelizer;
                    }
                }
                savedState.AudioAttributesImplApi21Parcelizer[i] = iAudioAttributesCompatParcelizer;
            }
            return savedState;
        }
        savedState.write = -1;
        savedState.AudioAttributesImplBaseParcelizer = -1;
        savedState.MediaBrowserCompatCustomActionResultReceiver = 0;
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void RemoteActionCompatParcelizer(AccessibilityEvent accessibilityEvent) {
        super.RemoteActionCompatParcelizer(accessibilityEvent);
        if (onPlay() > 0) {
            View viewWrite = write(false);
            View view = read(false);
            if (viewWrite == null || view == null) {
                return;
            }
            int iMediaDescriptionCompat = MediaDescriptionCompat(viewWrite);
            int iMediaDescriptionCompat2 = MediaDescriptionCompat(view);
            if (iMediaDescriptionCompat < iMediaDescriptionCompat2) {
                accessibilityEvent.setFromIndex(iMediaDescriptionCompat);
                accessibilityEvent.setToIndex(iMediaDescriptionCompat2);
            } else {
                accessibilityEvent.setFromIndex(iMediaDescriptionCompat2);
                accessibilityEvent.setToIndex(iMediaDescriptionCompat);
            }
        }
    }

    private int MediaBrowserCompatCustomActionResultReceiver() {
        View viewWrite = this.onPrepareFromSearch ? read(true) : write(true);
        if (viewWrite == null) {
            return -1;
        }
        return MediaDescriptionCompat(viewWrite);
    }

    private View write(boolean z) {
        int iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
        int iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        int iOnPlay = onPlay();
        View view = null;
        for (int i = 0; i < iOnPlay; i++) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
            int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver);
            if (this.read.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) > iAudioAttributesImplApi21Parcelizer && iAudioAttributesCompatParcelizer < iRemoteActionCompatParcelizer) {
                if (iAudioAttributesCompatParcelizer >= iAudioAttributesImplApi21Parcelizer || !z) {
                    return viewMediaBrowserCompatCustomActionResultReceiver;
                }
                if (view == null) {
                    view = viewMediaBrowserCompatCustomActionResultReceiver;
                }
            }
        }
        return view;
    }

    private View read(boolean z) {
        int iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
        int iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        View view = null;
        for (int iOnPlay = onPlay() - 1; iOnPlay >= 0; iOnPlay--) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iOnPlay);
            int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver);
            int iIconCompatParcelizer = this.read.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver);
            if (iIconCompatParcelizer > iAudioAttributesImplApi21Parcelizer && iAudioAttributesCompatParcelizer < iRemoteActionCompatParcelizer) {
                if (iIconCompatParcelizer <= iRemoteActionCompatParcelizer || !z) {
                    return viewMediaBrowserCompatCustomActionResultReceiver;
                }
                if (view == null) {
                    view = viewMediaBrowserCompatCustomActionResultReceiver;
                }
            }
        }
        return view;
    }

    private void RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        int iRemoteActionCompatParcelizer;
        int iMediaDescriptionCompat = MediaDescriptionCompat(Integer.MIN_VALUE);
        if (iMediaDescriptionCompat == Integer.MIN_VALUE || (iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer() - iMediaDescriptionCompat) <= 0) {
            return;
        }
        int i = iRemoteActionCompatParcelizer - (-IconCompatParcelizer(-iRemoteActionCompatParcelizer, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        if (!z || i <= 0) {
            return;
        }
        this.read.read(i);
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z) {
        int iAudioAttributesImplApi21Parcelizer;
        int iRatingCompat = RatingCompat(Integer.MAX_VALUE);
        if (iRatingCompat == Integer.MAX_VALUE || (iAudioAttributesImplApi21Parcelizer = iRatingCompat - this.read.AudioAttributesImplApi21Parcelizer()) <= 0) {
            return;
        }
        int iIconCompatParcelizer = iAudioAttributesImplApi21Parcelizer - IconCompatParcelizer(iAudioAttributesImplApi21Parcelizer, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (!z || iIconCompatParcelizer <= 0) {
            return;
        }
        this.read.read(-iIconCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer(int i, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int iMediaBrowserCompatItemReceiver;
        int iMediaBrowserCompatItemReceiver2;
        int iRemoteActionCompatParcelizer;
        boolean z = false;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read = i;
        if (!onSetRepeatMode() || (iRemoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) == -1) {
            iMediaBrowserCompatItemReceiver = 0;
            iMediaBrowserCompatItemReceiver2 = 0;
        } else {
            if (this.onPrepareFromSearch == (iRemoteActionCompatParcelizer < i)) {
                iMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                iMediaBrowserCompatItemReceiver2 = 0;
            } else {
                iMediaBrowserCompatItemReceiver2 = this.read.MediaBrowserCompatItemReceiver();
                iMediaBrowserCompatItemReceiver = 0;
            }
        }
        if (onPause()) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver = this.read.AudioAttributesImplApi21Parcelizer() - iMediaBrowserCompatItemReceiver2;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write = this.read.RemoteActionCompatParcelizer() + iMediaBrowserCompatItemReceiver;
        } else {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write = this.read.write() + iMediaBrowserCompatItemReceiver;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver = -iMediaBrowserCompatItemReceiver2;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer = false;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi21Parcelizer = true;
        erasedType erasedtype = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (this.read.read() == 0 && this.read.write() == 0) {
            z = true;
        }
        erasedtype.AudioAttributesCompatParcelizer = z;
    }

    private void onAddQueueItem(int i) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatItemReceiver = i;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer = this.onPrepareFromSearch != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesImplBaseParcelizer(int i) {
        super.AudioAttributesImplBaseParcelizer(i);
        for (int i2 = 0; i2 < this.onPlayFromSearch; i2++) {
            this.write[i2].write(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesImplApi26Parcelizer(int i) {
        super.AudioAttributesImplApi26Parcelizer(i);
        for (int i2 = 0; i2 < this.onPlayFromSearch; i2++) {
            this.write[i2].write(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        IconCompatParcelizer(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        IconCompatParcelizer(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void L_() {
        this.onCommand.IconCompatParcelizer();
        onSetRating();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2, int i3) {
        IconCompatParcelizer(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView recyclerView, int i, int i2, Object obj) {
        IconCompatParcelizer(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.onPrepareFromSearch
            if (r0 == 0) goto L9
            int r0 = r6.MediaBrowserCompatMediaItem()
            goto Ld
        L9:
            int r0 = r6.MediaMetadataCompat()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.onCommand
            r4.IconCompatParcelizer(r3)
            r4 = 1
            if (r9 == r4) goto L3b
            r5 = 2
            if (r9 == r5) goto L35
            if (r9 != r1) goto L40
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.onCommand
            r9.read(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.onCommand
            r7.write(r8, r4)
            goto L40
        L35:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.onCommand
            r9.read(r7, r8)
            goto L40
        L3b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.onCommand
            r9.write(r7, r8)
        L40:
            if (r2 <= r0) goto L54
            boolean r7 = r6.onPrepareFromSearch
            if (r7 == 0) goto L4b
            int r7 = r6.MediaMetadataCompat()
            goto L4f
        L4b:
            int r7 = r6.MediaBrowserCompatMediaItem()
        L4f:
            if (r3 > r7) goto L54
            r6.onSetRating()
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer(int, int, int):void");
    }

    private int AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, erasedType erasedtype, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int i;
        int iAudioAttributesImplApi21Parcelizer;
        int iMediaDescriptionCompat;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        int iAudioAttributesImplApi21Parcelizer2;
        int iRemoteActionCompatParcelizer2;
        this.onFastForward.set(0, this.onPlayFromSearch, true);
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer) {
            i = erasedtype.MediaBrowserCompatItemReceiver == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (erasedtype.MediaBrowserCompatItemReceiver == 1) {
            i = erasedtype.write + erasedtype.RemoteActionCompatParcelizer;
        } else {
            i = erasedtype.MediaBrowserCompatCustomActionResultReceiver - erasedtype.RemoteActionCompatParcelizer;
        }
        read(erasedtype.MediaBrowserCompatItemReceiver, i);
        if (this.onPrepareFromSearch) {
            iAudioAttributesImplApi21Parcelizer = this.read.RemoteActionCompatParcelizer();
        } else {
            iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
        }
        boolean z = false;
        while (erasedtype.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer || !this.onFastForward.isEmpty())) {
            View viewRemoteActionCompatParcelizer = erasedtype.RemoteActionCompatParcelizer(mediaDescriptionCompat);
            LayoutParams layoutParams = (LayoutParams) viewRemoteActionCompatParcelizer.getLayoutParams();
            int iO_ = layoutParams.O_();
            int iWrite = this.onCommand.write(iO_);
            boolean z2 = iWrite == -1;
            if (z2) {
                boolean z3 = layoutParams.IconCompatParcelizer;
                audioAttributesCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(erasedtype);
                this.onCommand.IconCompatParcelizer(iO_, audioAttributesCompatParcelizerIconCompatParcelizer);
            } else {
                audioAttributesCompatParcelizerIconCompatParcelizer = this.write[iWrite];
            }
            layoutParams.read = audioAttributesCompatParcelizerIconCompatParcelizer;
            if (erasedtype.MediaBrowserCompatItemReceiver == 1) {
                AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer);
            } else {
                read(viewRemoteActionCompatParcelizer, 0);
            }
            AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, layoutParams);
            if (erasedtype.MediaBrowserCompatItemReceiver == 1) {
                boolean z4 = layoutParams.IconCompatParcelizer;
                iRemoteActionCompatParcelizer = audioAttributesCompatParcelizerIconCompatParcelizer.IconCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
                iAudioAttributesCompatParcelizer = this.read.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer) + iRemoteActionCompatParcelizer;
                if (z2) {
                    boolean z5 = layoutParams.IconCompatParcelizer;
                }
            } else {
                boolean z6 = layoutParams.IconCompatParcelizer;
                iAudioAttributesCompatParcelizer = audioAttributesCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
                iRemoteActionCompatParcelizer = iAudioAttributesCompatParcelizer - this.read.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                if (z2) {
                    boolean z7 = layoutParams.IconCompatParcelizer;
                }
            }
            boolean z8 = layoutParams.IconCompatParcelizer;
            AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, layoutParams, erasedtype);
            if (onCommand() && this.onAddQueueItem == 1) {
                boolean z9 = layoutParams.IconCompatParcelizer;
                iRemoteActionCompatParcelizer2 = this.onPrepareFromMediaId.RemoteActionCompatParcelizer() - (((this.onPlayFromSearch - 1) - audioAttributesCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer) * this.onPlayFromUri);
                iAudioAttributesImplApi21Parcelizer2 = iRemoteActionCompatParcelizer2 - this.onPrepareFromMediaId.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
            } else {
                boolean z10 = layoutParams.IconCompatParcelizer;
                iAudioAttributesImplApi21Parcelizer2 = this.onPrepareFromMediaId.AudioAttributesImplApi21Parcelizer() + (audioAttributesCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer * this.onPlayFromUri);
                iRemoteActionCompatParcelizer2 = this.onPrepareFromMediaId.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer) + iAudioAttributesImplApi21Parcelizer2;
            }
            if (this.onAddQueueItem == 1) {
                RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer, iAudioAttributesImplApi21Parcelizer2, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, iAudioAttributesCompatParcelizer);
            } else {
                RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, iAudioAttributesImplApi21Parcelizer2, iAudioAttributesCompatParcelizer, iRemoteActionCompatParcelizer2);
            }
            boolean z11 = layoutParams.IconCompatParcelizer;
            read(audioAttributesCompatParcelizerIconCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatItemReceiver, i);
            read(mediaDescriptionCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer && viewRemoteActionCompatParcelizer.hasFocusable()) {
                boolean z12 = layoutParams.IconCompatParcelizer;
                this.onFastForward.set(audioAttributesCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer, false);
            }
            z = true;
        }
        if (!z) {
            read(mediaDescriptionCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatItemReceiver == -1) {
            iMediaDescriptionCompat = this.read.AudioAttributesImplApi21Parcelizer() - RatingCompat(this.read.AudioAttributesImplApi21Parcelizer());
        } else {
            iMediaDescriptionCompat = MediaDescriptionCompat(this.read.RemoteActionCompatParcelizer()) - this.read.RemoteActionCompatParcelizer();
        }
        if (iMediaDescriptionCompat > 0) {
            return Math.min(erasedtype.RemoteActionCompatParcelizer, iMediaDescriptionCompat);
        }
        return 0;
    }

    private static void AudioAttributesCompatParcelizer(View view, LayoutParams layoutParams, erasedType erasedtype) {
        if (erasedtype.MediaBrowserCompatItemReceiver == 1) {
            boolean z = layoutParams.IconCompatParcelizer;
            layoutParams.read.RemoteActionCompatParcelizer(view);
        } else {
            boolean z2 = layoutParams.IconCompatParcelizer;
            layoutParams.read.read(view);
        }
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, erasedType erasedtype) {
        int iMin;
        int iMin2;
        if (!erasedtype.AudioAttributesImplApi21Parcelizer || erasedtype.AudioAttributesCompatParcelizer) {
            return;
        }
        if (erasedtype.RemoteActionCompatParcelizer == 0) {
            if (erasedtype.MediaBrowserCompatItemReceiver == -1) {
                IconCompatParcelizer(mediaDescriptionCompat, erasedtype.write);
                return;
            } else {
                read(mediaDescriptionCompat, erasedtype.MediaBrowserCompatCustomActionResultReceiver);
                return;
            }
        }
        if (erasedtype.MediaBrowserCompatItemReceiver == -1) {
            int iMediaBrowserCompatMediaItem = erasedtype.MediaBrowserCompatCustomActionResultReceiver - MediaBrowserCompatMediaItem(erasedtype.MediaBrowserCompatCustomActionResultReceiver);
            if (iMediaBrowserCompatMediaItem < 0) {
                iMin2 = erasedtype.write;
            } else {
                iMin2 = erasedtype.write - Math.min(iMediaBrowserCompatMediaItem, erasedtype.RemoteActionCompatParcelizer);
            }
            IconCompatParcelizer(mediaDescriptionCompat, iMin2);
            return;
        }
        int iMediaMetadataCompat = MediaMetadataCompat(erasedtype.write) - erasedtype.write;
        if (iMediaMetadataCompat < 0) {
            iMin = erasedtype.MediaBrowserCompatCustomActionResultReceiver;
        } else {
            iMin = Math.min(iMediaMetadataCompat, erasedtype.RemoteActionCompatParcelizer) + erasedtype.MediaBrowserCompatCustomActionResultReceiver;
        }
        read(mediaDescriptionCompat, iMin);
    }

    private void read(int i, int i2) {
        for (int i3 = 0; i3 < this.onPlayFromSearch; i3++) {
            if (!this.write[i3].AudioAttributesCompatParcelizer.isEmpty()) {
                read(this.write[i3], i, i2);
            }
        }
    }

    private void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, int i2) {
        int iIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        if (i == -1) {
            if (audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer() + iIconCompatParcelizer <= i2) {
                this.onFastForward.set(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, false);
            }
        } else if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() - iIconCompatParcelizer >= i2) {
            this.onFastForward.set(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, false);
        }
    }

    private int MediaBrowserCompatMediaItem(int i) {
        int iAudioAttributesCompatParcelizer = this.write[0].AudioAttributesCompatParcelizer(i);
        for (int i2 = 1; i2 < this.onPlayFromSearch; i2++) {
            int iAudioAttributesCompatParcelizer2 = this.write[i2].AudioAttributesCompatParcelizer(i);
            if (iAudioAttributesCompatParcelizer2 > iAudioAttributesCompatParcelizer) {
                iAudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer2;
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    private int RatingCompat(int i) {
        int iAudioAttributesCompatParcelizer = this.write[0].AudioAttributesCompatParcelizer(i);
        for (int i2 = 1; i2 < this.onPlayFromSearch; i2++) {
            int iAudioAttributesCompatParcelizer2 = this.write[i2].AudioAttributesCompatParcelizer(i);
            if (iAudioAttributesCompatParcelizer2 < iAudioAttributesCompatParcelizer) {
                iAudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer2;
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    private int MediaDescriptionCompat(int i) {
        int iIconCompatParcelizer = this.write[0].IconCompatParcelizer(i);
        for (int i2 = 1; i2 < this.onPlayFromSearch; i2++) {
            int iIconCompatParcelizer2 = this.write[i2].IconCompatParcelizer(i);
            if (iIconCompatParcelizer2 > iIconCompatParcelizer) {
                iIconCompatParcelizer = iIconCompatParcelizer2;
            }
        }
        return iIconCompatParcelizer;
    }

    private int MediaMetadataCompat(int i) {
        int iIconCompatParcelizer = this.write[0].IconCompatParcelizer(i);
        for (int i2 = 1; i2 < this.onPlayFromSearch; i2++) {
            int iIconCompatParcelizer2 = this.write[i2].IconCompatParcelizer(i);
            if (iIconCompatParcelizer2 < iIconCompatParcelizer) {
                iIconCompatParcelizer = iIconCompatParcelizer2;
            }
        }
        return iIconCompatParcelizer;
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        while (onPlay() > 0) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(0);
            if (this.read.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) > i || this.read.read(viewMediaBrowserCompatCustomActionResultReceiver) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewMediaBrowserCompatCustomActionResultReceiver.getLayoutParams();
            boolean z = layoutParams.IconCompatParcelizer;
            if (layoutParams.read.AudioAttributesCompatParcelizer.size() == 1) {
                return;
            }
            layoutParams.read.AudioAttributesImplBaseParcelizer();
            AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver, mediaDescriptionCompat);
        }
    }

    private void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        for (int iOnPlay = onPlay() - 1; iOnPlay >= 0; iOnPlay--) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iOnPlay);
            if (this.read.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) < i || this.read.AudioAttributesImplApi21Parcelizer(viewMediaBrowserCompatCustomActionResultReceiver) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewMediaBrowserCompatCustomActionResultReceiver.getLayoutParams();
            boolean z = layoutParams.IconCompatParcelizer;
            if (layoutParams.read.AudioAttributesCompatParcelizer.size() == 1) {
                return;
            }
            layoutParams.read.AudioAttributesImplApi26Parcelizer();
            AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver, mediaDescriptionCompat);
        }
    }

    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) {
        if (this.onAddQueueItem == 0) {
            return (i == -1) != this.onPrepareFromSearch;
        }
        return ((i == -1) == this.onPrepareFromSearch) == onCommand();
    }

    private AudioAttributesCompatParcelizer IconCompatParcelizer(erasedType erasedtype) {
        int i;
        int i2;
        int i3;
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(erasedtype.MediaBrowserCompatItemReceiver)) {
            i2 = this.onPlayFromSearch - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.onPlayFromSearch;
            i2 = 0;
            i3 = 1;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = null;
        if (erasedtype.MediaBrowserCompatItemReceiver == 1) {
            int iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.write[i2];
                int iIconCompatParcelizer = audioAttributesCompatParcelizer2.IconCompatParcelizer(iAudioAttributesImplApi21Parcelizer);
                if (iIconCompatParcelizer < i4) {
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                    i4 = iIconCompatParcelizer;
                }
                i2 += i3;
            }
            return audioAttributesCompatParcelizer;
        }
        int iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = this.write[i2];
            int iAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer3.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
            if (iAudioAttributesCompatParcelizer > i5) {
                audioAttributesCompatParcelizer = audioAttributesCompatParcelizer3;
                i5 = iAudioAttributesCompatParcelizer;
            }
            i2 += i3;
        }
        return audioAttributesCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.onAddQueueItem == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.onAddQueueItem == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return IconCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return IconCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int IconCompatParcelizer(int i) {
        if (onPlay() == 0) {
            return this.onPrepareFromSearch ? 1 : -1;
        }
        return (i < MediaMetadataCompat()) != this.onPrepareFromSearch ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction.RemoteActionCompatParcelizer
    public final PointF RemoteActionCompatParcelizer(int i) {
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        PointF pointF = new PointF();
        if (iIconCompatParcelizer == 0) {
            return null;
        }
        if (this.onAddQueueItem == 0) {
            pointF.x = iIconCompatParcelizer;
            pointF.y = BitmapDescriptorFactory.HUE_RED;
            return pointF;
        }
        pointF.x = BitmapDescriptorFactory.HUE_RED;
        pointF.y = iIconCompatParcelizer;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        deserializeKeylj4SQcc deserializekeylj4sqcc = new deserializeKeylj4SQcc(recyclerView.getContext());
        deserializekeylj4sqcc.RemoteActionCompatParcelizer(i);
        RemoteActionCompatParcelizer(deserializekeylj4sqcc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(int i) {
        SavedState savedState = this.onPause;
        if (savedState != null && savedState.write != i) {
            this.onPause.read();
        }
        this.onMediaButtonEvent = i;
        this.onPlay = Integer.MIN_VALUE;
        onSetRating();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(int i, int i2, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int iIconCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        if (this.onAddQueueItem != 0) {
            i = i2;
        }
        if (onPlay() == 0 || i == 0) {
            return;
        }
        read(i, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int[] iArr = this.onPlayFromMediaId;
        if (iArr == null || iArr.length < this.onPlayFromSearch) {
            this.onPlayFromMediaId = new int[this.onPlayFromSearch];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.onPlayFromSearch; i4++) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer == -1) {
                iIconCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver;
                iAudioAttributesCompatParcelizer = this.write[i4].AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver);
            } else {
                iIconCompatParcelizer = this.write[i4].IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write);
                iAudioAttributesCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write;
            }
            int i5 = iIconCompatParcelizer - iAudioAttributesCompatParcelizer;
            if (i5 >= 0) {
                this.onPlayFromMediaId[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.onPlayFromMediaId, 0, i3);
        for (int i6 = 0; i6 < i3 && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver); i6++) {
            remoteActionCompatParcelizer.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read, this.onPlayFromMediaId[i6]);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read += this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer;
        }
    }

    private void read(int i, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int iMediaMetadataCompat;
        int i2;
        if (i > 0) {
            iMediaMetadataCompat = MediaBrowserCompatMediaItem();
            i2 = 1;
        } else {
            iMediaMetadataCompat = MediaMetadataCompat();
            i2 = -1;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi21Parcelizer = true;
        AudioAttributesCompatParcelizer(iMediaMetadataCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        onAddQueueItem(i2);
        erasedType erasedtype = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        erasedtype.read = iMediaMetadataCompat + erasedtype.IconCompatParcelizer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer = Math.abs(i);
    }

    private int IconCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0 || i == 0) {
            return 0;
        }
        read(i, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaDescriptionCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer >= iAudioAttributesCompatParcelizer) {
            i = i < 0 ? -iAudioAttributesCompatParcelizer : iAudioAttributesCompatParcelizer;
        }
        this.read.read(-i);
        this.handleMediaPlayPauseIfPendingOnHandler = this.onPrepareFromSearch;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer = 0;
        read(mediaDescriptionCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        return i;
    }

    private int MediaBrowserCompatMediaItem() {
        int iOnPlay = onPlay();
        if (iOnPlay == 0) {
            return 0;
        }
        return MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(iOnPlay - 1));
    }

    private int MediaMetadataCompat() {
        if (onPlay() == 0) {
            return 0;
        }
        return MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0));
    }

    private int AudioAttributesImplApi21Parcelizer(int i) {
        int iOnPlay = onPlay();
        for (int i2 = 0; i2 < iOnPlay; i2++) {
            int iMediaDescriptionCompat = MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(i2));
            if (iMediaDescriptionCompat >= 0 && iMediaDescriptionCompat < i) {
                return iMediaDescriptionCompat;
            }
        }
        return 0;
    }

    private int MediaBrowserCompatSearchResultReceiver(int i) {
        for (int iOnPlay = onPlay() - 1; iOnPlay >= 0; iOnPlay--) {
            int iMediaDescriptionCompat = MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(iOnPlay));
            if (iMediaDescriptionCompat >= 0 && iMediaDescriptionCompat < i) {
                return iMediaDescriptionCompat;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final RecyclerView.LayoutParams read() {
        if (this.onAddQueueItem == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final RecyclerView.LayoutParams AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final RecyclerView.LayoutParams read(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean RemoteActionCompatParcelizer(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final View AudioAttributesCompatParcelizer(View view, int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        View viewWrite;
        int iMediaMetadataCompat;
        int iWrite;
        int iWrite2;
        int iWrite3;
        if (onPlay() == 0 || (viewWrite = write(view)) == null) {
            return null;
        }
        MediaBrowserCompatItemReceiver();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        if (iAudioAttributesCompatParcelizer == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewWrite.getLayoutParams();
        boolean z = layoutParams.IconCompatParcelizer;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = layoutParams.read;
        if (iAudioAttributesCompatParcelizer == 1) {
            iMediaMetadataCompat = MediaBrowserCompatMediaItem();
        } else {
            iMediaMetadataCompat = MediaMetadataCompat();
        }
        AudioAttributesCompatParcelizer(iMediaMetadataCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        onAddQueueItem(iAudioAttributesCompatParcelizer);
        erasedType erasedtype = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        erasedtype.read = erasedtype.IconCompatParcelizer + iMediaMetadataCompat;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer = (int) (this.read.MediaBrowserCompatItemReceiver() * 0.33333334f);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer = true;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi21Parcelizer = false;
        AudioAttributesCompatParcelizer(mediaDescriptionCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.handleMediaPlayPauseIfPendingOnHandler = this.onPrepareFromSearch;
        View viewWrite2 = audioAttributesCompatParcelizer.write(iMediaMetadataCompat, iAudioAttributesCompatParcelizer);
        if (viewWrite2 != null && viewWrite2 != viewWrite) {
            return viewWrite2;
        }
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iAudioAttributesCompatParcelizer)) {
            for (int i2 = this.onPlayFromSearch - 1; i2 >= 0; i2--) {
                View viewWrite3 = this.write[i2].write(iMediaMetadataCompat, iAudioAttributesCompatParcelizer);
                if (viewWrite3 != null && viewWrite3 != viewWrite) {
                    return viewWrite3;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.onPlayFromSearch; i3++) {
                View viewWrite4 = this.write[i3].write(iMediaMetadataCompat, iAudioAttributesCompatParcelizer);
                if (viewWrite4 != null && viewWrite4 != viewWrite) {
                    return viewWrite4;
                }
            }
        }
        boolean z2 = (this.IconCompatParcelizer ^ true) == (iAudioAttributesCompatParcelizer == -1);
        if (z2) {
            iWrite = audioAttributesCompatParcelizer.read();
        } else {
            iWrite = audioAttributesCompatParcelizer.write();
        }
        View viewWrite5 = write(iWrite);
        if (viewWrite5 != null && viewWrite5 != viewWrite) {
            return viewWrite5;
        }
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iAudioAttributesCompatParcelizer)) {
            for (int i4 = this.onPlayFromSearch - 1; i4 >= 0; i4--) {
                if (i4 != audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                    if (z2) {
                        iWrite3 = this.write[i4].read();
                    } else {
                        iWrite3 = this.write[i4].write();
                    }
                    View viewWrite6 = write(iWrite3);
                    if (viewWrite6 != null && viewWrite6 != viewWrite) {
                        return viewWrite6;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.onPlayFromSearch; i5++) {
                if (z2) {
                    iWrite2 = this.write[i5].read();
                } else {
                    iWrite2 = this.write[i5].write();
                }
                View viewWrite7 = write(iWrite2);
                if (viewWrite7 != null && viewWrite7 != viewWrite) {
                    return viewWrite7;
                }
            }
        }
        return null;
    }

    private int AudioAttributesCompatParcelizer(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.onAddQueueItem == 1) ? 1 : Integer.MIN_VALUE : this.onAddQueueItem == 0 ? 1 : Integer.MIN_VALUE : this.onAddQueueItem == 1 ? -1 : Integer.MIN_VALUE : this.onAddQueueItem == 0 ? -1 : Integer.MIN_VALUE : (this.onAddQueueItem != 1 && onCommand()) ? -1 : 1 : (this.onAddQueueItem != 1 && onCommand()) ? 1 : -1;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        boolean IconCompatParcelizer;
        AudioAttributesCompatParcelizer read;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final boolean write() {
            return this.IconCompatParcelizer;
        }
    }

    class AudioAttributesCompatParcelizer {
        final int RemoteActionCompatParcelizer;
        ArrayList<View> AudioAttributesCompatParcelizer = new ArrayList<>();
        private int IconCompatParcelizer = Integer.MIN_VALUE;
        private int write = Integer.MIN_VALUE;
        private int AudioAttributesImplBaseParcelizer = 0;

        AudioAttributesCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        final int AudioAttributesCompatParcelizer(int i) {
            int i2 = this.IconCompatParcelizer;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.AudioAttributesCompatParcelizer.size() == 0) {
                return i;
            }
            MediaBrowserCompatItemReceiver();
            return this.IconCompatParcelizer;
        }

        private void MediaBrowserCompatItemReceiver() {
            View view = this.AudioAttributesCompatParcelizer.get(0);
            LayoutParams layoutParamsWrite = write(view);
            this.IconCompatParcelizer = StaggeredGridLayoutManager.this.read.AudioAttributesCompatParcelizer(view);
            boolean z = layoutParamsWrite.IconCompatParcelizer;
        }

        final int AudioAttributesImplApi21Parcelizer() {
            int i = this.IconCompatParcelizer;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            MediaBrowserCompatItemReceiver();
            return this.IconCompatParcelizer;
        }

        final int IconCompatParcelizer(int i) {
            int i2 = this.write;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.AudioAttributesCompatParcelizer.size() == 0) {
                return i;
            }
            MediaBrowserCompatCustomActionResultReceiver();
            return this.write;
        }

        private void MediaBrowserCompatCustomActionResultReceiver() {
            View view = this.AudioAttributesCompatParcelizer.get(r0.size() - 1);
            LayoutParams layoutParamsWrite = write(view);
            this.write = StaggeredGridLayoutManager.this.read.IconCompatParcelizer(view);
            boolean z = layoutParamsWrite.IconCompatParcelizer;
        }

        final int RemoteActionCompatParcelizer() {
            int i = this.write;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            MediaBrowserCompatCustomActionResultReceiver();
            return this.write;
        }

        final void read(View view) {
            LayoutParams layoutParamsWrite = write(view);
            layoutParamsWrite.read = this;
            this.AudioAttributesCompatParcelizer.add(0, view);
            this.IconCompatParcelizer = Integer.MIN_VALUE;
            if (this.AudioAttributesCompatParcelizer.size() == 1) {
                this.write = Integer.MIN_VALUE;
            }
            if (layoutParamsWrite.Q_() || layoutParamsWrite.P_()) {
                this.AudioAttributesImplBaseParcelizer += StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer(view);
            }
        }

        final void RemoteActionCompatParcelizer(View view) {
            LayoutParams layoutParamsWrite = write(view);
            layoutParamsWrite.read = this;
            this.AudioAttributesCompatParcelizer.add(view);
            this.write = Integer.MIN_VALUE;
            if (this.AudioAttributesCompatParcelizer.size() == 1) {
                this.IconCompatParcelizer = Integer.MIN_VALUE;
            }
            if (layoutParamsWrite.Q_() || layoutParamsWrite.P_()) {
                this.AudioAttributesImplBaseParcelizer += StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer(view);
            }
        }

        final void read(boolean z, int i) {
            int iAudioAttributesCompatParcelizer;
            if (z) {
                iAudioAttributesCompatParcelizer = IconCompatParcelizer(Integer.MIN_VALUE);
            } else {
                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Integer.MIN_VALUE);
            }
            AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer != Integer.MIN_VALUE) {
                if (!z || iAudioAttributesCompatParcelizer >= StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer()) {
                    if (z || iAudioAttributesCompatParcelizer <= StaggeredGridLayoutManager.this.read.AudioAttributesImplApi21Parcelizer()) {
                        if (i != Integer.MIN_VALUE) {
                            iAudioAttributesCompatParcelizer += i;
                        }
                        this.write = iAudioAttributesCompatParcelizer;
                        this.IconCompatParcelizer = iAudioAttributesCompatParcelizer;
                    }
                }
            }
        }

        final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.clear();
            RatingCompat();
            this.AudioAttributesImplBaseParcelizer = 0;
        }

        private void RatingCompat() {
            this.IconCompatParcelizer = Integer.MIN_VALUE;
            this.write = Integer.MIN_VALUE;
        }

        final void read(int i) {
            this.IconCompatParcelizer = i;
            this.write = i;
        }

        final void AudioAttributesImplApi26Parcelizer() {
            int size = this.AudioAttributesCompatParcelizer.size();
            View viewRemove = this.AudioAttributesCompatParcelizer.remove(size - 1);
            LayoutParams layoutParamsWrite = write(viewRemove);
            layoutParamsWrite.read = null;
            if (layoutParamsWrite.Q_() || layoutParamsWrite.P_()) {
                this.AudioAttributesImplBaseParcelizer -= StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer(viewRemove);
            }
            if (size == 1) {
                this.IconCompatParcelizer = Integer.MIN_VALUE;
            }
            this.write = Integer.MIN_VALUE;
        }

        final void AudioAttributesImplBaseParcelizer() {
            View viewRemove = this.AudioAttributesCompatParcelizer.remove(0);
            LayoutParams layoutParamsWrite = write(viewRemove);
            layoutParamsWrite.read = null;
            if (this.AudioAttributesCompatParcelizer.size() == 0) {
                this.write = Integer.MIN_VALUE;
            }
            if (layoutParamsWrite.Q_() || layoutParamsWrite.P_()) {
                this.AudioAttributesImplBaseParcelizer -= StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer(viewRemove);
            }
            this.IconCompatParcelizer = Integer.MIN_VALUE;
        }

        public final int IconCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        static LayoutParams write(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        final void write(int i) {
            int i2 = this.IconCompatParcelizer;
            if (i2 != Integer.MIN_VALUE) {
                this.IconCompatParcelizer = i2 + i;
            }
            int i3 = this.write;
            if (i3 != Integer.MIN_VALUE) {
                this.write = i3 + i;
            }
        }

        public final int read() {
            if (StaggeredGridLayoutManager.this.IconCompatParcelizer) {
                return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.size() - 1, -1);
            }
            return AudioAttributesCompatParcelizer(0, this.AudioAttributesCompatParcelizer.size());
        }

        public final int write() {
            if (StaggeredGridLayoutManager.this.IconCompatParcelizer) {
                return AudioAttributesCompatParcelizer(0, this.AudioAttributesCompatParcelizer.size());
            }
            return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.size() - 1, -1);
        }

        private int write(int i, int i2, boolean z) {
            int iAudioAttributesImplApi21Parcelizer = StaggeredGridLayoutManager.this.read.AudioAttributesImplApi21Parcelizer();
            int iRemoteActionCompatParcelizer = StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.AudioAttributesCompatParcelizer.get(i);
                int iAudioAttributesCompatParcelizer = StaggeredGridLayoutManager.this.read.AudioAttributesCompatParcelizer(view);
                int iIconCompatParcelizer = StaggeredGridLayoutManager.this.read.IconCompatParcelizer(view);
                boolean z2 = iAudioAttributesCompatParcelizer <= iRemoteActionCompatParcelizer;
                boolean z3 = iIconCompatParcelizer >= iAudioAttributesImplApi21Parcelizer;
                if (z2 && z3 && (iAudioAttributesCompatParcelizer < iAudioAttributesImplApi21Parcelizer || iIconCompatParcelizer > iRemoteActionCompatParcelizer)) {
                    return StaggeredGridLayoutManager.MediaDescriptionCompat(view);
                }
                i += i3;
            }
            return -1;
        }

        private int AudioAttributesCompatParcelizer(int i, int i2) {
            return write(i, i2, true);
        }

        public final View write(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.AudioAttributesCompatParcelizer.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.AudioAttributesCompatParcelizer.get(i3);
                    if ((StaggeredGridLayoutManager.this.IconCompatParcelizer && StaggeredGridLayoutManager.MediaDescriptionCompat(view2) <= i) || ((!StaggeredGridLayoutManager.this.IconCompatParcelizer && StaggeredGridLayoutManager.MediaDescriptionCompat(view2) >= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
                return view;
            }
            int size2 = this.AudioAttributesCompatParcelizer.size() - 1;
            while (size2 >= 0) {
                View view3 = this.AudioAttributesCompatParcelizer.get(size2);
                if ((StaggeredGridLayoutManager.this.IconCompatParcelizer && StaggeredGridLayoutManager.MediaDescriptionCompat(view3) >= i) || ((!StaggeredGridLayoutManager.this.IconCompatParcelizer && StaggeredGridLayoutManager.MediaDescriptionCompat(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
            return view;
        }
    }

    static class LazySpanLookup {
        List<FullSpanItem> IconCompatParcelizer;
        int[] read;

        LazySpanLookup() {
        }

        final int IconCompatParcelizer(int i) {
            int[] iArr = this.read;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (iRemoteActionCompatParcelizer == -1) {
                int[] iArr2 = this.read;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.read.length;
            }
            int iMin = Math.min(iRemoteActionCompatParcelizer + 1, this.read.length);
            Arrays.fill(this.read, i, iMin, -1);
            return iMin;
        }

        final int write(int i) {
            int[] iArr = this.read;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        final void IconCompatParcelizer(int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            read(i);
            this.read[i] = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }

        private int MediaBrowserCompatItemReceiver(int i) {
            int length = this.read.length;
            while (length <= i) {
                length <<= 1;
            }
            return length;
        }

        private void read(int i) {
            int[] iArr = this.read;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.read = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[MediaBrowserCompatItemReceiver(i)];
                this.read = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.read;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        final void IconCompatParcelizer() {
            int[] iArr = this.read;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.IconCompatParcelizer = null;
        }

        final void read(int i, int i2) {
            int[] iArr = this.read;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            read(i3);
            int[] iArr2 = this.read;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.read;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            AudioAttributesCompatParcelizer(i, i2);
        }

        private void AudioAttributesCompatParcelizer(int i, int i2) {
            List<FullSpanItem> list = this.IconCompatParcelizer;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.IconCompatParcelizer.get(size);
                    if (fullSpanItem.RemoteActionCompatParcelizer >= i) {
                        if (fullSpanItem.RemoteActionCompatParcelizer < i + i2) {
                            this.IconCompatParcelizer.remove(size);
                        } else {
                            fullSpanItem.RemoteActionCompatParcelizer -= i2;
                        }
                    }
                }
            }
        }

        final void write(int i, int i2) {
            int[] iArr = this.read;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            read(i3);
            int[] iArr2 = this.read;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.read, i, i3, -1);
            IconCompatParcelizer(i, i2);
        }

        private void IconCompatParcelizer(int i, int i2) {
            List<FullSpanItem> list = this.IconCompatParcelizer;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.IconCompatParcelizer.get(size);
                    if (fullSpanItem.RemoteActionCompatParcelizer >= i) {
                        fullSpanItem.RemoteActionCompatParcelizer += i2;
                    }
                }
            }
        }

        private int RemoteActionCompatParcelizer(int i) {
            if (this.IconCompatParcelizer == null) {
                return -1;
            }
            FullSpanItem fullSpanItemAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            if (fullSpanItemAudioAttributesCompatParcelizer != null) {
                this.IconCompatParcelizer.remove(fullSpanItemAudioAttributesCompatParcelizer);
            }
            int size = this.IconCompatParcelizer.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.IconCompatParcelizer.get(i2).RemoteActionCompatParcelizer >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.IconCompatParcelizer.get(i2);
            this.IconCompatParcelizer.remove(i2);
            return fullSpanItem.RemoteActionCompatParcelizer;
        }

        private FullSpanItem AudioAttributesCompatParcelizer(int i) {
            List<FullSpanItem> list = this.IconCompatParcelizer;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.IconCompatParcelizer.get(size);
                if (fullSpanItem.RemoteActionCompatParcelizer == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ FullSpanItem createFromParcel(Parcel parcel) {
                    return RemoteActionCompatParcelizer(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ FullSpanItem[] newArray(int i) {
                    return read(i);
                }

                private static FullSpanItem RemoteActionCompatParcelizer(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                private static FullSpanItem[] read(int i) {
                    return new FullSpanItem[i];
                }
            };
            boolean AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;
            int RemoteActionCompatParcelizer;
            private int[] write;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            FullSpanItem(Parcel parcel) {
                this.RemoteActionCompatParcelizer = parcel.readInt();
                this.IconCompatParcelizer = parcel.readInt();
                this.AudioAttributesCompatParcelizer = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.write = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            FullSpanItem() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.RemoteActionCompatParcelizer);
                parcel.writeInt(this.IconCompatParcelizer);
                parcel.writeInt(this.AudioAttributesCompatParcelizer ? 1 : 0);
                int[] iArr = this.write;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.write);
                } else {
                    parcel.writeInt(0);
                }
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append(", mGapDir=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.AudioAttributesCompatParcelizer);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.write));
                sb.append('}');
                return sb.toString();
            }
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        List<LazySpanLookup.FullSpanItem> AudioAttributesCompatParcelizer;
        int[] AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        boolean IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        int[] MediaBrowserCompatItemReceiver;
        boolean RemoteActionCompatParcelizer;
        boolean read;
        int write;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.write = parcel.readInt();
            this.AudioAttributesImplBaseParcelizer = parcel.readInt();
            int i = parcel.readInt();
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.AudioAttributesImplApi21Parcelizer = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.AudioAttributesImplApi26Parcelizer = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.MediaBrowserCompatItemReceiver = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.IconCompatParcelizer = parcel.readInt() == 1;
            this.RemoteActionCompatParcelizer = parcel.readInt() == 1;
            this.read = parcel.readInt() == 1;
            this.AudioAttributesCompatParcelizer = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.MediaBrowserCompatCustomActionResultReceiver = savedState.MediaBrowserCompatCustomActionResultReceiver;
            this.write = savedState.write;
            this.AudioAttributesImplBaseParcelizer = savedState.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesImplApi21Parcelizer = savedState.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = savedState.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatItemReceiver = savedState.MediaBrowserCompatItemReceiver;
            this.IconCompatParcelizer = savedState.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = savedState.RemoteActionCompatParcelizer;
            this.read = savedState.read;
            this.AudioAttributesCompatParcelizer = savedState.AudioAttributesCompatParcelizer;
        }

        final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesImplApi21Parcelizer = null;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.AudioAttributesImplApi26Parcelizer = 0;
            this.MediaBrowserCompatItemReceiver = null;
            this.AudioAttributesCompatParcelizer = null;
        }

        final void read() {
            this.AudioAttributesImplApi21Parcelizer = null;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.write = -1;
            this.AudioAttributesImplBaseParcelizer = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.write);
            parcel.writeInt(this.AudioAttributesImplBaseParcelizer);
            parcel.writeInt(this.MediaBrowserCompatCustomActionResultReceiver);
            if (this.MediaBrowserCompatCustomActionResultReceiver > 0) {
                parcel.writeIntArray(this.AudioAttributesImplApi21Parcelizer);
            }
            parcel.writeInt(this.AudioAttributesImplApi26Parcelizer);
            if (this.AudioAttributesImplApi26Parcelizer > 0) {
                parcel.writeIntArray(this.MediaBrowserCompatItemReceiver);
            }
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
            parcel.writeInt(this.read ? 1 : 0);
            parcel.writeList(this.AudioAttributesCompatParcelizer);
        }
    }

    class IconCompatParcelizer {
        int[] AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi26Parcelizer;
        int IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        boolean read;
        int write;

        IconCompatParcelizer() {
            RemoteActionCompatParcelizer();
        }

        final void RemoteActionCompatParcelizer() {
            this.write = -1;
            this.IconCompatParcelizer = Integer.MIN_VALUE;
            this.read = false;
            this.RemoteActionCompatParcelizer = false;
            this.AudioAttributesImplApi26Parcelizer = false;
            int[] iArr = this.AudioAttributesCompatParcelizer;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        final void IconCompatParcelizer(AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr) {
            int length = audioAttributesCompatParcelizerArr.length;
            int[] iArr = this.AudioAttributesCompatParcelizer;
            if (iArr == null || iArr.length < length) {
                this.AudioAttributesCompatParcelizer = new int[StaggeredGridLayoutManager.this.write.length];
            }
            for (int i = 0; i < length; i++) {
                this.AudioAttributesCompatParcelizer[i] = audioAttributesCompatParcelizerArr[i].AudioAttributesCompatParcelizer(Integer.MIN_VALUE);
            }
        }

        final void read() {
            this.IconCompatParcelizer = this.read ? StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer() : StaggeredGridLayoutManager.this.read.AudioAttributesImplApi21Parcelizer();
        }

        final void RemoteActionCompatParcelizer(int i) {
            if (this.read) {
                this.IconCompatParcelizer = StaggeredGridLayoutManager.this.read.RemoteActionCompatParcelizer() - i;
            } else {
                this.IconCompatParcelizer = StaggeredGridLayoutManager.this.read.AudioAttributesImplApi21Parcelizer() + i;
            }
        }
    }
}
