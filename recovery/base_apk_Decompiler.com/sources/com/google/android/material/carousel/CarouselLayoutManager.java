package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.DefaultExtractorsFactory;
import kotlin.StdKeyDeserializer;
import kotlin.StringCollectionDeserializer;
import kotlin._verifyNumberForScalarCoercion;
import kotlin.advancePeekPosition;
import kotlin.calculateNextSearchBytePosition;
import kotlin.deserializeKeylj4SQcc;
import kotlin.getLength;
import kotlin.peekFully;
import kotlin.readFromUpstream;
import kotlin.readFully;
import kotlin.updatePeekBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class CarouselLayoutManager extends RecyclerView.MediaBrowserCompatItemReceiver implements readFromUpstream, RecyclerView.onCustomAction.RemoteActionCompatParcelizer {
    private peekFully AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private updatePeekBuffer MediaBrowserCompatItemReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private getLength RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private advancePeekPosition onAddQueueItem;
    private Map<Integer, getLength> onCommand;
    private int onCustomAction;
    private final View.OnLayoutChangeListener onFastForward;
    private int onPause;
    private int read;
    private int write;

    private static int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new Runnable() { // from class: o.skipFromPeekBuffer
            @Override // java.lang.Runnable
            public final void run() {
                this.read.onSkipToPrevious();
            }
        });
    }

    static final class AudioAttributesCompatParcelizer {
        final float AudioAttributesCompatParcelizer;
        final float IconCompatParcelizer;
        final View RemoteActionCompatParcelizer;
        final write read;

        AudioAttributesCompatParcelizer(View view, float f, float f2, write writeVar) {
            this.RemoteActionCompatParcelizer = view;
            this.IconCompatParcelizer = f;
            this.AudioAttributesCompatParcelizer = f2;
            this.read = writeVar;
        }
    }

    public CarouselLayoutManager() {
        this(new readFully());
    }

    private CarouselLayoutManager(peekFully peekfully) {
        this(peekfully, (byte) 0);
    }

    private CarouselLayoutManager(peekFully peekfully, byte b) {
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = new IconCompatParcelizer();
        this.IconCompatParcelizer = 0;
        this.onFastForward = new View.OnLayoutChangeListener() { // from class: o.readFromPeekBuffer
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.write = -1;
        this.read = 0;
        IconCompatParcelizer(peekfully);
        MediaMetadataCompat(0);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = new IconCompatParcelizer();
        this.IconCompatParcelizer = 0;
        this.onFastForward = new View.OnLayoutChangeListener() { // from class: o.readFromPeekBuffer
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(view, i3, i22, i32, i4, i5, i6, i7, i8);
            }
        };
        this.write = -1;
        this.read = 0;
        IconCompatParcelizer(new readFully());
        IconCompatParcelizer(context, attributeSet);
    }

    private void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.Carousel);
            RatingCompat(typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Carousel_carousel_alignment, 0));
            MediaMetadataCompat(typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void RatingCompat(int i) {
        this.read = i;
        onSkipToPrevious();
    }

    @Override // kotlin.readFromUpstream
    public final int write() {
        return this.read;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final RecyclerView.LayoutParams read() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    private void IconCompatParcelizer(peekFully peekfully) {
        this.AudioAttributesCompatParcelizer = peekfully;
        onSkipToPrevious();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView) {
        super.AudioAttributesCompatParcelizer(recyclerView);
        onSkipToPrevious();
        recyclerView.addOnLayoutChangeListener(this.onFastForward);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(RecyclerView recyclerView, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        super.read(recyclerView, mediaDescriptionCompat);
        recyclerView.removeOnLayoutChangeListener(this.onFastForward);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() <= 0 || MediaMetadataCompat() <= BitmapDescriptorFactory.HUE_RED) {
            RemoteActionCompatParcelizer(mediaDescriptionCompat);
            this.IconCompatParcelizer = 0;
            return;
        }
        boolean zMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        boolean z = this.MediaBrowserCompatItemReceiver == null;
        if (z) {
            AudioAttributesCompatParcelizer(mediaDescriptionCompat);
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        int iIconCompatParcelizer = IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatItemReceiver);
        this.onCustomAction = zMediaBrowserCompatCustomActionResultReceiver ? iIconCompatParcelizer : iAudioAttributesCompatParcelizer;
        if (zMediaBrowserCompatCustomActionResultReceiver) {
            iIconCompatParcelizer = iAudioAttributesCompatParcelizer;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = iIconCompatParcelizer;
        if (z) {
            this.onPause = iAudioAttributesCompatParcelizer;
            this.onCommand = this.MediaBrowserCompatItemReceiver.read(onPrepareFromMediaId(), this.onCustomAction, this.handleMediaPlayPauseIfPendingOnHandler, MediaBrowserCompatCustomActionResultReceiver());
            int i = this.write;
            if (i != -1) {
                this.onPause = AudioAttributesCompatParcelizer(i, MediaDescriptionCompat(i));
            }
        }
        int i2 = this.onPause;
        this.onPause = i2 + RemoteActionCompatParcelizer(0, i2, this.onCustomAction, this.handleMediaPlayPauseIfPendingOnHandler);
        this.IconCompatParcelizer = StdKeyDeserializer.read(this.IconCompatParcelizer, 0, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read());
        write(this.MediaBrowserCompatItemReceiver);
        write(mediaDescriptionCompat);
        read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = onPrepareFromMediaId();
    }

    private void AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        View viewRemoteActionCompatParcelizer = mediaDescriptionCompat.RemoteActionCompatParcelizer(0);
        onCommand(viewRemoteActionCompatParcelizer);
        getLength getlengthAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this, viewRemoteActionCompatParcelizer);
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            getlengthAudioAttributesCompatParcelizer = getLength.read(getlengthAudioAttributesCompatParcelizer, MediaMetadataCompat());
        }
        this.MediaBrowserCompatItemReceiver = updatePeekBuffer.write(this, getlengthAudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSkipToPrevious() {
        this.MediaBrowserCompatItemReceiver = null;
        onSetRating();
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        IconCompatParcelizer(mediaDescriptionCompat);
        if (onPlay() == 0) {
            RemoteActionCompatParcelizer(mediaDescriptionCompat, this.IconCompatParcelizer - 1);
            read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.IconCompatParcelizer);
        } else {
            int iMediaDescriptionCompat = MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0));
            int iMediaDescriptionCompat2 = MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(onPlay() - 1));
            RemoteActionCompatParcelizer(mediaDescriptionCompat, iMediaDescriptionCompat - 1);
            read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iMediaDescriptionCompat2 + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        super.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (onPlay() == 0) {
            this.IconCompatParcelizer = 0;
        } else {
            this.IconCompatParcelizer = MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0));
        }
    }

    private void RemoteActionCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        float fIconCompatParcelizer = IconCompatParcelizer(i);
        while (i >= 0) {
            AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(mediaDescriptionCompat, fIconCompatParcelizer, i);
            if (write(AudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer2.read)) {
                return;
            }
            fIconCompatParcelizer = read(fIconCompatParcelizer, this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
            if (!IconCompatParcelizer(AudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer2.read)) {
                AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer, 0, AudioAttributesCompatParcelizer2);
            }
            i--;
        }
    }

    private void write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, int i, int i2) {
        if (i < 0 || i >= onPrepareFromMediaId()) {
            return;
        }
        AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(mediaDescriptionCompat, IconCompatParcelizer(i), i);
        AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer, i2, AudioAttributesCompatParcelizer2);
    }

    private void read(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i) {
        float fIconCompatParcelizer = IconCompatParcelizer(i);
        while (i < mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read()) {
            AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(mediaDescriptionCompat, fIconCompatParcelizer, i);
            if (IconCompatParcelizer(AudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer2.read)) {
                return;
            }
            fIconCompatParcelizer = IconCompatParcelizer(fIconCompatParcelizer, this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
            if (!write(AudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer2.read)) {
                AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer, -1, AudioAttributesCompatParcelizer2);
            }
            i++;
        }
    }

    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, float f, int i) {
        View viewRemoteActionCompatParcelizer = mediaDescriptionCompat.RemoteActionCompatParcelizer(i);
        onCommand(viewRemoteActionCompatParcelizer);
        float fIconCompatParcelizer = IconCompatParcelizer(f, this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() / 2.0f);
        write writeVarWrite = write(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), fIconCompatParcelizer, false);
        return new AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, fIconCompatParcelizer, IconCompatParcelizer(viewRemoteActionCompatParcelizer, fIconCompatParcelizer, writeVarWrite), writeVarWrite);
    }

    private void AudioAttributesCompatParcelizer(View view, int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        float fMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() / 2.0f;
        read(view, i);
        this.onAddQueueItem.write(view, (int) (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer - fMediaBrowserCompatItemReceiver), (int) (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer + fMediaBrowserCompatItemReceiver));
        read(view, audioAttributesCompatParcelizer.IconCompatParcelizer, audioAttributesCompatParcelizer.read);
    }

    private boolean write(float f, write writeVar) {
        float fIconCompatParcelizer = IconCompatParcelizer(f, AudioAttributesCompatParcelizer(f, writeVar) / 2.0f);
        return MediaBrowserCompatCustomActionResultReceiver() ? fIconCompatParcelizer > ((float) MediaMetadataCompat()) : fIconCompatParcelizer < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.readFromUpstream
    public final boolean RemoteActionCompatParcelizer() {
        return this.onAddQueueItem.read == 0;
    }

    private boolean IconCompatParcelizer(float f, write writeVar) {
        float f2 = read(f, AudioAttributesCompatParcelizer(f, writeVar) / 2.0f);
        return MediaBrowserCompatCustomActionResultReceiver() ? f2 < BitmapDescriptorFactory.HUE_RED : f2 > ((float) MediaMetadataCompat());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(View view, Rect rect) {
        super.read(view, rect);
        float fCenterY = rect.centerY();
        if (RemoteActionCompatParcelizer()) {
            fCenterY = rect.centerX();
        }
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fCenterY, write(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), fCenterY, true));
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        float fHeight = BitmapDescriptorFactory.HUE_RED;
        float fWidth = zRemoteActionCompatParcelizer ? (rect.width() - fAudioAttributesCompatParcelizer) / 2.0f : 0.0f;
        if (!RemoteActionCompatParcelizer()) {
            fHeight = (rect.height() - fAudioAttributesCompatParcelizer) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    private float onPause(View view) {
        int iCenterY;
        Rect rect = new Rect();
        super.read(view, rect);
        if (RemoteActionCompatParcelizer()) {
            iCenterY = rect.centerX();
        } else {
            iCenterY = rect.centerY();
        }
        return iCenterY;
    }

    private void IconCompatParcelizer(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        while (onPlay() > 0) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(0);
            float fOnPause = onPause(viewMediaBrowserCompatCustomActionResultReceiver);
            if (!write(fOnPause, write(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), fOnPause, true))) {
                break;
            } else {
                AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver, mediaDescriptionCompat);
            }
        }
        while (onPlay() - 1 >= 0) {
            View viewMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(onPlay() - 1);
            float fOnPause2 = onPause(viewMediaBrowserCompatCustomActionResultReceiver2);
            if (!IconCompatParcelizer(fOnPause2, write(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), fOnPause2, true))) {
                return;
            } else {
                AudioAttributesCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver2, mediaDescriptionCompat);
            }
        }
    }

    private static write write(List<getLength.RemoteActionCompatParcelizer> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            getLength.RemoteActionCompatParcelizer remoteActionCompatParcelizer = list.get(i5);
            float f6 = z ? remoteActionCompatParcelizer.write : remoteActionCompatParcelizer.read;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new write(list.get(i), list.get(i3));
    }

    private void write(updatePeekBuffer updatepeekbuffer) {
        int i = this.handleMediaPlayPauseIfPendingOnHandler;
        int i2 = this.onCustomAction;
        if (i <= i2) {
            this.RemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver() ? updatepeekbuffer.write() : updatepeekbuffer.RemoteActionCompatParcelizer();
        } else {
            this.RemoteActionCompatParcelizer = updatepeekbuffer.RemoteActionCompatParcelizer(this.onPause, i2, i);
        }
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer());
    }

    private int AudioAttributesCompatParcelizer(updatePeekBuffer updatepeekbuffer) {
        boolean zMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        getLength getlengthWrite = zMediaBrowserCompatCustomActionResultReceiver ? updatepeekbuffer.write() : updatepeekbuffer.RemoteActionCompatParcelizer();
        return (int) (((getPaddingStart() * (zMediaBrowserCompatCustomActionResultReceiver ? 1 : -1)) + MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) - read((zMediaBrowserCompatCustomActionResultReceiver ? getlengthWrite.AudioAttributesImplApi26Parcelizer() : getlengthWrite.read()).read, getlengthWrite.MediaBrowserCompatItemReceiver() / 2.0f));
    }

    private int IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, updatePeekBuffer updatepeekbuffer) {
        boolean zMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        getLength getlengthRemoteActionCompatParcelizer = zMediaBrowserCompatCustomActionResultReceiver ? updatepeekbuffer.RemoteActionCompatParcelizer() : updatepeekbuffer.write();
        getLength.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer = zMediaBrowserCompatCustomActionResultReceiver ? getlengthRemoteActionCompatParcelizer.read() : getlengthRemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        int iMediaBrowserCompatItemReceiver = (int) ((((((mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() - 1) * getlengthRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) + getPaddingEnd()) * (zMediaBrowserCompatCustomActionResultReceiver ? -1.0f : 1.0f)) - (remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer.read - MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) + (MediaDescriptionCompat() - remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer.read));
        return zMediaBrowserCompatCustomActionResultReceiver ? Math.min(0, iMediaBrowserCompatItemReceiver) : Math.max(0, iMediaBrowserCompatItemReceiver);
    }

    private float IconCompatParcelizer(int i) {
        return IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() - this.onPause, this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() * i);
    }

    private float IconCompatParcelizer(View view, float f, write writeVar) {
        float fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(writeVar.write.write, writeVar.read.write, writeVar.write.read, writeVar.read.read, f);
        if (writeVar.read != this.RemoteActionCompatParcelizer.write() && writeVar.write != this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return fRemoteActionCompatParcelizer;
        }
        return fRemoteActionCompatParcelizer + ((f - writeVar.read.read) * ((1.0f - writeVar.read.AudioAttributesCompatParcelizer) + (this.onAddQueueItem.write((RecyclerView.LayoutParams) view.getLayoutParams()) / this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver())));
    }

    private static float AudioAttributesCompatParcelizer(float f, write writeVar) {
        return BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(writeVar.write.AudioAttributesImplApi26Parcelizer, writeVar.read.AudioAttributesImplApi26Parcelizer, writeVar.write.write, writeVar.read.write, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void read(View view, float f, write writeVar) {
        if (view instanceof DefaultExtractorsFactory) {
            float fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(writeVar.write.AudioAttributesCompatParcelizer, writeVar.read.AudioAttributesCompatParcelizer, writeVar.write.read, writeVar.read.read, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFWrite = this.onAddQueueItem.write(height, width, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, height / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, fRemoteActionCompatParcelizer), BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, width / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, fRemoteActionCompatParcelizer));
            float fIconCompatParcelizer = IconCompatParcelizer(view, f, writeVar);
            RectF rectF = new RectF(fIconCompatParcelizer - (rectFWrite.width() / 2.0f), fIconCompatParcelizer - (rectFWrite.height() / 2.0f), (rectFWrite.width() / 2.0f) + fIconCompatParcelizer, (rectFWrite.height() / 2.0f) + fIconCompatParcelizer);
            RectF rectF2 = new RectF(MediaBrowserCompatMediaItem(), onStop(), onCommand(), MediaBrowserCompatSearchResultReceiver());
            this.onAddQueueItem.AudioAttributesCompatParcelizer(rectFWrite, rectF, rectF2);
            this.onAddQueueItem.IconCompatParcelizer(rectFWrite, rectF, rectF2);
            ((DefaultExtractorsFactory) view).setMaskRectF(rectFWrite);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void onCommand(View view) {
        float fMediaBrowserCompatItemReceiver;
        float fMediaBrowserCompatItemReceiver2;
        if (!(view instanceof DefaultExtractorsFactory)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        AudioAttributesCompatParcelizer(view, rect);
        int i = rect.left;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        if (this.MediaBrowserCompatItemReceiver != null && this.onAddQueueItem.read == 0) {
            fMediaBrowserCompatItemReceiver = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().MediaBrowserCompatItemReceiver();
        } else {
            fMediaBrowserCompatItemReceiver = ((ViewGroup.LayoutParams) layoutParams).width;
        }
        if (this.MediaBrowserCompatItemReceiver != null && this.onAddQueueItem.read == 1) {
            fMediaBrowserCompatItemReceiver2 = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().MediaBrowserCompatItemReceiver();
        } else {
            fMediaBrowserCompatItemReceiver2 = ((ViewGroup.LayoutParams) layoutParams).height;
        }
        int iOnPrepare = onPrepare();
        int iOnSeekTo = onSeekTo();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iWrite = write(iOnPrepare, iOnSeekTo, paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i + i2, (int) fMediaBrowserCompatItemReceiver, AudioAttributesImplApi26Parcelizer());
        int iOnMediaButtonEvent = onMediaButtonEvent();
        int iOnFastForward = onFastForward();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        view.measure(iWrite, write(iOnMediaButtonEvent, iOnFastForward, paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i3 + i4, (int) fMediaBrowserCompatItemReceiver2, AudioAttributesImplApi21Parcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int MediaBrowserCompatMediaItem() {
        return this.onAddQueueItem.IconCompatParcelizer();
    }

    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onAddQueueItem.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onCommand() {
        return this.onAddQueueItem.read();
    }

    private int MediaDescriptionCompat() {
        return this.onAddQueueItem.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onStop() {
        return this.onAddQueueItem.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int MediaBrowserCompatSearchResultReceiver() {
        return this.onAddQueueItem.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.readFromUpstream
    public final int AudioAttributesCompatParcelizer() {
        return onPrepare();
    }

    @Override // kotlin.readFromUpstream
    public final int IconCompatParcelizer() {
        return onMediaButtonEvent();
    }

    private int MediaMetadataCompat() {
        if (RemoteActionCompatParcelizer()) {
            return AudioAttributesCompatParcelizer();
        }
        return IconCompatParcelizer();
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return RemoteActionCompatParcelizer() && onPlayFromSearch() == 1;
    }

    private float read(float f, float f2) {
        return MediaBrowserCompatCustomActionResultReceiver() ? f + f2 : f - f2;
    }

    private float IconCompatParcelizer(float f, float f2) {
        return MediaBrowserCompatCustomActionResultReceiver() ? f - f2 : f + f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void RemoteActionCompatParcelizer(AccessibilityEvent accessibilityEvent) {
        super.RemoteActionCompatParcelizer(accessibilityEvent);
        if (onPlay() > 0) {
            accessibilityEvent.setFromIndex(MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0)));
            accessibilityEvent.setToIndex(MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(onPlay() - 1)));
        }
    }

    private int AudioAttributesCompatParcelizer(int i, getLength getlength) {
        float fMediaBrowserCompatItemReceiver;
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            fMediaBrowserCompatItemReceiver = ((MediaMetadataCompat() - getlength.AudioAttributesImplApi26Parcelizer().read) - (i * getlength.MediaBrowserCompatItemReceiver())) - (getlength.MediaBrowserCompatItemReceiver() / 2.0f);
        } else {
            fMediaBrowserCompatItemReceiver = ((i * getlength.MediaBrowserCompatItemReceiver()) - getlength.read().read) + (getlength.MediaBrowserCompatItemReceiver() / 2.0f);
        }
        return (int) fMediaBrowserCompatItemReceiver;
    }

    private int IconCompatParcelizer(int i, getLength getlength) {
        int iMediaMetadataCompat;
        int i2 = Integer.MAX_VALUE;
        for (getLength.RemoteActionCompatParcelizer remoteActionCompatParcelizer : getlength.AudioAttributesCompatParcelizer()) {
            float fMediaBrowserCompatItemReceiver = (i * getlength.MediaBrowserCompatItemReceiver()) + (getlength.MediaBrowserCompatItemReceiver() / 2.0f);
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                iMediaMetadataCompat = (int) ((MediaMetadataCompat() - remoteActionCompatParcelizer.read) - fMediaBrowserCompatItemReceiver);
            } else {
                iMediaMetadataCompat = (int) (fMediaBrowserCompatItemReceiver - remoteActionCompatParcelizer.read);
            }
            int i3 = iMediaMetadataCompat - this.onPause;
            if (Math.abs(i2) > Math.abs(i3)) {
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction.RemoteActionCompatParcelizer
    public final PointF RemoteActionCompatParcelizer(int i) {
        if (this.MediaBrowserCompatItemReceiver == null) {
            return null;
        }
        int i2 = read(i, MediaDescriptionCompat(i));
        if (RemoteActionCompatParcelizer()) {
            return new PointF(i2, BitmapDescriptorFactory.HUE_RED);
        }
        return new PointF(BitmapDescriptorFactory.HUE_RED, i2);
    }

    private int read(int i, getLength getlength) {
        return AudioAttributesCompatParcelizer(i, getlength) - this.onPause;
    }

    private getLength MediaDescriptionCompat(int i) {
        getLength getlength;
        Map<Integer, getLength> map = this.onCommand;
        return (map == null || (getlength = map.get(Integer.valueOf(StdKeyDeserializer.read(i, 0, Math.max(0, onPrepareFromMediaId() + (-1)))))) == null) ? this.MediaBrowserCompatItemReceiver.IconCompatParcelizer() : getlength;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(int i) {
        this.write = i;
        if (this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        this.onPause = AudioAttributesCompatParcelizer(i, MediaDescriptionCompat(i));
        this.IconCompatParcelizer = StdKeyDeserializer.read(i, 0, Math.max(0, onPrepareFromMediaId() - 1));
        write(this.MediaBrowserCompatItemReceiver);
        onSetRating();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        deserializeKeylj4SQcc deserializekeylj4sqcc = new deserializeKeylj4SQcc(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.4
            @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction
            public final PointF read(int i2) {
                return CarouselLayoutManager.this.RemoteActionCompatParcelizer(i2);
            }

            @Override // kotlin.deserializeKeylj4SQcc
            public final int IconCompatParcelizer(View view, int i2) {
                if (CarouselLayoutManager.this.MediaBrowserCompatItemReceiver == null || !CarouselLayoutManager.this.RemoteActionCompatParcelizer()) {
                    return 0;
                }
                return CarouselLayoutManager.this.AudioAttributesCompatParcelizer(CarouselLayoutManager.MediaDescriptionCompat(view));
            }

            @Override // kotlin.deserializeKeylj4SQcc
            public final int write(View view, int i2) {
                if (CarouselLayoutManager.this.MediaBrowserCompatItemReceiver == null || CarouselLayoutManager.this.RemoteActionCompatParcelizer()) {
                    return 0;
                }
                return CarouselLayoutManager.this.AudioAttributesCompatParcelizer(CarouselLayoutManager.MediaDescriptionCompat(view));
            }
        };
        deserializekeylj4sqcc.RemoteActionCompatParcelizer(i);
        RemoteActionCompatParcelizer(deserializekeylj4sqcc);
    }

    final int AudioAttributesCompatParcelizer(int i) {
        return (int) (this.onPause - AudioAttributesCompatParcelizer(i, MediaDescriptionCompat(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (AudioAttributesImplApi26Parcelizer()) {
            return IconCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return !RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (AudioAttributesImplApi21Parcelizer()) {
            return IconCompatParcelizer(i, mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        return 0;
    }

    private int AudioAttributesImplApi21Parcelizer(int i) {
        int iOnSkipToQueueItem = onSkipToQueueItem();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            if (iOnSkipToQueueItem == 0) {
                return MediaBrowserCompatCustomActionResultReceiver() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            return iOnSkipToQueueItem == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && iOnSkipToQueueItem == 1) ? 1 : Integer.MIN_VALUE;
        }
        if (iOnSkipToQueueItem == 0) {
            return MediaBrowserCompatCustomActionResultReceiver() ? -1 : 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final View AudioAttributesCompatParcelizer(View view, int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int iAudioAttributesImplApi21Parcelizer;
        if (onPlay() == 0 || (iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iAudioAttributesImplApi21Parcelizer == -1) {
            if (MediaDescriptionCompat(view) == 0) {
                return null;
            }
            write(mediaDescriptionCompat, MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0)) - 1, 0);
            return AudioAttributesImplBaseParcelizer();
        }
        if (MediaDescriptionCompat(view) == onPrepareFromMediaId() - 1) {
            return null;
        }
        write(mediaDescriptionCompat, MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(onPlay() - 1)) + 1, -1);
        return MediaBrowserCompatItemReceiver();
    }

    private View AudioAttributesImplBaseParcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver(MediaBrowserCompatCustomActionResultReceiver() ? onPlay() - 1 : 0);
    }

    private View MediaBrowserCompatItemReceiver() {
        return MediaBrowserCompatCustomActionResultReceiver(MediaBrowserCompatCustomActionResultReceiver() ? 0 : onPlay() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final boolean IconCompatParcelizer(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iIconCompatParcelizer;
        if (this.MediaBrowserCompatItemReceiver == null || (iIconCompatParcelizer = IconCompatParcelizer(MediaDescriptionCompat(view), MediaDescriptionCompat(MediaDescriptionCompat(view)))) == 0) {
            return false;
        }
        RemoteActionCompatParcelizer(recyclerView, IconCompatParcelizer(MediaDescriptionCompat(view), this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.onPause + RemoteActionCompatParcelizer(iIconCompatParcelizer, this.onPause, this.onCustomAction, this.handleMediaPlayPauseIfPendingOnHandler), this.onCustomAction, this.handleMediaPlayPauseIfPendingOnHandler)));
        return true;
    }

    private void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i) {
        if (RemoteActionCompatParcelizer()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    private int IconCompatParcelizer(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        float f;
        if (onPlay() == 0 || i == 0) {
            return 0;
        }
        if (this.MediaBrowserCompatItemReceiver == null) {
            AudioAttributesCompatParcelizer(mediaDescriptionCompat);
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, this.onPause, this.onCustomAction, this.handleMediaPlayPauseIfPendingOnHandler);
        this.onPause += iRemoteActionCompatParcelizer;
        write(this.MediaBrowserCompatItemReceiver);
        float fMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() / 2.0f;
        float fIconCompatParcelizer = IconCompatParcelizer(MediaDescriptionCompat(MediaBrowserCompatCustomActionResultReceiver(0)));
        Rect rect = new Rect();
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            f = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer().write;
        } else {
            f = this.RemoteActionCompatParcelizer.read().write;
        }
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < onPlay(); i2++) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i2);
            float fAbs = Math.abs(f - read(viewMediaBrowserCompatCustomActionResultReceiver, fIconCompatParcelizer, fMediaBrowserCompatItemReceiver, rect));
            if (viewMediaBrowserCompatCustomActionResultReceiver != null && fAbs < f2) {
                this.write = MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver);
                f2 = fAbs;
            }
            fIconCompatParcelizer = IconCompatParcelizer(fIconCompatParcelizer, this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
        }
        read(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        return iRemoteActionCompatParcelizer;
    }

    private float read(View view, float f, float f2, Rect rect) {
        float fIconCompatParcelizer = IconCompatParcelizer(f, f2);
        write writeVarWrite = write(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), fIconCompatParcelizer, false);
        float fIconCompatParcelizer2 = IconCompatParcelizer(view, fIconCompatParcelizer, writeVarWrite);
        super.read(view, rect);
        read(view, fIconCompatParcelizer, writeVarWrite);
        this.onAddQueueItem.read(view, rect, f2, fIconCompatParcelizer2);
        return fIconCompatParcelizer2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return this.onPause;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int MediaBrowserCompatItemReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0 || this.MediaBrowserCompatItemReceiver == null || onPrepareFromMediaId() <= 1) {
            return 0;
        }
        return (int) (onPrepare() * (this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().MediaBrowserCompatItemReceiver() / IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return this.handleMediaPlayPauseIfPendingOnHandler - this.onCustomAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return this.onPause;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesImplBaseParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (onPlay() == 0 || this.MediaBrowserCompatItemReceiver == null || onPrepareFromMediaId() <= 1) {
            return 0;
        }
        return (int) (onMediaButtonEvent() * (this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().MediaBrowserCompatItemReceiver() / read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        return this.handleMediaPlayPauseIfPendingOnHandler - this.onCustomAction;
    }

    private int onSkipToQueueItem() {
        return this.onAddQueueItem.read;
    }

    private void MediaMetadataCompat(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i)));
        }
        IconCompatParcelizer((String) null);
        advancePeekPosition advancepeekposition = this.onAddQueueItem;
        if (advancepeekposition == null || i != advancepeekposition.read) {
            this.onAddQueueItem = advancePeekPosition.IconCompatParcelizer(this, i);
            onSkipToPrevious();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        super.RemoteActionCompatParcelizer(recyclerView, i, i2);
        setSessionImpl();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        super.AudioAttributesCompatParcelizer(recyclerView, i, i2);
        setSessionImpl();
    }

    private void setSessionImpl() {
        int iOnPrepareFromMediaId = onPrepareFromMediaId();
        int i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (iOnPrepareFromMediaId == i || this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        if (this.AudioAttributesCompatParcelizer.write(this, i)) {
            onSkipToPrevious();
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iOnPrepareFromMediaId;
    }

    static class write {
        final getLength.RemoteActionCompatParcelizer read;
        final getLength.RemoteActionCompatParcelizer write;

        write(getLength.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getLength.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
            StringCollectionDeserializer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.read <= remoteActionCompatParcelizer2.read);
            this.write = remoteActionCompatParcelizer;
            this.read = remoteActionCompatParcelizer2;
        }
    }

    static class IconCompatParcelizer extends RecyclerView.AudioAttributesImplBaseParcelizer {
        private List<getLength.RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer;
        private final Paint read;

        IconCompatParcelizer() {
            Paint paint = new Paint();
            this.read = paint;
            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        final void IconCompatParcelizer(List<getLength.RemoteActionCompatParcelizer> list) {
            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
        public final void AudioAttributesCompatParcelizer(Canvas canvas, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super.AudioAttributesCompatParcelizer(canvas, recyclerView, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            this.read.setStrokeWidth(recyclerView.getResources().getDimension(calculateNextSearchBytePosition.write.m3_carousel_debug_keyline_width));
            for (getLength.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer) {
                this.read.setColor(_verifyNumberForScalarCoercion.RemoteActionCompatParcelizer(-65281, -16776961, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer));
                if (((CarouselLayoutManager) recyclerView.AudioAttributesImplApi21Parcelizer()).RemoteActionCompatParcelizer()) {
                    canvas.drawLine(remoteActionCompatParcelizer.write, ((CarouselLayoutManager) recyclerView.AudioAttributesImplApi21Parcelizer()).onStop(), remoteActionCompatParcelizer.write, ((CarouselLayoutManager) recyclerView.AudioAttributesImplApi21Parcelizer()).MediaBrowserCompatSearchResultReceiver(), this.read);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.AudioAttributesImplApi21Parcelizer()).MediaBrowserCompatMediaItem(), remoteActionCompatParcelizer.write, ((CarouselLayoutManager) recyclerView.AudioAttributesImplApi21Parcelizer()).onCommand(), remoteActionCompatParcelizer.write, this.read);
                }
            }
        }
    }
}
