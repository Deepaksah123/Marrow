package kotlin;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdagetAgeBasedEvictionFunction1 implements lambdagetMaxCountEvictionFunction0 {
    private final Context IconCompatParcelizer;

    @setSdkPayload
    public lambdagetAgeBasedEvictionFunction1(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = context;
    }

    @Override // kotlin.lambdagetMaxCountEvictionFunction0
    public final Object AudioAttributesCompatParcelizer(int i) {
        String string = this.IconCompatParcelizer.getString(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // kotlin.lambdagetMaxCountEvictionFunction0
    public final Object IconCompatParcelizer(int i, Object[] objArr) {
        String string = this.IconCompatParcelizer.getString(i, Arrays.copyOf(objArr, objArr.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
