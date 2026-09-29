package kotlin;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lo/updateBuilder;", "Landroid/text/style/CharacterStyle;", "", "p0", "p1", "<init>", "(ZZ)V", "Landroid/text/TextPaint;", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "IconCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateBuilder extends CharacterStyle {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;
    private final boolean IconCompatParcelizer;

    public updateBuilder(boolean z, boolean z2) {
        this.IconCompatParcelizer = z;
        this.write = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint p0) {
        p0.setUnderlineText(this.IconCompatParcelizer);
        p0.setStrikeThruText(this.write);
    }
}
