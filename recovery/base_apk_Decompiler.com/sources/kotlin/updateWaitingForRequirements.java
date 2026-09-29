package kotlin;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.DownloadManagerExternalSyntheticLambda0;
import kotlin.DownloadRequest;
import kotlin.getDownloadIndex;
import kotlin.onRequirementsStateChanged;
import kotlin.r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I;
import kotlin.updateWaitingForRequirements;
import o.updateWaitingForRequirements.RemoteActionCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class updateWaitingForRequirements<MessageType extends updateWaitingForRequirements<MessageType, BuilderType>, BuilderType extends RemoteActionCompatParcelizer<MessageType, BuilderType>> extends r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, updateWaitingForRequirements<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected onWaitingForRequirementsChanged unknownFields = onWaitingForRequirementsChanged.IconCompatParcelizer();

    public enum AudioAttributesCompatParcelizer {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected abstract Object IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    final boolean onPrepareFromUri() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    final void onSetCaptioningEnabled() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    private int write() {
        return this.memoizedHashCode;
    }

    private void IconCompatParcelizer(int i) {
        this.memoizedHashCode = i;
    }

    final void onPlayFromUri() {
        this.memoizedHashCode = 0;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return write() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setRequirements
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MessageType onRemoveQueueItemAt() {
        return (MessageType) read(AudioAttributesCompatParcelizer.GET_DEFAULT_INSTANCE);
    }

    @Override // kotlin.DownloadManagerExternalSyntheticLambda0
    /* JADX INFO: renamed from: onSetRepeatMode, reason: merged with bridge method [inline-methods] */
    public final BuilderType onSetPlaybackSpeed() {
        return (BuilderType) read(AudioAttributesCompatParcelizer.NEW_BUILDER);
    }

    final MessageType onSetShuffleMode() {
        return (MessageType) read(AudioAttributesCompatParcelizer.NEW_MUTABLE_INSTANCE);
    }

    public String toString() {
        return canDownloadsRun.read(this, super.toString());
    }

    public int hashCode() {
        if (onPrepareFromUri()) {
            return IconCompatParcelizer();
        }
        if (AudioAttributesCompatParcelizer()) {
            IconCompatParcelizer(IconCompatParcelizer());
        }
        return write();
    }

    private int IconCompatParcelizer() {
        return syncStoppedDownload.write().IconCompatParcelizer(this).IconCompatParcelizer(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return syncStoppedDownload.write().IconCompatParcelizer(this).RemoteActionCompatParcelizer(this, (updateWaitingForRequirements) obj);
        }
        return false;
    }

    protected final void onRewind() {
        syncStoppedDownload.write().IconCompatParcelizer(this).RemoteActionCompatParcelizer(this);
        onSetCaptioningEnabled();
    }

    public final <MessageType extends updateWaitingForRequirements<MessageType, BuilderType>, BuilderType extends RemoteActionCompatParcelizer<MessageType, BuilderType>> BuilderType onPlayFromSearch() {
        return (BuilderType) read(AudioAttributesCompatParcelizer.NEW_BUILDER);
    }

    @Override // kotlin.setRequirements
    public final boolean onSeekTo() {
        return read(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.DownloadManagerExternalSyntheticLambda0
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public BuilderType onSetRating() {
        return (BuilderType) ((RemoteActionCompatParcelizer) read(AudioAttributesCompatParcelizer.NEW_BUILDER)).AudioAttributesCompatParcelizer(this);
    }

    private Object AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return IconCompatParcelizer(audioAttributesCompatParcelizer);
    }

    private Object read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return IconCompatParcelizer(audioAttributesCompatParcelizer);
    }

    final void onPrepareFromMediaId() {
        AudioAttributesCompatParcelizer(Integer.MAX_VALUE);
    }

    @Override // kotlin.r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I
    final int onFastForward() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // kotlin.r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I
    final void AudioAttributesCompatParcelizer(int i) {
        if (i < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was ".concat(String.valueOf(i)));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // kotlin.DownloadManagerExternalSyntheticLambda0
    public final void write(DownloadManager downloadManager) throws IOException {
        syncStoppedDownload.write().IconCompatParcelizer(this).AudioAttributesCompatParcelizer(this, r8lambdafuj8eSXOdfKow5OUl2qXLFR6UQ.IconCompatParcelizer(downloadManager));
    }

    @Override // kotlin.r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I
    final int RemoteActionCompatParcelizer(setNotMetRequirements setnotmetrequirements) {
        if (onPrepareFromUri()) {
            int i = read((setNotMetRequirements<?>) setnotmetrequirements);
            if (i >= 0) {
                return i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was ".concat(String.valueOf(i)));
        }
        if (onFastForward() != Integer.MAX_VALUE) {
            return onFastForward();
        }
        int i2 = read((setNotMetRequirements<?>) setnotmetrequirements);
        AudioAttributesCompatParcelizer(i2);
        return i2;
    }

    @Override // kotlin.DownloadManagerExternalSyntheticLambda0
    public final int onRemoveQueueItem() {
        return RemoteActionCompatParcelizer((setNotMetRequirements) null);
    }

    private int read(setNotMetRequirements<?> setnotmetrequirements) {
        if (setnotmetrequirements == null) {
            return syncStoppedDownload.write().IconCompatParcelizer(this).AudioAttributesCompatParcelizer(this);
        }
        return setnotmetrequirements.AudioAttributesCompatParcelizer(this);
    }

    final Object onPrepareFromSearch() throws Exception {
        return read(AudioAttributesCompatParcelizer.BUILD_MESSAGE_INFO);
    }

    static <T extends updateWaitingForRequirements<?, ?>> T write(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((updateWaitingForRequirements) DownloadProgress.IconCompatParcelizer(cls)).onRemoveQueueItemAt();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static <T extends updateWaitingForRequirements<?, ?>> void RemoteActionCompatParcelizer(Class<T> cls, T t) {
        t.onSetCaptioningEnabled();
        defaultInstanceMap.put(cls, t);
    }

    protected static Object AudioAttributesCompatParcelizer(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, String str, Object[] objArr) {
        return new syncRemovingDownload(downloadManagerExternalSyntheticLambda0, str, objArr);
    }

    public static abstract class RemoteActionCompatParcelizer<MessageType extends updateWaitingForRequirements<MessageType, BuilderType>, BuilderType extends RemoteActionCompatParcelizer<MessageType, BuilderType>> extends r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I.IconCompatParcelizer<MessageType, BuilderType> {
        private final MessageType AudioAttributesCompatParcelizer;
        public MessageType write;

        public RemoteActionCompatParcelizer(MessageType messagetype) {
            this.AudioAttributesCompatParcelizer = messagetype;
            if (messagetype.onPrepareFromUri()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.write = (MessageType) RemoteActionCompatParcelizer();
        }

        private MessageType RemoteActionCompatParcelizer() {
            return (MessageType) this.AudioAttributesCompatParcelizer.onSetShuffleMode();
        }

        protected final void onCustomAction() {
            if (this.write.onPrepareFromUri()) {
                return;
            }
            read();
        }

        private void read() {
            MessageType messagetype = (MessageType) RemoteActionCompatParcelizer();
            IconCompatParcelizer(messagetype, this.write);
            this.write = messagetype;
        }

        @Override // kotlin.setRequirements
        public final boolean onSeekTo() {
            return updateWaitingForRequirements.read(this.write, false);
        }

        @Override // o.r8lambdaIarTRJdiD8mQuXjk9eORNtbVN5I.IconCompatParcelizer
        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final BuilderType clone() {
            BuilderType buildertype = (BuilderType) onRemoveQueueItemAt().onSetPlaybackSpeed();
            buildertype.write = (MessageType) RatingCompat();
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.DownloadManagerExternalSyntheticLambda0.read
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public MessageType RatingCompat() {
            if (!this.write.onPrepareFromUri()) {
                return this.write;
            }
            this.write.onRewind();
            return this.write;
        }

        @Override // o.DownloadManagerExternalSyntheticLambda0.read
        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
        public final MessageType MediaBrowserCompatMediaItem() {
            MessageType messagetype = (MessageType) RatingCompat();
            if (messagetype.onSeekTo()) {
                return messagetype;
            }
            throw MediaBrowserCompatCustomActionResultReceiver();
        }

        public final BuilderType AudioAttributesCompatParcelizer(MessageType messagetype) {
            if (onRemoveQueueItemAt().equals(messagetype)) {
                return this;
            }
            onCustomAction();
            IconCompatParcelizer(this.write, messagetype);
            return this;
        }

        private static <MessageType> void IconCompatParcelizer(MessageType messagetype, MessageType messagetype2) {
            syncStoppedDownload.write().IconCompatParcelizer(messagetype).AudioAttributesCompatParcelizer(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setRequirements
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public MessageType onRemoveQueueItemAt() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static abstract class IconCompatParcelizer<MessageType extends IconCompatParcelizer<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends updateWaitingForRequirements<MessageType, BuilderType> implements addDownload<MessageType, BuilderType> {
        protected onRequirementsStateChanged<read> extensions = onRequirementsStateChanged.AudioAttributesCompatParcelizer();

        final onRequirementsStateChanged<read> RemoteActionCompatParcelizer() {
            if (this.extensions.MediaBrowserCompatCustomActionResultReceiver()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    static final class read implements onRequirementsStateChanged.RemoteActionCompatParcelizer<read> {
        private boolean AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private DownloadRequest.read read;
        private boolean write;

        @Override // o.onRequirementsStateChanged.RemoteActionCompatParcelizer
        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // o.onRequirementsStateChanged.RemoteActionCompatParcelizer
        public final DownloadRequest.read IconCompatParcelizer() {
            return this.read;
        }

        @Override // o.onRequirementsStateChanged.RemoteActionCompatParcelizer
        public final DownloadRequest.IconCompatParcelizer write() {
            throw null;
        }

        @Override // o.onRequirementsStateChanged.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.onRequirementsStateChanged.RemoteActionCompatParcelizer
        public final boolean read() {
            return this.write;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.onRequirementsStateChanged.RemoteActionCompatParcelizer
        public final DownloadManagerExternalSyntheticLambda0.read IconCompatParcelizer(DownloadManagerExternalSyntheticLambda0.read readVar, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0) {
            return ((RemoteActionCompatParcelizer) readVar).AudioAttributesCompatParcelizer((updateWaitingForRequirements) downloadManagerExternalSyntheticLambda0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public int compareTo(read readVar) {
            int i = readVar.IconCompatParcelizer;
            return 0;
        }
    }

    static Object RemoteActionCompatParcelizer(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends updateWaitingForRequirements<T, ?>> boolean read(T t, boolean z) {
        byte bByteValue = ((Byte) t.read(AudioAttributesCompatParcelizer.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zWrite = syncStoppedDownload.write().IconCompatParcelizer(t).write(t);
        if (z) {
            t.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zWrite;
    }

    protected static getDownloadIndex.IconCompatParcelizer onPlayFromMediaId() {
        return getMinRetryCount.IconCompatParcelizer();
    }

    public static getDownloadIndex.IconCompatParcelizer RemoteActionCompatParcelizer(getDownloadIndex.IconCompatParcelizer iconCompatParcelizer) {
        int size = iconCompatParcelizer.size();
        return iconCompatParcelizer.AudioAttributesCompatParcelizer(size == 0 ? 10 : size << 1);
    }

    protected static <E> getDownloadIndex.MediaBrowserCompatItemReceiver<E> onPrepare() {
        return syncQueuedDownload.write();
    }

    public static <E> getDownloadIndex.MediaBrowserCompatItemReceiver<E> read(getDownloadIndex.MediaBrowserCompatItemReceiver<E> mediaBrowserCompatItemReceiver) {
        int size = mediaBrowserCompatItemReceiver.size();
        return mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(size == 0 ? 10 : size << 1);
    }

    public static class write<T extends updateWaitingForRequirements<T, ?>> extends DownloadHelperMediaPreparer<T> {
        private final T write;

        public write(T t) {
            this.write = t;
        }
    }
}
