package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CryptoException extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ newNoDataInstance IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoException(newNoDataInstance newnodatainstance) {
        super(1);
        this.IconCompatParcelizer = newnodatainstance;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        newNoDataInstance newnodatainstance = this.IconCompatParcelizer;
        List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
        if (_isNaN.checkSelfPermission(newnodatainstance.read, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            listIconCompatParcelizer.add(getWritableDatabase.IconCompatParcelizer);
        }
        if (_isNaN.checkSelfPermission(newnodatainstance.read, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            listIconCompatParcelizer.add(getPcmEncodingForType.AudioAttributesCompatParcelizer);
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer);
    }
}
