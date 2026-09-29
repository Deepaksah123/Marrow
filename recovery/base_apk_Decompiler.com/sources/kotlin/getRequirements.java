package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.getDownloadIndex;

/* JADX INFO: loaded from: classes3.dex */
abstract class getRequirements {
    private static final getRequirements IconCompatParcelizer;
    private static final getRequirements write;

    abstract <L> void AudioAttributesCompatParcelizer(Object obj, Object obj2, long j);

    abstract void read(Object obj, long j);

    /* synthetic */ getRequirements(byte b) {
        this();
    }

    private getRequirements() {
    }

    static {
        byte b = 0;
        IconCompatParcelizer = new AudioAttributesCompatParcelizer(b);
        write = new read(b);
    }

    static getRequirements write() {
        return IconCompatParcelizer;
    }

    static getRequirements read() {
        return write;
    }

    static final class AudioAttributesCompatParcelizer extends getRequirements {
        private static final Class<?> AudioAttributesCompatParcelizer = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private AudioAttributesCompatParcelizer() {
            super((byte) 0);
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        @Override // kotlin.getRequirements
        final void read(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(obj, j);
            if (list instanceof isInitialized) {
                objUnmodifiableList = ((isInitialized) list).IconCompatParcelizer();
            } else {
                if (AudioAttributesCompatParcelizer.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof onDownloadTaskStopped) && (list instanceof getDownloadIndex.MediaBrowserCompatItemReceiver)) {
                    getDownloadIndex.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (getDownloadIndex.MediaBrowserCompatItemReceiver) list;
                    if (mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
                        mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            DownloadProgress.write(obj, j, objUnmodifiableList);
        }

        private static <L> List<L> RemoteActionCompatParcelizer(Object obj, long j, int i) {
            List<L> arrayList;
            List<L> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj, j);
            if (listRemoteActionCompatParcelizer.isEmpty()) {
                if (listRemoteActionCompatParcelizer instanceof isInitialized) {
                    arrayList = new isIdle(i);
                } else if ((listRemoteActionCompatParcelizer instanceof onDownloadTaskStopped) && (listRemoteActionCompatParcelizer instanceof getDownloadIndex.MediaBrowserCompatItemReceiver)) {
                    arrayList = ((getDownloadIndex.MediaBrowserCompatItemReceiver) listRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                DownloadProgress.write(obj, j, arrayList);
                return arrayList;
            }
            if (AudioAttributesCompatParcelizer.isAssignableFrom(listRemoteActionCompatParcelizer.getClass())) {
                ArrayList arrayList2 = new ArrayList(listRemoteActionCompatParcelizer.size() + i);
                arrayList2.addAll(listRemoteActionCompatParcelizer);
                DownloadProgress.write(obj, j, arrayList2);
                return arrayList2;
            }
            if (listRemoteActionCompatParcelizer instanceof onIdle) {
                isIdle isidle = new isIdle(listRemoteActionCompatParcelizer.size() + i);
                isidle.addAll((onIdle) listRemoteActionCompatParcelizer);
                DownloadProgress.write(obj, j, isidle);
                return isidle;
            }
            if ((listRemoteActionCompatParcelizer instanceof onDownloadTaskStopped) && (listRemoteActionCompatParcelizer instanceof getDownloadIndex.MediaBrowserCompatItemReceiver)) {
                getDownloadIndex.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (getDownloadIndex.MediaBrowserCompatItemReceiver) listRemoteActionCompatParcelizer;
                if (!mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
                    getDownloadIndex.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer = mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer.size() + i);
                    DownloadProgress.write(obj, j, mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer);
                    return mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer;
                }
            }
            return listRemoteActionCompatParcelizer;
        }

        @Override // kotlin.getRequirements
        final <E> void AudioAttributesCompatParcelizer(Object obj, Object obj2, long j) {
            List listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj2, j);
            List listRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(obj, j, listRemoteActionCompatParcelizer.size());
            int size = listRemoteActionCompatParcelizer2.size();
            int size2 = listRemoteActionCompatParcelizer.size();
            if (size > 0 && size2 > 0) {
                listRemoteActionCompatParcelizer2.addAll(listRemoteActionCompatParcelizer);
            }
            if (size > 0) {
                listRemoteActionCompatParcelizer = listRemoteActionCompatParcelizer2;
            }
            DownloadProgress.write(obj, j, listRemoteActionCompatParcelizer);
        }

        private static <E> List<E> RemoteActionCompatParcelizer(Object obj, long j) {
            return (List) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(obj, j);
        }
    }

    static final class read extends getRequirements {
        private read() {
            super((byte) 0);
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // kotlin.getRequirements
        final void read(Object obj, long j) {
            AudioAttributesCompatParcelizer(obj, j).RemoteActionCompatParcelizer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [o.getDownloadIndex$MediaBrowserCompatItemReceiver] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, o.getDownloadIndex$MediaBrowserCompatItemReceiver] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3 */
        @Override // kotlin.getRequirements
        final <E> void AudioAttributesCompatParcelizer(Object obj, Object obj2, long j) {
            getDownloadIndex.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(obj, j);
            ?? AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(obj2, j);
            int size = mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer.size();
            int size2 = AudioAttributesCompatParcelizer.size();
            ?? r3 = mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer;
            r3 = mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer;
            if (size > 0 && size2 > 0) {
                boolean zAudioAttributesCompatParcelizer = mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                ?? AudioAttributesCompatParcelizer2 = mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer;
                if (!zAudioAttributesCompatParcelizer) {
                    AudioAttributesCompatParcelizer2 = mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(size2 + size);
                }
                AudioAttributesCompatParcelizer2.addAll(AudioAttributesCompatParcelizer);
                r3 = AudioAttributesCompatParcelizer2;
            }
            if (size > 0) {
                AudioAttributesCompatParcelizer = r3;
            }
            DownloadProgress.write(obj, j, (Object) AudioAttributesCompatParcelizer);
        }

        private static <E> getDownloadIndex.MediaBrowserCompatItemReceiver<E> AudioAttributesCompatParcelizer(Object obj, long j) {
            return (getDownloadIndex.MediaBrowserCompatItemReceiver) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(obj, j);
        }
    }
}
