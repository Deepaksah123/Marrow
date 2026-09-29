package kotlin;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.AnnotatedWithParams;
import kotlin._isIncludableMemberMethod;
import kotlin.constructPropertyCollector;
import o._isIncludableMemberMethod.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class _isIncludableMemberMethod<MessageType extends _isIncludableMemberMethod<MessageType, BuilderType>, BuilderType extends IconCompatParcelizer<MessageType, BuilderType>> implements constructPropertyCollector {
    protected int memoizedHashCode = 0;

    @Override // kotlin.constructPropertyCollector
    public AnnotatedWithParams MediaDescriptionCompat() {
        try {
            AnnotatedWithParams.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = AnnotatedWithParams.read(onCustomAction());
            AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer.read());
            return audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        } catch (IOException e) {
            throw new RuntimeException(this.write("ByteString"), e);
        }
    }

    public void write(OutputStream outputStream) throws IOException {
        getParameterAnnotations getparameterannotationsIconCompatParcelizer = getParameterAnnotations.IconCompatParcelizer(outputStream, getParameterAnnotations.MediaBrowserCompatItemReceiver(onCustomAction()));
        AudioAttributesCompatParcelizer(getparameterannotationsIconCompatParcelizer);
        getparameterannotationsIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    int MediaMetadataCompat() {
        throw new UnsupportedOperationException();
    }

    void AudioAttributesCompatParcelizer(int i) {
        throw new UnsupportedOperationException();
    }

    int read(getPrimaryMember getprimarymember) {
        int iMediaMetadataCompat = MediaMetadataCompat();
        if (iMediaMetadataCompat != -1) {
            return iMediaMetadataCompat;
        }
        int iAudioAttributesCompatParcelizer = getprimarymember.AudioAttributesCompatParcelizer(this);
        AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
        return iAudioAttributesCompatParcelizer;
    }

    ClassIntrospector MediaBrowserCompatSearchResultReceiver() {
        return new ClassIntrospector();
    }

    private String write(String str) {
        StringBuilder sb = new StringBuilder("Serializing ");
        sb.append(getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static <T> void RemoteActionCompatParcelizer(Iterable<T> iterable, List<? super T> list) {
        IconCompatParcelizer.AudioAttributesCompatParcelizer(iterable, list);
    }

    public static abstract class IconCompatParcelizer<MessageType extends _isIncludableMemberMethod<MessageType, BuilderType>, BuilderType extends IconCompatParcelizer<MessageType, BuilderType>> implements constructPropertyCollector.RemoteActionCompatParcelizer {
        @Override // 
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public abstract BuilderType clone();

        protected abstract BuilderType RemoteActionCompatParcelizer(MessageType messagetype);

        @Override // o.constructPropertyCollector.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public BuilderType RemoteActionCompatParcelizer(constructPropertyCollector constructpropertycollector) {
            if (!handleMediaPlayPauseIfPendingOnHandler().getClass().isInstance(constructpropertycollector)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return (BuilderType) RemoteActionCompatParcelizer((_isIncludableMemberMethod) constructpropertycollector);
        }

        private static <T> void IconCompatParcelizer(Iterable<T> iterable, List<? super T> list) {
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

        protected static ClassIntrospector AudioAttributesCompatParcelizer(constructPropertyCollector constructpropertycollector) {
            return new ClassIntrospector();
        }

        protected static <T> void AudioAttributesCompatParcelizer(Iterable<T> iterable, List<? super T> list) {
            forDeserialization.read(iterable);
            if (iterable instanceof isFactoryMethod) {
                List<?> listAudioAttributesCompatParcelizer = ((isFactoryMethod) iterable).AudioAttributesCompatParcelizer();
                isFactoryMethod isfactorymethod = (isFactoryMethod) list;
                int size = list.size();
                for (Object obj : listAudioAttributesCompatParcelizer) {
                    if (obj == null) {
                        StringBuilder sb = new StringBuilder("Element at index ");
                        sb.append(isfactorymethod.size() - size);
                        sb.append(" is null.");
                        String string = sb.toString();
                        for (int size2 = isfactorymethod.size() - 1; size2 >= size; size2--) {
                            isfactorymethod.remove(size2);
                        }
                        throw new NullPointerException(string);
                    }
                    if (obj instanceof AnnotatedWithParams) {
                        isfactorymethod.IconCompatParcelizer((AnnotatedWithParams) obj);
                    } else {
                        isfactorymethod.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof getConstructorParameters) {
                list.addAll((Collection) iterable);
            } else {
                IconCompatParcelizer(iterable, list);
            }
        }
    }
}
