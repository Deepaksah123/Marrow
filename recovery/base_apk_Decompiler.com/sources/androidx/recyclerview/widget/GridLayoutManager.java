package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    final SparseIntArray AudioAttributesCompatParcelizer;
    final SparseIntArray IconCompatParcelizer;
    private IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    final Rect RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private int[] onCommand;
    private View[] onCustomAction;
    private boolean onPause;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.onAddQueueItem = false;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.AudioAttributesCompatParcelizer = new SparseIntArray();
        this.IconCompatParcelizer = new SparseIntArray();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new write();
        this.RemoteActionCompatParcelizer = new Rect();
        MediaMetadataCompat(read(context, attributeSet, i, i2).AudioAttributesCompatParcelizer);
    }

    public GridLayoutManager(Context context, int i) {
        this.onAddQueueItem = false;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.AudioAttributesCompatParcelizer = new SparseIntArray();
        this.IconCompatParcelizer = new SparseIntArray();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new write();
        this.RemoteActionCompatParcelizer = new Rect();
        MediaMetadataCompat(i);
    }

    public GridLayoutManager(int i) {
        super(1, false);
        this.onAddQueueItem = false;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.AudioAttributesCompatParcelizer = new SparseIntArray();
        this.IconCompatParcelizer = new SparseIntArray();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new write();
        this.RemoteActionCompatParcelizer = new Rect();
        MediaMetadataCompat(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void write(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.write(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (((LinearLayoutManager) this).write == 0) {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() <= 0) {
            return 0;
        }
        return IconCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (((LinearLayoutManager) this).write == 1) {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() <= 0) {
            return 0;
        }
        return IconCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.IconCompatParcelizer(view, hassuperclassstartingwith);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iIconCompatParcelizer = IconCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, layoutParams2.O_());
        if (((LinearLayoutManager) this).write == 0) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(layoutParams2.write(), layoutParams2.read(), iIconCompatParcelizer, 1, false, false));
        } else {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(iIconCompatParcelizer, 1, layoutParams2.write(), layoutParams2.read(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, hasSuperClassStartingWith hassuperclassstartingwith) {
        super.IconCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, hassuperclassstartingwith);
        hassuperclassstartingwith.AudioAttributesCompatParcelizer((CharSequence) GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
            onSkipToQueueItem();
        }
        super.write(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        onSkipToPrevious();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        super.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.onAddQueueItem = false;
    }

    private void onSkipToPrevious() {
        this.AudioAttributesCompatParcelizer.clear();
        this.IconCompatParcelizer.clear();
    }

    private void onSkipToQueueItem() {
        int iOnPlay = onPlay();
        for (int i = 0; i < iOnPlay; i++) {
            LayoutParams layoutParams = (LayoutParams) MediaBrowserCompatCustomActionResultReceiver(i).getLayoutParams();
            int iO_ = layoutParams.O_();
            this.AudioAttributesCompatParcelizer.put(iO_, layoutParams.read());
            this.IconCompatParcelizer.put(iO_, layoutParams.write());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void L_() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2, int i3) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final RecyclerView.LayoutParams read() {
        if (((LinearLayoutManager) this).write == 0) {
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

    public final void read(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizer;
    }

    public final IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    private void onStop() {
        int iOnMediaButtonEvent;
        int paddingTop;
        if (MediaBrowserCompatSearchResultReceiver() == 1) {
            iOnMediaButtonEvent = onPrepare() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            iOnMediaButtonEvent = onMediaButtonEvent() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        RatingCompat(iOnMediaButtonEvent - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(Rect rect, int i, int i2) {
        int iA_;
        int iA_2;
        if (this.onCommand == null) {
            super.IconCompatParcelizer(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (((LinearLayoutManager) this).write == 1) {
            iA_2 = a_(i2, rect.height() + paddingTop, onPrepareFromSearch());
            int[] iArr = this.onCommand;
            iA_ = a_(i, iArr[iArr.length - 1] + paddingLeft, onPlayFromUri());
        } else {
            iA_ = a_(i, rect.width() + paddingLeft, onPlayFromUri());
            int[] iArr2 = this.onCommand;
            iA_2 = a_(i2, iArr2[iArr2.length - 1] + paddingTop, onPrepareFromSearch());
        }
        RemoteActionCompatParcelizer(iA_, iA_2);
    }

    private void RatingCompat(int i) {
        this.onCommand = write(this.onCommand, this.handleMediaPlayPauseIfPendingOnHandler, i);
    }

    private static int[] write(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private int AudioAttributesImplApi21Parcelizer(int i, int i2) {
        if (((LinearLayoutManager) this).write == 1 && MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            int[] iArr = this.onCommand;
            int i3 = this.handleMediaPlayPauseIfPendingOnHandler - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        int[] iArr2 = this.onCommand;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final void AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, LinearLayoutManager.IconCompatParcelizer iconCompatParcelizer, int i) {
        super.AudioAttributesCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer, i);
        onStop();
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() > 0 && !mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
            RemoteActionCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer, i);
        }
        setSessionImpl();
    }

    private void setSessionImpl() {
        View[] viewArr = this.onCustomAction;
        if (viewArr == null || viewArr.length != this.handleMediaPlayPauseIfPendingOnHandler) {
            this.onCustomAction = new View[this.handleMediaPlayPauseIfPendingOnHandler];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        onStop();
        setSessionImpl();
        return super.read(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        onStop();
        setSessionImpl();
        return super.RemoteActionCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private void RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, LinearLayoutManager.IconCompatParcelizer iconCompatParcelizer, int i) {
        int i2;
        int iAudioAttributesCompatParcelizer;
        boolean z = i == 1;
        int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer.IconCompatParcelizer);
        if (z) {
            while (iAudioAttributesCompatParcelizer2 > 0 && iconCompatParcelizer.IconCompatParcelizer > 0) {
                iconCompatParcelizer.IconCompatParcelizer--;
                iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer.IconCompatParcelizer);
            }
            return;
        }
        int i3 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        int i4 = iconCompatParcelizer.IconCompatParcelizer;
        while (i4 < i3 - 1 && (iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (i2 = i4 + 1))) > iAudioAttributesCompatParcelizer2) {
            i4 = i2;
            iAudioAttributesCompatParcelizer2 = iAudioAttributesCompatParcelizer;
        }
        iconCompatParcelizer.IconCompatParcelizer = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final View write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, boolean z, boolean z2) {
        int i;
        int iOnPlay;
        int iOnPlay2 = onPlay();
        int i2 = 1;
        if (z2) {
            iOnPlay = onPlay() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iOnPlay2;
            iOnPlay = 0;
        }
        int i3 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        AudioAttributesImplBaseParcelizer();
        int iAudioAttributesImplApi21Parcelizer = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        int iRemoteActionCompatParcelizer = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        View view = null;
        View view2 = null;
        while (iOnPlay != i) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iOnPlay);
            int iMediaDescriptionCompat = MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver);
            if (iMediaDescriptionCompat >= 0 && iMediaDescriptionCompat < i3 && AudioAttributesCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iMediaDescriptionCompat) == 0) {
                if (((RecyclerView.LayoutParams) viewMediaBrowserCompatCustomActionResultReceiver.getLayoutParams()).Q_()) {
                    if (view2 == null) {
                        view2 = viewMediaBrowserCompatCustomActionResultReceiver;
                    }
                } else {
                    if (((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) < iRemoteActionCompatParcelizer && ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver) >= iAudioAttributesImplApi21Parcelizer) {
                        return viewMediaBrowserCompatCustomActionResultReceiver;
                    }
                    if (view == null) {
                        view = viewMediaBrowserCompatCustomActionResultReceiver;
                    }
                }
            }
            iOnPlay += i2;
        }
        return view != null ? view : view2;
    }

    private int IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i) {
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(i, this.handleMediaPlayPauseIfPendingOnHandler);
        }
        int iAudioAttributesCompatParcelizer = mediaDescriptionCompat.AudioAttributesCompatParcelizer(i);
        if (iAudioAttributesCompatParcelizer == -1) {
            return 0;
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler);
    }

    private int AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i) {
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(i, this.handleMediaPlayPauseIfPendingOnHandler);
        }
        int i2 = this.IconCompatParcelizer.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iAudioAttributesCompatParcelizer = mediaDescriptionCompat.AudioAttributesCompatParcelizer(i);
        if (iAudioAttributesCompatParcelizer == -1) {
            return 0;
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler);
    }

    private int RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i) {
        if (!mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write()) {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(i);
        }
        int i2 = this.AudioAttributesCompatParcelizer.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iAudioAttributesCompatParcelizer = mediaDescriptionCompat.AudioAttributesCompatParcelizer(i);
        if (iAudioAttributesCompatParcelizer == -1) {
            return 1;
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final void read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, LinearLayoutManager.RemoteActionCompatParcelizer remoteActionCompatParcelizer, RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        int iIconCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler;
        for (int i = 0; i < this.handleMediaPlayPauseIfPendingOnHandler && remoteActionCompatParcelizer.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && iIconCompatParcelizer > 0; i++) {
            int i2 = remoteActionCompatParcelizer.write;
            remoteActionCompatParcelizer2.read(i2, Math.max(0, remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver));
            iIconCompatParcelizer -= this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(i2);
            remoteActionCompatParcelizer.write += remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, LinearLayoutManager.RemoteActionCompatParcelizer remoteActionCompatParcelizer, LinearLayoutManager.read readVar) {
        int i;
        int i2;
        int paddingLeft;
        int paddingTop;
        int iWrite;
        int iWrite2;
        int i3;
        int iWrite3;
        int iWrite4;
        View viewAudioAttributesCompatParcelizer;
        int iIconCompatParcelizer = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        boolean z = iIconCompatParcelizer != 1073741824;
        int i4 = onPlay() > 0 ? this.onCommand[this.handleMediaPlayPauseIfPendingOnHandler] : 0;
        if (z) {
            onStop();
        }
        boolean z2 = remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver == 1;
        int iAudioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler;
        if (!z2) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, remoteActionCompatParcelizer.write) + RemoteActionCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, remoteActionCompatParcelizer.write);
        }
        int i5 = 0;
        while (i5 < this.handleMediaPlayPauseIfPendingOnHandler && remoteActionCompatParcelizer.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && iAudioAttributesCompatParcelizer > 0) {
            int i6 = remoteActionCompatParcelizer.write;
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i6);
            if (iRemoteActionCompatParcelizer > this.handleMediaPlayPauseIfPendingOnHandler) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i6);
                sb.append(" requires ");
                sb.append(iRemoteActionCompatParcelizer);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
            iAudioAttributesCompatParcelizer -= iRemoteActionCompatParcelizer;
            if (iAudioAttributesCompatParcelizer < 0 || (viewAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(mediaDescriptionCompat)) == null) {
                break;
            }
            this.onCustomAction[i5] = viewAudioAttributesCompatParcelizer;
            i5++;
        }
        if (i5 == 0) {
            readVar.read = true;
            return;
        }
        read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i5, z2);
        float f = BitmapDescriptorFactory.HUE_RED;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            View view = this.onCustomAction[i8];
            if (remoteActionCompatParcelizer.MediaDescriptionCompat == null) {
                if (z2) {
                    AudioAttributesCompatParcelizer(view);
                } else {
                    read(view, 0);
                }
            } else if (z2) {
                RemoteActionCompatParcelizer(view);
            } else {
                AudioAttributesCompatParcelizer(view, 0);
            }
            AudioAttributesCompatParcelizer(view, this.RemoteActionCompatParcelizer);
            write(view, iIconCompatParcelizer, false);
            int iRemoteActionCompatParcelizer2 = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(view);
            if (iRemoteActionCompatParcelizer2 > i7) {
                i7 = iRemoteActionCompatParcelizer2;
            }
            float fWrite = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.write(view) / ((LayoutParams) view.getLayoutParams()).read;
            if (fWrite > f) {
                f = fWrite;
            }
        }
        if (z) {
            IconCompatParcelizer(f, i4);
            i7 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                View view2 = this.onCustomAction[i9];
                write(view2, 1073741824, true);
                int iRemoteActionCompatParcelizer3 = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(view2);
                if (iRemoteActionCompatParcelizer3 > i7) {
                    i7 = iRemoteActionCompatParcelizer3;
                }
            }
        }
        for (int i10 = 0; i10 < i5; i10++) {
            View view3 = this.onCustomAction[i10];
            if (((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(view3) != i7) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.RemoteActionCompatParcelizer;
                int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(layoutParams.IconCompatParcelizer, layoutParams.read);
                if (((LinearLayoutManager) this).write == 1) {
                    iWrite4 = write(iAudioAttributesImplApi21Parcelizer, 1073741824, i12, ((ViewGroup.LayoutParams) layoutParams).width, false);
                    iWrite3 = View.MeasureSpec.makeMeasureSpec(i7 - i11, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - i12, 1073741824);
                    iWrite3 = write(iAudioAttributesImplApi21Parcelizer, 1073741824, i11, ((ViewGroup.LayoutParams) layoutParams).height, false);
                    iWrite4 = iMakeMeasureSpec;
                }
                read(view3, iWrite4, iWrite3, true);
            }
        }
        readVar.AudioAttributesCompatParcelizer = i7;
        if (((LinearLayoutManager) this).write == 1) {
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == -1) {
                iWrite2 = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                i3 = iWrite2 - i7;
            } else {
                i3 = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                iWrite2 = i3 + i7;
            }
            paddingTop = i3;
            iWrite = 0;
            paddingLeft = 0;
        } else {
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == -1) {
                i2 = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                i = i2 - i7;
            } else {
                i = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
                i2 = i + i7;
            }
            paddingLeft = i;
            paddingTop = 0;
            iWrite = i2;
            iWrite2 = 0;
        }
        for (int i13 = 0; i13 < i5; i13++) {
            View view4 = this.onCustomAction[i13];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (((LinearLayoutManager) this).write == 1) {
                if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    iWrite = getPaddingLeft() + this.onCommand[this.handleMediaPlayPauseIfPendingOnHandler - layoutParams2.IconCompatParcelizer];
                    paddingLeft = iWrite - ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.write(view4);
                } else {
                    paddingLeft = this.onCommand[layoutParams2.IconCompatParcelizer] + getPaddingLeft();
                    iWrite = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.write(view4) + paddingLeft;
                }
            } else {
                paddingTop = this.onCommand[layoutParams2.IconCompatParcelizer] + getPaddingTop();
                iWrite2 = ((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.write(view4) + paddingTop;
            }
            RemoteActionCompatParcelizer(view4, paddingLeft, paddingTop, iWrite, iWrite2);
            if (layoutParams2.Q_() || layoutParams2.P_()) {
                readVar.IconCompatParcelizer = true;
            }
            readVar.write = view4.hasFocusable() | readVar.write;
        }
        Arrays.fill(this.onCustomAction, (Object) null);
    }

    private void write(View view, int i, boolean z) {
        int iWrite;
        int iWrite2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.RemoteActionCompatParcelizer;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(layoutParams.IconCompatParcelizer, layoutParams.read);
        if (((LinearLayoutManager) this).write == 1) {
            iWrite2 = write(iAudioAttributesImplApi21Parcelizer, i, i3, ((ViewGroup.LayoutParams) layoutParams).width, false);
            iWrite = write(((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(), onFastForward(), i2, ((ViewGroup.LayoutParams) layoutParams).height, true);
        } else {
            int iWrite3 = write(iAudioAttributesImplApi21Parcelizer, i, i2, ((ViewGroup.LayoutParams) layoutParams).height, false);
            int iWrite4 = write(((LinearLayoutManager) this).AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(), onSeekTo(), i3, ((ViewGroup.LayoutParams) layoutParams).width, true);
            iWrite = iWrite3;
            iWrite2 = iWrite4;
        }
        read(view, iWrite2, iWrite, z);
    }

    private void IconCompatParcelizer(float f, int i) {
        RatingCompat(Math.max(Math.round(f * this.handleMediaPlayPauseIfPendingOnHandler), i));
    }

    private void read(View view, int i, int i2, boolean z) {
        boolean zIconCompatParcelizer;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            zIconCompatParcelizer = IconCompatParcelizer(view, i, i2, layoutParams);
        } else {
            zIconCompatParcelizer = read(view, i, i2, layoutParams);
        }
        if (zIconCompatParcelizer) {
            view.measure(i, i2);
        }
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        if (z) {
            i2 = 1;
            i3 = 0;
        } else {
            i2 = -1;
            i3 = 0;
            i4 = i - 1;
            i = -1;
        }
        while (i4 != i) {
            View view = this.onCustomAction[i4];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.read = RemoteActionCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, MediaDescriptionCompat(view));
            layoutParams.IconCompatParcelizer = i3;
            i3 += layoutParams.read;
            i4 += i2;
        }
    }

    public final int IconCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    private void MediaMetadataCompat(int i) {
        if (i == this.handleMediaPlayPauseIfPendingOnHandler) {
            return;
        }
        this.onAddQueueItem = true;
        if (i <= 0) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(i)));
        }
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        onSetRating();
    }

    public static abstract class IconCompatParcelizer {
        final SparseIntArray IconCompatParcelizer = new SparseIntArray();
        final SparseIntArray write = new SparseIntArray();
        private boolean read = false;
        private boolean AudioAttributesCompatParcelizer = false;

        public abstract int IconCompatParcelizer(int i);

        public final void read() {
            this.read = true;
        }

        public final void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer.clear();
        }

        public final void write() {
            this.write.clear();
        }

        final int AudioAttributesCompatParcelizer(int i, int i2) {
            if (!this.read) {
                return write(i, i2);
            }
            int i3 = this.IconCompatParcelizer.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iWrite = write(i, i2);
            this.IconCompatParcelizer.put(i, iWrite);
            return iWrite;
        }

        final int RemoteActionCompatParcelizer(int i, int i2) {
            return read(i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int write(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.IconCompatParcelizer(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.read
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.IconCompatParcelizer
                int r2 = write(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.IconCompatParcelizer
                int r3 = r3.get(r2)
                int r4 = r5.IconCompatParcelizer(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.IconCompatParcelizer(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.IconCompatParcelizer.write(int, int):int");
        }

        private static int write(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        private int read(int i, int i2) {
            int iIconCompatParcelizer = IconCompatParcelizer(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int iIconCompatParcelizer2 = IconCompatParcelizer(i5);
                i4 += iIconCompatParcelizer2;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = iIconCompatParcelizer2;
                }
            }
            return i4 + iIconCompatParcelizer > i2 ? i3 + 1 : i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View AudioAttributesCompatParcelizer(android.view.View r22, int r23, androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat r24, androidx.recyclerview.widget.RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r25) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AudioAttributesCompatParcelizer(android.view.View, int, androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat, androidx.recyclerview.widget.RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean M_() {
        return ((LinearLayoutManager) this).MediaBrowserCompatItemReceiver == null && !this.onAddQueueItem;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return super.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return super.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return super.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return super.RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public static final class write extends IconCompatParcelizer {
        @Override // androidx.recyclerview.widget.GridLayoutManager.IconCompatParcelizer
        public final int IconCompatParcelizer(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.IconCompatParcelizer
        public final int write(int i, int i2) {
            return i % i2;
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        int IconCompatParcelizer;
        int read;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.IconCompatParcelizer = -1;
            this.read = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.IconCompatParcelizer = -1;
            this.read = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.IconCompatParcelizer = -1;
            this.read = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.IconCompatParcelizer = -1;
            this.read = 0;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }

        public final int read() {
            return this.read;
        }
    }
}
