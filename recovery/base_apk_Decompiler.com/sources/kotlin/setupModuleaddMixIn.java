package kotlin;

import kotlin.KotlinKeySerializersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setupModuleaddMixIn {
    private KotlinKeySerializersKt AudioAttributesCompatParcelizer;
    private KotlinKeySerializersKt RemoteActionCompatParcelizer;
    private KotlinKeySerializersKt write;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    public setupModuleaddMixIn() {
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        this.RemoteActionCompatParcelizer = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion2 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        this.AudioAttributesCompatParcelizer = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion3 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        this.write = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
    }

    public final KotlinKeySerializers write() {
        return new KotlinKeySerializers(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write);
    }

    public final KotlinKeySerializersKt AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        int i = read.read[accessgetstaticjsonkeygetter.ordinal()];
        if (i == 1) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i == 2) {
            return this.write;
        }
        if (i == 3) {
            return this.AudioAttributesCompatParcelizer;
        }
        throw new RenewEligibleCreator();
    }

    public final void AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, KotlinKeySerializersKt kotlinKeySerializersKt) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        toMagicModuleMetaRepoModel.write(kotlinKeySerializersKt, "");
        int i = read.read[accessgetstaticjsonkeygetter.ordinal()];
        if (i == 1) {
            this.RemoteActionCompatParcelizer = kotlinKeySerializersKt;
        } else if (i == 2) {
            this.write = kotlinKeySerializersKt;
        } else {
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            this.AudioAttributesCompatParcelizer = kotlinKeySerializersKt;
        }
    }

    public final void read(KotlinKeySerializers kotlinKeySerializers) {
        toMagicModuleMetaRepoModel.write(kotlinKeySerializers, "");
        this.RemoteActionCompatParcelizer = kotlinKeySerializers.getRead();
        this.write = kotlinKeySerializers.getIconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = kotlinKeySerializers.getRemoteActionCompatParcelizer();
    }
}
