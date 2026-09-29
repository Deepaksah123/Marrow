package kotlin;

import kotlin.KotlinKeySerializersKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J&\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0015H\u0087\bø\u0001\u0000J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001eJ\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroidx/paging/LoadStates;", "", "refresh", "Landroidx/paging/LoadState;", "prepend", "append", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)V", "getAppend", "()Landroidx/paging/LoadState;", "getPrepend", "getRefresh", "component1", "component2", "component3", "copy", "equals", "", "other", "forEach", "", "op", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "get", "loadType", "get$paging_common", "hashCode", "", "modifyState", "newState", "modifyState$paging_common", "toString", "", "Companion", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class KotlinKeySerializers {
    public static final write AudioAttributesCompatParcelizer = new write(null);
    private static final KotlinKeySerializers write;
    private final KotlinKeySerializersKt IconCompatParcelizer;
    private final KotlinKeySerializersKt RemoteActionCompatParcelizer;
    private final KotlinKeySerializersKt read;

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public KotlinKeySerializers(KotlinKeySerializersKt kotlinKeySerializersKt, KotlinKeySerializersKt kotlinKeySerializersKt2, KotlinKeySerializersKt kotlinKeySerializersKt3) {
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt, "");
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt2, "");
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt3, "");
        this.read = kotlinKeySerializersKt;
        this.RemoteActionCompatParcelizer = kotlinKeySerializersKt2;
        this.IconCompatParcelizer = kotlinKeySerializersKt3;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final KotlinKeySerializersKt getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final KotlinKeySerializersKt getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final KotlinKeySerializersKt getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final KotlinKeySerializers read(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, KotlinKeySerializersKt kotlinKeySerializersKt) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt, "");
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[accessgetstaticjsonkeygetter.ordinal()];
        if (i == 1) {
            return AudioAttributesCompatParcelizer(this, null, null, kotlinKeySerializersKt, 3);
        }
        if (i == 2) {
            return AudioAttributesCompatParcelizer(this, null, kotlinKeySerializersKt, null, 5);
        }
        if (i == 3) {
            return AudioAttributesCompatParcelizer(this, kotlinKeySerializersKt, null, null, 6);
        }
        throw new RenewEligibleCreator();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/KotlinKeySerializers$write;", "", "<init>", "()V", "Lo/KotlinKeySerializers;", "write", "Lo/KotlinKeySerializers;", "RemoteActionCompatParcelizer", "()Lo/KotlinKeySerializers;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public static KotlinKeySerializers RemoteActionCompatParcelizer() {
            return KotlinKeySerializers.write;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        KotlinKeySerializersKt.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion2 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        KotlinKeySerializersKt.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite2 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion3 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        write = new KotlinKeySerializers(remoteActionCompatParcelizerWrite, remoteActionCompatParcelizerWrite2, KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write());
    }

    private static /* synthetic */ KotlinKeySerializers AudioAttributesCompatParcelizer(KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializersKt kotlinKeySerializersKt, KotlinKeySerializersKt kotlinKeySerializersKt2, KotlinKeySerializersKt kotlinKeySerializersKt3, int i) {
        if ((i & 1) != 0) {
            kotlinKeySerializersKt = kotlinKeySerializers.read;
        }
        if ((i & 2) != 0) {
            kotlinKeySerializersKt2 = kotlinKeySerializers.RemoteActionCompatParcelizer;
        }
        if ((i & 4) != 0) {
            kotlinKeySerializersKt3 = kotlinKeySerializers.IconCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(kotlinKeySerializersKt, kotlinKeySerializersKt2, kotlinKeySerializersKt3);
    }

    private static KotlinKeySerializers AudioAttributesCompatParcelizer(KotlinKeySerializersKt kotlinKeySerializersKt, KotlinKeySerializersKt kotlinKeySerializersKt2, KotlinKeySerializersKt kotlinKeySerializersKt3) {
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt, "");
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt2, "");
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt3, "");
        return new KotlinKeySerializers(kotlinKeySerializersKt, kotlinKeySerializersKt2, kotlinKeySerializersKt3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KotlinKeySerializers)) {
            return false;
        }
        KotlinKeySerializers kotlinKeySerializers = (KotlinKeySerializers) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, kotlinKeySerializers.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, kotlinKeySerializers.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, kotlinKeySerializers.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadStates(refresh=");
        sb.append(this.read);
        sb.append(", prepend=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", append=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
