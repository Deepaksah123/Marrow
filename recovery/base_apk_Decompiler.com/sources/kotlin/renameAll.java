package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lo/renameAll;", "", "", "p0", "<init>", "(I)V", "", "write", "(Lo/renameAll;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class renameAll {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final renameAll IconCompatParcelizer = new renameAll(0);
    private static final renameAll write = new renameAll(1);
    private static final renameAll read = new renameAll(2);

    public renameAll(int i) {
        this.write = i;
    }

    public final int write() {
        return this.write;
    }

    /* JADX INFO: renamed from: o.renameAll$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\u000b"}, d2 = {"Lo/renameAll$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "Lo/renameAll;", "p0", "IconCompatParcelizer", "(Ljava/util/List;)Lo/renameAll;", "Lo/renameAll;", "write", "()Lo/renameAll;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final renameAll write() {
            return renameAll.IconCompatParcelizer;
        }

        public final renameAll AudioAttributesCompatParcelizer() {
            return renameAll.write;
        }

        public final renameAll RemoteActionCompatParcelizer() {
            return renameAll.read;
        }

        public final renameAll IconCompatParcelizer(List<renameAll> p0) {
            int iValueOf = 0;
            int size = p0.size();
            for (int i = 0; i < size; i++) {
                iValueOf = Integer.valueOf(iValueOf.intValue() | p0.get(i).write());
            }
            return new renameAll(iValueOf.intValue());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean write(renameAll p0) {
        int i = this.write;
        return (p0.write | i) == i;
    }

    public final String toString() {
        if (this.write == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.write & write.write) != 0) {
            arrayList.add("Underline");
        }
        if ((this.write & read.write) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            StringBuilder sb = new StringBuilder("TextDecoration.");
            sb.append((String) arrayList.get(0));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("TextDecoration[");
        sb2.append(ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(arrayList, ", ", null, null, 0, null, null, 62, null));
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof renameAll) && this.write == ((renameAll) p0).write;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getWrite() {
        return this.write;
    }
}
