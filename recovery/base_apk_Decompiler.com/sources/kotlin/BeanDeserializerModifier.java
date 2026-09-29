package kotlin;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.find;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0014\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u001a\u0010\"\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010&\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\u0016\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001d\u0010%R$\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b\u0014\u0010%"}, d2 = {"Lo/BeanDeserializerModifier;", "Landroid/text/style/LineHeightSpan;", "", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "Lo/find$read;", "p6", "<init>", "(FIIZZFILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "Landroid/graphics/Paint$FontMetricsInt;", "", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "write", "(Landroid/graphics/Paint$FontMetricsInt;)V", "AudioAttributesCompatParcelizer", "(IIZ)Lo/BeanDeserializerModifier;", "AudioAttributesImplBaseParcelizer", "F", "MediaBrowserCompatCustomActionResultReceiver", "I", "RemoteActionCompatParcelizer", "read", "MediaBrowserCompatSearchResultReceiver", "Z", "()Z", "RatingCompat", "IconCompatParcelizer", "MediaDescriptionCompat", "AudioAttributesImplApi26Parcelizer", "()I", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeanDeserializerModifier implements LineHeightSpan {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final float MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    private BeanDeserializerModifier(float f, int i, int i2, boolean z, boolean z2, float f2, int i3) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.write = z;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = f2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.AudioAttributesImplApi21Parcelizer = Integer.MIN_VALUE;
        this.AudioAttributesImplBaseParcelizer = Integer.MIN_VALUE;
        this.AudioAttributesImplApi26Parcelizer = Integer.MIN_VALUE;
        this.MediaBrowserCompatMediaItem = Integer.MIN_VALUE;
        if ((BitmapDescriptorFactory.HUE_RED > f2 || f2 > 1.0f) && f2 != -1.0f) {
            withStackTrace.AudioAttributesCompatParcelizer("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence p0, int p1, int p2, int p3, int p4, Paint.FontMetricsInt p5) {
        if (modifyDeserializer.write(p5) > 0) {
            boolean z = p1 == this.RemoteActionCompatParcelizer;
            boolean z2 = p2 == this.read;
            if (z && z2 && this.write && this.IconCompatParcelizer && !find.read.write(this.MediaBrowserCompatItemReceiver, find.read.INSTANCE.RemoteActionCompatParcelizer())) {
                return;
            }
            if (this.AudioAttributesImplApi21Parcelizer == Integer.MIN_VALUE) {
                write(p5);
            }
            p5.ascent = z ? this.AudioAttributesImplApi21Parcelizer : this.AudioAttributesImplBaseParcelizer;
            p5.descent = z2 ? this.MediaBrowserCompatMediaItem : this.AudioAttributesImplApi26Parcelizer;
        }
    }

    private final void write(Paint.FontMetricsInt p0) {
        double dCeil;
        int iMin;
        int iMax;
        int iCeil = (int) Math.ceil(this.AudioAttributesCompatParcelizer);
        int iWrite = iCeil - modifyDeserializer.write(p0);
        if (find.read.write(this.MediaBrowserCompatItemReceiver, find.read.INSTANCE.read()) && iWrite <= 0) {
            this.AudioAttributesImplBaseParcelizer = p0.ascent;
            int i = p0.descent;
            this.AudioAttributesImplApi26Parcelizer = i;
            this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatMediaItem = i;
            this.MediaBrowserCompatSearchResultReceiver = 0;
            this.RatingCompat = 0;
            return;
        }
        float fAbs = this.MediaBrowserCompatCustomActionResultReceiver;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(p0.ascent) / modifyDeserializer.write(p0);
        }
        if (iWrite <= 0) {
            dCeil = Math.ceil(iWrite * fAbs);
        } else {
            dCeil = Math.ceil(iWrite * (1.0f - fAbs));
        }
        int i2 = p0.descent + ((int) dCeil);
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.AudioAttributesImplBaseParcelizer = i2 - iCeil;
        if (find.read.write(this.MediaBrowserCompatItemReceiver, find.read.INSTANCE.AudioAttributesCompatParcelizer()) || iWrite >= 0) {
            this.AudioAttributesImplApi21Parcelizer = this.write ? p0.ascent : this.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatMediaItem = this.IconCompatParcelizer ? p0.descent : this.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatSearchResultReceiver = p0.ascent - this.AudioAttributesImplApi21Parcelizer;
            this.RatingCompat = this.MediaBrowserCompatMediaItem - p0.descent;
            return;
        }
        if (find.read.write(this.MediaBrowserCompatItemReceiver, find.read.INSTANCE.RemoteActionCompatParcelizer())) {
            if (this.write) {
                iMin = Math.max(p0.ascent, this.AudioAttributesImplBaseParcelizer);
            } else {
                iMin = Math.min(p0.ascent, this.AudioAttributesImplBaseParcelizer);
            }
            this.AudioAttributesImplApi21Parcelizer = iMin;
            if (this.IconCompatParcelizer) {
                iMax = Math.min(p0.descent, this.AudioAttributesImplApi26Parcelizer);
            } else {
                iMax = Math.max(p0.descent, this.AudioAttributesImplApi26Parcelizer);
            }
            this.MediaBrowserCompatMediaItem = iMax;
            this.MediaBrowserCompatSearchResultReceiver = 0;
            this.RatingCompat = 0;
        }
    }

    public final BeanDeserializerModifier AudioAttributesCompatParcelizer(int p0, int p1, boolean p2) {
        return new BeanDeserializerModifier(this.AudioAttributesCompatParcelizer, p0, p1, p2, this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, null);
    }

    public /* synthetic */ BeanDeserializerModifier(float f, int i, int i2, boolean z, boolean z2, float f2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, i, i2, z, z2, f2, i3);
    }
}
