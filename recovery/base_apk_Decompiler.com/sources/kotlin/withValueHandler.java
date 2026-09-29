package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u000e\f\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\r"}, d2 = {"Lo/withValueHandler;", "", "<init>", "()V", "Lo/isJavaLangObject;", "p0", "Lo/getValueHandler;", "p1", "Lo/hasHandlers;", "p2", "", "p3", "read", "(Lo/isJavaLangObject;Lo/getValueHandler;Lo/hasHandlers;I)I", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class withValueHandler {
    public static final withValueHandler INSTANCE = new withValueHandler();

    private withValueHandler() {
    }

    public final int read(isJavaLangObject p0, getValueHandler p1, hasHandlers p2, int p3) {
        return p0.IconCompatParcelizer(new isArrayType(p1, p1.getRead()), new IconCompatParcelizer(p2, read.IconCompatParcelizer, write.AudioAttributesCompatParcelizer), PropertyValueBuffer.read$default(0, 0, 0, p3, 7, null)).getRemoteActionCompatParcelizer();
    }

    public final int RemoteActionCompatParcelizer(isJavaLangObject p0, getValueHandler p1, hasHandlers p2, int p3) {
        return p0.IconCompatParcelizer(new isArrayType(p1, p1.getRead()), new IconCompatParcelizer(p2, read.IconCompatParcelizer, write.read), PropertyValueBuffer.read$default(0, p3, 0, 0, 13, null)).getAudioAttributesCompatParcelizer();
    }

    public final int write(isJavaLangObject p0, getValueHandler p1, hasHandlers p2, int p3) {
        return p0.IconCompatParcelizer(new isArrayType(p1, p1.getRead()), new IconCompatParcelizer(p2, read.AudioAttributesCompatParcelizer, write.AudioAttributesCompatParcelizer), PropertyValueBuffer.read$default(0, 0, 0, p3, 7, null)).getRemoteActionCompatParcelizer();
    }

    public final int AudioAttributesCompatParcelizer(isJavaLangObject p0, getValueHandler p1, hasHandlers p2, int p3) {
        return p0.IconCompatParcelizer(new isArrayType(p1, p1.getRead()), new IconCompatParcelizer(p2, read.AudioAttributesCompatParcelizer, write.read), PropertyValueBuffer.read$default(0, p3, 0, 0, 13, null)).getAudioAttributesCompatParcelizer();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/withValueHandler$IconCompatParcelizer;", "Lo/isTypeOrSuperTypeOf;", "Lo/hasHandlers;", "p0", "Lo/withValueHandler$read;", "p1", "Lo/withValueHandler$write;", "p2", "<init>", "(Lo/hasHandlers;Lo/withValueHandler$read;Lo/withValueHandler$write;)V", "Lo/PropertyValueAny;", "Lo/_parser;", "write", "(J)Lo/_parser;", "", "AudioAttributesCompatParcelizer", "(I)I", "read", "IconCompatParcelizer", "Lo/hasHandlers;", "Lo/withValueHandler$read;", "RemoteActionCompatParcelizer", "Lo/withValueHandler$write;", "", "q_", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements isTypeOrSuperTypeOf {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final read RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final write AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final hasHandlers IconCompatParcelizer;

        public IconCompatParcelizer(hasHandlers hashandlers, read readVar, write writeVar) {
            this.IconCompatParcelizer = hashandlers;
            this.RemoteActionCompatParcelizer = readVar;
            this.AudioAttributesCompatParcelizer = writeVar;
        }

        @Override // kotlin.hasHandlers
        public final Object q_() {
            return this.IconCompatParcelizer.q_();
        }

        @Override // kotlin.isTypeOrSuperTypeOf
        public final _parser write(long p0) {
            int iIconCompatParcelizer;
            int iAudioAttributesCompatParcelizer;
            if (this.AudioAttributesCompatParcelizer == write.AudioAttributesCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer == read.AudioAttributesCompatParcelizer) {
                    iAudioAttributesCompatParcelizer = this.IconCompatParcelizer.write(PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0));
                } else {
                    iAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0));
                }
                return new RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, PropertyValueAny.AudioAttributesCompatParcelizer(p0) ? PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0) : 32767);
            }
            if (this.RemoteActionCompatParcelizer == read.AudioAttributesCompatParcelizer) {
                iIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(PropertyValueAny.AudioAttributesImplBaseParcelizer(p0));
            } else {
                iIconCompatParcelizer = this.IconCompatParcelizer.read(PropertyValueAny.AudioAttributesImplBaseParcelizer(p0));
            }
            return new RemoteActionCompatParcelizer(PropertyValueAny.RemoteActionCompatParcelizer(p0) ? PropertyValueAny.AudioAttributesImplBaseParcelizer(p0) : 32767, iIconCompatParcelizer);
        }

        @Override // kotlin.hasHandlers
        public final int AudioAttributesCompatParcelizer(int p0) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        }

        @Override // kotlin.hasHandlers
        public final int write(int p0) {
            return this.IconCompatParcelizer.write(p0);
        }

        @Override // kotlin.hasHandlers
        public final int read(int p0) {
            return this.IconCompatParcelizer.read(p0);
        }

        @Override // kotlin.hasHandlers
        public final int IconCompatParcelizer(int p0) {
            return this.IconCompatParcelizer.IconCompatParcelizer(p0);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/withValueHandler$RemoteActionCompatParcelizer;", "Lo/_parser;", "", "p0", "p1", "<init>", "(II)V", "Lo/weirdNumberException;", "AudioAttributesCompatParcelizer", "(Lo/weirdNumberException;)I", "Lo/hasReferringProperties;", "", "Lkotlin/Function1;", "Lo/validateAppend;", "", "p2", "RemoteActionCompatParcelizer", "(JFLo/getAnswerMap;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends _parser {
        @Override // kotlin.withStaticTyping
        public final int AudioAttributesCompatParcelizer(weirdNumberException p0) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin._parser
        public final void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2) {
        }

        public RemoteActionCompatParcelizer(int i, int i2) {
            long j = -1;
            MediaBrowserCompatItemReceiver(getKey.read((((long) i2) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) i) << 32)));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/withValueHandler$read;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private static final /* synthetic */ getMagicModuleSavedMcqCount RemoteActionCompatParcelizer;
        private static final /* synthetic */ read[] read;
        public static final read IconCompatParcelizer = new read("Min", 0);
        public static final read AudioAttributesCompatParcelizer = new read("Max", 1);

        private read(String str, int i) {
        }

        static {
            read[] readVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            read = readVarArrAudioAttributesCompatParcelizer;
            RemoteActionCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(readVarArrAudioAttributesCompatParcelizer);
        }

        private static final /* synthetic */ read[] AudioAttributesCompatParcelizer() {
            return new read[]{IconCompatParcelizer, AudioAttributesCompatParcelizer};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) read.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/withValueHandler$write;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write {
        private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
        private static final /* synthetic */ write[] write;
        public static final write AudioAttributesCompatParcelizer = new write("Width", 0);
        public static final write read = new write("Height", 1);

        private write(String str, int i) {
        }

        static {
            write[] writeVarArrWrite = write();
            write = writeVarArrWrite;
            IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(writeVarArrWrite);
        }

        private static final /* synthetic */ write[] write() {
            return new write[]{AudioAttributesCompatParcelizer, read};
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) write.clone();
        }
    }
}
