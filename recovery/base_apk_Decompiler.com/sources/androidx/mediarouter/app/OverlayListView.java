package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OverlayListView extends ListView {
    private final List<write> read;

    public OverlayListView(Context context) {
        super(context);
        this.read = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.read = new ArrayList();
    }

    public final void AudioAttributesCompatParcelizer(write writeVar) {
        this.read.add(writeVar);
    }

    public final void read() {
        for (write writeVar : this.read) {
            if (!writeVar.RemoteActionCompatParcelizer()) {
                writeVar.write(getDrawingTime());
            }
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        Iterator<write> it = this.read.iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.read.size() > 0) {
            Iterator<write> it = this.read.iterator();
            while (it.hasNext()) {
                write next = it.next();
                BitmapDrawable bitmapDrawableAudioAttributesCompatParcelizer = next.AudioAttributesCompatParcelizer();
                if (bitmapDrawableAudioAttributesCompatParcelizer != null) {
                    bitmapDrawableAudioAttributesCompatParcelizer.draw(canvas);
                }
                if (!next.read(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }

    public static class write {
        private BitmapDrawable AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private Interpolator AudioAttributesImplBaseParcelizer;
        private long IconCompatParcelizer;
        private RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
        private Rect MediaBrowserCompatMediaItem;
        private long MediaDescriptionCompat;
        private int read;
        private Rect write;
        private float RemoteActionCompatParcelizer = 1.0f;
        private float MediaMetadataCompat = 1.0f;
        private float MediaBrowserCompatItemReceiver = 1.0f;

        public interface RemoteActionCompatParcelizer {
            void RemoteActionCompatParcelizer();
        }

        public write(BitmapDrawable bitmapDrawable, Rect rect) {
            this.AudioAttributesCompatParcelizer = bitmapDrawable;
            this.MediaBrowserCompatMediaItem = rect;
            this.write = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.AudioAttributesCompatParcelizer;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.RemoteActionCompatParcelizer * 255.0f));
                this.AudioAttributesCompatParcelizer.setBounds(this.write);
            }
        }

        public final BitmapDrawable AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final write read() {
            this.MediaMetadataCompat = 1.0f;
            this.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
            return this;
        }

        public final write IconCompatParcelizer(int i) {
            this.read = i;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(long j) {
            this.IconCompatParcelizer = j;
            return this;
        }

        public final write RemoteActionCompatParcelizer(Interpolator interpolator) {
            this.AudioAttributesImplBaseParcelizer = interpolator;
            return this;
        }

        public final write read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer;
            return this;
        }

        public final void write(long j) {
            this.MediaDescriptionCompat = j;
            this.AudioAttributesImplApi21Parcelizer = true;
        }

        public final void IconCompatParcelizer() {
            this.AudioAttributesImplApi21Parcelizer = true;
            this.AudioAttributesImplApi26Parcelizer = true;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }

        public final boolean read(long j) {
            if (this.AudioAttributesImplApi26Parcelizer) {
                return false;
            }
            float fMin = Math.min(1.0f, (j - this.MediaDescriptionCompat) / this.IconCompatParcelizer);
            float f = BitmapDescriptorFactory.HUE_RED;
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fMin);
            if (this.AudioAttributesImplApi21Parcelizer) {
                f = fMax;
            }
            Interpolator interpolator = this.AudioAttributesImplBaseParcelizer;
            float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);
            int i = (int) (this.read * interpolation);
            this.write.top = this.MediaBrowserCompatMediaItem.top + i;
            this.write.bottom = this.MediaBrowserCompatMediaItem.bottom + i;
            float f2 = this.MediaMetadataCompat;
            float f3 = f2 + ((this.MediaBrowserCompatItemReceiver - f2) * interpolation);
            this.RemoteActionCompatParcelizer = f3;
            BitmapDrawable bitmapDrawable = this.AudioAttributesCompatParcelizer;
            if (bitmapDrawable != null && this.write != null) {
                bitmapDrawable.setAlpha((int) (f3 * 255.0f));
                this.AudioAttributesCompatParcelizer.setBounds(this.write);
            }
            if (this.AudioAttributesImplApi21Parcelizer && f >= 1.0f) {
                this.AudioAttributesImplApi26Parcelizer = true;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                }
            }
            return !this.AudioAttributesImplApi26Parcelizer;
        }
    }
}
