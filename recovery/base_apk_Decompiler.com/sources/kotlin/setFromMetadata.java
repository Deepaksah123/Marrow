package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.getActivityBanner;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setFromMetadata extends Drawable implements getActivityBanner {
    private static final Property<setFromMetadata, Float> write = new Property<setFromMetadata, Float>(Float.class, "growFraction") { // from class: o.setFromMetadata.3
        @Override // android.util.Property
        public final /* synthetic */ Float get(setFromMetadata setfrommetadata) {
            return RemoteActionCompatParcelizer(setfrommetadata);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(setFromMetadata setfrommetadata, Float f) {
            IconCompatParcelizer(setfrommetadata, f);
        }

        private static Float RemoteActionCompatParcelizer(setFromMetadata setfrommetadata) {
            return Float.valueOf(setfrommetadata.IconCompatParcelizer());
        }

        private static void IconCompatParcelizer(setFromMetadata setfrommetadata, Float f) {
            setfrommetadata.read(f.floatValue());
        }
    };
    private boolean AudioAttributesImplApi21Parcelizer;
    private getActivityBanner.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    final Context IconCompatParcelizer;
    private List<getActivityBanner.RemoteActionCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    private ValueAnimator MediaBrowserCompatItemReceiver;
    private ValueAnimator MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    final getMetadataCopyWithAppendedEntriesFrom RemoteActionCompatParcelizer;
    final Paint read = new Paint();
    public FlacStreamMetadataSeekTable AudioAttributesCompatParcelizer = new FlacStreamMetadataSeekTable();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    static /* synthetic */ boolean write(setFromMetadata setfrommetadata) {
        return super.setVisible(false, false);
    }

    setFromMetadata(Context context, getMetadataCopyWithAppendedEntriesFrom getmetadatacopywithappendedentriesfrom) {
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = getmetadatacopywithappendedentriesfrom;
        setAlpha(255);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.MediaBrowserCompatMediaItem == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, write, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.MediaBrowserCompatMediaItem = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.MediaBrowserCompatMediaItem.setInterpolator(BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer);
            IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.MediaBrowserCompatItemReceiver == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, write, 1.0f, BitmapDescriptorFactory.HUE_RED);
            this.MediaBrowserCompatItemReceiver = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.MediaBrowserCompatItemReceiver.setInterpolator(BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer);
            AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        }
    }

    public void RemoteActionCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.contains(remoteActionCompatParcelizer)) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.add(remoteActionCompatParcelizer);
    }

    public boolean AudioAttributesCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        List<getActivityBanner.RemoteActionCompatParcelizer> list = this.MediaBrowserCompatCustomActionResultReceiver;
        if (list == null || !list.contains(remoteActionCompatParcelizer)) {
            return false;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.remove(remoteActionCompatParcelizer);
        if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
            return true;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplBaseParcelizer() {
        List<getActivityBanner.RemoteActionCompatParcelizer> list = this.MediaBrowserCompatCustomActionResultReceiver;
        if (list == null || this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        Iterator<getActivityBanner.RemoteActionCompatParcelizer> it = list.iterator();
        while (it.hasNext()) {
            it.next().read(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        List<getActivityBanner.RemoteActionCompatParcelizer> list = this.MediaBrowserCompatCustomActionResultReceiver;
        if (list == null || this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        Iterator<getActivityBanner.RemoteActionCompatParcelizer> it = list.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(this);
        }
    }

    public void start() {
        read(true, true, false);
    }

    public void stop() {
        read(false, true, false);
    }

    public boolean isRunning() {
        return AudioAttributesCompatParcelizer() || RemoteActionCompatParcelizer();
    }

    public boolean AudioAttributesCompatParcelizer() {
        ValueAnimator valueAnimator = this.MediaBrowserCompatMediaItem;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean RemoteActionCompatParcelizer() {
        ValueAnimator valueAnimator = this.MediaBrowserCompatItemReceiver;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean read() {
        return write(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return write(z, z2, true);
    }

    public boolean write(boolean z, boolean z2, boolean z3) {
        return read(z, z2, z3 && FlacStreamMetadataSeekTable.RemoteActionCompatParcelizer(this.IconCompatParcelizer.getContentResolver()) > BitmapDescriptorFactory.HUE_RED);
    }

    boolean read(boolean z, boolean z2, boolean z3) {
        MediaBrowserCompatCustomActionResultReceiver();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.MediaBrowserCompatMediaItem : this.MediaBrowserCompatItemReceiver;
        ValueAnimator valueAnimator2 = z ? this.MediaBrowserCompatItemReceiver : this.MediaBrowserCompatMediaItem;
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                IconCompatParcelizer(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                write(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (z3 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() : this.RemoteActionCompatParcelizer.IconCompatParcelizer())) {
            write(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z4;
        }
        valueAnimator.resume();
        return z4;
    }

    private void IconCompatParcelizer(ValueAnimator... valueAnimatorArr) {
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = true;
        int length = valueAnimatorArr.length;
        for (int i = 0; i <= 0; i++) {
            valueAnimatorArr[0].cancel();
        }
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    private void write(ValueAnimator... valueAnimatorArr) {
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = true;
        int length = valueAnimatorArr.length;
        for (int i = 0; i <= 0; i++) {
            valueAnimatorArr[0].end();
        }
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.MediaMetadataCompat = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.MediaMetadataCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.read.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private void IconCompatParcelizer(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.MediaBrowserCompatMediaItem;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.MediaBrowserCompatMediaItem = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: o.setFromMetadata.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                setFromMetadata.this.AudioAttributesImplBaseParcelizer();
            }
        });
    }

    private void AudioAttributesCompatParcelizer(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.MediaBrowserCompatItemReceiver;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.MediaBrowserCompatItemReceiver = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: o.setFromMetadata.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                setFromMetadata.write(setFromMetadata.this);
                setFromMetadata.this.write();
            }
        });
    }

    final float IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() || this.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        return 1.0f;
    }

    final void read(float f) {
        if (this.AudioAttributesImplBaseParcelizer != f) {
            this.AudioAttributesImplBaseParcelizer = f;
            invalidateSelf();
        }
    }
}
