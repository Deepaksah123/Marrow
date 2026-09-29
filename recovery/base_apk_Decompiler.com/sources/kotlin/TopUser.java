package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a"}, d2 = {"Lo/TopUser;", "Lo/NotesDispatchAddressRequest;", "", "Lo/getUnderrunThreshold;", "", "p0", "<init>", "(J)V", "toString", "()Ljava/lang/String;", "Lo/CurrentQuery;", "write", "(Lo/CurrentQuery;)Ljava/lang/String;", "p1", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "J", "()J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TopUser extends getUnderrunThreshold implements NotesDispatchAddressRequest<String> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    @Override // kotlin.NotesDispatchAddressRequest
    public final /* synthetic */ void RemoteActionCompatParcelizer(String str) {
        AudioAttributesCompatParcelizer(str);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    public TopUser(long j) {
        super(INSTANCE);
        this.read = j;
    }

    /* JADX INFO: renamed from: o.TopUser$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/TopUser$read;", "Lo/CurrentQuery$IconCompatParcelizer;", "Lo/TopUser;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<TopUser> {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineId(");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.NotesDispatchAddressRequest
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public String read(CurrentQuery p0) {
        String write;
        isScoreStatsAvailable isscorestatsavailable = (isScoreStatsAvailable) p0.get(isScoreStatsAvailable.INSTANCE);
        if (isscorestatsavailable == null || (write = isscorestatsavailable.getWrite()) == null) {
            write = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iWrite = TestGroupLSModel.write(name, " @", 0, 6);
        if (iWrite < 0) {
            iWrite = name.length();
        }
        StringBuilder sb = new StringBuilder(write.length() + iWrite + 10);
        String strSubstring = name.substring(0, iWrite);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(write);
        sb.append('#');
        sb.append(this.read);
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        threadCurrentThread.setName(string);
        return name;
    }

    private static void AudioAttributesCompatParcelizer(String str) {
        Thread.currentThread().setName(str);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof TopUser) && this.read == ((TopUser) p0).read;
    }

    public final int hashCode() {
        return Long.hashCode(this.read);
    }
}
