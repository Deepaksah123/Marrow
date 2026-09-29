package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getFirstSampleNumber;

/* JADX INFO: loaded from: classes3.dex */
public class readTagHeader extends frameSizeBytesByTypeNb implements getFirstSampleNumber.read {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final Rect IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private final float MediaBrowserCompatMediaItem;
    private CharSequence MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final getFirstSampleNumber MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private int RatingCompat;
    private final View.OnLayoutChangeListener RemoteActionCompatParcelizer;
    private float onCustomAction;
    private final Paint.FontMetrics read;
    private final Context write;

    public static readTagHeader AudioAttributesCompatParcelizer(Context context, int i) {
        readTagHeader readtagheader = new readTagHeader(context, null, 0, i);
        readtagheader.AudioAttributesCompatParcelizer((AttributeSet) null, 0, i);
        return readtagheader;
    }

    private readTagHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, 0, i2);
        this.read = new Paint.FontMetrics();
        getFirstSampleNumber getfirstsamplenumber = new getFirstSampleNumber(this);
        this.MediaDescriptionCompat = getfirstsamplenumber;
        this.RemoteActionCompatParcelizer = new View.OnLayoutChangeListener() { // from class: o.readTagHeader.1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                readTagHeader.this.AudioAttributesCompatParcelizer(view);
            }
        };
        this.IconCompatParcelizer = new Rect();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1.0f;
        this.onCustomAction = 1.0f;
        this.MediaBrowserCompatMediaItem = 0.5f;
        this.MediaMetadataCompat = 0.5f;
        this.MediaBrowserCompatItemReceiver = 1.0f;
        this.write = context;
        getfirstsamplenumber.RemoteActionCompatParcelizer().density = context.getResources().getDisplayMetrics().density;
        getfirstsamplenumber.RemoteActionCompatParcelizer().setTextAlign(Paint.Align.CENTER);
    }

    private void AudioAttributesCompatParcelizer(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayWrite = readId3Metadata.write(this.write, null, calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip, 0, i2, new int[0]);
        this.AudioAttributesCompatParcelizer = this.write.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(onPlayFromUri().MediaDescriptionCompat().IconCompatParcelizer(write()).RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(typedArrayWrite.getText(calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_text));
        TrackOutput trackOutputWrite = SeekMap.write(this.write, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_textAppearance);
        if (trackOutputWrite != null && typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_textColor)) {
            trackOutputWrite.AudioAttributesCompatParcelizer(SeekMap.IconCompatParcelizer(this.write, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_textColor));
        }
        write(trackOutputWrite);
        AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_backgroundTint, createExtractors.read(_verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(createExtractors.read(this.write, R.attr.colorBackground, readTagHeader.class.getCanonicalName()), 229), _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(createExtractors.read(this.write, calculateNextSearchBytePosition.IconCompatParcelizer.colorOnBackground, readTagHeader.class.getCanonicalName()), 153)))));
        MediaBrowserCompatCustomActionResultReceiver(ColorStateList.valueOf(createExtractors.read(this.write, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface, readTagHeader.class.getCanonicalName())));
        this.RatingCompat = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_padding, 0);
        this.AudioAttributesImplApi26Parcelizer = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_minWidth, 0);
        this.AudioAttributesImplBaseParcelizer = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_minHeight, 0);
        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Tooltip_android_layout_margin, 0);
        typedArrayWrite.recycle();
    }

    public final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        if (TextUtils.equals(this.MediaBrowserCompatSearchResultReceiver, charSequence)) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = charSequence;
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        invalidateSelf();
    }

    private void write(TrackOutput trackOutput) {
        this.MediaDescriptionCompat.write(trackOutput, this.write);
    }

    public final void IconCompatParcelizer(float f) {
        this.MediaMetadataCompat = 1.2f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
        this.onCustomAction = f;
        this.MediaBrowserCompatItemReceiver = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public final void IconCompatParcelizer(View view) {
        if (view == null) {
            return;
        }
        AudioAttributesCompatParcelizer(view);
        view.addOnLayoutChangeListener(this.RemoteActionCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.RemoteActionCompatParcelizer);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.RatingCompat << 1) + read(), this.AudioAttributesImplApi26Parcelizer);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.MediaDescriptionCompat.RemoteActionCompatParcelizer().getTextSize(), this.AudioAttributesImplBaseParcelizer);
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fIconCompatParcelizer = IconCompatParcelizer();
        float f = (float) (-((((double) this.AudioAttributesCompatParcelizer) * Math.sqrt(2.0d)) - ((double) this.AudioAttributesCompatParcelizer)));
        canvas.scale(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.MediaMetadataCompat));
        canvas.translate(fIconCompatParcelizer, f);
        super.draw(canvas);
        read(canvas);
        canvas.restore();
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(onPlayFromUri().MediaDescriptionCompat().IconCompatParcelizer(write()).RemoteActionCompatParcelizer());
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable, o.getFirstSampleNumber.read
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // o.getFirstSampleNumber.read
    public final void AudioAttributesCompatParcelizer() {
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.AudioAttributesImplApi21Parcelizer = iArr[0];
        view.getWindowVisibleDisplayFrame(this.IconCompatParcelizer);
    }

    private float IconCompatParcelizer() {
        int i;
        if (((this.IconCompatParcelizer.right - getBounds().right) - this.AudioAttributesImplApi21Parcelizer) - this.MediaBrowserCompatCustomActionResultReceiver < 0) {
            i = ((this.IconCompatParcelizer.right - getBounds().right) - this.AudioAttributesImplApi21Parcelizer) - this.MediaBrowserCompatCustomActionResultReceiver;
        } else {
            if (((this.IconCompatParcelizer.left - getBounds().left) - this.AudioAttributesImplApi21Parcelizer) + this.MediaBrowserCompatCustomActionResultReceiver <= 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            i = ((this.IconCompatParcelizer.left - getBounds().left) - this.AudioAttributesImplApi21Parcelizer) + this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return i;
    }

    private getBitrateFromFrameSize write() {
        float f = -IconCompatParcelizer();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.AudioAttributesCompatParcelizer) * Math.sqrt(2.0d)))) / 2.0f;
        return new getFrameSizeInBytes(new assertInitialized(this.AudioAttributesCompatParcelizer), Math.min(Math.max(f, -fWidth), fWidth));
    }

    private void read(Canvas canvas) {
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            return;
        }
        int i = (int) read(getBounds());
        if (this.MediaDescriptionCompat.read() != null) {
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer().drawableState = getState();
            this.MediaDescriptionCompat.write(this.write);
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer().setAlpha((int) (this.MediaBrowserCompatItemReceiver * 255.0f));
        }
        CharSequence charSequence = this.MediaBrowserCompatSearchResultReceiver;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, this.MediaDescriptionCompat.RemoteActionCompatParcelizer());
    }

    private float read() {
        CharSequence charSequence = this.MediaBrowserCompatSearchResultReceiver;
        return charSequence == null ? BitmapDescriptorFactory.HUE_RED : this.MediaDescriptionCompat.IconCompatParcelizer(charSequence.toString());
    }

    private float read(Rect rect) {
        return rect.centerY() - RemoteActionCompatParcelizer();
    }

    private float RemoteActionCompatParcelizer() {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer().getFontMetrics(this.read);
        return (this.read.descent + this.read.ascent) / 2.0f;
    }
}
