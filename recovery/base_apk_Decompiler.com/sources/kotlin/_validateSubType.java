package kotlin;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0003\u001a\u0004\u0018\u00010\u0012*\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u001b\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f*\u00020\tH\u0002¢\u0006\u0004\b\u0003\u0010\u0014\u001a\u001b\u0010\u000e\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u0017\" \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"", "p0", "Landroid/text/TextDirectionHeuristic;", "AudioAttributesCompatParcelizer", "(I)Landroid/text/TextDirectionHeuristic;", "p1", "Lo/addBeanProps;", "read", "(II)J", "Lo/addInjectables;", "IconCompatParcelizer", "(Lo/addInjectables;)J", "", "Lo/BeanDeserializerModifier;", "write", "([Lo/BeanDeserializerModifier;)J", "Landroid/text/TextPaint;", "p2", "Landroid/graphics/Paint$FontMetricsInt;", "(Lo/addInjectables;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Lo/BeanDeserializerModifier;)Landroid/graphics/Paint$FontMetricsInt;", "(Lo/addInjectables;)[Lo/BeanDeserializerModifier;", "Landroid/text/Layout;", "", "(Landroid/text/Layout;I)Z", "Ljava/lang/ThreadLocal;", "Lo/setPOJOBuilder;", "Ljava/lang/ThreadLocal;", "()Ljava/lang/ThreadLocal;", "RemoteActionCompatParcelizer", "J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _validateSubType {
    private static final ThreadLocal<setPOJOBuilder> write = new ThreadLocal<>();
    private static final long RemoteActionCompatParcelizer = read(0, 0);

    public static final ThreadLocal<setPOJOBuilder> read() {
        return write;
    }

    public static final TextDirectionHeuristic AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i == 4) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (i == 5) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static final long read(int i, int i2) {
        long j = -1;
        return addBeanProps.IconCompatParcelizer((((long) i2) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) i) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IconCompatParcelizer(addInjectables addinjectables) {
        int topPadding;
        int bottomPadding;
        if (addinjectables.write() || addinjectables.MediaBrowserCompatCustomActionResultReceiver()) {
            return RemoteActionCompatParcelizer;
        }
        TextPaint paint = addinjectables.RemoteActionCompatParcelizer().getPaint();
        CharSequence text = addinjectables.RemoteActionCompatParcelizer().getText();
        Rect rectIconCompatParcelizer = createBuilderBasedDeserializer.IconCompatParcelizer(paint, text, addinjectables.RemoteActionCompatParcelizer().getLineStart(0), addinjectables.RemoteActionCompatParcelizer().getLineEnd(0));
        int lineAscent = addinjectables.RemoteActionCompatParcelizer().getLineAscent(0);
        if (rectIconCompatParcelizer.top < lineAscent) {
            topPadding = lineAscent - rectIconCompatParcelizer.top;
        } else {
            topPadding = addinjectables.RemoteActionCompatParcelizer().getTopPadding();
        }
        if (addinjectables.AudioAttributesImplApi26Parcelizer() != 1) {
            int iAudioAttributesImplApi26Parcelizer = addinjectables.AudioAttributesImplApi26Parcelizer() - 1;
            rectIconCompatParcelizer = createBuilderBasedDeserializer.IconCompatParcelizer(paint, text, addinjectables.RemoteActionCompatParcelizer().getLineStart(iAudioAttributesImplApi26Parcelizer), addinjectables.RemoteActionCompatParcelizer().getLineEnd(iAudioAttributesImplApi26Parcelizer));
        }
        int lineDescent = addinjectables.RemoteActionCompatParcelizer().getLineDescent(addinjectables.AudioAttributesImplApi26Parcelizer() - 1);
        if (rectIconCompatParcelizer.bottom > lineDescent) {
            bottomPadding = rectIconCompatParcelizer.bottom - lineDescent;
        } else {
            bottomPadding = addinjectables.RemoteActionCompatParcelizer().getBottomPadding();
        }
        if (topPadding == 0 && bottomPadding == 0) {
            return RemoteActionCompatParcelizer;
        }
        return read(topPadding, bottomPadding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long write(BeanDeserializerModifier[] beanDeserializerModifierArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (BeanDeserializerModifier beanDeserializerModifier : beanDeserializerModifierArr) {
            if (beanDeserializerModifier.getMediaBrowserCompatSearchResultReceiver() < 0) {
                iMax = Math.max(iMax, Math.abs(beanDeserializerModifier.getMediaBrowserCompatSearchResultReceiver()));
            }
            if (beanDeserializerModifier.getRatingCompat() < 0) {
                iMax2 = Math.max(iMax, Math.abs(beanDeserializerModifier.getRatingCompat()));
            }
        }
        if (iMax == 0 && iMax2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        return read(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt AudioAttributesCompatParcelizer(addInjectables addinjectables, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, BeanDeserializerModifier[] beanDeserializerModifierArr) {
        int iAudioAttributesImplApi26Parcelizer = addinjectables.AudioAttributesImplApi26Parcelizer() - 1;
        if (addinjectables.RemoteActionCompatParcelizer().getLineStart(iAudioAttributesImplApi26Parcelizer) != addinjectables.RemoteActionCompatParcelizer().getLineEnd(iAudioAttributesImplApi26Parcelizer) || beanDeserializerModifierArr == null || beanDeserializerModifierArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        BeanDeserializerModifier beanDeserializerModifier = (BeanDeserializerModifier) getOrderDetails.AudioAttributesImplApi21Parcelizer(beanDeserializerModifierArr);
        spannableString.setSpan(beanDeserializerModifier.AudioAttributesCompatParcelizer(0, spannableString.length(), (iAudioAttributesImplApi26Parcelizer == 0 || !beanDeserializerModifier.getIconCompatParcelizer()) ? beanDeserializerModifier.getIconCompatParcelizer() : false), 0, spannableString.length(), 33);
        SpannableString spannableString2 = spannableString;
        StaticLayout staticLayoutWrite = hasIgnorable.INSTANCE.write(spannableString2, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString2.length() : spannableString.length(), (2072512 & 32) != 0 ? addOrReplaceProperty.INSTANCE.AudioAttributesCompatParcelizer() : textDirectionHeuristic, (2072512 & 64) != 0 ? addOrReplaceProperty.INSTANCE.read() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, (2072512 & 2048) != 0 ? 0.0f : BitmapDescriptorFactory.HUE_RED, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : addinjectables.write(), (2072512 & 16384) != 0 ? true : addinjectables.read(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutWrite.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutWrite.getLineDescent(0);
        fontMetricsInt.top = staticLayoutWrite.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutWrite.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeanDeserializerModifier[] AudioAttributesCompatParcelizer(addInjectables addinjectables) {
        if (!(addinjectables.MediaBrowserCompatItemReceiver() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceMediaBrowserCompatItemReceiver = addinjectables.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.read(charSequenceMediaBrowserCompatItemReceiver, "");
        if (!buildAbstract.RemoteActionCompatParcelizer((Spanned) charSequenceMediaBrowserCompatItemReceiver, BeanDeserializerModifier.class) && addinjectables.MediaBrowserCompatItemReceiver().length() > 0) {
            return null;
        }
        CharSequence charSequenceMediaBrowserCompatItemReceiver2 = addinjectables.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.read(charSequenceMediaBrowserCompatItemReceiver2, "");
        return (BeanDeserializerModifier[]) ((Spanned) charSequenceMediaBrowserCompatItemReceiver2).getSpans(0, addinjectables.MediaBrowserCompatItemReceiver().length(), BeanDeserializerModifier.class);
    }

    public static final boolean write(Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
