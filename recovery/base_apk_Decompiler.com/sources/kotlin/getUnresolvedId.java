package kotlin;

import android.os.LocaleList;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0013"}, d2 = {"Lo/getUnresolvedId;", "Lo/canCreateFromLong;", "<init>", "()V", "", "p0", "Ljava/util/Locale;", "Lo/write;", "write", "(Ljava/lang/String;)Ljava/util/Locale;", "Landroid/os/LocaleList;", "read", "Landroid/os/LocaleList;", "Lo/canCreateFromBoolean;", "RemoteActionCompatParcelizer", "Lo/canCreateFromBoolean;", "Lo/createUsingDelegate;", "Lo/createUsingDelegate;", "IconCompatParcelizer", "()Lo/canCreateFromBoolean;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getUnresolvedId implements canCreateFromLong {
    private canCreateFromBoolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private LocaleList write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final createUsingDelegate IconCompatParcelizer = new createUsingDelegate();

    @Override // kotlin.canCreateFromLong
    public final canCreateFromBoolean write() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.IconCompatParcelizer) {
            canCreateFromBoolean cancreatefromboolean = this.RemoteActionCompatParcelizer;
            if (cancreatefromboolean != null && localeList == this.write) {
                return cancreatefromboolean;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new canCreateFromInt(localeList.get(i)));
            }
            canCreateFromBoolean cancreatefromboolean2 = new canCreateFromBoolean(arrayList);
            this.write = localeList;
            this.RemoteActionCompatParcelizer = cancreatefromboolean2;
            return cancreatefromboolean2;
        }
    }

    @Override // kotlin.canCreateFromLong
    public final Locale write(String p0) {
        Locale localeForLanguageTag = Locale.forLanguageTag(p0);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) localeForLanguageTag.toLanguageTag(), (Object) C.LANGUAGE_UNDETERMINED)) {
            String unused = canCreateFromBigDecimal.RemoteActionCompatParcelizer;
        }
        return localeForLanguageTag;
    }
}
