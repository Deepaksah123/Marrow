package kotlin;

import android.text.TextPaint;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/constructAnySetter;", "Lo/addObjectIdReader;", "", "p0", "Landroid/text/TextPaint;", "p1", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V", "", "IconCompatParcelizer", "(I)I", "write", "Ljava/lang/CharSequence;", "RemoteActionCompatParcelizer", "Landroid/text/TextPaint;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class constructAnySetter extends addObjectIdReader {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final TextPaint read;
    private final CharSequence write;

    public constructAnySetter(CharSequence charSequence, TextPaint textPaint) {
        this.write = charSequence;
        this.read = textPaint;
    }

    @Override // kotlin.addObjectIdReader
    public final int IconCompatParcelizer(int p0) {
        TextPaint textPaint = this.read;
        CharSequence charSequence = this.write;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, p0, 2);
    }

    @Override // kotlin.addObjectIdReader
    public final int write(int p0) {
        TextPaint textPaint = this.read;
        CharSequence charSequence = this.write;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, p0, 0);
    }
}
