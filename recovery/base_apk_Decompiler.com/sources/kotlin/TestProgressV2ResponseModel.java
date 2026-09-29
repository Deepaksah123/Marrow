package kotlin;

import android.content.Context;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes4.dex */
public class TestProgressV2ResponseModel extends TestScoreRSModel {
    protected final OverScroller AudioAttributesCompatParcelizer;

    public TestProgressV2ResponseModel(Context context) {
        this.AudioAttributesCompatParcelizer = new OverScroller(context);
    }

    @Override // kotlin.TestScoreRSModel
    public boolean read() {
        return this.AudioAttributesCompatParcelizer.computeScrollOffset();
    }

    @Override // kotlin.TestScoreRSModel
    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.AudioAttributesCompatParcelizer.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    @Override // kotlin.TestScoreRSModel
    public final void write() {
        this.AudioAttributesCompatParcelizer.forceFinished(true);
    }

    @Override // kotlin.TestScoreRSModel
    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.isFinished();
    }

    @Override // kotlin.TestScoreRSModel
    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getCurrX();
    }

    @Override // kotlin.TestScoreRSModel
    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getCurrY();
    }
}
