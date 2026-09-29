package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ForwardingExtractorInput<S extends getMetadataCopyWithAppendedEntriesFrom> {
    S AudioAttributesCompatParcelizer;
    protected setFromMetadata IconCompatParcelizer;

    abstract void AudioAttributesCompatParcelizer(Canvas canvas, Rect rect, float f);

    public abstract int RemoteActionCompatParcelizer();

    public abstract int write();

    abstract void write(Canvas canvas, Paint paint);

    abstract void write(Canvas canvas, Paint paint, float f, float f2, int i);

    public ForwardingExtractorInput(S s) {
        this.AudioAttributesCompatParcelizer = s;
    }

    protected final void IconCompatParcelizer(setFromMetadata setfrommetadata) {
        this.IconCompatParcelizer = setfrommetadata;
    }

    final void write(Canvas canvas, Rect rect, float f) {
        this.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(canvas, rect, f);
    }
}
