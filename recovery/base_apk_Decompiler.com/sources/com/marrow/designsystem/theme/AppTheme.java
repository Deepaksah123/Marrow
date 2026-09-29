package com.marrow.designsystem.theme;

import java.util.Iterator;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\rj\u0002\b\u000bj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/marrow/designsystem/theme/AppTheme;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "read", "Companion", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppTheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ AppTheme[] MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String read;
    public static final AppTheme RemoteActionCompatParcelizer = new AppTheme("LIGHT", 0, "AppTheme.Light");
    public static final AppTheme read = new AppTheme("DARK", 1, "AppTheme.Dark");
    public static final AppTheme AudioAttributesCompatParcelizer = new AppTheme("SEPIA", 2, "AppTheme.Sepia");
    public static final AppTheme write = new AppTheme("SYSTEM", 3, "AppTheme.System");

    private AppTheme(String str, int i, String str2) {
        this.read = str2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    static {
        AppTheme[] appThemeArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        MediaBrowserCompatItemReceiver = appThemeArrAudioAttributesCompatParcelizer;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(appThemeArrAudioAttributesCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/designsystem/theme/AppTheme$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/designsystem/theme/AppTheme;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lcom/marrow/designsystem/theme/AppTheme;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static AppTheme RemoteActionCompatParcelizer(String p0) {
            AppTheme next;
            toMagicModuleMetaRepoModel.write(p0, "");
            Iterator<AppTheme> it = AppTheme.read().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) next.getRead(), (Object) p0)) {
                    break;
                }
            }
            AppTheme appTheme = next;
            return appTheme == null ? AppTheme.RemoteActionCompatParcelizer : appTheme;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.read;
    }

    private static final /* synthetic */ AppTheme[] AudioAttributesCompatParcelizer() {
        return new AppTheme[]{RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer, write};
    }

    @getMagicModuleMeta
    public static final AppTheme write(String str) {
        return Companion.RemoteActionCompatParcelizer(str);
    }

    public static getMagicModuleSavedMcqCount<AppTheme> read() {
        return IconCompatParcelizer;
    }

    public static AppTheme valueOf(String str) {
        return (AppTheme) Enum.valueOf(AppTheme.class, str);
    }

    public static AppTheme[] values() {
        return (AppTheme[]) MediaBrowserCompatItemReceiver.clone();
    }
}
