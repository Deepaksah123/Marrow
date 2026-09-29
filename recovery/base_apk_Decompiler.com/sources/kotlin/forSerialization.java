package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.forDeserialization;

/* JADX INFO: loaded from: classes4.dex */
abstract class forSerialization {
    private static final forSerialization read;
    private static final forSerialization write;

    abstract void AudioAttributesCompatParcelizer(Object obj, long j);

    abstract <L> List<L> IconCompatParcelizer(Object obj, long j);

    abstract <L> void read(Object obj, Object obj2, long j);

    /* synthetic */ forSerialization(byte b) {
        this();
    }

    private forSerialization() {
    }

    static {
        byte b = 0;
        write = new RemoteActionCompatParcelizer(b);
        read = new IconCompatParcelizer(b);
    }

    static forSerialization RemoteActionCompatParcelizer() {
        return write;
    }

    static forSerialization write() {
        return read;
    }

    static final class RemoteActionCompatParcelizer extends forSerialization {
        private static final Class<?> read = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private RemoteActionCompatParcelizer() {
            super((byte) 0);
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        @Override // kotlin.forSerialization
        final <L> List<L> IconCompatParcelizer(Object obj, long j) {
            return RemoteActionCompatParcelizer(obj, j, 10);
        }

        @Override // kotlin.forSerialization
        final void AudioAttributesCompatParcelizer(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, j);
            if (list instanceof isFactoryMethod) {
                objUnmodifiableList = ((isFactoryMethod) list).write();
            } else {
                if (read.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof getConstructorParameters) && (list instanceof forDeserialization.AudioAttributesImplBaseParcelizer)) {
                    forDeserialization.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (forDeserialization.AudioAttributesImplBaseParcelizer) list;
                    if (audioAttributesImplBaseParcelizer.read()) {
                        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            ClassIntrospectorMixInResolver.read(obj, j, objUnmodifiableList);
        }

        private static <L> List<L> RemoteActionCompatParcelizer(Object obj, long j, int i) {
            List<L> arrayList;
            List<L> listWrite = write(obj, j);
            if (listWrite.isEmpty()) {
                if (listWrite instanceof isFactoryMethod) {
                    arrayList = new hasProperty(i);
                } else if ((listWrite instanceof getConstructorParameters) && (listWrite instanceof forDeserialization.AudioAttributesImplBaseParcelizer)) {
                    arrayList = ((forDeserialization.AudioAttributesImplBaseParcelizer) listWrite).AudioAttributesCompatParcelizer(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                ClassIntrospectorMixInResolver.read(obj, j, arrayList);
                return arrayList;
            }
            if (read.isAssignableFrom(listWrite.getClass())) {
                ArrayList arrayList2 = new ArrayList(listWrite.size() + i);
                arrayList2.addAll(listWrite);
                ClassIntrospectorMixInResolver.read(obj, j, arrayList2);
                return arrayList2;
            }
            if (listWrite instanceof hasSetter) {
                hasProperty hasproperty = new hasProperty(listWrite.size() + i);
                hasproperty.addAll((hasSetter) listWrite);
                ClassIntrospectorMixInResolver.read(obj, j, hasproperty);
                return hasproperty;
            }
            if ((listWrite instanceof getConstructorParameters) && (listWrite instanceof forDeserialization.AudioAttributesImplBaseParcelizer)) {
                forDeserialization.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (forDeserialization.AudioAttributesImplBaseParcelizer) listWrite;
                if (!audioAttributesImplBaseParcelizer.read()) {
                    forDeserialization.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer = audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(listWrite.size() + i);
                    ClassIntrospectorMixInResolver.read(obj, j, audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer);
                    return audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer;
                }
            }
            return listWrite;
        }

        @Override // kotlin.forSerialization
        final <E> void read(Object obj, Object obj2, long j) {
            List listWrite = write(obj2, j);
            List listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj, j, listWrite.size());
            int size = listRemoteActionCompatParcelizer.size();
            int size2 = listWrite.size();
            if (size > 0 && size2 > 0) {
                listRemoteActionCompatParcelizer.addAll(listWrite);
            }
            if (size > 0) {
                listWrite = listRemoteActionCompatParcelizer;
            }
            ClassIntrospectorMixInResolver.read(obj, j, listWrite);
        }

        private static <E> List<E> write(Object obj, long j) {
            return (List) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, j);
        }
    }

    static final class IconCompatParcelizer extends forSerialization {
        private IconCompatParcelizer() {
            super((byte) 0);
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // kotlin.forSerialization
        final <L> List<L> IconCompatParcelizer(Object obj, long j) {
            forDeserialization.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = read(obj, j);
            if (audioAttributesImplBaseParcelizer.read()) {
                return audioAttributesImplBaseParcelizer;
            }
            int size = audioAttributesImplBaseParcelizer.size();
            forDeserialization.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer = audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(size == 0 ? 10 : size << 1);
            ClassIntrospectorMixInResolver.read(obj, j, audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer);
            return audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer;
        }

        @Override // kotlin.forSerialization
        final void AudioAttributesCompatParcelizer(Object obj, long j) {
            read(obj, j).RemoteActionCompatParcelizer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [o.forDeserialization$AudioAttributesImplBaseParcelizer] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, o.forDeserialization$AudioAttributesImplBaseParcelizer] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3 */
        @Override // kotlin.forSerialization
        final <E> void read(Object obj, Object obj2, long j) {
            forDeserialization.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = read(obj, j);
            ?? r5 = read(obj2, j);
            int size = audioAttributesImplBaseParcelizer.size();
            int size2 = r5.size();
            ?? r3 = audioAttributesImplBaseParcelizer;
            r3 = audioAttributesImplBaseParcelizer;
            if (size > 0 && size2 > 0) {
                boolean z = audioAttributesImplBaseParcelizer.read();
                ?? AudioAttributesCompatParcelizer = audioAttributesImplBaseParcelizer;
                if (!z) {
                    AudioAttributesCompatParcelizer = audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(size2 + size);
                }
                AudioAttributesCompatParcelizer.addAll(r5);
                r3 = AudioAttributesCompatParcelizer;
            }
            if (size > 0) {
                r5 = r3;
            }
            ClassIntrospectorMixInResolver.read(obj, j, (Object) r5);
        }

        private static <E> forDeserialization.AudioAttributesImplBaseParcelizer<E> read(Object obj, long j) {
            return (forDeserialization.AudioAttributesImplBaseParcelizer) ClassIntrospectorMixInResolver.AudioAttributesImplApi21Parcelizer(obj, j);
        }
    }
}
