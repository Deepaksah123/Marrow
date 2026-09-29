package kotlin;

import android.content.Context;
import com.marrow.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\f"}, d2 = {"Lo/DefaultTimeBarExternalSyntheticLambda0;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;", "p3", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultTimeBarExternalSyntheticLambda0 {
    public static final DefaultTimeBarExternalSyntheticLambda0 INSTANCE = new DefaultTimeBarExternalSyntheticLambda0();

    private DefaultTimeBarExternalSyntheticLambda0() {
    }

    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(Context p0, int p1, Object... p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        String[] stringArray = p0.getResources().getStringArray(p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stringArray, "");
        String str = stringArray[0];
        if (p2.length != 0) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            Locale locale = Locale.getDefault();
            toMagicModuleMetaRepoModel.write((Object) str);
            Object[] objArrCopyOf = Arrays.copyOf(p2, p2.length);
            String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            return str2;
        }
        toMagicModuleMetaRepoModel.write((Object) str);
        return str;
    }

    @getMagicModuleMeta
    public static final String IconCompatParcelizer(Context context, int i, Object... objArr) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(objArr, "");
        String[] stringArray = context.getResources().getStringArray(R.array.video_sorting_options);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stringArray, "");
        String str = stringArray[i];
        int length = objArr.length;
        toMagicModuleMetaRepoModel.write((Object) str);
        return str;
    }
}
