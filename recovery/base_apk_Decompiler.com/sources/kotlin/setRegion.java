package kotlin;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setRegion;", "", "<init>", "()V", "Lo/isFmgStudent;", "AudioAttributesCompatParcelizer", "()Lo/isFmgStudent;", "", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "Lo/isFmgStudent;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setRegion {
    public static final setRegion INSTANCE = new setRegion();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final boolean RemoteActionCompatParcelizer = VideoPlaybackConfiguration.AudioAttributesCompatParcelizer("kotlinx.coroutines.fast.service.loader", true);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final isFmgStudent write = AudioAttributesCompatParcelizer();

    private setRegion() {
    }

    private static isFmgStudent AudioAttributesCompatParcelizer() {
        Object next;
        isFmgStudent isfmgstudentAudioAttributesCompatParcelizer;
        try {
            List<MainDispatcherFactory> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer ? setNetworkType.INSTANCE.RemoteActionCompatParcelizer() : StateResult.MediaBrowserCompatItemReceiver(StateResult.read(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (isfmgstudentAudioAttributesCompatParcelizer = setRootSessionId.AudioAttributesCompatParcelizer(mainDispatcherFactory, listRemoteActionCompatParcelizer)) == null) ? setRootSessionId.write(null, 3) : isfmgstudentAudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            return setRootSessionId.write(th, 2);
        }
    }
}
