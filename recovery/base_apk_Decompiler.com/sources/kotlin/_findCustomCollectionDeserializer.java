package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aY\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "p0", "Lo/deserializeWithObjectId;", "p1", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "p2", "Lo/bufferMapProperty;", "p3", "Lo/_reportMissingSetter$write;", "p4", "Lo/_findCustomMapDeserializer;", "p5", "Lo/_findCustomBeanDeserializer;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/deserializeWithObjectId;Ljava/util/List;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;Ljava/util/List;)Lo/_findCustomBeanDeserializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _findCustomCollectionDeserializer {
    public static /* synthetic */ _findCustomBeanDeserializer RemoteActionCompatParcelizer$default(String str, deserializeWithObjectId deserializewithobjectid, List list, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, List list2, int i, Object obj) {
        if ((i & 32) != 0) {
            list2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return RemoteActionCompatParcelizer(str, deserializewithobjectid, list, buffermapproperty, writeVar, list2);
    }

    public static final _findCustomBeanDeserializer RemoteActionCompatParcelizer(String str, deserializeWithObjectId deserializewithobjectid, List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list2) {
        return createFromBoolean.read(str, deserializewithobjectid, list, list2, buffermapproperty, writeVar);
    }
}
