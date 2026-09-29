package com.marrow.data.models.video;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.RenewEligibleCreator;
import kotlin.getMagicModuleMeta;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/marrow/data/models/video/ThemeState;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "", "isDark", "()Z", "getHasMultipleThemes", "hasMultipleThemes", "", "getTheme", "()Ljava/lang/String;", CourseConfigKeyConstantsKt.KEY_THEME, "Companion", "LIGHT_SINGLE", "DARK_SINGLE", "LIGHT_MULTI", "DARK_MULTI"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeState {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ ThemeState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final ThemeState LIGHT_SINGLE = new ThemeState("LIGHT_SINGLE", 0, 0);
    public static final ThemeState DARK_SINGLE = new ThemeState("DARK_SINGLE", 1, 1);
    public static final ThemeState LIGHT_MULTI = new ThemeState("LIGHT_MULTI", 2, 2);
    public static final ThemeState DARK_MULTI = new ThemeState("DARK_MULTI", 3, 3);

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeState.values().length];
            try {
                iArr[ThemeState.LIGHT_SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeState.LIGHT_MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeState.DARK_MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ThemeState.DARK_SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ThemeState(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ThemeState[] themeStateArr$values = $values();
        $VALUES = themeStateArr$values;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(themeStateArr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isDark() {
        return this == DARK_SINGLE || this == DARK_MULTI;
    }

    public final boolean getHasMultipleThemes() {
        return this == LIGHT_MULTI || this == DARK_MULTI;
    }

    public final String getTheme() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return "light";
        }
        if (i == 3 || i == 4) {
            return "dark";
        }
        throw new RenewEligibleCreator();
    }

    private static final /* synthetic */ ThemeState[] $values() {
        return new ThemeState[]{LIGHT_SINGLE, DARK_SINGLE, LIGHT_MULTI, DARK_MULTI};
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/marrow/data/models/video/ThemeState$Companion;", "", "<init>", "()V", "Lcom/marrow/data/models/video/ThemeState;", "p0", "", "fromThemeState", "(Lcom/marrow/data/models/video/ThemeState;)I", "toThemeState", "(Ljava/lang/Integer;)Lcom/marrow/data/models/video/ThemeState;", "toggleTheme", "(Lcom/marrow/data/models/video/ThemeState;)Lcom/marrow/data/models/video/ThemeState;", "", "", "p1", "getThemeState", "(Ljava/lang/String;Ljava/util/List;)Lcom/marrow/data/models/video/ThemeState;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ThemeState.values().length];
                try {
                    iArr[ThemeState.DARK_MULTI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ThemeState.LIGHT_MULTI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final int fromThemeState(ThemeState p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getValue();
        }

        @getMagicModuleMeta
        public final ThemeState toThemeState(Integer p0) {
            ThemeState next;
            Iterator<ThemeState> it = ThemeState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int value = next.getValue();
                if (p0 != null && value == p0.intValue()) {
                    break;
                }
            }
            ThemeState themeState = next;
            return themeState == null ? ThemeState.LIGHT_SINGLE : themeState;
        }

        @getMagicModuleMeta
        public final ThemeState toggleTheme(ThemeState p0) {
            int i = p0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
            if (i == 1) {
                return ThemeState.LIGHT_MULTI;
            }
            if (i == 2) {
                return ThemeState.DARK_MULTI;
            }
            return ThemeState.LIGHT_SINGLE;
        }

        public final ThemeState getThemeState(String p0, List<String> p1) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "light")) {
                List<String> list = p1;
                if (list == null || list.isEmpty() || p1.size() == 1) {
                    return ThemeState.LIGHT_SINGLE;
                }
                return ThemeState.LIGHT_MULTI;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "dark")) {
                List<String> list2 = p1;
                if (list2 == null || list2.isEmpty() || p1.size() == 1) {
                    return ThemeState.DARK_SINGLE;
                }
                return ThemeState.DARK_MULTI;
            }
            return ThemeState.LIGHT_SINGLE;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static getMagicModuleSavedMcqCount<ThemeState> getEntries() {
        return $ENTRIES;
    }

    @getMagicModuleMeta
    public static final ThemeState toThemeState(Integer num) {
        return INSTANCE.toThemeState(num);
    }

    @getMagicModuleMeta
    public static final ThemeState toggleTheme(ThemeState themeState) {
        return INSTANCE.toggleTheme(themeState);
    }

    public static ThemeState valueOf(String str) {
        return (ThemeState) Enum.valueOf(ThemeState.class, str);
    }

    public static ThemeState[] values() {
        return (ThemeState[]) $VALUES.clone();
    }
}
