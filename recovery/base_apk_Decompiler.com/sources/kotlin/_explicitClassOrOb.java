package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AnnotatedFieldCollectorFieldBuilder;
import kotlin._explicitClassOrOb;
import kotlin._ignorableAnnotation;
import kotlin._isIncludableMemberMethod;
import kotlin.constructPropertyCollector;
import kotlin.forDeserialization;
import kotlin.isPresent;
import o._explicitClassOrOb.AudioAttributesCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class _explicitClassOrOb<MessageType extends _explicitClassOrOb<MessageType, BuilderType>, BuilderType extends AudioAttributesCompatParcelizer<MessageType, BuilderType>> extends _isIncludableMemberMethod<MessageType, BuilderType> {
    private static Map<Object, _explicitClassOrOb<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected isExplicitlyIncluded unknownFields = isExplicitlyIncluded.IconCompatParcelizer();
    protected int memoizedSerializedSize = -1;

    public enum AudioAttributesImplApi21Parcelizer {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected abstract Object AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, Object obj, Object obj2);

    @Override // kotlin.forClassAnnotations
    /* JADX INFO: renamed from: onCommand, reason: merged with bridge method [inline-methods] */
    public final MessageType handleMediaPlayPauseIfPendingOnHandler() {
        return (MessageType) write(AudioAttributesImplApi21Parcelizer.GET_DEFAULT_INSTANCE);
    }

    @Override // kotlin.constructPropertyCollector
    /* JADX INFO: renamed from: onPlay, reason: merged with bridge method [inline-methods] */
    public final BuilderType onMediaButtonEvent() {
        return (BuilderType) write(AudioAttributesImplApi21Parcelizer.NEW_BUILDER);
    }

    public String toString() {
        return collectProperties.RemoteActionCompatParcelizer(this, super.toString());
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        this.memoizedHashCode = getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(this).read(this);
        return this.memoizedHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (handleMediaPlayPauseIfPendingOnHandler().getClass().isInstance(obj)) {
            return getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(this).RemoteActionCompatParcelizer(this, (_explicitClassOrOb) obj);
        }
        return false;
    }

    protected void onPause() {
        getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(this).RemoteActionCompatParcelizer(this);
    }

    public final <MessageType extends _explicitClassOrOb<MessageType, BuilderType>, BuilderType extends AudioAttributesCompatParcelizer<MessageType, BuilderType>> BuilderType MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return (BuilderType) write(AudioAttributesImplApi21Parcelizer.NEW_BUILDER);
    }

    @Override // kotlin.forClassAnnotations
    public final boolean onFastForward() {
        return AudioAttributesCompatParcelizer(this, true);
    }

    @Override // kotlin.constructPropertyCollector
    /* JADX INFO: renamed from: onPlayFromMediaId, reason: merged with bridge method [inline-methods] */
    public final BuilderType onPrepareFromMediaId() {
        BuilderType buildertype = (BuilderType) write(AudioAttributesImplApi21Parcelizer.NEW_BUILDER);
        buildertype.RemoteActionCompatParcelizer(this);
        return buildertype;
    }

    protected Object AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, Object obj) {
        return AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer, obj, null);
    }

    protected Object write(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        return AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer, null, null);
    }

    @Override // kotlin._isIncludableMemberMethod
    int MediaMetadataCompat() {
        return this.memoizedSerializedSize;
    }

    @Override // kotlin._isIncludableMemberMethod
    void AudioAttributesCompatParcelizer(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // kotlin.constructPropertyCollector
    public void AudioAttributesCompatParcelizer(getParameterAnnotations getparameterannotations) throws IOException {
        getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(this).AudioAttributesCompatParcelizer(this, replaceParameterAnnotations.AudioAttributesCompatParcelizer(getparameterannotations));
    }

    @Override // kotlin.constructPropertyCollector
    public int onCustomAction() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(this).AudioAttributesCompatParcelizer(this);
        }
        return this.memoizedSerializedSize;
    }

    Object onAddQueueItem() throws Exception {
        return write(AudioAttributesImplApi21Parcelizer.BUILD_MESSAGE_INFO);
    }

    static <T extends _explicitClassOrOb<?, ?>> T AudioAttributesCompatParcelizer(Class<T> cls) {
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
        T t2 = (T) ((_explicitClassOrOb) ClassIntrospectorMixInResolver.write(cls)).handleMediaPlayPauseIfPendingOnHandler();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static <T extends _explicitClassOrOb<?, ?>> void read(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    protected static Object write(constructPropertyCollector constructpropertycollector, String str, Object[] objArr) {
        return new getMutator(constructpropertycollector, str, objArr);
    }

    public static abstract class AudioAttributesCompatParcelizer<MessageType extends _explicitClassOrOb<MessageType, BuilderType>, BuilderType extends AudioAttributesCompatParcelizer<MessageType, BuilderType>> extends _isIncludableMemberMethod.IconCompatParcelizer<MessageType, BuilderType> {
        protected boolean RemoteActionCompatParcelizer = false;
        public MessageType read;
        private final MessageType write;

        public AudioAttributesCompatParcelizer(MessageType messagetype) {
            this.write = messagetype;
            this.read = (MessageType) messagetype.write(AudioAttributesImplApi21Parcelizer.NEW_MUTABLE_INSTANCE);
        }

        protected void AudioAttributesImplApi26Parcelizer() {
            if (this.RemoteActionCompatParcelizer) {
                MessageType messagetype = (MessageType) this.read.write(AudioAttributesImplApi21Parcelizer.NEW_MUTABLE_INSTANCE);
                RemoteActionCompatParcelizer(messagetype, this.read);
                this.read = messagetype;
                this.RemoteActionCompatParcelizer = false;
            }
        }

        @Override // kotlin.forClassAnnotations
        public final boolean onFastForward() {
            return _explicitClassOrOb.AudioAttributesCompatParcelizer(this.read, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o._isIncludableMemberMethod.IconCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType clone() {
            AnnotatedFieldCollectorFieldBuilder.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (BuilderType) handleMediaPlayPauseIfPendingOnHandler().onMediaButtonEvent();
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(read());
            return audioAttributesCompatParcelizer;
        }

        @Override // o.constructPropertyCollector.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public MessageType read() {
            if (this.RemoteActionCompatParcelizer) {
                return this.read;
            }
            this.read.onPause();
            this.RemoteActionCompatParcelizer = true;
            return this.read;
        }

        @Override // o.constructPropertyCollector.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final MessageType write() {
            MessageType messagetype = (MessageType) read();
            if (messagetype.onFastForward()) {
                return messagetype;
            }
            throw AudioAttributesCompatParcelizer(messagetype);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o._isIncludableMemberMethod.IconCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public BuilderType RemoteActionCompatParcelizer(MessageType messagetype) {
            return (BuilderType) RemoteActionCompatParcelizer((_explicitClassOrOb) messagetype);
        }

        public BuilderType RemoteActionCompatParcelizer(MessageType messagetype) {
            AudioAttributesImplApi26Parcelizer();
            RemoteActionCompatParcelizer(this.read, messagetype);
            return this;
        }

        private void RemoteActionCompatParcelizer(MessageType messagetype, MessageType messagetype2) {
            getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(messagetype).IconCompatParcelizer(messagetype, messagetype2);
        }

        @Override // kotlin.forClassAnnotations
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
        public MessageType handleMediaPlayPauseIfPendingOnHandler() {
            return this.write;
        }
    }

    public static abstract class RemoteActionCompatParcelizer<MessageType extends RemoteActionCompatParcelizer<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends _explicitClassOrOb<MessageType, BuilderType> implements _isExplicitClassOrOb<MessageType, BuilderType> {
        protected isPresent<read> extensions = isPresent.write();

        final isPresent<read> AudioAttributesCompatParcelizer() {
            if (this.extensions.MediaBrowserCompatCustomActionResultReceiver()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    static final class read implements isPresent.read<read> {
        final _ignorableAnnotation.IconCompatParcelizer AudioAttributesCompatParcelizer;
        final boolean IconCompatParcelizer;
        final boolean RemoteActionCompatParcelizer;
        final int read;
        final forDeserialization.RemoteActionCompatParcelizer<?> write;

        @Override // o.isPresent.read
        public final int read() {
            return this.read;
        }

        @Override // o.isPresent.read
        public final _ignorableAnnotation.IconCompatParcelizer IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.isPresent.read
        public final _ignorableAnnotation.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        }

        @Override // o.isPresent.read
        public final boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // o.isPresent.read
        public final boolean write() {
            return this.IconCompatParcelizer;
        }

        public final forDeserialization.RemoteActionCompatParcelizer<?> AudioAttributesImplApi26Parcelizer() {
            return this.write;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.isPresent.read
        public final constructPropertyCollector.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(constructPropertyCollector.RemoteActionCompatParcelizer remoteActionCompatParcelizer, constructPropertyCollector constructpropertycollector) {
            return ((AudioAttributesCompatParcelizer) remoteActionCompatParcelizer).RemoteActionCompatParcelizer((_explicitClassOrOb) constructpropertycollector);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public int compareTo(read readVar) {
            return this.read - readVar.read;
        }
    }

    static Object write(Method method, Object obj, Object... objArr) {
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

    public static class write<ContainingType extends constructPropertyCollector, Type> extends emptyCollector<ContainingType, Type> {
        final read RemoteActionCompatParcelizer;
        final constructPropertyCollector read;

        public final int read() {
            return this.RemoteActionCompatParcelizer.read();
        }

        public final constructPropertyCollector AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final _ignorableAnnotation.IconCompatParcelizer write() {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
    }

    protected static final <T extends _explicitClassOrOb<T, ?>> boolean AudioAttributesCompatParcelizer(T t, boolean z) {
        byte bByteValue = ((Byte) t.write(AudioAttributesImplApi21Parcelizer.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zWrite = getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(t).write(t);
        if (z) {
            t.AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer.SET_MEMOIZED_IS_INITIALIZED, zWrite ? t : null);
        }
        return zWrite;
    }

    public static <E> forDeserialization.AudioAttributesImplBaseParcelizer<E> MediaBrowserCompatMediaItem() {
        return getField.AudioAttributesCompatParcelizer();
    }

    public static <E> forDeserialization.AudioAttributesImplBaseParcelizer<E> IconCompatParcelizer(forDeserialization.AudioAttributesImplBaseParcelizer<E> audioAttributesImplBaseParcelizer) {
        int size = audioAttributesImplBaseParcelizer.size();
        return audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(size == 0 ? 10 : size << 1);
    }

    public static class IconCompatParcelizer<T extends _explicitClassOrOb<T, ?>> extends AnnotatedMethodCollector<T> {
        private final T AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(T t) {
            this.AudioAttributesCompatParcelizer = t;
        }
    }

    static <T extends _explicitClassOrOb<T, ?>> T IconCompatParcelizer(T t, getOwner getowner, asAnnotations asannotations) throws _add {
        T t2 = (T) t.write(AudioAttributesImplApi21Parcelizer.NEW_MUTABLE_INSTANCE);
        try {
            getPrimaryMember getprimarymemberAudioAttributesCompatParcelizer = getAccessor.IconCompatParcelizer().AudioAttributesCompatParcelizer(t2);
            getprimarymemberAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(t2, AnnotationCollector.write(getowner), asannotations);
            getprimarymemberAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof _add) {
                throw ((_add) e.getCause());
            }
            throw new _add(e.getMessage()).RemoteActionCompatParcelizer(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof _add) {
                throw ((_add) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends _explicitClassOrOb<T, ?>> T read(T t) throws _add {
        if (t == null || t.onFastForward()) {
            return t;
        }
        throw t.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(t);
    }

    public static <T extends _explicitClassOrOb<T, ?>> T IconCompatParcelizer(T t, InputStream inputStream) throws _add {
        return (T) read(IconCompatParcelizer(t, getOwner.IconCompatParcelizer(inputStream), asAnnotations.read()));
    }
}
