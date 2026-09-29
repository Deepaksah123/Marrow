package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class _findPrimitive {
    public final Object AudioAttributesCompatParcelizer;
    public final collectAndResolveSubtypesByTypeId IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final buildIteratorSerializer[] read;
    public final _verifyAndResolvePlaceholders[] write;

    public _findPrimitive(buildIteratorSerializer[] builditeratorserializerArr, _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeid, Object obj) {
        buildTypeSerializer.IconCompatParcelizer(builditeratorserializerArr.length == _verifyandresolveplaceholdersArr.length);
        this.read = builditeratorserializerArr;
        this.write = (_verifyAndResolvePlaceholders[]) _verifyandresolveplaceholdersArr.clone();
        this.IconCompatParcelizer = collectandresolvesubtypesbytypeid;
        this.AudioAttributesCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = builditeratorserializerArr.length;
    }

    public final boolean IconCompatParcelizer(int i) {
        return this.read[i] != null;
    }

    public final boolean RemoteActionCompatParcelizer(_findPrimitive _findprimitive) {
        if (_findprimitive == null || _findprimitive.write.length != this.write.length) {
            return false;
        }
        for (int i = 0; i < this.write.length; i++) {
            if (!AudioAttributesCompatParcelizer(_findprimitive, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(_findPrimitive _findprimitive, int i) {
        return _findprimitive != null && LaissezFaireSubTypeValidator.read(this.read[i], _findprimitive.read[i]) && LaissezFaireSubTypeValidator.read(this.write[i], _findprimitive.write[i]);
    }
}
