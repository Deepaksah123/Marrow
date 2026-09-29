package kotlin;

import android.graphics.Canvas;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/JsonParserSequence;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "", "p1", "", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Canvas;Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class JsonParserSequence {
    public static final JsonParserSequence INSTANCE = new JsonParserSequence();

    private JsonParserSequence() {
    }

    public final void AudioAttributesCompatParcelizer(Canvas p0, boolean p1) {
        if (p1) {
            p0.enableZ();
        } else {
            p0.disableZ();
        }
    }
}
