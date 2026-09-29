package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u001e\n\u0013B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d"}, d2 = {"Lo/lambdasetShuffleModeEnabled4;", "", "Lo/getSubscriptionExpiresOn;", "", "Lo/lambdasetShuffleModeEnabled4$write;", "<init>", "()V", "", "p0", "(Ljava/util/Map;)V", "read", "()Ljava/util/Map;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lo/lambdasetShuffleModeEnabled4$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "()Lo/lambdasetShuffleModeEnabled4$AudioAttributesCompatParcelizer;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class lambdasetShuffleModeEnabled4 implements Iterable<Pair<? extends String, ? extends write>>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, write> write;
    public static final lambdasetShuffleModeEnabled4 AudioAttributesCompatParcelizer = new lambdasetShuffleModeEnabled4();

    private lambdasetShuffleModeEnabled4(Map<String, write> map) {
        this.write = map;
    }

    public lambdasetShuffleModeEnabled4() {
        this(VideoTimelineResponseBody.read());
    }

    private boolean write() {
        return this.write.isEmpty();
    }

    public final Map<String, String> read() {
        if (write()) {
            return VideoTimelineResponseBody.read();
        }
        Map<String, write> map = this.write;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, write> entry : map.entrySet()) {
            String strIconCompatParcelizer = entry.getValue().IconCompatParcelizer();
            if (strIconCompatParcelizer != null) {
                linkedHashMap.put(entry.getKey(), strIconCompatParcelizer);
            }
        }
        return linkedHashMap;
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends write>> iterator() {
        Map<String, write> map = this.write;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, write> entry : map.entrySet()) {
            arrayList.add(setAction.write(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final boolean equals(Object p0) {
        if (this != p0) {
            return (p0 instanceof lambdasetShuffleModeEnabled4) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((lambdasetShuffleModeEnabled4) p0).write);
        }
        return true;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(map=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public final AudioAttributesCompatParcelizer IconCompatParcelizer() {
        return new AudioAttributesCompatParcelizer(this);
    }

    public static final class write {
        private final String IconCompatParcelizer;
        private final Object RemoteActionCompatParcelizer;

        public final int hashCode() {
            return 0;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry(value=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", cacheKey=");
            sb.append((Object) this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        private final Map<String, write> read;

        public AudioAttributesCompatParcelizer() {
            this.read = new LinkedHashMap();
        }

        public AudioAttributesCompatParcelizer(lambdasetShuffleModeEnabled4 lambdasetshufflemodeenabled4) {
            toMagicModuleMetaRepoModel.write(lambdasetshufflemodeenabled4, "");
            this.read = VideoTimelineResponseBody.IconCompatParcelizer(lambdasetshufflemodeenabled4.write);
        }

        public final lambdasetShuffleModeEnabled4 AudioAttributesCompatParcelizer() {
            return new lambdasetShuffleModeEnabled4(VideoTimelineResponseBody.AudioAttributesCompatParcelizer(this.read), null);
        }
    }

    public /* synthetic */ lambdasetShuffleModeEnabled4(Map map, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(map);
    }
}
