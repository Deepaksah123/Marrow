package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getAnimatingAway;", "", "<init>", "(Ljava/lang/String;I)V", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAnimatingAway {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
    private static final /* synthetic */ getAnimatingAway[] IconCompatParcelizer;
    public static final getAnimatingAway read = new getAnimatingAway("Horizontal", 0);
    public static final getAnimatingAway RemoteActionCompatParcelizer = new getAnimatingAway("Vertical", 1);

    private getAnimatingAway(String str, int i) {
    }

    static {
        getAnimatingAway[] getanimatingawayArrWrite = write();
        IconCompatParcelizer = getanimatingawayArrWrite;
        AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(getanimatingawayArrWrite);
    }

    private static final /* synthetic */ getAnimatingAway[] write() {
        return new getAnimatingAway[]{read, RemoteActionCompatParcelizer};
    }

    public static getAnimatingAway valueOf(String str) {
        return (getAnimatingAway) Enum.valueOf(getAnimatingAway.class, str);
    }

    public static getAnimatingAway[] values() {
        return (getAnimatingAway[]) IconCompatParcelizer.clone();
    }
}
