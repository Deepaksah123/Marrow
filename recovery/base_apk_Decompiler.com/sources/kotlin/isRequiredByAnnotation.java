package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinKeySerializersKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
final class isRequiredByAnnotation<Key, Value> {
    private final setCardContent<write<Key, Value>> AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final KotlinKeySerializersKt.write[] RemoteActionCompatParcelizer;
    private final read[] read;

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            IconCompatParcelizer = iArr;
            int[] iArr2 = new int[read.values().length];
            try {
                iArr2[read.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[read.REQUIRES_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[read.UNBLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            write = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/isRequiredByAnnotation$read;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum read {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    public isRequiredByAnnotation() {
        int length = accessgetStaticJsonKeyGetter.values().length;
        read[] readVarArr = new read[length];
        for (int i = 0; i < length; i++) {
            readVarArr[i] = read.UNBLOCKED;
        }
        this.read = readVarArr;
        int length2 = accessgetStaticJsonKeyGetter.values().length;
        KotlinKeySerializersKt.write[] writeVarArr = new KotlinKeySerializersKt.write[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            writeVarArr[i2] = null;
        }
        this.RemoteActionCompatParcelizer = writeVarArr;
        this.AudioAttributesCompatParcelizer = new setCardContent<>();
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }

    public final KotlinKeySerializers AudioAttributesCompatParcelizer() {
        return new KotlinKeySerializers(RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter.REFRESH), RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter.PREPEND), RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter.APPEND));
    }

    private final KotlinKeySerializersKt RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
        KotlinKeySerializersKt.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer;
        read readVar = this.read[accessgetstaticjsonkeygetter.ordinal()];
        setCardContent<write<Key, Value>> setcardcontent = this.AudioAttributesCompatParcelizer;
        if (!(setcardcontent instanceof Collection) || !setcardcontent.isEmpty()) {
            Iterator<write<Key, Value>> it = setcardcontent.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().AudioAttributesCompatParcelizer() == accessgetstaticjsonkeygetter) {
                    if (readVar != read.REQUIRES_REFRESH) {
                        return KotlinKeySerializersKt.IconCompatParcelizer.INSTANCE;
                    }
                }
            }
        }
        KotlinKeySerializersKt.write writeVar = this.RemoteActionCompatParcelizer[accessgetstaticjsonkeygetter.ordinal()];
        if (writeVar != null) {
            return writeVar;
        }
        int i = RemoteActionCompatParcelizer.write[readVar.ordinal()];
        if (i == 1) {
            if (RemoteActionCompatParcelizer.IconCompatParcelizer[accessgetstaticjsonkeygetter.ordinal()] == 1) {
                KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
                remoteActionCompatParcelizerIconCompatParcelizer = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
            } else {
                KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion2 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
                remoteActionCompatParcelizerIconCompatParcelizer = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.IconCompatParcelizer();
            }
            return remoteActionCompatParcelizerIconCompatParcelizer;
        }
        if (i == 2) {
            KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion3 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
            return KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion4 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        return KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
    }

