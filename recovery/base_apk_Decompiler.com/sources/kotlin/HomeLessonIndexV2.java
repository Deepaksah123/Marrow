package kotlin;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.BookReference;
import kotlin.LessonSpinnerItem;
import kotlin.isRight;
import kotlin.setNotesCount;
import kotlin.setVideoMetaEncrypt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HomeLessonIndexV2 extends setNotesCount implements Serializable {
    protected void onStop() {
    }

    public HomeLessonIndexV2() {
    }

    public HomeLessonIndexV2(byte b) {
    }

    protected boolean write(setSlidesCount setslidescount, setResumeExplanation setresumeexplanation, setStepType setsteptype, int i) throws IOException {
        return setslidescount.RemoteActionCompatParcelizer(i, setresumeexplanation);
    }

    public static abstract class RemoteActionCompatParcelizer<MessageType extends HomeLessonIndexV2, BuilderType extends RemoteActionCompatParcelizer> extends setNotesCount.write<BuilderType> {
        private setVideoAspectRatio read = setVideoAspectRatio.write;

        @Override // kotlin.getSelectedAnswerIndex
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
        public abstract MessageType read();

        public abstract BuilderType IconCompatParcelizer(MessageType messagetype);

        @Override // o.setNotesCount.write
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final setVideoAspectRatio MediaMetadataCompat() {
            return this.read;
        }

        public final BuilderType AudioAttributesCompatParcelizer(setVideoAspectRatio setvideoaspectratio) {
            this.read = setvideoaspectratio;
            return this;
        }
    }

    public static abstract class read<MessageType extends read<MessageType>> extends HomeLessonIndexV2 implements StepIndexIA<MessageType> {
        private final setVideoMetaEncrypt<write> AudioAttributesCompatParcelizer;

        public read() {
            this.AudioAttributesCompatParcelizer = setVideoMetaEncrypt.AudioAttributesCompatParcelizer();
        }

        public read(AudioAttributesCompatParcelizer<MessageType, ?> audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        private void read(IconCompatParcelizer<MessageType, ?> iconCompatParcelizer) {
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer() != read()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean write(IconCompatParcelizer<MessageType, Type> iconCompatParcelizer) {
            read(iconCompatParcelizer);
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer);
        }

        public final <Type> int AudioAttributesCompatParcelizer(IconCompatParcelizer<MessageType, List<Type>> iconCompatParcelizer) {
            read(iconCompatParcelizer);
            return this.AudioAttributesCompatParcelizer.read(iconCompatParcelizer.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type IconCompatParcelizer(IconCompatParcelizer<MessageType, Type> iconCompatParcelizer) {
            read(iconCompatParcelizer);
            Object objWrite = this.AudioAttributesCompatParcelizer.write(iconCompatParcelizer.RemoteActionCompatParcelizer);
            if (objWrite == null) {
                return iconCompatParcelizer.read;
            }
            return (Type) iconCompatParcelizer.read(objWrite);
        }

        public final <Type> Type write(IconCompatParcelizer<MessageType, List<Type>> iconCompatParcelizer, int i) {
            read(iconCompatParcelizer);
            return (Type) iconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(iconCompatParcelizer.RemoteActionCompatParcelizer, i));
        }

        protected final boolean onSkipToQueueItem() {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        }

        @Override // kotlin.HomeLessonIndexV2
        protected final boolean write(setSlidesCount setslidescount, setResumeExplanation setresumeexplanation, setStepType setsteptype, int i) throws IOException {
            return HomeLessonIndexV2.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, read(), setslidescount, setresumeexplanation, setsteptype, i);
        }

        @Override // kotlin.HomeLessonIndexV2
        protected final void onStop() {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }

        public class AudioAttributesCompatParcelizer {
            private final boolean IconCompatParcelizer;
            private final Iterator<Map.Entry<write, Object>> RemoteActionCompatParcelizer;
            private Map.Entry<write, Object> read;

            /* synthetic */ AudioAttributesCompatParcelizer(read readVar) {
                this(false);
            }

            private AudioAttributesCompatParcelizer(boolean z) {
                Iterator<Map.Entry<write, Object>> itMediaBrowserCompatItemReceiver = read.this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                this.RemoteActionCompatParcelizer = itMediaBrowserCompatItemReceiver;
                if (itMediaBrowserCompatItemReceiver.hasNext()) {
                    this.read = itMediaBrowserCompatItemReceiver.next();
                }
                this.IconCompatParcelizer = false;
            }

            public final void read(int i, setResumeExplanation setresumeexplanation) throws IOException {
                while (true) {
                    Map.Entry<write, Object> entry = this.read;
                    if (entry == null || entry.getKey().write() >= i) {
                        return;
                    }
                    write key = this.read.getKey();
                    if (this.IconCompatParcelizer && key.RemoteActionCompatParcelizer() == isRight.RemoteActionCompatParcelizer.MESSAGE && !key.IconCompatParcelizer()) {
                        setresumeexplanation.AudioAttributesCompatParcelizer(key.write(), (BookReference) this.read.getValue());
                    } else {
                        setVideoMetaEncrypt.read(key, this.read.getValue(), setresumeexplanation);
                    }
                    if (this.RemoteActionCompatParcelizer.hasNext()) {
                        this.read = this.RemoteActionCompatParcelizer.next();
                    } else {
                        this.read = null;
                    }
                }
            }
        }

        protected final read<MessageType>.AudioAttributesCompatParcelizer setSessionImpl() {
            return new AudioAttributesCompatParcelizer(this);
        }

        protected final int onSkipToPrevious() {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    public static abstract class AudioAttributesCompatParcelizer<MessageType extends read<MessageType>, BuilderType extends AudioAttributesCompatParcelizer<MessageType, BuilderType>> extends RemoteActionCompatParcelizer<MessageType, BuilderType> implements StepIndexIA<MessageType> {
        private boolean IconCompatParcelizer;
        private setVideoMetaEncrypt<write> RemoteActionCompatParcelizer = setVideoMetaEncrypt.read();

        private void AudioAttributesImplApi26Parcelizer() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.clone();
            this.IconCompatParcelizer = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public setVideoMetaEncrypt<write> AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            this.IconCompatParcelizer = false;
            return this.RemoteActionCompatParcelizer;
        }

        @Override // o.HomeLessonIndexV2.RemoteActionCompatParcelizer, o.setNotesCount.write
        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        protected final boolean MediaBrowserCompatSearchResultReceiver() {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }

        protected final void write(MessageType messagetype) {
            AudioAttributesImplApi26Parcelizer();
            this.RemoteActionCompatParcelizer.write(((read) messagetype).AudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <MessageType extends kotlin.BookReference> boolean RemoteActionCompatParcelizer(kotlin.setVideoMetaEncrypt<o.HomeLessonIndexV2.write> r5, MessageType r6, kotlin.setSlidesCount r7, kotlin.setResumeExplanation r8, kotlin.setStepType r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.HomeLessonIndexV2.RemoteActionCompatParcelizer(o.setVideoMetaEncrypt, o.BookReference, o.setSlidesCount, o.setResumeExplanation, o.setStepType, int):boolean");
    }

    /* JADX INFO: renamed from: o.HomeLessonIndexV2$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[isRight.RemoteActionCompatParcelizer.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[isRight.RemoteActionCompatParcelizer.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[isRight.RemoteActionCompatParcelizer.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static <ContainingType extends BookReference, Type> IconCompatParcelizer<ContainingType, Type> read(ContainingType containingtype, Type type, BookReference bookReference, int i, isRight.IconCompatParcelizer iconCompatParcelizer, Class cls) {
        return new IconCompatParcelizer<>(containingtype, type, bookReference, new write(null, i, iconCompatParcelizer, false, false), cls);
    }

    public static <ContainingType extends BookReference, Type> IconCompatParcelizer<ContainingType, Type> write(ContainingType containingtype, BookReference bookReference, int i, isRight.IconCompatParcelizer iconCompatParcelizer, Class cls) {
        return new IconCompatParcelizer<>(containingtype, Collections.emptyList(), bookReference, new write(null, i, iconCompatParcelizer, true, false), cls);
    }

    static final class write implements setVideoMetaEncrypt.RemoteActionCompatParcelizer<write> {
        final boolean AudioAttributesCompatParcelizer;
        private int read;
        final isRight.IconCompatParcelizer write;
        private LessonSpinnerItem.RemoteActionCompatParcelizer<?> RemoteActionCompatParcelizer = null;
        private boolean IconCompatParcelizer = false;

        write(LessonSpinnerItem.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer, int i, isRight.IconCompatParcelizer iconCompatParcelizer, boolean z, boolean z2) {
            this.read = i;
            this.write = iconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // o.setVideoMetaEncrypt.RemoteActionCompatParcelizer
        public final int write() {
            return this.read;
        }

        @Override // o.setVideoMetaEncrypt.RemoteActionCompatParcelizer
        public final isRight.IconCompatParcelizer read() {
            return this.write;
        }

        @Override // o.setVideoMetaEncrypt.RemoteActionCompatParcelizer
        public final isRight.RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            return this.write.IconCompatParcelizer();
        }

        @Override // o.setVideoMetaEncrypt.RemoteActionCompatParcelizer
        public final boolean IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.setVideoMetaEncrypt.RemoteActionCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final LessonSpinnerItem.RemoteActionCompatParcelizer<?> MediaBrowserCompatCustomActionResultReceiver() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // o.setVideoMetaEncrypt.RemoteActionCompatParcelizer
        public final BookReference.write IconCompatParcelizer(BookReference.write writeVar, BookReference bookReference) {
            return ((RemoteActionCompatParcelizer) writeVar).IconCompatParcelizer((HomeLessonIndexV2) bookReference);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public int compareTo(write writeVar) {
            return this.read - writeVar.read;
        }
    }

    static Method RemoteActionCompatParcelizer(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String strValueOf = String.valueOf(String.valueOf(cls.getName()));
            String strValueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(strValueOf.length() + 45 + strValueOf2.length());
            sb.append("Generated message class \"");
            sb.append(strValueOf);
            sb.append("\" missing method \"");
            sb.append(strValueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object read(Method method, Object... objArr) {
        try {
            return method.invoke(null, objArr);
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

    public static class IconCompatParcelizer<ContainingType extends BookReference, Type> {
        private Method AudioAttributesCompatParcelizer;
        private ContainingType IconCompatParcelizer;
        private Class MediaBrowserCompatItemReceiver;
        final write RemoteActionCompatParcelizer;
        final Type read;
        private BookReference write;

        IconCompatParcelizer(ContainingType containingtype, Type type, BookReference bookReference, write writeVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (writeVar.read() == isRight.IconCompatParcelizer.MESSAGE && bookReference == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.IconCompatParcelizer = containingtype;
            this.read = type;
            this.write = bookReference;
            this.RemoteActionCompatParcelizer = writeVar;
            this.MediaBrowserCompatItemReceiver = cls;
            if (LessonSpinnerItem.AudioAttributesCompatParcelizer.class.isAssignableFrom(cls)) {
                this.AudioAttributesCompatParcelizer = HomeLessonIndexV2.RemoteActionCompatParcelizer(cls, "valueOf", Integer.TYPE);
            } else {
                this.AudioAttributesCompatParcelizer = null;
            }
        }

        public final ContainingType AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int write() {
            return this.RemoteActionCompatParcelizer.write();
        }

        public final BookReference RemoteActionCompatParcelizer() {
            return this.write;
        }

        final Object read(Object obj) {
            if (this.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() != isRight.RemoteActionCompatParcelizer.ENUM) {
                    return obj;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(IconCompatParcelizer(it.next()));
                }
                return arrayList;
            }
            return IconCompatParcelizer(obj);
        }

        final Object IconCompatParcelizer(Object obj) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == isRight.RemoteActionCompatParcelizer.ENUM ? HomeLessonIndexV2.read(this.AudioAttributesCompatParcelizer, (Integer) obj) : obj;
        }

        final Object RemoteActionCompatParcelizer(Object obj) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == isRight.RemoteActionCompatParcelizer.ENUM ? Integer.valueOf(((LessonSpinnerItem.AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer()) : obj;
        }
    }
}
