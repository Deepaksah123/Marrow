package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getMaxSupportedChannelCountForPassthrough extends MagicModuleUseCase implements getAnswerMap {
    public static final getMaxSupportedChannelCountForPassthrough IconCompatParcelizer = new getMaxSupportedChannelCountForPassthrough();

    public getMaxSupportedChannelCountForPassthrough() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        List list = (List) obj;
        String str = (String) ((Pair) list.get(0)).RemoteActionCompatParcelizer();
        Pair pair = (Pair) list.get(1);
        String str2 = (String) pair.RemoteActionCompatParcelizer();
        int iIntValue = ((Number) pair.read()).intValue();
        if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str) && TestGroupLSModel.IconCompatParcelizer((CharSequence) str2)) {
            return Integer.valueOf(iIntValue);
        }
        return null;
    }
}