    public final boolean read(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor) {
        write<Key, Value> next;
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        toMagicModuleMetaRepoModel.write(accessisprimaryconstructor, "");
        Iterator<write<Key, Value>> it = this.AudioAttributesCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.AudioAttributesCompatParcelizer() == accessgetstaticjsonkeygetter) {
                break;
            }
        }
        write<Key, Value> writeVar = next;
        if (writeVar != null) {
            writeVar.IconCompatParcelizer(accessisprimaryconstructor);
            return false;
        }
        read readVar = this.read[accessgetstaticjsonkeygetter.ordinal()];
        if (readVar == read.REQUIRES_REFRESH && accessgetstaticjsonkeygetter != accessgetStaticJsonKeyGetter.REFRESH) {
            this.AudioAttributesCompatParcelizer.add(new write<>(accessgetstaticjsonkeygetter, accessisprimaryconstructor));
            return false;
        }
        if (readVar != read.UNBLOCKED && accessgetstaticjsonkeygetter != accessgetStaticJsonKeyGetter.REFRESH) {
            return false;
        }
        if (accessgetstaticjsonkeygetter == accessgetStaticJsonKeyGetter.REFRESH) {
            write(accessgetStaticJsonKeyGetter.REFRESH, (KotlinKeySerializersKt.write) null);
        }
        if (this.RemoteActionCompatParcelizer[accessgetstaticjsonkeygetter.ordinal()] == null) {
            return this.AudioAttributesCompatParcelizer.add(new write<>(accessgetstaticjsonkeygetter, accessisprimaryconstructor));
        }
        return false;
    }

    public final void write(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, read readVar) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        this.read[accessgetstaticjsonkeygetter.ordinal()] = readVar;
    }

    public final accessisPrimaryConstructor<Key, Value> RemoteActionCompatParcelizer() {
        write<Key, Value> next;
        Iterator<write<Key, Value>> it = this.AudioAttributesCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.AudioAttributesCompatParcelizer() == accessgetStaticJsonKeyGetter.REFRESH) {
                break;
            }
        }
        write<Key, Value> writeVar = next;
        if (writeVar != null) {
            return writeVar.write();
        }
        return null;
    }

    public final Pair<accessgetStaticJsonKeyGetter, accessisPrimaryConstructor<Key, Value>> IconCompatParcelizer() {
        write<Key, Value> next;
        Iterator<write<Key, Value>> it = this.AudioAttributesCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            write<Key, Value> writeVar = next;
            if (writeVar.AudioAttributesCompatParcelizer() != accessgetStaticJsonKeyGetter.REFRESH && this.read[writeVar.AudioAttributesCompatParcelizer().ordinal()] == read.UNBLOCKED) {
                break;
            }
        }
        write<Key, Value> writeVar2 = next;
        if (writeVar2 != null) {
            return setAction.write(writeVar2.AudioAttributesCompatParcelizer(), writeVar2.write());
        }
        return null;
    }

    public final void write() {
        this.AudioAttributesCompatParcelizer.clear();
    }

    /* JADX INFO: renamed from: o.isRequiredByAnnotation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/isRequiredByAnnotation$write;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/isRequiredByAnnotation$write;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<write<Key, Value>, Boolean> {
        final /* synthetic */ accessgetStaticJsonKeyGetter $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(write<Key, Value> writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            return Boolean.valueOf(writeVar.AudioAttributesCompatParcelizer() == this.$IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
            super(1);
            this.$IconCompatParcelizer = accessgetstaticjsonkeygetter;
        }
    }

    public final void AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        IntermediateLoginResponseBody.read((List) this.AudioAttributesCompatParcelizer, (getAnswerMap) new AnonymousClass1(accessgetstaticjsonkeygetter));
    }

    public final void read() {
        int length = this.RemoteActionCompatParcelizer.length;
        for (int i = 0; i < length; i++) {
            this.RemoteActionCompatParcelizer[i] = null;
        }
    }

    public final void write(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, KotlinKeySerializersKt.write writeVar) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        this.RemoteActionCompatParcelizer[accessgetstaticjsonkeygetter.ordinal()] = writeVar;
    }

    public static final class write<Key, Value> {
        private accessisPrimaryConstructor<Key, Value> AudioAttributesCompatParcelizer;
        private final accessgetStaticJsonKeyGetter RemoteActionCompatParcelizer;

        public write(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor) {
            toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
            toMagicModuleMetaRepoModel.write(accessisprimaryconstructor, "");
            this.RemoteActionCompatParcelizer = accessgetstaticjsonkeygetter;
            this.AudioAttributesCompatParcelizer = accessisprimaryconstructor;
        }

        public final accessgetStaticJsonKeyGetter AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void IconCompatParcelizer(accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor) {
            toMagicModuleMetaRepoModel.write(accessisprimaryconstructor, "");
            this.AudioAttributesCompatParcelizer = accessisprimaryconstructor;
        }

        public final accessisPrimaryConstructor<Key, Value> write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
