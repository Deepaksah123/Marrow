package kotlin;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public class deserializeKeylj4SQcc extends RecyclerView.onCustomAction {
    private final DisplayMetrics AudioAttributesCompatParcelizer;
    private PointF AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    protected final LinearInterpolator read = new LinearInterpolator();
    protected final DecelerateInterpolator write = new DecelerateInterpolator();
    private boolean IconCompatParcelizer = false;
    private int RemoteActionCompatParcelizer = 0;
    private int MediaBrowserCompatItemReceiver = 0;

    private static int write(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public deserializeKeylj4SQcc(Context context) {
        this.AudioAttributesCompatParcelizer = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction
    public void IconCompatParcelizer(View view, RecyclerView.onCustomAction.write writeVar) {
        int iIconCompatParcelizer = IconCompatParcelizer(view, AudioAttributesImplBaseParcelizer());
        int iWrite = write(view, AudioAttributesImplApi26Parcelizer());
        int iWrite2 = write((int) Math.sqrt((iIconCompatParcelizer * iIconCompatParcelizer) + (iWrite * iWrite)));
        if (iWrite2 > 0) {
            writeVar.IconCompatParcelizer(-iIconCompatParcelizer, -iWrite, iWrite2, this.write);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction
    public final void IconCompatParcelizer(int i, int i2, RecyclerView.onCustomAction.write writeVar) {
        if (RemoteActionCompatParcelizer() == 0) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        this.RemoteActionCompatParcelizer = write(this.RemoteActionCompatParcelizer, i);
        int iWrite = write(this.MediaBrowserCompatItemReceiver, i2);
        this.MediaBrowserCompatItemReceiver = iWrite;
        if (this.RemoteActionCompatParcelizer == 0 && iWrite == 0) {
            write(writeVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.onCustomAction
    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = 0;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = null;
    }

    protected float AudioAttributesCompatParcelizer(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    private float AudioAttributesImplApi21Parcelizer() {
        if (!this.IconCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            this.IconCompatParcelizer = true;
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    protected final int write(int i) {
        return (int) Math.ceil(((double) IconCompatParcelizer(i)) / 0.3356d);
    }

    protected int IconCompatParcelizer(int i) {
        return (int) Math.ceil(Math.abs(i) * AudioAttributesImplApi21Parcelizer());
    }

    private int AudioAttributesImplBaseParcelizer() {
        PointF pointF = this.AudioAttributesImplApi26Parcelizer;
        if (pointF == null || pointF.x == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return this.AudioAttributesImplApi26Parcelizer.x > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }

    private int AudioAttributesImplApi26Parcelizer() {
        PointF pointF = this.AudioAttributesImplApi26Parcelizer;
        if (pointF == null || pointF.y == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return this.AudioAttributesImplApi26Parcelizer.y > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }

    private void write(RecyclerView.onCustomAction.write writeVar) {
        PointF pointF = read(write());
        if (pointF == null || (pointF.x == BitmapDescriptorFactory.HUE_RED && pointF.y == BitmapDescriptorFactory.HUE_RED)) {
            writeVar.read(write());
            MediaBrowserCompatItemReceiver();
            return;
        }
        IconCompatParcelizer(pointF);
        this.AudioAttributesImplApi26Parcelizer = pointF;
        this.RemoteActionCompatParcelizer = (int) (pointF.x * 10000.0f);
        this.MediaBrowserCompatItemReceiver = (int) (pointF.y * 10000.0f);
        writeVar.IconCompatParcelizer((int) (this.RemoteActionCompatParcelizer * 1.2f), (int) (this.MediaBrowserCompatItemReceiver * 1.2f), (int) (IconCompatParcelizer(10000) * 1.2f), this.read);
    }

    private static int write(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int write(View view, int i) {
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = read();
        if (mediaBrowserCompatItemReceiver == null || !mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int iRatingCompat = RecyclerView.MediaBrowserCompatItemReceiver.RatingCompat(view);
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        return write(iRatingCompat - i2, RecyclerView.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, mediaBrowserCompatItemReceiver.getPaddingTop(), mediaBrowserCompatItemReceiver.onMediaButtonEvent() - mediaBrowserCompatItemReceiver.getPaddingBottom(), i);
    }

    public int IconCompatParcelizer(View view, int i) {
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = read();
        if (mediaBrowserCompatItemReceiver == null || !mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(view);
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        return write(iMediaBrowserCompatItemReceiver - i2, RecyclerView.MediaBrowserCompatItemReceiver.MediaMetadataCompat(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, mediaBrowserCompatItemReceiver.getPaddingLeft(), mediaBrowserCompatItemReceiver.onPrepare() - mediaBrowserCompatItemReceiver.getPaddingRight(), i);
    }
}
