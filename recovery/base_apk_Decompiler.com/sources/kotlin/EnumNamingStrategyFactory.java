package kotlin;

import android.text.Editable;

/* JADX INFO: loaded from: classes2.dex */
final class EnumNamingStrategyFactory extends Editable.Factory {
    private static volatile Editable.Factory IconCompatParcelizer;
    private static Class<?> RemoteActionCompatParcelizer;
    private static final Object read = new Object();

    private EnumNamingStrategyFactory() {
        try {
            RemoteActionCompatParcelizer = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory write() {
        if (IconCompatParcelizer == null) {
            synchronized (read) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new EnumNamingStrategyFactory();
                }
            }
        }
        return IconCompatParcelizer;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = RemoteActionCompatParcelizer;
        if (cls != null) {
            return _isCglibGetCallbacks.IconCompatParcelizer(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
