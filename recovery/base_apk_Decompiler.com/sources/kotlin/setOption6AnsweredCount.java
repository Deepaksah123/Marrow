package kotlin;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setOption6AnsweredCount {
    public static final setOption6AnsweredCount AudioAttributesCompatParcelizer;
    private static final int AudioAttributesImplApi21Parcelizer;
    private static final int AudioAttributesImplApi26Parcelizer;
    private static final List<write.RemoteActionCompatParcelizer> AudioAttributesImplBaseParcelizer;
    private static final List<write.RemoteActionCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    public static final setOption6AnsweredCount MediaBrowserCompatItemReceiver;
    private static final int MediaBrowserCompatMediaItem;
    private static final int MediaBrowserCompatSearchResultReceiver;
    private static final int MediaDescriptionCompat;
    private static final int MediaMetadataCompat;
    private static final int RatingCompat;
    public static final setOption6AnsweredCount RemoteActionCompatParcelizer;
    private static final int onAddQueueItem;
    public static final setOption6AnsweredCount read;
    public static final setOption6AnsweredCount write;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final List<setReferences> onCustomAction;
    public static final write IconCompatParcelizer = new write(0 == true ? 1 : 0);
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;

    /* JADX WARN: Multi-variable type inference failed */
    private setOption6AnsweredCount(int i, List<? extends setReferences> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.onCustomAction = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((setReferences) it.next()).RemoteActionCompatParcelizer();
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
    }

    private /* synthetic */ setOption6AnsweredCount(int i) {
        this(i, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    }

    public final List<setReferences> AudioAttributesImplBaseParcelizer() {
        return this.onCustomAction;
    }

    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean AudioAttributesCompatParcelizer(int i) {
        return (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver & i) != 0;
    }

    public final setOption6AnsweredCount write(int i) {
        int i2 = i & this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (i2 == 0) {
            return null;
        }
        return new setOption6AnsweredCount(i2, this.onCustomAction);
    }

    public final String toString() {
        Object next;
        Iterator<T> it = AudioAttributesImplBaseParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((write.RemoteActionCompatParcelizer) next).write() == this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                break;
            }
        }
        write.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (write.RemoteActionCompatParcelizer) next;
        String strAudioAttributesCompatParcelizer = remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.AudioAttributesCompatParcelizer() : null;
        if (strAudioAttributesCompatParcelizer == null) {
            List<write.RemoteActionCompatParcelizer> list = MediaBrowserCompatCustomActionResultReceiver;
            ArrayList arrayList = new ArrayList();
            for (write.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 : list) {
                String strAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2.write()) ? remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer() : null;
                if (strAudioAttributesCompatParcelizer2 != null) {
                    arrayList.add(strAudioAttributesCompatParcelizer2);
                }
            }
            strAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, " | ", null, null, 0, null, null, 62);
        }
        StringBuilder sb = new StringBuilder("DescriptorKindFilter(");
        sb.append(strAudioAttributesCompatParcelizer);
        sb.append(", ");
        sb.append(this.onCustomAction);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        setOption6AnsweredCount setoption6answeredcount = (setOption6AnsweredCount) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCustomAction, setoption6answeredcount.onCustomAction) && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == setoption6answeredcount.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int hashCode() {
        return (this.onCustomAction.hashCode() * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public static final class write {
        private write() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int AudioAttributesImplApi21Parcelizer() {
            int i = setOption6AnsweredCount.handleMediaPlayPauseIfPendingOnHandler;
            write writeVar = setOption6AnsweredCount.IconCompatParcelizer;
            setOption6AnsweredCount.handleMediaPlayPauseIfPendingOnHandler <<= 1;
            return i;
        }

        public static int RemoteActionCompatParcelizer() {
            return setOption6AnsweredCount.RatingCompat;
        }

        public static int MediaBrowserCompatItemReceiver() {
            return setOption6AnsweredCount.MediaBrowserCompatMediaItem;
        }

        public static int MediaBrowserCompatCustomActionResultReceiver() {
            return setOption6AnsweredCount.MediaMetadataCompat;
        }

        public static int AudioAttributesImplApi26Parcelizer() {
            return setOption6AnsweredCount.MediaDescriptionCompat;
        }

        public static int read() {
            return setOption6AnsweredCount.MediaBrowserCompatSearchResultReceiver;
        }

        public static int AudioAttributesImplBaseParcelizer() {
            return setOption6AnsweredCount.onAddQueueItem;
        }

        public static int write() {
            return setOption6AnsweredCount.AudioAttributesImplApi21Parcelizer;
        }

        public static int IconCompatParcelizer() {
            return setOption6AnsweredCount.AudioAttributesImplApi26Parcelizer;
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        static final class RemoteActionCompatParcelizer {
            private final String AudioAttributesCompatParcelizer;
            private final int RemoteActionCompatParcelizer;

            public RemoteActionCompatParcelizer(int i, String str) {
                toMagicModuleMetaRepoModel.write(str, "");
                this.RemoteActionCompatParcelizer = i;
                this.AudioAttributesCompatParcelizer = str;
            }

            public final String AudioAttributesCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final int write() {
                return this.RemoteActionCompatParcelizer;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        write.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        int iAudioAttributesImplApi21Parcelizer = write.AudioAttributesImplApi21Parcelizer();
        RatingCompat = iAudioAttributesImplApi21Parcelizer;
        int iAudioAttributesImplApi21Parcelizer2 = write.AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatMediaItem = iAudioAttributesImplApi21Parcelizer2;
        int iAudioAttributesImplApi21Parcelizer3 = write.AudioAttributesImplApi21Parcelizer();
        MediaMetadataCompat = iAudioAttributesImplApi21Parcelizer3;
        int iAudioAttributesImplApi21Parcelizer4 = write.AudioAttributesImplApi21Parcelizer();
        MediaDescriptionCompat = iAudioAttributesImplApi21Parcelizer4;
        int iAudioAttributesImplApi21Parcelizer5 = write.AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatSearchResultReceiver = iAudioAttributesImplApi21Parcelizer5;
        int iAudioAttributesImplApi21Parcelizer6 = write.AudioAttributesImplApi21Parcelizer();
        onAddQueueItem = iAudioAttributesImplApi21Parcelizer6;
        int iAudioAttributesImplApi21Parcelizer7 = write.AudioAttributesImplApi21Parcelizer() - 1;
        AudioAttributesImplApi21Parcelizer = iAudioAttributesImplApi21Parcelizer7;
        int i = iAudioAttributesImplApi21Parcelizer | iAudioAttributesImplApi21Parcelizer2 | iAudioAttributesImplApi21Parcelizer3;
        AudioAttributesImplApi26Parcelizer = i;
        write = new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer7);
        AudioAttributesCompatParcelizer = new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer5 | iAudioAttributesImplApi21Parcelizer6);
        new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer);
        new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer2);
        new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer3);
        RemoteActionCompatParcelizer = new setOption6AnsweredCount(i);
        new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer4);
        read = new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer5);
        MediaBrowserCompatItemReceiver = new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer6);
        new setOption6AnsweredCount(iAudioAttributesImplApi21Parcelizer2 | iAudioAttributesImplApi21Parcelizer5 | iAudioAttributesImplApi21Parcelizer6);
        Field[] fields = setOption6AnsweredCount.class.getFields();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fields, "");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            write.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            setOption6AnsweredCount setoption6answeredcount = obj instanceof setOption6AnsweredCount ? (setOption6AnsweredCount) obj : null;
            if (setoption6answeredcount != null) {
                int i2 = setoption6answeredcount.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                String name = field2.getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                remoteActionCompatParcelizer2 = new write.RemoteActionCompatParcelizer(i2, name);
            }
            if (remoteActionCompatParcelizer2 != null) {
                arrayList2.add(remoteActionCompatParcelizer2);
            }
        }
        AudioAttributesImplBaseParcelizer = arrayList2;
        Field[] fields2 = setOption6AnsweredCount.class.getFields();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fields2, "");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            toMagicModuleMetaRepoModel.read(obj3, "");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name2, "");
                remoteActionCompatParcelizer = new write.RemoteActionCompatParcelizer(iIntValue, name2);
            } else {
                remoteActionCompatParcelizer = null;
            }
            if (remoteActionCompatParcelizer != null) {
                arrayList5.add(remoteActionCompatParcelizer);
            }
        }
        MediaBrowserCompatCustomActionResultReceiver = arrayList5;
    }
}
