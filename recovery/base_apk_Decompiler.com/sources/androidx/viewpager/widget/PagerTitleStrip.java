package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.getComponentEnabledSetting;

/* JADX INFO: loaded from: classes4.dex */
@ViewPager.write
public class PagerTitleStrip extends ViewGroup {
    ViewPager AudioAttributesCompatParcelizer;
    int AudioAttributesImplApi21Parcelizer;
    TextView IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int RatingCompat;
    TextView RemoteActionCompatParcelizer;
    private WeakReference<getComponentEnabledSetting> handleMediaPlayPauseIfPendingOnHandler;
    float read;
    TextView write;
    private static final int[] AudioAttributesImplBaseParcelizer = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] AudioAttributesImplApi26Parcelizer = {R.attr.textAllCaps};

    static class RemoteActionCompatParcelizer extends SingleLineTransformationMethod {
        private Locale write;

        RemoteActionCompatParcelizer(Context context) {
            this.write = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.write);
            }
            return null;
        }
    }

    private static void IconCompatParcelizer(TextView textView) {
        textView.setTransformationMethod(new RemoteActionCompatParcelizer(textView.getContext()));
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PagerTitleStrip(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.PagerTitleStrip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void setTextSpacing(int i) {
        this.RatingCompat = i;
        requestLayout();
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RatingCompat;
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.MediaMetadataCompat = i;
        int i2 = (i << 24) | (this.AudioAttributesImplApi21Parcelizer & 16777215);
        this.IconCompatParcelizer.setTextColor(i2);
        this.write.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        this.RemoteActionCompatParcelizer.setTextColor(i);
        int i2 = (this.MediaMetadataCompat << 24) | (this.AudioAttributesImplApi21Parcelizer & 16777215);
        this.IconCompatParcelizer.setTextColor(i2);
        this.write.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.IconCompatParcelizer.setTextSize(i, f);
        this.RemoteActionCompatParcelizer.setTextSize(i, f);
        this.write.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        getComponentEnabledSetting getcomponentenabledsetting = viewPager.read();
        viewPager.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        viewPager.write(this.MediaBrowserCompatMediaItem);
        this.AudioAttributesCompatParcelizer = viewPager;
        WeakReference<getComponentEnabledSetting> weakReference = this.handleMediaPlayPauseIfPendingOnHandler;
        RemoteActionCompatParcelizer(weakReference != null ? weakReference.get() : null, getcomponentenabledsetting);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.AudioAttributesCompatParcelizer;
        if (viewPager != null) {
            RemoteActionCompatParcelizer(viewPager.read(), null);
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((ViewPager.RemoteActionCompatParcelizer) null);
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem);
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    final void AudioAttributesCompatParcelizer(int i, getComponentEnabledSetting getcomponentenabledsetting) {
        int iAudioAttributesCompatParcelizer = getcomponentenabledsetting != null ? getcomponentenabledsetting.AudioAttributesCompatParcelizer() : 0;
        this.MediaDescriptionCompat = true;
        CharSequence charSequence = null;
        this.IconCompatParcelizer.setText((i <= 0 || getcomponentenabledsetting == null) ? null : getcomponentenabledsetting.read(i - 1));
        this.RemoteActionCompatParcelizer.setText((getcomponentenabledsetting == null || i >= iAudioAttributesCompatParcelizer) ? null : getcomponentenabledsetting.read(i));
        int i2 = i + 1;
        if (i2 < iAudioAttributesCompatParcelizer && getcomponentenabledsetting != null) {
            charSequence = getcomponentenabledsetting.read(i2);
        }
        this.write.setText(charSequence);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.IconCompatParcelizer.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.RemoteActionCompatParcelizer.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.write.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.MediaBrowserCompatItemReceiver = i;
        if (!this.MediaBrowserCompatSearchResultReceiver) {
            read(i, this.read, false);
        }
        this.MediaDescriptionCompat = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.MediaDescriptionCompat) {
            return;
        }
        super.requestLayout();
    }

    final void RemoteActionCompatParcelizer(getComponentEnabledSetting getcomponentenabledsetting, getComponentEnabledSetting getcomponentenabledsetting2) {
        if (getcomponentenabledsetting != null) {
            getcomponentenabledsetting.read(this.MediaBrowserCompatMediaItem);
            this.handleMediaPlayPauseIfPendingOnHandler = null;
        }
        if (getcomponentenabledsetting2 != null) {
            getcomponentenabledsetting2.RemoteActionCompatParcelizer((DataSetObserver) this.MediaBrowserCompatMediaItem);
            this.handleMediaPlayPauseIfPendingOnHandler = new WeakReference<>(getcomponentenabledsetting2);
        }
        ViewPager viewPager = this.AudioAttributesCompatParcelizer;
        if (viewPager != null) {
            this.MediaBrowserCompatItemReceiver = -1;
            this.read = -1.0f;
            AudioAttributesCompatParcelizer(viewPager.write(), getcomponentenabledsetting2);
            requestLayout();
        }
    }

    void read(int i, float f, boolean z) {
        if (i != this.MediaBrowserCompatItemReceiver) {
            AudioAttributesCompatParcelizer(i, this.AudioAttributesCompatParcelizer.read());
        } else if (!z && f == this.read) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = true;
        int measuredWidth = this.IconCompatParcelizer.getMeasuredWidth();
        int measuredWidth2 = this.RemoteActionCompatParcelizer.getMeasuredWidth();
        int measuredWidth3 = this.write.getMeasuredWidth();
        int i2 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = paddingRight + i2;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i4 = ((width - i3) - ((int) (((width - (paddingLeft + i2)) - i3) * f2))) - i2;
        int i5 = measuredWidth2 + i4;
        int baseline = this.IconCompatParcelizer.getBaseline();
        int baseline2 = this.RemoteActionCompatParcelizer.getBaseline();
        int baseline3 = this.write.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i6 = iMax - baseline;
        int i7 = iMax - baseline2;
        int i8 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.IconCompatParcelizer.getMeasuredHeight() + i6, this.RemoteActionCompatParcelizer.getMeasuredHeight() + i7), this.write.getMeasuredHeight() + i8);
        int i9 = this.MediaBrowserCompatCustomActionResultReceiver & 112;
        if (i9 == 16) {
            paddingTop = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else if (i9 == 80) {
            paddingTop = (height - paddingBottom) - iMax2;
        }
        int i10 = i6 + paddingTop;
        int i11 = i7 + paddingTop;
        int i12 = paddingTop + i8;
        TextView textView = this.RemoteActionCompatParcelizer;
        textView.layout(i4, i11, i5, textView.getMeasuredHeight() + i11);
        int iMin = Math.min(paddingLeft, (i4 - this.RatingCompat) - measuredWidth);
        TextView textView2 = this.IconCompatParcelizer;
        textView2.layout(iMin, i10, measuredWidth + iMin, textView2.getMeasuredHeight() + i10);
        int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i5 + this.RatingCompat);
        TextView textView3 = this.write;
        textView3.layout(iMax3, i12, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i12);
        this.read = f;
        this.MediaBrowserCompatSearchResultReceiver = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.IconCompatParcelizer.measure(childMeasureSpec2, childMeasureSpec);
        this.RemoteActionCompatParcelizer.measure(childMeasureSpec2, childMeasureSpec);
        this.write.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(write(), this.RemoteActionCompatParcelizer.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, this.RemoteActionCompatParcelizer.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.AudioAttributesCompatParcelizer != null) {
            float f = this.read;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            read(this.MediaBrowserCompatItemReceiver, f, true);
        }
    }

    int write() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    class AudioAttributesCompatParcelizer extends DataSetObserver implements ViewPager.RemoteActionCompatParcelizer, ViewPager.IconCompatParcelizer {
        private int RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer() {
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void read(int i, float f) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.read(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            if (this.RemoteActionCompatParcelizer == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.AudioAttributesCompatParcelizer(pagerTitleStrip.AudioAttributesCompatParcelizer.write(), PagerTitleStrip.this.AudioAttributesCompatParcelizer.read());
                float f = PagerTitleStrip.this.read;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    f2 = PagerTitleStrip.this.read;
                }
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                pagerTitleStrip2.read(pagerTitleStrip2.AudioAttributesCompatParcelizer.write(), f2, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(ViewPager viewPager, getComponentEnabledSetting getcomponentenabledsetting, getComponentEnabledSetting getcomponentenabledsetting2) {
            PagerTitleStrip.this.RemoteActionCompatParcelizer(getcomponentenabledsetting, getcomponentenabledsetting2);
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.AudioAttributesCompatParcelizer(pagerTitleStrip.AudioAttributesCompatParcelizer.write(), PagerTitleStrip.this.AudioAttributesCompatParcelizer.read());
            float f = PagerTitleStrip.this.read;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (f >= BitmapDescriptorFactory.HUE_RED) {
                f2 = PagerTitleStrip.this.read;
            }
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.read(pagerTitleStrip2.AudioAttributesCompatParcelizer.write(), f2, true);
        }
    }
}
