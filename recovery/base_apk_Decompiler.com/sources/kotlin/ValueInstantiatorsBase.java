package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jw\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010.R\u0014\u0010)\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010."}, d2 = {"Lo/ValueInstantiatorsBase;", "Landroid/text/style/LeadingMarginSpan;", "Lo/findAndAddVirtualProperties;", "p0", "", "p1", "p2", "p3", "Lo/Instantiatable;", "p4", "p5", "Lo/findViews;", "p6", "Lo/bufferMapProperty;", "p7", "p8", "<init>", "(Lo/findAndAddVirtualProperties;FFFLo/Instantiatable;FLo/findViews;Lo/bufferMapProperty;F)V", "", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "", "p9", "p10", "Landroid/text/Layout;", "p11", "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "AudioAttributesImplBaseParcelizer", "Lo/findAndAddVirtualProperties;", "RemoteActionCompatParcelizer", "F", "AudioAttributesCompatParcelizer", "write", "read", "IconCompatParcelizer", "Lo/Instantiatable;", "AudioAttributesImplApi26Parcelizer", "Lo/findViews;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/bufferMapProperty;", "I", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValueInstantiatorsBase implements LeadingMarginSpan {
    public static final int AudioAttributesCompatParcelizer = findViews.write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final findViews AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final findAndAddVirtualProperties RemoteActionCompatParcelizer;
    private final Instantiatable IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final bufferMapProperty AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    public ValueInstantiatorsBase(findAndAddVirtualProperties findandaddvirtualproperties, float f, float f2, float f3, Instantiatable instantiatable, float f4, findViews findviews, bufferMapProperty buffermapproperty, float f5) {
        this.RemoteActionCompatParcelizer = findandaddvirtualproperties;
        this.AudioAttributesCompatParcelizer = f;
        this.read = f2;
        this.IconCompatParcelizer = instantiatable;
        this.write = f4;
        this.AudioAttributesImplApi21Parcelizer = findviews;
        this.AudioAttributesImplBaseParcelizer = buffermapproperty;
        int iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(f + f3);
        this.MediaBrowserCompatItemReceiver = iRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = getOnline.RemoteActionCompatParcelizer(f5) - iRemoteActionCompatParcelizer;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean p0) {
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas p0, final Paint p1, int p2, final int p3, int p4, int p5, int p6, CharSequence p7, int p8, int p9, boolean p10, Layout p11) {
        if (p0 != null) {
            final float f = (p4 + p6) / 2.0f;
            final int iWrite = getQues.write(p2 - this.MediaBrowserCompatItemReceiver, 0);
            toMagicModuleMetaRepoModel.read(p7, "");
            if (((Spanned) p7).getSpanStart(this) != p8 || p1 == null) {
                return;
            }
            Paint.Style style = p1.getStyle();
            ValueInstantiatorBase.IconCompatParcelizer(p1, this.AudioAttributesImplApi21Parcelizer);
            float f2 = this.AudioAttributesCompatParcelizer;
            long j = -1;
            final long jWrite = calloc.write((((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(this.read))) | (Float.floatToRawIntBits(f2) << 32));
            ValueInstantiatorBase.write(p1, this.IconCompatParcelizer, this.write, jWrite, new getCreatedOnDateMs() { // from class: o.BeanAsArrayDeserializer
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return ValueInstantiatorsBase.read(this.read, jWrite, p3, p0, p1, iWrite, f);
                }
            });
            p1.setStyle(style);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(ValueInstantiatorsBase valueInstantiatorsBase, long j, int i, Canvas canvas, Paint paint, int i2, float f) {
        ValueInstantiatorBase.RemoteActionCompatParcelizer(valueInstantiatorsBase.RemoteActionCompatParcelizer.write(j, i > 0 ? tryToResolveUnresolved.write : tryToResolveUnresolved.RemoteActionCompatParcelizer, valueInstantiatorsBase.AudioAttributesImplBaseParcelizer), canvas, paint, i2, f, i);
        return getShowPopup.INSTANCE;
    }
}
