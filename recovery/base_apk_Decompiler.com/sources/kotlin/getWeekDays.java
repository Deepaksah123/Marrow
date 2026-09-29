package kotlin;

import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"Lo/getWeekDays;", "", "<init>", "()V", "Lo/getMonthName;", "p0", "", "read", "(Lo/getMonthName;)Ljava/lang/String;", "Lo/getWeekDays$IconCompatParcelizer;", "IconCompatParcelizer", "(Lo/getMonthName;)Lo/getWeekDays$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "Lo/getWeekDays$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class getWeekDays {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static IconCompatParcelizer write;
    public static final getWeekDays INSTANCE = new getWeekDays();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null, null, null);

    static final class IconCompatParcelizer {
        public final Method AudioAttributesCompatParcelizer;
        public final Method IconCompatParcelizer;
        public final Method RemoteActionCompatParcelizer;

        public IconCompatParcelizer(Method method, Method method2, Method method3) {
            this.AudioAttributesCompatParcelizer = method;
            this.IconCompatParcelizer = method2;
            this.RemoteActionCompatParcelizer = method3;
        }
    }

    private getWeekDays() {
    }

    public static String read(getMonthName p0) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer IconCompatParcelizer2 = write;
        if (IconCompatParcelizer2 == null) {
            IconCompatParcelizer2 = IconCompatParcelizer(p0);
        }
        if (IconCompatParcelizer2 != IconCompatParcelizer && (method = IconCompatParcelizer2.AudioAttributesCompatParcelizer) != null && (objInvoke = method.invoke(p0.getClass(), new Object[0])) != null && (method2 = IconCompatParcelizer2.IconCompatParcelizer) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = IconCompatParcelizer2.RemoteActionCompatParcelizer;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }

    private static IconCompatParcelizer IconCompatParcelizer(getMonthName p0) {
        try {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(Class.class.getDeclaredMethod("getModule", new Class[0]), p0.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), p0.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            write = iconCompatParcelizer;
            return iconCompatParcelizer;
        } catch (Exception unused) {
            IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer;
            write = iconCompatParcelizer2;
            return iconCompatParcelizer2;
        }
    }
}
