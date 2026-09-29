package kotlin;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.getTestPattern;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/SpliceScheduleCommand1;", "Lo/DefaultDownloadIndex;", "<init>", "()V", "", "write", "()J", "Lo/getTestPattern;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SpliceScheduleCommand1 implements DefaultDownloadIndex {
    @Override // kotlin.DefaultDownloadIndex
    public final long AudioAttributesCompatParcelizer() {
        getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
        return getUserSubmissionTimestamp.read(SystemClock.elapsedRealtime(), isAnonymous.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.DefaultDownloadIndex
    public final long write() {
        return System.currentTimeMillis() * 1000;
    }
}
