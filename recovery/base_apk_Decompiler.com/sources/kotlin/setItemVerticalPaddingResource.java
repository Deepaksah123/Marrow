package kotlin;

import android.app.UiModeManager;
import android.content.Context;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.AppThemeManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/setItemVerticalPaddingResource;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/marrow/designsystem/theme/AppTheme;", "read", "(Landroid/content/Context;)Lcom/marrow/designsystem/theme/AppTheme;", "", "(Ljava/lang/String;)Lcom/marrow/designsystem/theme/AppTheme;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Z", "p1", "p2", "", "(Landroid/content/Context;Lcom/marrow/designsystem/theme/AppTheme;Z)V", "IconCompatParcelizer", "(Landroid/content/Context;Lcom/marrow/designsystem/theme/AppTheme;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setItemVerticalPaddingResource {
    public static final setItemVerticalPaddingResource INSTANCE = new setItemVerticalPaddingResource();

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[AppTheme.values().length];
            try {
                iArr[AppTheme.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private setItemVerticalPaddingResource() {
    }

    @getMagicModuleMeta
    public static final AppTheme read(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object systemService = p0.getSystemService("uimode");
        toMagicModuleMetaRepoModel.read(systemService, "");
        if (((UiModeManager) systemService).getNightMode() == 2) {
            return AppTheme.read;
        }
        return AppTheme.RemoteActionCompatParcelizer;
    }

    public static AppTheme read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String read = AppTheme.RemoteActionCompatParcelizer.getRead();
        StringBuilder sb = new StringBuilder();
        sb.append(read);
        sb.append("+.Regular");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb.toString())) {
            String read2 = AppTheme.RemoteActionCompatParcelizer.getRead();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(read2);
            sb2.append("+.Large");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb2.toString())) {
                String read3 = AppTheme.read.getRead();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(read3);
                sb3.append("+.Regular");
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb3.toString())) {
                    String read4 = AppTheme.read.getRead();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(read4);
                    sb4.append("+.Large");
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb4.toString())) {
                        String read5 = AppTheme.AudioAttributesCompatParcelizer.getRead();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(read5);
                        sb5.append("+.Regular");
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb5.toString())) {
                            String read6 = AppTheme.AudioAttributesCompatParcelizer.getRead();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(read6);
                            sb6.append("+.Large");
                            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb6.toString())) {
                                return AppTheme.RemoteActionCompatParcelizer;
                            }
                        }
                        return AppTheme.RemoteActionCompatParcelizer;
                    }
                }
                return AppTheme.read;
            }
        }
        return AppTheme.RemoteActionCompatParcelizer;
    }

    public static boolean RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String read = AppTheme.AudioAttributesCompatParcelizer.getRead();
        StringBuilder sb = new StringBuilder();
        sb.append(read);
        sb.append("+.Regular");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb.toString())) {
            return true;
        }
        String read2 = AppTheme.AudioAttributesCompatParcelizer.getRead();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(read2);
        sb2.append("+.Large");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) sb2.toString());
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Context p0, AppTheme p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        IconCompatParcelizer(p0, p1);
        AppThemeManager.RemoteActionCompatParcelizer(p2);
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(Context p0, AppTheme p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (IconCompatParcelizer.IconCompatParcelizer[p1.ordinal()] == 1) {
            AppThemeManager.write(true);
            p1 = read(p0);
        } else {
            AppThemeManager.write(false);
        }
        AppThemeManager.AudioAttributesCompatParcelizer(p1);
    }
}
