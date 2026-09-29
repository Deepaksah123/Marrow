package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000eJ;\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JY\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0017\u0010%\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b \u0010&R$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118\u0007@BX\u0087.¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u001f\u0010(R$\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@BX\u0087\u000e¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b\u001c\u0010&R$\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@BX\u0087\u000e¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b$\u0010&R\u0016\u0010)\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010-"}, d2 = {"Lo/modifyCollectionDeserializer;", "Landroid/text/style/ReplacementSpan;", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(FIFIFFI)V", "Lo/bufferMapProperty;", "(FIFILo/bufferMapProperty;I)V", "Landroid/graphics/Paint;", "", "Landroid/graphics/Paint$FontMetricsInt;", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "p7", "p8", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "MediaBrowserCompatCustomActionResultReceiver", "F", "RemoteActionCompatParcelizer", "RatingCompat", "I", "write", "read", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "MediaBrowserCompatMediaItem", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "()I", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class modifyCollectionDeserializer extends ReplacementSpan {
    private int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Paint.FontMetricsInt MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;
    public static final int AudioAttributesCompatParcelizer = 8;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas p0, CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, Paint p8) {
    }

    private modifyCollectionDeserializer(float f, int i, float f2, int i2, float f3, float f4, int i3) {
        this.RemoteActionCompatParcelizer = f;
        this.write = i;
        this.read = f2;
        this.IconCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = f3;
        this.AudioAttributesImplBaseParcelizer = f4;
        this.AudioAttributesImplApi26Parcelizer = i3;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public modifyCollectionDeserializer(float f, int i, float f2, int i2, bufferMapProperty buffermapproperty, int i3) {
        this(f, i, f2, i2, i == 0 ? buffermapproperty.c_(setResolver.RemoteActionCompatParcelizer(f)) : 0.0f, i2 == 0 ? buffermapproperty.c_(setResolver.RemoteActionCompatParcelizer(f2)) : BitmapDescriptorFactory.HUE_RED, i3);
    }

    public final Paint.FontMetricsInt write() {
        Paint.FontMetricsInt fontMetricsInt = this.MediaBrowserCompatCustomActionResultReceiver;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final int RemoteActionCompatParcelizer() {
        if (!this.MediaDescriptionCompat) {
            withStackTrace.AudioAttributesCompatParcelizer("PlaceholderSpan is not laid out yet.");
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int AudioAttributesCompatParcelizer() {
        if (!this.MediaDescriptionCompat) {
            withStackTrace.AudioAttributesCompatParcelizer("PlaceholderSpan is not laid out yet.");
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint p0, CharSequence p1, int p2, int p3, Paint.FontMetricsInt p4) {
        float f;
        float f2;
        this.MediaDescriptionCompat = true;
        float textSize = p0.getTextSize();
        this.MediaBrowserCompatCustomActionResultReceiver = p0.getFontMetricsInt();
        if (write().descent <= write().ascent) {
            withStackTrace.read("Invalid fontMetrics: line height can not be negative.");
        }
        int i = this.write;
        if (i == 0) {
            f = this.AudioAttributesCompatParcelizer;
        } else if (i == 1) {
            f = this.RemoteActionCompatParcelizer * textSize;
        } else {
            withStackTrace.RemoteActionCompatParcelizer("Unsupported unit.");
            throw new PlanDetailsCreator();
        }
        this.MediaBrowserCompatItemReceiver = modifyCollectionLikeDeserializer.write(f);
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            f2 = this.AudioAttributesImplBaseParcelizer;
        } else if (i2 == 1) {
            f2 = this.read * textSize;
        } else {
            withStackTrace.RemoteActionCompatParcelizer("Unsupported unit.");
            throw new PlanDetailsCreator();
        }
        this.AudioAttributesImplApi21Parcelizer = modifyCollectionLikeDeserializer.write(f2);
        if (p4 != null) {
            p4.ascent = write().ascent;
            p4.descent = write().descent;
            p4.leading = write().leading;
            switch (this.AudioAttributesImplApi26Parcelizer) {
                case 0:
                    if (p4.ascent > (-AudioAttributesCompatParcelizer())) {
                        p4.ascent = -AudioAttributesCompatParcelizer();
                    }
                    break;
                case 1:
                case 4:
                    if (p4.ascent + AudioAttributesCompatParcelizer() > p4.descent) {
                        p4.descent = p4.ascent + AudioAttributesCompatParcelizer();
                    }
                    break;
                case 2:
                case 5:
                    if (p4.ascent > p4.descent - AudioAttributesCompatParcelizer()) {
                        p4.ascent = p4.descent - AudioAttributesCompatParcelizer();
                    }
                    break;
                case 3:
                case 6:
                    if (p4.descent - p4.ascent < AudioAttributesCompatParcelizer()) {
                        p4.ascent -= (AudioAttributesCompatParcelizer() - (p4.descent - p4.ascent)) / 2;
                        p4.descent = p4.ascent + AudioAttributesCompatParcelizer();
                    }
                    break;
                default:
                    withStackTrace.read("Unknown verticalAlign.");
                    break;
            }
            p4.top = Math.min(write().top, p4.ascent);
            p4.bottom = Math.max(write().bottom, p4.descent);
        }
        return RemoteActionCompatParcelizer();
    }
}
