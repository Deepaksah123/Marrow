package kotlin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0007\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ\u0011\u0010\f\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/getSubMesh;", "", "<init>", "()V", "Ljava/util/Calendar;", "", "p0", "write", "(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;", "", "AudioAttributesCompatParcelizer", "(Ljava/util/Calendar;)Z", "RemoteActionCompatParcelizer", "", "read", "(J)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSubMesh {
    public static final getSubMesh INSTANCE = new getSubMesh();

    private getSubMesh() {
    }

    public static String write(Calendar calendar, String str) {
        toMagicModuleMetaRepoModel.write(calendar, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = new SimpleDateFormat(str, Locale.getDefault()).format(calendar.getTime());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        return str2;
    }

    public static boolean AudioAttributesCompatParcelizer(Calendar calendar) {
        toMagicModuleMetaRepoModel.write(calendar, "");
        Calendar calendar2 = Calendar.getInstance();
        return calendar2.get(0) == calendar.get(0) && calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6);
    }

    public static boolean write(Calendar calendar) {
        toMagicModuleMetaRepoModel.write(calendar, "");
        Calendar calendar2 = Calendar.getInstance();
        return calendar2.get(0) == calendar.get(0) && calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2);
    }

    public static boolean RemoteActionCompatParcelizer(Calendar calendar) {
        toMagicModuleMetaRepoModel.write(calendar, "");
        return calendar.after(Calendar.getInstance());
    }

    public static String read(long p0) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(p0);
        return String.valueOf(calendar.get(1));
    }
}
