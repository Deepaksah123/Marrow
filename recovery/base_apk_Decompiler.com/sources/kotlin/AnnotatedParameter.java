package kotlin;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.BasicClassIntrospector;
import kotlin._add;
import kotlin._ignorableAnnotation;

/* JADX INFO: loaded from: classes4.dex */
abstract class AnnotatedParameter implements getGetter {
    /* synthetic */ AnnotatedParameter(byte b) {
        this();
    }

    public static AnnotatedParameter AudioAttributesCompatParcelizer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new AudioAttributesCompatParcelizer(byteBuffer, true);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private AnnotatedParameter() {
    }

    static final class AudioAttributesCompatParcelizer extends AnnotatedParameter {
        private final boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private final byte[] IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private final int RemoteActionCompatParcelizer;
        private int read;
        private int write;

        public AudioAttributesCompatParcelizer(ByteBuffer byteBuffer, boolean z) {
            super((byte) 0);
            this.AudioAttributesCompatParcelizer = true;
            this.IconCompatParcelizer = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.AudioAttributesImplApi21Parcelizer = iArrayOffset;
            this.RemoteActionCompatParcelizer = iArrayOffset;
            this.read = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean onFastForward() {
            return this.AudioAttributesImplApi21Parcelizer == this.read;
        }

        @Override // kotlin.getGetter
        public final int IconCompatParcelizer() throws IOException {
            if (onFastForward()) {
                return Integer.MAX_VALUE;
            }
            int iOnPlayFromUri = onPlayFromUri();
            this.MediaBrowserCompatCustomActionResultReceiver = iOnPlayFromUri;
            if (iOnPlayFromUri == this.write) {
                return Integer.MAX_VALUE;
            }
            return _ignorableAnnotation.read(iOnPlayFromUri);
        }

        @Override // kotlin.getGetter
        public final int read() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // kotlin.getGetter
        public final boolean onCommand() throws IOException {
            int i;
            if (onFastForward() || (i = this.MediaBrowserCompatCustomActionResultReceiver) == this.write) {
                return false;
            }
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(i);
            if (iRemoteActionCompatParcelizer == 0) {
                onPlayFromSearch();
                return true;
            }
            if (iRemoteActionCompatParcelizer == 1) {
                AudioAttributesCompatParcelizer(8);
                return true;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                AudioAttributesCompatParcelizer(onPlayFromUri());
                return true;
            }
            if (iRemoteActionCompatParcelizer == 3) {
                onPrepare();
                return true;
            }
            if (iRemoteActionCompatParcelizer == 5) {
                AudioAttributesCompatParcelizer(4);
                return true;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final double RemoteActionCompatParcelizer() throws IOException {
            IconCompatParcelizer(1);
            return Double.longBitsToDouble(onPause());
        }

        @Override // kotlin.getGetter
        public final float MediaBrowserCompatItemReceiver() throws IOException {
            IconCompatParcelizer(5);
            return Float.intBitsToFloat(onPlay());
        }

        @Override // kotlin.getGetter
        public final long handleMediaPlayPauseIfPendingOnHandler() throws IOException {
            IconCompatParcelizer(0);
            return onRemoveQueueItemAt();
        }

        @Override // kotlin.getGetter
        public final long MediaBrowserCompatMediaItem() throws IOException {
            IconCompatParcelizer(0);
            return onRemoveQueueItemAt();
        }

        @Override // kotlin.getGetter
        public final int AudioAttributesImplApi26Parcelizer() throws IOException {
            IconCompatParcelizer(0);
            return onPlayFromUri();
        }

        @Override // kotlin.getGetter
        public final long MediaBrowserCompatCustomActionResultReceiver() throws IOException {
            IconCompatParcelizer(1);
            return onPause();
        }

        @Override // kotlin.getGetter
        public final int AudioAttributesImplBaseParcelizer() throws IOException {
            IconCompatParcelizer(5);
            return onPlay();
        }

        @Override // kotlin.getGetter
        public final boolean write() throws IOException {
            IconCompatParcelizer(0);
            return onPlayFromUri() != 0;
        }

        @Override // kotlin.getGetter
        public final String onCustomAction() throws IOException {
            return read(false);
        }

        @Override // kotlin.getGetter
        public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
            return read(true);
        }

        private String read(boolean z) throws IOException {
            IconCompatParcelizer(2);
            int iOnPlayFromUri = onPlayFromUri();
            if (iOnPlayFromUri == 0) {
                return "";
            }
            read(iOnPlayFromUri);
            if (z) {
                byte[] bArr = this.IconCompatParcelizer;
                int i = this.AudioAttributesImplApi21Parcelizer;
                if (!_emptyAnnotationMaps.write(bArr, i, i + iOnPlayFromUri)) {
                    throw _add.RemoteActionCompatParcelizer();
                }
            }
            String str = new String(this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, iOnPlayFromUri, forDeserialization.write);
            this.AudioAttributesImplApi21Parcelizer += iOnPlayFromUri;
            return str;
        }

        @Override // kotlin.getGetter
        public final <T> T AudioAttributesCompatParcelizer(Class<T> cls, asAnnotations asannotations) throws IOException {
            IconCompatParcelizer(2);
            return (T) IconCompatParcelizer(getAccessor.IconCompatParcelizer().read(cls), asannotations);
        }

        @Override // kotlin.getGetter
        public final <T> T RemoteActionCompatParcelizer(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
            IconCompatParcelizer(2);
            return (T) IconCompatParcelizer(getprimarymember, asannotations);
        }

        private <T> T IconCompatParcelizer(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
            int iOnPlayFromUri = onPlayFromUri();
            read(iOnPlayFromUri);
            int i = this.read;
            int i2 = this.AudioAttributesImplApi21Parcelizer + iOnPlayFromUri;
            this.read = i2;
            try {
                T tWrite = getprimarymember.write();
                getprimarymember.AudioAttributesCompatParcelizer(tWrite, this, asannotations);
                getprimarymember.RemoteActionCompatParcelizer(tWrite);
                if (this.AudioAttributesImplApi21Parcelizer == i2) {
                    return tWrite;
                }
                throw _add.AudioAttributesImplBaseParcelizer();
            } finally {
                this.read = i;
            }
        }

        @Override // kotlin.getGetter
        public final <T> T write(Class<T> cls, asAnnotations asannotations) throws IOException {
            IconCompatParcelizer(3);
            return (T) AudioAttributesCompatParcelizer(getAccessor.IconCompatParcelizer().read(cls), asannotations);
        }

        @Override // kotlin.getGetter
        public final <T> T read(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
            IconCompatParcelizer(3);
            return (T) AudioAttributesCompatParcelizer(getprimarymember, asannotations);
        }

        private <T> T AudioAttributesCompatParcelizer(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
            int i = this.write;
            this.write = _ignorableAnnotation.RemoteActionCompatParcelizer(_ignorableAnnotation.read(this.MediaBrowserCompatCustomActionResultReceiver), 4);
            try {
                T tWrite = getprimarymember.write();
                getprimarymember.AudioAttributesCompatParcelizer(tWrite, this, asannotations);
                getprimarymember.RemoteActionCompatParcelizer(tWrite);
                if (this.MediaBrowserCompatCustomActionResultReceiver == this.write) {
                    return tWrite;
                }
                throw _add.AudioAttributesImplBaseParcelizer();
            } finally {
                this.write = i;
            }
        }

        @Override // kotlin.getGetter
        public final AnnotatedWithParams AudioAttributesCompatParcelizer() throws IOException {
            AnnotatedWithParams annotatedWithParamsWrite;
            IconCompatParcelizer(2);
            int iOnPlayFromUri = onPlayFromUri();
            if (iOnPlayFromUri == 0) {
                return AnnotatedWithParams.AudioAttributesCompatParcelizer;
            }
            read(iOnPlayFromUri);
            if (this.AudioAttributesCompatParcelizer) {
                annotatedWithParamsWrite = AnnotatedWithParams.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, iOnPlayFromUri);
            } else {
                annotatedWithParamsWrite = AnnotatedWithParams.write(this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, iOnPlayFromUri);
            }
            this.AudioAttributesImplApi21Parcelizer += iOnPlayFromUri;
            return annotatedWithParamsWrite;
        }

        @Override // kotlin.getGetter
        public final int onAddQueueItem() throws IOException {
            IconCompatParcelizer(0);
            return onPlayFromUri();
        }

        @Override // kotlin.getGetter
        public final int AudioAttributesImplApi21Parcelizer() throws IOException {
            IconCompatParcelizer(0);
            return onPlayFromUri();
        }

        @Override // kotlin.getGetter
        public final int MediaDescriptionCompat() throws IOException {
            IconCompatParcelizer(5);
            return onPlay();
        }

        @Override // kotlin.getGetter
        public final long MediaMetadataCompat() throws IOException {
            IconCompatParcelizer(1);
            return onPause();
        }

        @Override // kotlin.getGetter
        public final int RatingCompat() throws IOException {
            IconCompatParcelizer(0);
            return getOwner.RemoteActionCompatParcelizer(onPlayFromUri());
        }

        @Override // kotlin.getGetter
        public final long MediaBrowserCompatSearchResultReceiver() throws IOException {
            IconCompatParcelizer(0);
            return getOwner.write(onRemoveQueueItemAt());
        }

        @Override // kotlin.getGetter
        public final void IconCompatParcelizer(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof asAnnotationMap) {
                asAnnotationMap asannotationmap = (asAnnotationMap) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 1) {
                    do {
                        asannotationmap.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = onPlayFromUri();
                    MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri);
                    int i3 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                        asannotationmap.RemoteActionCompatParcelizer(Double.longBitsToDouble(onPrepareFromSearch()));
                    }
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 1) {
                do {
                    list.add(Double.valueOf(RemoteActionCompatParcelizer()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = onPlayFromUri();
                MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri2);
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                    list.add(Double.valueOf(Double.longBitsToDouble(onPrepareFromSearch())));
                }
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void AudioAttributesImplApi26Parcelizer(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof AnnotationIntrospectorPair) {
                AnnotationIntrospectorPair annotationIntrospectorPair = (AnnotationIntrospectorPair) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = onPlayFromUri();
                    write(iOnPlayFromUri);
                    int i3 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                        annotationIntrospectorPair.write(Float.intBitsToFloat(onMediaButtonEvent()));
                    }
                    return;
                }
                if (iRemoteActionCompatParcelizer == 5) {
                    do {
                        annotationIntrospectorPair.write(MediaBrowserCompatItemReceiver());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = onPlayFromUri();
                write(iOnPlayFromUri2);
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                    list.add(Float.valueOf(Float.intBitsToFloat(onMediaButtonEvent())));
                }
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 5) {
                do {
                    list.add(Float.valueOf(MediaBrowserCompatItemReceiver()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void onCommand(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof findFactoryMethodMetadata) {
                findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 0) {
                    do {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                    while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri) {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(onRemoveQueueItemAt());
                    }
                    RemoteActionCompatParcelizer(iOnPlayFromUri);
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 0) {
                do {
                    list.add(Long.valueOf(handleMediaPlayPauseIfPendingOnHandler()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri2) {
                    list.add(Long.valueOf(onRemoveQueueItemAt()));
                }
                RemoteActionCompatParcelizer(iOnPlayFromUri2);
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void AudioAttributesImplBaseParcelizer(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof findFactoryMethodMetadata) {
                findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 0) {
                    do {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(MediaBrowserCompatMediaItem());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                    while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri) {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(onRemoveQueueItemAt());
                    }
                    RemoteActionCompatParcelizer(iOnPlayFromUri);
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 0) {
                do {
                    list.add(Long.valueOf(MediaBrowserCompatMediaItem()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri2) {
                    list.add(Long.valueOf(onRemoveQueueItemAt()));
                }
                RemoteActionCompatParcelizer(iOnPlayFromUri2);
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void MediaBrowserCompatItemReceiver(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof AnnotationCollectorOneCollector) {
                AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 0) {
                    do {
                        annotationCollectorOneCollector.write(AudioAttributesImplApi26Parcelizer());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                    while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri) {
                        annotationCollectorOneCollector.write(onPlayFromUri());
                    }
                    RemoteActionCompatParcelizer(iOnPlayFromUri);
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 0) {
                do {
                    list.add(Integer.valueOf(AudioAttributesImplApi26Parcelizer()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri2) {
                    list.add(Integer.valueOf(onPlayFromUri()));
                }
                RemoteActionCompatParcelizer(iOnPlayFromUri2);
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void AudioAttributesImplApi21Parcelizer(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof findFactoryMethodMetadata) {
                findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 1) {
                    do {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = onPlayFromUri();
                    MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri);
                    int i3 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(onPrepareFromSearch());
                    }
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 1) {
                do {
                    list.add(Long.valueOf(MediaBrowserCompatCustomActionResultReceiver()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = onPlayFromUri();
                MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri2);
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                    list.add(Long.valueOf(onPrepareFromSearch()));
                }
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void RemoteActionCompatParcelizer(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof AnnotationCollectorOneCollector) {
                AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = onPlayFromUri();
                    write(iOnPlayFromUri);
                    int i3 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                        annotationCollectorOneCollector.write(onMediaButtonEvent());
                    }
                    return;
                }
                if (iRemoteActionCompatParcelizer == 5) {
                    do {
                        annotationCollectorOneCollector.write(AudioAttributesImplBaseParcelizer());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = onPlayFromUri();
                write(iOnPlayFromUri2);
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                    list.add(Integer.valueOf(onMediaButtonEvent()));
                }
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 5) {
                do {
                    list.add(Integer.valueOf(AudioAttributesImplBaseParcelizer()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void write(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof collectMethods) {
                collectMethods collectmethods = (collectMethods) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer != 0) {
                    if (iRemoteActionCompatParcelizer == 2) {
                        int iOnPlayFromUri = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                        while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri) {
                            collectmethods.write(onPlayFromUri() != 0);
                        }
                        RemoteActionCompatParcelizer(iOnPlayFromUri);
                        return;
                    }
                    throw _add.write();
                }
                do {
                    collectmethods.write(write());
                    if (onFastForward()) {
                        return;
                    } else {
                        i2 = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i2;
                return;
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 != 0) {
                if (iRemoteActionCompatParcelizer2 == 2) {
                    int iOnPlayFromUri2 = this.AudioAttributesImplApi21Parcelizer + onPlayFromUri();
                    while (this.AudioAttributesImplApi21Parcelizer < iOnPlayFromUri2) {
                        list.add(Boolean.valueOf(onPlayFromUri() != 0));
                    }
                    RemoteActionCompatParcelizer(iOnPlayFromUri2);
                    return;
                }
                throw _add.write();
            }
            do {
                list.add(Boolean.valueOf(write()));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        @Override // kotlin.getGetter
        public final void RatingCompat(List<String> list) throws IOException {
            write(list, false);
        }

        @Override // kotlin.getGetter
        public final void MediaBrowserCompatMediaItem(List<String> list) throws IOException {
            write(list, true);
        }

        private void write(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) != 2) {
                throw _add.write();
            }
            if ((list instanceof isFactoryMethod) && !z) {
                isFactoryMethod isfactorymethod = (isFactoryMethod) list;
                do {
                    isfactorymethod.IconCompatParcelizer(AudioAttributesCompatParcelizer());
                    if (onFastForward()) {
                        return;
                    } else {
                        i2 = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i2;
                return;
            }
            do {
                list.add(read(z));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getGetter
        public final <T> void read(List<T> list, getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
            int i;
            if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) != 2) {
                throw _add.write();
            }
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            do {
                list.add(IconCompatParcelizer(getprimarymember, asannotations));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == i2);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getGetter
        public final <T> void AudioAttributesCompatParcelizer(List<T> list, getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException {
            int i;
            if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) != 3) {
                throw _add.write();
            }
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            do {
                list.add(AudioAttributesCompatParcelizer(getprimarymember, asannotations));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == i2);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        @Override // kotlin.getGetter
        public final void AudioAttributesCompatParcelizer(List<AnnotatedWithParams> list) throws IOException {
            int i;
            if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) != 2) {
                throw _add.write();
            }
            do {
                list.add(AudioAttributesCompatParcelizer());
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        @Override // kotlin.getGetter
        public final void handleMediaPlayPauseIfPendingOnHandler(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof AnnotationCollectorOneCollector) {
                AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer != 0) {
                    if (iRemoteActionCompatParcelizer == 2) {
                        int iOnPlayFromUri = onPlayFromUri();
                        int i3 = this.AudioAttributesImplApi21Parcelizer;
                        while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                            annotationCollectorOneCollector.write(onPlayFromUri());
                        }
                        return;
                    }
                    throw _add.write();
                }
                do {
                    annotationCollectorOneCollector.write(onAddQueueItem());
                    if (onFastForward()) {
                        return;
                    } else {
                        i2 = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i2;
                return;
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 != 0) {
                if (iRemoteActionCompatParcelizer2 == 2) {
                    int iOnPlayFromUri2 = onPlayFromUri();
                    int i4 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                        list.add(Integer.valueOf(onPlayFromUri()));
                    }
                    return;
                }
                throw _add.write();
            }
            do {
                list.add(Integer.valueOf(onAddQueueItem()));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        @Override // kotlin.getGetter
        public final void read(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof AnnotationCollectorOneCollector) {
                AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer != 0) {
                    if (iRemoteActionCompatParcelizer == 2) {
                        int iOnPlayFromUri = onPlayFromUri();
                        int i3 = this.AudioAttributesImplApi21Parcelizer;
                        while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                            annotationCollectorOneCollector.write(onPlayFromUri());
                        }
                        return;
                    }
                    throw _add.write();
                }
                do {
                    annotationCollectorOneCollector.write(AudioAttributesImplApi21Parcelizer());
                    if (onFastForward()) {
                        return;
                    } else {
                        i2 = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i2;
                return;
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 != 0) {
                if (iRemoteActionCompatParcelizer2 == 2) {
                    int iOnPlayFromUri2 = onPlayFromUri();
                    int i4 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                        list.add(Integer.valueOf(onPlayFromUri()));
                    }
                    return;
                }
                throw _add.write();
            }
            do {
                list.add(Integer.valueOf(AudioAttributesImplApi21Parcelizer()));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        @Override // kotlin.getGetter
        public final void MediaBrowserCompatCustomActionResultReceiver(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof AnnotationCollectorOneCollector) {
                AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = onPlayFromUri();
                    write(iOnPlayFromUri);
                    int i3 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                        annotationCollectorOneCollector.write(onMediaButtonEvent());
                    }
                    return;
                }
                if (iRemoteActionCompatParcelizer == 5) {
                    do {
                        annotationCollectorOneCollector.write(MediaDescriptionCompat());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = onPlayFromUri();
                write(iOnPlayFromUri2);
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                    list.add(Integer.valueOf(onMediaButtonEvent()));
                }
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 5) {
                do {
                    list.add(Integer.valueOf(MediaDescriptionCompat()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void MediaMetadataCompat(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof findFactoryMethodMetadata) {
                findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer == 1) {
                    do {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(MediaMetadataCompat());
                        if (onFastForward()) {
                            return;
                        } else {
                            i2 = this.AudioAttributesImplApi21Parcelizer;
                        }
                    } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    return;
                }
                if (iRemoteActionCompatParcelizer == 2) {
                    int iOnPlayFromUri = onPlayFromUri();
                    MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri);
                    int i3 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                        findfactorymethodmetadata.AudioAttributesCompatParcelizer(onPrepareFromSearch());
                    }
                    return;
                }
                throw _add.write();
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 == 1) {
                do {
                    list.add(Long.valueOf(MediaMetadataCompat()));
                    if (onFastForward()) {
                        return;
                    } else {
                        i = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            if (iRemoteActionCompatParcelizer2 == 2) {
                int iOnPlayFromUri2 = onPlayFromUri();
                MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri2);
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                    list.add(Long.valueOf(onPrepareFromSearch()));
                }
                return;
            }
            throw _add.write();
        }

        @Override // kotlin.getGetter
        public final void MediaDescriptionCompat(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof AnnotationCollectorOneCollector) {
                AnnotationCollectorOneCollector annotationCollectorOneCollector = (AnnotationCollectorOneCollector) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer != 0) {
                    if (iRemoteActionCompatParcelizer == 2) {
                        int iOnPlayFromUri = onPlayFromUri();
                        int i3 = this.AudioAttributesImplApi21Parcelizer;
                        while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                            annotationCollectorOneCollector.write(getOwner.RemoteActionCompatParcelizer(onPlayFromUri()));
                        }
                        return;
                    }
                    throw _add.write();
                }
                do {
                    annotationCollectorOneCollector.write(RatingCompat());
                    if (onFastForward()) {
                        return;
                    } else {
                        i2 = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i2;
                return;
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 != 0) {
                if (iRemoteActionCompatParcelizer2 == 2) {
                    int iOnPlayFromUri2 = onPlayFromUri();
                    int i4 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                        list.add(Integer.valueOf(getOwner.RemoteActionCompatParcelizer(onPlayFromUri())));
                    }
                    return;
                }
                throw _add.write();
            }
            do {
                list.add(Integer.valueOf(RatingCompat()));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        @Override // kotlin.getGetter
        public final void MediaBrowserCompatSearchResultReceiver(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof findFactoryMethodMetadata) {
                findFactoryMethodMetadata findfactorymethodmetadata = (findFactoryMethodMetadata) list;
                int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (iRemoteActionCompatParcelizer != 0) {
                    if (iRemoteActionCompatParcelizer == 2) {
                        int iOnPlayFromUri = onPlayFromUri();
                        int i3 = this.AudioAttributesImplApi21Parcelizer;
                        while (this.AudioAttributesImplApi21Parcelizer < i3 + iOnPlayFromUri) {
                            findfactorymethodmetadata.AudioAttributesCompatParcelizer(getOwner.write(onRemoveQueueItemAt()));
                        }
                        return;
                    }
                    throw _add.write();
                }
                do {
                    findfactorymethodmetadata.AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver());
                    if (onFastForward()) {
                        return;
                    } else {
                        i2 = this.AudioAttributesImplApi21Parcelizer;
                    }
                } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = i2;
                return;
            }
            int iRemoteActionCompatParcelizer2 = _ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            if (iRemoteActionCompatParcelizer2 != 0) {
                if (iRemoteActionCompatParcelizer2 == 2) {
                    int iOnPlayFromUri2 = onPlayFromUri();
                    int i4 = this.AudioAttributesImplApi21Parcelizer;
                    while (this.AudioAttributesImplApi21Parcelizer < i4 + iOnPlayFromUri2) {
                        list.add(Long.valueOf(getOwner.write(onRemoveQueueItemAt())));
                    }
                    return;
                }
                throw _add.write();
            }
            do {
                list.add(Long.valueOf(MediaBrowserCompatSearchResultReceiver()));
                if (onFastForward()) {
                    return;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
            } while (onPlayFromUri() == this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getGetter
        public final <K, V> void write(Map<K, V> map, BasicClassIntrospector.AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer, asAnnotations asannotations) throws IOException {
            IconCompatParcelizer(2);
            int iOnPlayFromUri = onPlayFromUri();
            read(iOnPlayFromUri);
            int i = this.read;
            this.read = this.AudioAttributesImplApi21Parcelizer + iOnPlayFromUri;
            try {
                Object objWrite = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                Object objWrite2 = audioAttributesCompatParcelizer.IconCompatParcelizer;
                while (true) {
                    int iIconCompatParcelizer = IconCompatParcelizer();
                    if (iIconCompatParcelizer == Integer.MAX_VALUE) {
                        map.put(objWrite, objWrite2);
                        return;
                    }
                    if (iIconCompatParcelizer == 1) {
                        objWrite = write(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, (Class<?>) null, (asAnnotations) null);
                    } else if (iIconCompatParcelizer == 2) {
                        objWrite2 = write(audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer.IconCompatParcelizer.getClass(), asannotations);
                    } else {
                        try {
                            if (!onCommand()) {
                                throw new _add("Unable to parse map entry.");
                            }
                        } catch (_add.RemoteActionCompatParcelizer unused) {
                            if (!onCommand()) {
                                throw new _add("Unable to parse map entry.");
                            }
                        }
                    }
                }
            } finally {
                this.read = i;
            }
        }

        private Object write(_ignorableAnnotation.IconCompatParcelizer iconCompatParcelizer, Class<?> cls, asAnnotations asannotations) throws IOException {
            switch (AnonymousClass3.RemoteActionCompatParcelizer[iconCompatParcelizer.ordinal()]) {
                case 1:
                    return Boolean.valueOf(write());
                case 2:
                    return AudioAttributesCompatParcelizer();
                case 3:
                    return Double.valueOf(RemoteActionCompatParcelizer());
                case 4:
                    return Integer.valueOf(AudioAttributesImplApi21Parcelizer());
                case 5:
                    return Integer.valueOf(AudioAttributesImplBaseParcelizer());
                case 6:
                    return Long.valueOf(MediaBrowserCompatCustomActionResultReceiver());
                case 7:
                    return Float.valueOf(MediaBrowserCompatItemReceiver());
                case 8:
                    return Integer.valueOf(AudioAttributesImplApi26Parcelizer());
                case 9:
                    return Long.valueOf(MediaBrowserCompatMediaItem());
                case 10:
                    return AudioAttributesCompatParcelizer(cls, asannotations);
                case 11:
                    return Integer.valueOf(MediaDescriptionCompat());
                case 12:
                    return Long.valueOf(MediaMetadataCompat());
                case 13:
                    return Integer.valueOf(RatingCompat());
                case 14:
                    return Long.valueOf(MediaBrowserCompatSearchResultReceiver());
                case 15:
                    return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                case 16:
                    return Integer.valueOf(onAddQueueItem());
                case 17:
                    return Long.valueOf(handleMediaPlayPauseIfPendingOnHandler());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int onPlayFromUri() throws IOException {
            int i;
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            int i3 = this.read;
            if (i3 == i2) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            byte[] bArr = this.IconCompatParcelizer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.AudioAttributesImplApi21Parcelizer = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) onPrepareFromMediaId();
            }
            int i5 = i2 + 2;
            int i6 = (bArr[i4] << 7) ^ b;
            if (i6 < 0) {
                i = i6 ^ (-128);
            } else {
                int i7 = i2 + 3;
                int i8 = (bArr[i5] << 14) ^ i6;
                if (i8 >= 0) {
                    i = i8 ^ 16256;
                } else {
                    int i9 = i2 + 4;
                    int i10 = i8 ^ (bArr[i7] << 21);
                    if (i10 < 0) {
                        i = (-2080896) ^ i10;
                    } else {
                        i7 = i2 + 5;
                        byte b2 = bArr[i9];
                        int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                        if (b2 < 0) {
                            i9 = i2 + 6;
                            if (bArr[i7] < 0) {
                                i7 = i2 + 7;
                                if (bArr[i9] < 0) {
                                    i9 = i2 + 8;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 9;
                                        if (bArr[i9] < 0) {
                                            if (bArr[i7] < 0) {
                                                throw _add.AudioAttributesCompatParcelizer();
                                            }
                                            i5 = i2 + 10;
                                            i = i11;
                                        }
                                    }
                                }
                            }
                            i = i11;
                        }
                        i = i11;
                    }
                    i5 = i9;
                }
                i5 = i7;
            }
            this.AudioAttributesImplApi21Parcelizer = i5;
            return i;
        }

        private long onRemoveQueueItemAt() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.AudioAttributesImplApi21Parcelizer;
            int i2 = this.read;
            if (i2 == i) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            byte[] bArr = this.IconCompatParcelizer;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.AudioAttributesImplApi21Parcelizer = i3;
                return b;
            }
            if (i2 - i3 < 9) {
                return onPrepareFromMediaId();
            }
            int i4 = i + 2;
            int i5 = (bArr[i3] << 7) ^ b;
            if (i5 < 0) {
                j = i5 ^ (-128);
            } else {
                int i6 = i + 3;
                int i7 = (bArr[i4] << 14) ^ i5;
                if (i7 >= 0) {
                    j = i7 ^ 16256;
                    i4 = i6;
                } else {
                    int i8 = i + 4;
                    int i9 = i7 ^ (bArr[i6] << 21);
                    if (i9 < 0) {
                        long j4 = (-2080896) ^ i9;
                        i4 = i8;
                        j = j4;
                    } else {
                        long j5 = i9;
                        i4 = i + 5;
                        long j6 = j5 ^ (((long) bArr[i8]) << 28);
                        if (j6 >= 0) {
                            j3 = 266354560;
                        } else {
                            int i10 = i + 6;
                            long j7 = j6 ^ (((long) bArr[i4]) << 35);
                            if (j7 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i4 = i + 7;
                                j6 = j7 ^ (((long) bArr[i10]) << 42);
                                if (j6 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i10 = i + 8;
                                    j7 = j6 ^ (((long) bArr[i4]) << 49);
                                    if (j7 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        i4 = i + 9;
                                        long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            if (bArr[i4] < 0) {
                                                throw _add.AudioAttributesCompatParcelizer();
                                            }
                                            i4 = i + 10;
                                        }
                                        j = j8;
                                    }
                                }
                            }
                            j = j7 ^ j2;
                            i4 = i10;
                        }
                        j = j6 ^ j3;
                    }
                }
            }
            this.AudioAttributesImplApi21Parcelizer = i4;
            return j;
        }

        private long onPrepareFromMediaId() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bOnPlayFromMediaId = onPlayFromMediaId();
                j |= ((long) (bOnPlayFromMediaId & 127)) << i;
                if ((bOnPlayFromMediaId & 128) == 0) {
                    return j;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private byte onPlayFromMediaId() throws IOException {
            int i = this.AudioAttributesImplApi21Parcelizer;
            if (i == this.read) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            byte[] bArr = this.IconCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = i + 1;
            return bArr[i];
        }

        private int onPlay() throws IOException {
            read(4);
            return onMediaButtonEvent();
        }

        private long onPause() throws IOException {
            read(8);
            return onPrepareFromSearch();
        }

        private int onMediaButtonEvent() {
            int i = this.AudioAttributesImplApi21Parcelizer;
            byte[] bArr = this.IconCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        private long onPrepareFromSearch() {
            int i = this.AudioAttributesImplApi21Parcelizer;
            byte[] bArr = this.IconCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        private void onPlayFromSearch() throws IOException {
            int i = this.read;
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            if (i - i2 >= 10) {
                byte[] bArr = this.IconCompatParcelizer;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.AudioAttributesImplApi21Parcelizer = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            onRemoveQueueItem();
        }

        private void onRemoveQueueItem() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (onPlayFromMediaId() >= 0) {
                    return;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private void AudioAttributesCompatParcelizer(int i) throws IOException {
            read(i);
            this.AudioAttributesImplApi21Parcelizer += i;
        }

        private void onPrepare() throws IOException {
            int i = this.write;
            this.write = _ignorableAnnotation.RemoteActionCompatParcelizer(_ignorableAnnotation.read(this.MediaBrowserCompatCustomActionResultReceiver), 4);
            while (IconCompatParcelizer() != Integer.MAX_VALUE && onCommand()) {
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver != this.write) {
                throw _add.AudioAttributesImplBaseParcelizer();
            }
            this.write = i;
        }

        private void read(int i) throws IOException {
            if (i < 0 || i > this.read - this.AudioAttributesImplApi21Parcelizer) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
        }

        private void IconCompatParcelizer(int i) throws IOException {
            if (_ignorableAnnotation.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) != i) {
                throw _add.write();
            }
        }

        private void MediaBrowserCompatCustomActionResultReceiver(int i) throws IOException {
            read(i);
            if ((i & 7) != 0) {
                throw _add.AudioAttributesImplBaseParcelizer();
            }
        }

        private void write(int i) throws IOException {
            read(i);
            if ((i & 3) != 0) {
                throw _add.AudioAttributesImplBaseParcelizer();
            }
        }

        private void RemoteActionCompatParcelizer(int i) throws IOException {
            if (this.AudioAttributesImplApi21Parcelizer != i) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
        }
    }

    /* JADX INFO: renamed from: o.AnnotatedParameter$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[_ignorableAnnotation.IconCompatParcelizer.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[_ignorableAnnotation.IconCompatParcelizer.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                RemoteActionCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }
}
