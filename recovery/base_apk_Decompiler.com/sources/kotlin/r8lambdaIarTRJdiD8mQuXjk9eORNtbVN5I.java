package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.DownloadIndex;
import kotlin.DownloadManagerExternalSyntheticLambda0;
import kotlin.r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I;
import o.r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I<MessageType extends r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I<MessageType, BuilderType>, BuilderType extends IconCompatParcelizer<MessageType, BuilderType>> implements DownloadManagerExternalSyntheticLambda0 {
    protected int memoizedHashCode = 0;

    @Override // kotlin.DownloadManagerExternalSyntheticLambda0
    public final DownloadIndex onPlay() {
        try {
            DownloadIndex.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = DownloadIndex.write(onRemoveQueueItem());
            write(remoteActionCompatParcelizerWrite.write());
            return remoteActionCompatParcelizerWrite.RemoteActionCompatParcelizer();
        } catch (IOException e) {
            throw new RuntimeException(this.AudioAttributesCompatParcelizer("ByteString"), e);
        }
    }

    public final byte[] onPause() {
        try {
            byte[] bArr = new byte[onRemoveQueueItem()];
            DownloadManager downloadManager = DownloadManager.read(bArr);
            write(downloadManager);
            downloadManager.MediaBrowserCompatItemReceiver();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(AudioAttributesCompatParcelizer("byte array"), e);
        }
    }

    int onFastForward() {
        throw new UnsupportedOperationException();
    }

    void AudioAttributesCompatParcelizer(int i) {
        throw new UnsupportedOperationException();
    }

    int RemoteActionCompatParcelizer(setNotMetRequirements setnotmetrequirements) {
        int iOnFastForward = onFastForward();
        if (iOnFastForward != -1) {
            return iOnFastForward;
        }
        int iAudioAttributesCompatParcelizer = setnotmetrequirements.AudioAttributesCompatParcelizer(this);
        AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
        return iAudioAttributesCompatParcelizer;
    }

    private String AudioAttributesCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("Serializing ");
        sb.append(getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static <T> void write(Iterable<T> iterable, List<? super T> list) {
        IconCompatParcelizer.write(iterable, list);
    }

    public static abstract class IconCompatParcelizer<MessageType extends r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I<MessageType, BuilderType>, BuilderType extends IconCompatParcelizer<MessageType, BuilderType>> implements DownloadManagerExternalSyntheticLambda0.read {
        @Override // 
        /* JADX INFO: renamed from: MediaMetadataCompat */
        public abstract BuilderType clone();

        private static <T> void RemoteActionCompatParcelizer(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb = new StringBuilder("Element at index ");
                    sb.append(list.size() - size);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(string);
                }
                list.add(t);
            }
        }

        protected static onDownloadRemoved MediaBrowserCompatCustomActionResultReceiver() {
            return new onDownloadRemoved();
        }

        protected static <T> void write(Iterable<T> iterable, List<? super T> list) {
            getDownloadIndex.RemoteActionCompatParcelizer(iterable);
            if (iterable instanceof isInitialized) {
                List<?> listWrite = ((isInitialized) iterable).write();
                isInitialized isinitialized = (isInitialized) list;
                int size = list.size();
                for (Object obj : listWrite) {
                    if (obj == null) {
                        StringBuilder sb = new StringBuilder("Element at index ");
                        sb.append(isinitialized.size() - size);
                        sb.append(" is null.");
                        String string = sb.toString();
                        for (int size2 = isinitialized.size() - 1; size2 >= size; size2--) {
                            isinitialized.remove(size2);
                        }
                        throw new NullPointerException(string);
                    }
                    if (obj instanceof DownloadIndex) {
                        isinitialized.AudioAttributesCompatParcelizer((DownloadIndex) obj);
                    } else {
                        isinitialized.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof onDownloadTaskStopped) {
                list.addAll((Collection) iterable);
            } else {
                RemoteActionCompatParcelizer(iterable, list);
            }
        }
    }
}
