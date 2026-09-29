package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lo/copyYearItem;", "Lo/setSubmissionTimestamp;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;III)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "IconCompatParcelizer", "()I", "mask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class copyYearItem implements setSubmissionTimestamp {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ copyYearItem[] $VALUES;
    public static final copyYearItem CANON_EQ;
    public static final copyYearItem COMMENTS;
    public static final copyYearItem DOT_MATCHES_ALL;
    public static final copyYearItem IGNORE_CASE;
    public static final copyYearItem LITERAL;
    public static final copyYearItem MULTILINE;
    public static final copyYearItem UNIX_LINES;
    private final int mask;
    private final int value;

    private copyYearItem(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }

    /* synthetic */ copyYearItem(String str, int i, int i2, int i3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }

    @Override // kotlin.setSubmissionTimestamp
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    static {
        int i = 2;
        IGNORE_CASE = new copyYearItem("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 0;
        int i3 = 2;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        MULTILINE = new copyYearItem("MULTILINE", 1, 8, i2, i3, magicModuleRepositoryImplExternalSyntheticLambda0);
        int i4 = 0;
        int i5 = 2;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda02 = null;
        LITERAL = new copyYearItem("LITERAL", i, 16, i4, i5, magicModuleRepositoryImplExternalSyntheticLambda02);
        UNIX_LINES = new copyYearItem("UNIX_LINES", 3, 1, i2, i3, magicModuleRepositoryImplExternalSyntheticLambda0);
        COMMENTS = new copyYearItem("COMMENTS", 4, 4, i4, i5, magicModuleRepositoryImplExternalSyntheticLambda02);
        DOT_MATCHES_ALL = new copyYearItem("DOT_MATCHES_ALL", 5, 32, i2, i3, magicModuleRepositoryImplExternalSyntheticLambda0);
        CANON_EQ = new copyYearItem("CANON_EQ", 6, 128, i4, i5, magicModuleRepositoryImplExternalSyntheticLambda02);
        copyYearItem[] copyyearitemArrWrite = write();
        $VALUES = copyyearitemArrWrite;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(copyyearitemArrWrite);
    }

    private static final /* synthetic */ copyYearItem[] write() {
        return new copyYearItem[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static copyYearItem valueOf(String str) {
        return (copyYearItem) Enum.valueOf(copyYearItem.class, str);
    }

    public static copyYearItem[] values() {
        return (copyYearItem[]) $VALUES.clone();
    }
}
