package kotlin;

import com.marrow.data.models.test.TestIndex;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class isLoadCompleted implements getNextChunk {
    private getNowPeriodTimeUs IconCompatParcelizer;

    @setSdkPayload
    public isLoadCompleted(getNowPeriodTimeUs getnowperiodtimeus) {
        this.IconCompatParcelizer = getnowperiodtimeus;
    }

    @Override // kotlin.getNextChunk
    public final TestIndex write(String str) {
        return this.IconCompatParcelizer.a_(str);
    }

    @Override // kotlin.getNextChunk
    public final TestIndex[] IconCompatParcelizer() {
        TestIndex testIndexIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(false);
        TestIndex testIndexRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(false);
        TestIndex[] testIndexArrWrite = this.IconCompatParcelizer.write();
        TestIndex testIndex = this.IconCompatParcelizer.read(false);
        TestIndex testIndexAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(false);
        ArrayList arrayList = new ArrayList();
        if (testIndexArrWrite != null && testIndexArrWrite.length > 0) {
            Collections.addAll(arrayList, testIndexArrWrite);
        }
        if (testIndexAudioAttributesCompatParcelizer != null) {
            arrayList.add(testIndexAudioAttributesCompatParcelizer);
        } else if (testIndexRemoteActionCompatParcelizer != null) {
            arrayList.add(testIndexRemoteActionCompatParcelizer);
        } else if (testIndexIconCompatParcelizer != null) {
            arrayList.add(testIndexIconCompatParcelizer);
        } else if (testIndex != null) {
            arrayList.add(testIndex);
        }
        return (TestIndex[]) arrayList.toArray(new TestIndex[arrayList.size()]);
    }

    @Override // kotlin.getNextChunk
    public final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.write("status = 2", (String[]) null);
    }
}
