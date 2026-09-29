package kotlin;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/constructSettableProperty;", "Landroid/text/style/MetricAffectingSpan;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroid/text/TextPaint;", "", "updateMeasureState", "(Landroid/text/TextPaint;)V", "updateDrawState", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class constructSettableProperty extends MetricAffectingSpan {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    public constructSettableProperty(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint p0) {
        p0.setFontFeatureSettings(this.RemoteActionCompatParcelizer);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint p0) {
        p0.setFontFeatureSettings(this.RemoteActionCompatParcelizer);
    }
}
