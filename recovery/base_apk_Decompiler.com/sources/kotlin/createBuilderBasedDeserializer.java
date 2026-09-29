package kotlin;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0007\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\n\u001a+\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000f\u001a\u00020\t*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroid/text/TextPaint;", "", "p0", "", "p1", "p2", "Landroid/graphics/Rect;", "IconCompatParcelizer", "(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;", "", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroid/graphics/Paint;", "write", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;", "p3", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class createBuilderBasedDeserializer {
    public static final Rect IconCompatParcelizer(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (buildAbstract.AudioAttributesCompatParcelizer(spanned, MetricAffectingSpan.class, i, i2)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    AudioAttributesCompatParcelizer(textPaint2, charSequence, i, iNextSpanTransition, rect2);
                    IconCompatParcelizer(rect, rect2);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        return write(textPaint, charSequence, i, i2);
    }

    private static final void IconCompatParcelizer(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    public static final Rect write(Paint paint, CharSequence charSequence, int i, int i2) {
        Rect rect = new Rect();
        AudioAttributesCompatParcelizer(paint, charSequence, i, i2, rect);
        return rect;
    }

    private static final void AudioAttributesCompatParcelizer(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        getBuildMethod.IconCompatParcelizer(paint, charSequence, i, i2, rect);
    }
}
