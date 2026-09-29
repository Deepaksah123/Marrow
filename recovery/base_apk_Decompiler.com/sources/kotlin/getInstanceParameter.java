package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0015\u0012B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\r\u0082\u0001\u0002\u0016\u0017"}, d2 = {"Lo/getInstanceParameter;", "", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lo/accessgetStaticJsonKeyGetter;", "RemoteActionCompatParcelizer", "(Lo/accessgetStaticJsonKeyGetter;)I", "I", "AudioAttributesCompatParcelizer", "read", "write", "IconCompatParcelizer", "Lo/getInstanceParameter$IconCompatParcelizer;", "Lo/getInstanceParameter$AudioAttributesCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class getInstanceParameter {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private final int read;

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    private getInstanceParameter(int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.read = i4;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getInstanceParameter)) {
            return false;
        }
        getInstanceParameter getinstanceparameter = (getInstanceParameter) p0;
        return this.RemoteActionCompatParcelizer == getinstanceparameter.RemoteActionCompatParcelizer && this.write == getinstanceparameter.write && this.AudioAttributesCompatParcelizer == getinstanceparameter.AudioAttributesCompatParcelizer && this.read == getinstanceparameter.read;
    }

    public final int RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = write.write[p0.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i == 2) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i == 3) {
            return this.write;
        }
        throw new RenewEligibleCreator();
    }

    public int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer) + Integer.hashCode(this.write) + Integer.hashCode(this.AudioAttributesCompatParcelizer) + Integer.hashCode(this.read);
    }

    public /* synthetic */ getInstanceParameter(int i, int i2, int i3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, i2, i3, i4);
    }

    public static final class AudioAttributesCompatParcelizer extends getInstanceParameter {
        public AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4, null);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewportHint.Initial(\n            |    presentedItemsBefore=");
            sb.append(getRemoteActionCompatParcelizer());
            sb.append(",\n            |    presentedItemsAfter=");
            sb.append(getWrite());
            sb.append(",\n            |    originalPageOffsetFirst=");
            sb.append(getAudioAttributesCompatParcelizer());
            sb.append(",\n            |    originalPageOffsetLast=");
            sb.append(getRead());
            sb.append(",\n            |)");
            return TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|");
        }
    }

    public static final class IconCompatParcelizer extends getInstanceParameter {
        private final int IconCompatParcelizer;
        private final int write;

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        public final int read() {
            return this.write;
        }

        public IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6, null);
            this.IconCompatParcelizer = i;
            this.write = i2;
        }

        @Override // kotlin.getInstanceParameter
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && this.write == iconCompatParcelizer.write && getRemoteActionCompatParcelizer() == iconCompatParcelizer.getRemoteActionCompatParcelizer() && getWrite() == iconCompatParcelizer.getWrite() && getAudioAttributesCompatParcelizer() == iconCompatParcelizer.getAudioAttributesCompatParcelizer() && getRead() == iconCompatParcelizer.getRead();
        }

        @Override // kotlin.getInstanceParameter
        public final int hashCode() {
            return super.hashCode() + Integer.hashCode(this.IconCompatParcelizer) + Integer.hashCode(this.write);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewportHint.Access(\n            |    pageOffset=");
            sb.append(this.IconCompatParcelizer);
            sb.append(",\n            |    indexInPage=");
            sb.append(this.write);
            sb.append(",\n            |    presentedItemsBefore=");
            sb.append(getRemoteActionCompatParcelizer());
            sb.append(",\n            |    presentedItemsAfter=");
            sb.append(getWrite());
            sb.append(",\n            |    originalPageOffsetFirst=");
            sb.append(getAudioAttributesCompatParcelizer());
            sb.append(",\n            |    originalPageOffsetLast=");
            sb.append(getRead());
            sb.append(",\n            |)");
            return TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|");
        }
    }
}
