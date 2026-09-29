package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.OnDelegateCreatedListener;
import kotlin.getPlayoutDurationForMediaDuration;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteCreator {
    public static final OnDelegateCreatedListener AudioAttributesCompatParcelizer(getPlayoutDurationForMediaDuration getplayoutdurationformediaduration) {
        toMagicModuleMetaRepoModel.write(getplayoutdurationformediaduration, "");
        String strAudioAttributesCompatParcelizer = getplayoutdurationformediaduration.AudioAttributesCompatParcelizer();
        Long lWrite = getplayoutdurationformediaduration.write();
        long jLongValue = lWrite != null ? lWrite.longValue() : 0L;
        String str = getplayoutdurationformediaduration.read();
        String remoteActionCompatParcelizer = getplayoutdurationformediaduration.IconCompatParcelizer().getRemoteActionCompatParcelizer();
        int read = getplayoutdurationformediaduration.IconCompatParcelizer().getRead();
        String write = getplayoutdurationformediaduration.IconCompatParcelizer().getWrite();
        List<getPlayoutDurationForMediaDuration.write> listWrite = getplayoutdurationformediaduration.IconCompatParcelizer().write();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
        Iterator<T> it = listWrite.iterator();
        while (it.hasNext()) {
            arrayList.add(onDelegateCreated.RemoteActionCompatParcelizer((getPlayoutDurationForMediaDuration.write) it.next()));
        }
        return new OnDelegateCreatedListener(strAudioAttributesCompatParcelizer, jLongValue, str, new OnDelegateCreatedListener.IconCompatParcelizer(remoteActionCompatParcelizer, read, write, arrayList), getplayoutdurationformediaduration.AudioAttributesImplApi21Parcelizer(), getplayoutdurationformediaduration.AudioAttributesImplBaseParcelizer(), getplayoutdurationformediaduration.RemoteActionCompatParcelizer());
    }
}
