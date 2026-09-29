package kotlin;

import java.util.List;
import java.util.Locale;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0005\u0010\u0014\"\u0018\u0010\u0005\u001a\u00020\u0015*\u00020\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/withCaseInsensitivity;", "p0", "Lo/canCreateFromBoolean;", "p1", "", "read", "(ILo/canCreateFromBoolean;)I", "", "Lo/deserializeWithObjectId;", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "p2", "Lo/_findCustomMapDeserializer;", "p3", "Lo/bufferMapProperty;", "p4", "Lo/_reportMissingSetter$write;", "p5", "Lo/_findCustomBeanDeserializer;", "(Ljava/lang/String;Lo/deserializeWithObjectId;Ljava/util/List;Ljava/util/List;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;)Lo/_findCustomBeanDeserializer;", "", "IconCompatParcelizer", "(Lo/deserializeWithObjectId;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class createFromBoolean {
    public static final int read(int i, canCreateFromBoolean cancreatefromboolean) {
        Locale remoteActionCompatParcelizer;
        if (withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.AudioAttributesCompatParcelizer())) {
            return 2;
        }
        if (withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.RemoteActionCompatParcelizer())) {
            return 3;
        }
        if (withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.write())) {
            return 0;
        }
        if (withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.read())) {
            return 1;
        }
        if (withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.IconCompatParcelizer()) || withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            if (cancreatefromboolean == null || (remoteActionCompatParcelizer = cancreatefromboolean.read(0).getRemoteActionCompatParcelizer()) == null) {
                remoteActionCompatParcelizer = Locale.getDefault();
            }
            int iIconCompatParcelizer = configureFromBooleanCreator.IconCompatParcelizer(remoteActionCompatParcelizer);
            return (iIconCompatParcelizer == 0 || iIconCompatParcelizer != 1) ? 2 : 3;
        }
        throw new IllegalStateException("Invalid TextDirection.".toString());
    }

    public static final _findCustomBeanDeserializer read(String str, deserializeWithObjectId deserializewithobjectid, List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list2, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar) {
        return new canCreateUsingArrayDelegate(str, deserializewithobjectid, list, list2, writeVar, buffermapproperty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(deserializeWithObjectId deserializewithobjectid) {
        _findCustomTreeNodeDeserializer remoteActionCompatParcelizer;
        _getSetterInfo write = deserializewithobjectid.getWrite();
        return !(((write == null || (remoteActionCompatParcelizer = write.getRemoteActionCompatParcelizer()) == null) ? null : _deserializeIfNatural.IconCompatParcelizer(remoteActionCompatParcelizer.getRead())) == null ? false : _deserializeIfNatural.read(r1.getWrite(), _deserializeIfNatural.INSTANCE.read()));
    }
}
