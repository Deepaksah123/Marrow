package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001au\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0010*\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/PropertyValueAny;", "p2", "Lo/bufferMapProperty;", "p3", "Lo/_reportMissingSetter$write;", "p4", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findPropertyUnwrapper;", "p5", "Lo/_findCustomMapDeserializer;", "p6", "", "p7", "Lo/paramName;", "p8", "Lo/_constructDefaultValueInstantiator;", "IconCompatParcelizer", "(Ljava/lang/String;Lo/deserializeWithObjectId;JLo/bufferMapProperty;Lo/_reportMissingSetter$write;Ljava/util/List;Ljava/util/List;II)Lo/_constructDefaultValueInstantiator;", "Lo/_findCustomBeanDeserializer;", "(Lo/_findCustomBeanDeserializer;JII)Lo/_constructDefaultValueInstantiator;", "", "RemoteActionCompatParcelizer", "(F)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _findCustomMapLikeDeserializer {
    public static final _constructDefaultValueInstantiator IconCompatParcelizer(String str, deserializeWithObjectId deserializewithobjectid, long j, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list2, int i, int i2) {
        return createFromBigDecimal.RemoteActionCompatParcelizer(str, deserializewithobjectid, list, list2, i, i2, j, buffermapproperty, writeVar);
    }

    public static final _constructDefaultValueInstantiator IconCompatParcelizer(_findCustomBeanDeserializer _findcustombeandeserializer, long j, int i, int i2) {
        return createFromBigDecimal.RemoteActionCompatParcelizer(_findcustombeandeserializer, i, i2, j);
    }

    public static final int RemoteActionCompatParcelizer(float f) {
        return (int) Math.ceil(f);
    }
}
