package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroid/os/Handler;", "", "p0", "Lo/setAddressLine1;", "write", "(Landroid/os/Handler;Ljava/lang/String;)Lo/setAddressLine1;", "Landroid/os/Looper;", "", "read", "(Landroid/os/Looper;)Landroid/os/Handler;", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDisplayAddress {
    private static volatile Choreographer choreographer;

    public static final setAddressLine1 write(Handler handler, String str) {
        return new getNationalNumber(handler, str);
    }

    public static final Handler read(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        toMagicModuleMetaRepoModel.read(objInvoke, "");
        return (Handler) objInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(new getNationalNumber(read(Looper.getMainLooper()), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
    }
}
