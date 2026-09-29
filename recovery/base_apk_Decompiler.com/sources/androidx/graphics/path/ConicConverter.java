package androidx.graphics.path;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "p4", "internalConicToQuadratics", "([FI[FFF)I", "read", "[F"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConicConverter {
    private float[] read = new float[TsExtractor.TS_STREAM_TYPE_HDMV_DTS];

    private final native int internalConicToQuadratics(float[] p0, int p1, float[] p2, float p3, float p4);
}
