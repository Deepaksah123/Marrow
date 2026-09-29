package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\t"}, d2 = {"Lo/DataSourceUtil;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "write", "I", "()I", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataSourceUtil {
    private static final /* synthetic */ DataSourceUtil[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;
    private static DataSourceUtil RemoteActionCompatParcelizer = new DataSourceUtil("ACTIVITY_INACTIVE", 0, 0);
    private static DataSourceUtil IconCompatParcelizer = new DataSourceUtil("ACTIVITY_PAUSE", 1, 1);
    public static final DataSourceUtil read = new DataSourceUtil("ACTIVITY_COMPLETED", 2, 2);

    private DataSourceUtil(String str, int i, int i2) {
        this.read = i2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    static {
        DataSourceUtil[] dataSourceUtilArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer = dataSourceUtilArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(dataSourceUtilArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ DataSourceUtil[] AudioAttributesCompatParcelizer() {
        return new DataSourceUtil[]{RemoteActionCompatParcelizer, IconCompatParcelizer, read};
    }

    public static DataSourceUtil valueOf(String str) {
        return (DataSourceUtil) Enum.valueOf(DataSourceUtil.class, str);
    }

    public static DataSourceUtil[] values() {
        return (DataSourceUtil[]) AudioAttributesCompatParcelizer.clone();
    }
}
