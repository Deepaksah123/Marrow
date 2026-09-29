package kotlin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012"}, d2 = {"Lo/hasMixIns;", "", "<init>", "()V", "", "p0", "Lo/POJOPropertyBuilderWithMember;", "p1", "", "read", "(Ljava/lang/String;Lo/POJOPropertyBuilderWithMember;)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lo/POJOPropertyBuilderWithMember;", "", "AudioAttributesCompatParcelizer", "()Ljava/util/Set;", "IconCompatParcelizer", "", "Ljava/util/Map;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class hasMixIns {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, POJOPropertyBuilderWithMember> write = new LinkedHashMap();

    public final void read(String p0, POJOPropertyBuilderWithMember p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        POJOPropertyBuilderWithMember pOJOPropertyBuilderWithMemberPut = this.write.put(p0, p1);
        if (pOJOPropertyBuilderWithMemberPut != null) {
            pOJOPropertyBuilderWithMemberPut.RemoteActionCompatParcelizer();
        }
    }

    public final POJOPropertyBuilderWithMember RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.get(p0);
    }

    public final Set<String> AudioAttributesCompatParcelizer() {
        return new HashSet(this.write.keySet());
    }

    public final void IconCompatParcelizer() {
        Iterator<POJOPropertyBuilderWithMember> it = this.write.values().iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer();
        }
        this.write.clear();
    }
}
