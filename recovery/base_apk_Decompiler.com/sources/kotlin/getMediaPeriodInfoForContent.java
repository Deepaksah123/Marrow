package kotlin;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaPeriodInfoForContent {
    private static final setRequestMetadata<?, ?, ?> AudioAttributesCompatParcelizer = new setRequestMetadata<>(Object.class, Object.class, Object.class, Collections.singletonList(new setDrmMultiSession(Object.class, Object.class, Object.class, Collections.emptyList(), new getNextLoadPositionUs(), null)), null);
    private final setTitleOptional<removeMediaSourceRange, setRequestMetadata<?, ?, ?>> read = new setTitleOptional<>();
    private final AtomicReference<removeMediaSourceRange> write = new AtomicReference<>();

    public static boolean AudioAttributesCompatParcelizer(setRequestMetadata<?, ?, ?> setrequestmetadata) {
        return AudioAttributesCompatParcelizer.equals(setrequestmetadata);
    }

    public final <Data, TResource, Transcode> setRequestMetadata<Data, TResource, Transcode> IconCompatParcelizer(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        setRequestMetadata<Data, TResource, Transcode> setrequestmetadata;
        removeMediaSourceRange removemediasourcerangeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(cls, cls2, cls3);
        synchronized (this.read) {
            setrequestmetadata = (setRequestMetadata) this.read.get(removemediasourcerangeAudioAttributesCompatParcelizer);
        }
        this.write.set(removemediasourcerangeAudioAttributesCompatParcelizer);
        return setrequestmetadata;
    }

    public final void AudioAttributesCompatParcelizer(Class<?> cls, Class<?> cls2, Class<?> cls3, setRequestMetadata<?, ?, ?> setrequestmetadata) {
        synchronized (this.read) {
            setTitleOptional<removeMediaSourceRange, setRequestMetadata<?, ?, ?>> settitleoptional = this.read;
            removeMediaSourceRange removemediasourcerange = new removeMediaSourceRange(cls, cls2, cls3);
            if (setrequestmetadata == null) {
                setrequestmetadata = AudioAttributesCompatParcelizer;
            }
            settitleoptional.put(removemediasourcerange, setrequestmetadata);
        }
    }

    private removeMediaSourceRange AudioAttributesCompatParcelizer(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        removeMediaSourceRange andSet = this.write.getAndSet(null);
        if (andSet == null) {
            andSet = new removeMediaSourceRange();
        }
        andSet.IconCompatParcelizer(cls, cls2, cls3);
        return andSet;
    }
}
