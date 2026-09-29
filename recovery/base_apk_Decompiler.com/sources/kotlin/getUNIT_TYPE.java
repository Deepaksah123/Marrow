package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000e*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0004\t\u000e\u000f\fJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H ¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H @ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006R\u001a\u0010\t\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/getUNIT_TYPE;", "", "Key", "Value", "p0", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "Lo/getUNIT_TYPE$read;", "Lo/getUNIT_TYPE$write;", "write", "Lo/getUNIT_TYPE$IconCompatParcelizer;", "Lo/getUNIT_TYPE$IconCompatParcelizer;", "read", "()Lo/getUNIT_TYPE$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class getUNIT_TYPE<Key, Value> {
    private final IconCompatParcelizer write;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getUNIT_TYPE$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum IconCompatParcelizer {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    public abstract Key AudioAttributesCompatParcelizer();

    public abstract Object write();

    /* JADX INFO: renamed from: read, reason: from getter */
    public final IconCompatParcelizer getWrite() {
        return this.write;
    }

    public static final class read<K> {
        private final int AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final accessgetStaticJsonKeyGetter read;
        private final K write;

        public read(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, K k, int i, boolean z, int i2) {
            toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
            this.read = accessgetstaticjsonkeygetter;
            this.write = k;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = i2;
            if (accessgetstaticjsonkeygetter != accessgetStaticJsonKeyGetter.REFRESH && k == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u000f*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u000fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012"}, d2 = {"Lo/getUNIT_TYPE$write;", "", "Value", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "read", "Ljava/util/List;", "RemoteActionCompatParcelizer", "", "AudioAttributesCompatParcelizer", "I", "()I", "write", "IconCompatParcelizer", "Ljava/lang/Object;", "()Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write<Value> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final Object read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final Object AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public final List<Value> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final Object getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final Object getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        public final boolean equals(Object p0) {
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, writeVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == writeVar.IconCompatParcelizer && this.write == writeVar.write;
        }
    }
}
