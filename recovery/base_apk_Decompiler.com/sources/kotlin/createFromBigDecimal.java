package kotlin;

import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aq\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0018"}, d2 = {"", "p0", "Lo/deserializeWithObjectId;", "p1", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "p2", "Lo/_findCustomMapDeserializer;", "p3", "", "p4", "Lo/paramName;", "p5", "Lo/PropertyValueAny;", "p6", "Lo/bufferMapProperty;", "p7", "Lo/_reportMissingSetter$write;", "p8", "Lo/_constructDefaultValueInstantiator;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/deserializeWithObjectId;Ljava/util/List;Ljava/util/List;IIJLo/bufferMapProperty;Lo/_reportMissingSetter$write;)Lo/_constructDefaultValueInstantiator;", "Lo/_findCustomBeanDeserializer;", "(Lo/_findCustomBeanDeserializer;IIJ)Lo/_constructDefaultValueInstantiator;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class createFromBigDecimal {
    public static final _constructDefaultValueInstantiator RemoteActionCompatParcelizer(String str, deserializeWithObjectId deserializewithobjectid, List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list2, int i, int i2, long j, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar) {
        return new hasKeySerializers(new canCreateUsingArrayDelegate(str, deserializewithobjectid, list, list2, writeVar, buffermapproperty), i, i2, j, null);
    }

    public static final _constructDefaultValueInstantiator RemoteActionCompatParcelizer(_findCustomBeanDeserializer _findcustombeandeserializer, int i, int i2, long j) {
        toMagicModuleMetaRepoModel.read(_findcustombeandeserializer, "");
        return new hasKeySerializers((canCreateUsingArrayDelegate) _findcustombeandeserializer, i, i2, j, null);
    }
}
