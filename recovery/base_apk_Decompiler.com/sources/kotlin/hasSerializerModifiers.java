package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000b"}, d2 = {"Lo/_findCustomReferenceDeserializer;", "p0", "Lo/_findCustomTreeNodeDeserializer;", "p1", "Lo/_getSetterInfo;", "AudioAttributesCompatParcelizer", "(Lo/_findCustomReferenceDeserializer;Lo/_findCustomTreeNodeDeserializer;)Lo/_getSetterInfo;", "", "p2", "IconCompatParcelizer", "(Lo/_findCustomTreeNodeDeserializer;Lo/_findCustomTreeNodeDeserializer;F)Lo/_findCustomTreeNodeDeserializer;", "(Lo/_findCustomReferenceDeserializer;Lo/_findCustomReferenceDeserializer;F)Lo/_findCustomReferenceDeserializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hasSerializerModifiers {
    public static final _findCustomReferenceDeserializer AudioAttributesCompatParcelizer(_findCustomReferenceDeserializer _findcustomreferencedeserializer, _findCustomReferenceDeserializer _findcustomreferencedeserializer2, float f) {
        return _findcustomreferencedeserializer;
    }

    public static final _getSetterInfo AudioAttributesCompatParcelizer(_findCustomReferenceDeserializer _findcustomreferencedeserializer, _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer) {
        return new _getSetterInfo(_findcustomreferencedeserializer, _findcustomtreenodedeserializer);
    }

    public static final _findCustomTreeNodeDeserializer IconCompatParcelizer(_findCustomTreeNodeDeserializer _findcustomtreenodedeserializer, _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer2, float f) {
        return _findcustomtreenodedeserializer.getRemoteActionCompatParcelizer() == _findcustomtreenodedeserializer2.getRemoteActionCompatParcelizer() ? _findcustomtreenodedeserializer : new _findCustomTreeNodeDeserializer(((_deserializeIfNatural) _convertObjectId.IconCompatParcelizer(_deserializeIfNatural.IconCompatParcelizer(_findcustomtreenodedeserializer.getRead()), _deserializeIfNatural.IconCompatParcelizer(_findcustomtreenodedeserializer2.getRead()), f)).getWrite(), ((Boolean) _convertObjectId.IconCompatParcelizer(Boolean.valueOf(_findcustomtreenodedeserializer.getRemoteActionCompatParcelizer()), Boolean.valueOf(_findcustomtreenodedeserializer2.getRemoteActionCompatParcelizer()), f)).booleanValue(), null);
    }
}
