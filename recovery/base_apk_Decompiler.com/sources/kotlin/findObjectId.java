package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t"}, d2 = {"Lo/_handleOddName;", "Lo/extractScalarFromObject;", "p0", "", "p1", "read", "(Lo/_handleOddName;Lo/extractScalarFromObject;Z)Lo/_handleOddName;", "Lo/addKeyDeserializers;", "p2", "(Lo/_handleOddName;Lo/extractScalarFromObject;ZLo/addKeyDeserializers;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findObjectId {
    public static /* synthetic */ _handleOddName read$default(_handleOddName _handleoddname, extractScalarFromObject extractscalarfromobject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return read(_handleoddname, extractscalarfromobject, z);
    }

    public static final _handleOddName read(_handleOddName _handleoddname, extractScalarFromObject extractscalarfromobject, boolean z) {
        return _handleoddname.AudioAttributesCompatParcelizer(new deserializerInstance(extractscalarfromobject, z));
    }

    public static final _handleOddName read(_handleOddName _handleoddname, extractScalarFromObject extractscalarfromobject, boolean z, addKeyDeserializers addkeydeserializers) {
        return _handleoddname.AudioAttributesCompatParcelizer(new handleUnknownTypeId(extractscalarfromobject, z, addkeydeserializers));
    }
}
