package kotlin;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes5.dex */
public abstract class advancePeekPosition {
    public final int read;

    public abstract int AudioAttributesCompatParcelizer();

    public abstract void AudioAttributesCompatParcelizer(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract int IconCompatParcelizer();

    public abstract void IconCompatParcelizer(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract int MediaBrowserCompatItemReceiver();

    public abstract int RemoteActionCompatParcelizer();

    public abstract int read();

    public abstract void read(View view, Rect rect, float f, float f2);

    public abstract float write(RecyclerView.LayoutParams layoutParams);

    public abstract int write();

    public abstract RectF write(float f, float f2, float f3, float f4);

    public abstract void write(View view, int i, int i2);

    /* synthetic */ advancePeekPosition(int i, byte b) {
        this(i);
    }

    private advancePeekPosition(int i) {
        this.read = i;
    }

    public static advancePeekPosition IconCompatParcelizer(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return write(carouselLayoutManager);
        }
        if (i == 1) {
            return read(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static advancePeekPosition read(final CarouselLayoutManager carouselLayoutManager) {
        return new advancePeekPosition() { // from class: o.advancePeekPosition.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int MediaBrowserCompatItemReceiver() {
                return 0;
            }

            {
                super(1, (byte) 0);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int IconCompatParcelizer() {
                return carouselLayoutManager.getPaddingLeft();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int write() {
                return MediaBrowserCompatItemReceiver();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int read() {
                return carouselLayoutManager.onPrepare() - carouselLayoutManager.getPaddingRight();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int RemoteActionCompatParcelizer() {
                return AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int AudioAttributesCompatParcelizer() {
                return carouselLayoutManager.onMediaButtonEvent();
            }

            @Override // kotlin.advancePeekPosition
            public final void write(View view, int i, int i2) {
                CarouselLayoutManager.RemoteActionCompatParcelizer(view, IconCompatParcelizer(), i, read(), i2);
            }

            @Override // kotlin.advancePeekPosition
            public final float write(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // kotlin.advancePeekPosition
            public final RectF write(float f, float f2, float f3, float f4) {
                return new RectF(BitmapDescriptorFactory.HUE_RED, f3, f2, f - f3);
            }

            @Override // kotlin.advancePeekPosition
            public final void AudioAttributesCompatParcelizer(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.top < rectF3.top && rectF2.bottom > rectF3.top) {
                    float f = rectF3.top - rectF2.top;
                    rectF.top += f;
                    rectF3.top += f;
                }
                if (rectF2.bottom <= rectF3.bottom || rectF2.top >= rectF3.bottom) {
                    return;
                }
                float f2 = rectF2.bottom - rectF3.bottom;
                rectF.bottom = Math.max(rectF.bottom - f2, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f2, rectF2.top);
            }

            @Override // kotlin.advancePeekPosition
            public final void IconCompatParcelizer(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.bottom <= rectF3.top) {
                    rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.top = Math.min(rectF.top, rectF.bottom);
                }
                if (rectF2.top >= rectF3.bottom) {
                    rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.bottom = Math.max(rectF.top, rectF.bottom);
                }
            }

            @Override // kotlin.advancePeekPosition
            public final void read(View view, Rect rect, float f, float f2) {
                view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
            }
        };
    }

    private static advancePeekPosition write(final CarouselLayoutManager carouselLayoutManager) {
        return new advancePeekPosition() { // from class: o.advancePeekPosition.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int IconCompatParcelizer() {
                return 0;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                byte b = 0;
                super(b, b);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int write() {
                return carouselLayoutManager.MediaBrowserCompatCustomActionResultReceiver() ? read() : IconCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int read() {
                return carouselLayoutManager.onPrepare();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int RemoteActionCompatParcelizer() {
                return carouselLayoutManager.MediaBrowserCompatCustomActionResultReceiver() ? IconCompatParcelizer() : read();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int MediaBrowserCompatItemReceiver() {
                return carouselLayoutManager.getPaddingTop();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // kotlin.advancePeekPosition
            public final int AudioAttributesCompatParcelizer() {
                return carouselLayoutManager.onMediaButtonEvent() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // kotlin.advancePeekPosition
            public final void write(View view, int i, int i2) {
                CarouselLayoutManager.RemoteActionCompatParcelizer(view, i, MediaBrowserCompatItemReceiver(), i2, AudioAttributesCompatParcelizer());
            }

            @Override // kotlin.advancePeekPosition
            public final float write(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }

            @Override // kotlin.advancePeekPosition
            public final RectF write(float f, float f2, float f3, float f4) {
                return new RectF(f4, BitmapDescriptorFactory.HUE_RED, f2 - f4, f);
            }

            @Override // kotlin.advancePeekPosition
            public final void AudioAttributesCompatParcelizer(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.left < rectF3.left && rectF2.right > rectF3.left) {
                    float f = rectF3.left - rectF2.left;
                    rectF.left += f;
                    rectF2.left += f;
                }
                if (rectF2.right <= rectF3.right || rectF2.left >= rectF3.right) {
                    return;
                }
                float f2 = rectF2.right - rectF3.right;
                rectF.right = Math.max(rectF.right - f2, rectF.left);
                rectF2.right = Math.max(rectF2.right - f2, rectF2.left);
            }

            @Override // kotlin.advancePeekPosition
            public final void IconCompatParcelizer(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    rectF.right = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.left = Math.min(rectF.left, rectF.right);
                }
                if (rectF2.left >= rectF3.right) {
                    rectF.left = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.right = Math.max(rectF.left, rectF.right);
                }
            }

            @Override // kotlin.advancePeekPosition
            public final void read(View view, Rect rect, float f, float f2) {
                view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
            }
        };
    }
}
