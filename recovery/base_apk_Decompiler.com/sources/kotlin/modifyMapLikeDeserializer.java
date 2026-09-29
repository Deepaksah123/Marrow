package kotlin;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/modifyMapLikeDeserializer;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "p0", "<init>", "(Landroid/graphics/Typeface;)V", "Landroid/text/TextPaint;", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "Landroid/graphics/Paint;", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Paint;)V", "read", "Landroid/graphics/Typeface;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class modifyMapLikeDeserializer extends MetricAffectingSpan {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Typeface IconCompatParcelizer;

    public modifyMapLikeDeserializer(Typeface typeface) {
        this.IconCompatParcelizer = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint p0) {
        AudioAttributesCompatParcelizer(p0);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint p0) {
        AudioAttributesCompatParcelizer(p0);
    }

    private final void AudioAttributesCompatParcelizer(Paint p0) {
        p0.setTypeface(this.IconCompatParcelizer);
    }
}
