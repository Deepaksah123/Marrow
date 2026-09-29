package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._parseDoublePrimitive;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public class TrackOutput {
    public final float AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer = false;
    public final int AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    public final float IconCompatParcelizer;
    private Typeface MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private ColorStateList MediaBrowserCompatMediaItem;
    private ColorStateList MediaBrowserCompatSearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private ColorStateList RatingCompat;
    public final float RemoteActionCompatParcelizer;
    private float onAddQueueItem;
    private int onCustomAction;
    public final float read;
    public final ColorStateList write;

    static /* synthetic */ boolean IconCompatParcelizer(TrackOutput trackOutput) {
        trackOutput.AudioAttributesImplApi21Parcelizer = true;
        return true;
    }

    public TrackOutput(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance);
        write(typedArrayObtainStyledAttributes.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_textSize, BitmapDescriptorFactory.HUE_RED));
        AudioAttributesCompatParcelizer(SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_textColor));
        this.MediaBrowserCompatSearchResultReceiver = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_textColorHint);
        this.RatingCompat = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_textColorLink);
        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_textStyle, 0);
        this.onCustomAction = typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_typeface, 1);
        int iIconCompatParcelizer = SeekMap.IconCompatParcelizer(typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_fontFamily, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_fontFamily);
        this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getResourceId(iIconCompatParcelizer, 0);
        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getString(iIconCompatParcelizer);
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_textAllCaps, false);
        this.write = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_shadowColor);
        this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_shadowDx, BitmapDescriptorFactory.HUE_RED);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_shadowDy, BitmapDescriptorFactory.HUE_RED);
        this.read = typedArrayObtainStyledAttributes.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_shadowRadius, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextAppearance);
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes2.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextAppearance_android_letterSpacing);
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes2.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextAppearance_android_letterSpacing, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private Typeface IconCompatParcelizer(Context context) {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceIconCompatParcelizer = _parseDoublePrimitive.IconCompatParcelizer(context, this.MediaBrowserCompatItemReceiver);
                this.MediaBrowserCompatCustomActionResultReceiver = typefaceIconCompatParcelizer;
                if (typefaceIconCompatParcelizer != null) {
                    this.MediaBrowserCompatCustomActionResultReceiver = Typeface.create(typefaceIconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        read();
        this.AudioAttributesImplApi21Parcelizer = true;
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(Context context, final SeekMapSeekPoints seekMapSeekPoints) {
        if (write(context)) {
            IconCompatParcelizer(context);
        } else {
            read();
        }
        int i = this.MediaBrowserCompatItemReceiver;
        if (i == 0) {
            this.AudioAttributesImplApi21Parcelizer = true;
        }
        if (this.AudioAttributesImplApi21Parcelizer) {
            seekMapSeekPoints.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, true);
            return;
        }
        try {
            _parseDoublePrimitive.read(context, i, new _parseDoublePrimitive.IconCompatParcelizer() { // from class: o.TrackOutput.5
                @Override // o._parseDoublePrimitive.IconCompatParcelizer
                /* JADX INFO: renamed from: read */
                public final void RemoteActionCompatParcelizer(Typeface typeface) {
                    TrackOutput trackOutput = TrackOutput.this;
                    trackOutput.MediaBrowserCompatCustomActionResultReceiver = Typeface.create(typeface, trackOutput.AudioAttributesImplApi26Parcelizer);
                    TrackOutput.IconCompatParcelizer(TrackOutput.this);
                    seekMapSeekPoints.RemoteActionCompatParcelizer(TrackOutput.this.MediaBrowserCompatCustomActionResultReceiver, false);
                }

                @Override // o._parseDoublePrimitive.IconCompatParcelizer
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
                public final void IconCompatParcelizer(int i2) {
                    TrackOutput.IconCompatParcelizer(TrackOutput.this);
                    seekMapSeekPoints.AudioAttributesCompatParcelizer(i2);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.AudioAttributesImplApi21Parcelizer = true;
            seekMapSeekPoints.AudioAttributesCompatParcelizer(1);
        } catch (Exception unused2) {
            this.AudioAttributesImplApi21Parcelizer = true;
            seekMapSeekPoints.AudioAttributesCompatParcelizer(-3);
        }
    }

    private void AudioAttributesCompatParcelizer(final Context context, final TextPaint textPaint, final SeekMapSeekPoints seekMapSeekPoints) {
        IconCompatParcelizer(context, textPaint, write());
        IconCompatParcelizer(context, new SeekMapSeekPoints() { // from class: o.TrackOutput.2
            @Override // kotlin.SeekMapSeekPoints
            public final void RemoteActionCompatParcelizer(Typeface typeface, boolean z) {
                TrackOutput.this.IconCompatParcelizer(context, textPaint, typeface);
                seekMapSeekPoints.RemoteActionCompatParcelizer(typeface, z);
            }

            @Override // kotlin.SeekMapSeekPoints
            public final void AudioAttributesCompatParcelizer(int i) {
                seekMapSeekPoints.AudioAttributesCompatParcelizer(i);
            }
        });
    }

    public final Typeface write() {
        read();
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private void read() {
        String str;
        if (this.MediaBrowserCompatCustomActionResultReceiver == null && (str = this.AudioAttributesImplBaseParcelizer) != null) {
            this.MediaBrowserCompatCustomActionResultReceiver = Typeface.create(str, this.AudioAttributesImplApi26Parcelizer);
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            int i = this.onCustomAction;
            if (i == 1) {
                this.MediaBrowserCompatCustomActionResultReceiver = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.MediaBrowserCompatCustomActionResultReceiver = Typeface.SERIF;
            } else if (i == 3) {
                this.MediaBrowserCompatCustomActionResultReceiver = Typeface.MONOSPACE;
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver = Typeface.DEFAULT;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = Typeface.create(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer);
        }
    }

    public final void write(Context context, TextPaint textPaint, SeekMapSeekPoints seekMapSeekPoints) {
        read(context, textPaint, seekMapSeekPoints);
        ColorStateList colorStateList = this.MediaBrowserCompatMediaItem;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.MediaBrowserCompatMediaItem.getDefaultColor()) : -16777216);
        float f = this.read;
        float f2 = this.AudioAttributesCompatParcelizer;
        float f3 = this.IconCompatParcelizer;
        ColorStateList colorStateList2 = this.write;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.write.getDefaultColor()) : 0);
    }

    public final void read(Context context, TextPaint textPaint, SeekMapSeekPoints seekMapSeekPoints) {
        if (write(context)) {
            IconCompatParcelizer(context, textPaint, IconCompatParcelizer(context));
        } else {
            AudioAttributesCompatParcelizer(context, textPaint, seekMapSeekPoints);
        }
    }

    public final void IconCompatParcelizer(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceAudioAttributesCompatParcelizer = TrackOutputSampleDataPart.AudioAttributesCompatParcelizer(context, typeface);
        if (typefaceAudioAttributesCompatParcelizer != null) {
            typeface = typefaceAudioAttributesCompatParcelizer;
        }
        textPaint.setTypeface(typeface);
        int i = this.AudioAttributesImplApi26Parcelizer & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : BitmapDescriptorFactory.HUE_RED);
        textPaint.setTextSize(this.onAddQueueItem);
        if (this.MediaDescriptionCompat) {
            textPaint.setLetterSpacing(this.RemoteActionCompatParcelizer);
        }
    }

    public final ColorStateList RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        this.MediaBrowserCompatMediaItem = colorStateList;
    }

    public final float IconCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public final void write(float f) {
        this.onAddQueueItem = f;
    }

    private boolean write(Context context) {
        int i = this.MediaBrowserCompatItemReceiver;
        return (i != 0 ? _parseDoublePrimitive.RemoteActionCompatParcelizer(context, i) : null) != null;
    }
}
