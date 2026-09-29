package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class registerAudioDeviceCallback extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ ArrayList AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerAudioDeviceCallback(ArrayList arrayList) {
        super(1);
        this.AudioAttributesCompatParcelizer = arrayList;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        List list = (List) obj;
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((List) this.AudioAttributesCompatParcelizer, new newEncryptedObject(((Number) list.get(0)).intValue() + 1, ((Number) list.get(1)).intValue() - 1));
    }
}
