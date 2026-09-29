package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getReader;", "", "<init>", "()V", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getReader {
    public static final getReader INSTANCE = new getReader();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getReader$write;", "", "Lo/bufferMapProperty;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;)F", "", "AudioAttributesCompatParcelizer", "()Z", "read", "", "()Ljava/lang/String;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write {
        boolean AudioAttributesCompatParcelizer();

        float RemoteActionCompatParcelizer(bufferMapProperty p0);

        String read();
    }

    private getReader() {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012"}, d2 = {"Lo/getReader$read;", "", "Lo/getReader$write;", "p0", "<init>", "([Lo/getReader$write;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "IconCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "write", "Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final List<write> write;

        public read(write... writeVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (write writeVar : writeVarArr) {
                String str = writeVar.read();
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = (List) new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(writeVar);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    StringBuilder sb = new StringBuilder("'");
                    sb.append(str2);
                    sb.append("' must be unique. Actual [ [");
                    sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(list, null, null, null, 0, null, null, 63));
                    sb.append(']');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) list);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.write = arrayList2;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((write) arrayList2.get(i)).AudioAttributesCompatParcelizer()) {
                    z = true;
                    break;
                }
                i++;
            }
            this.RemoteActionCompatParcelizer = z;
        }

        public final List<write> AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((read) p0).write);
        }

        public final int hashCode() {
            return this.write.hashCode();
        }
    }
}
