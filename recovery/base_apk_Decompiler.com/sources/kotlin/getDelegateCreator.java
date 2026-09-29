package kotlin;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getDelegateCreator;", "", "<init>", "()V", "Lo/canCreateFromBoolean;", "p0", "read", "(Lo/canCreateFromBoolean;)Ljava/lang/Object;", "Lo/canInstantiate;", "p1", "", "IconCompatParcelizer", "(Lo/canInstantiate;Lo/canCreateFromBoolean;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDelegateCreator {
    public static final getDelegateCreator INSTANCE = new getDelegateCreator();

    private getDelegateCreator() {
    }

    public final Object read(canCreateFromBoolean p0) {
        canCreateFromBoolean cancreatefromboolean = p0;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(cancreatefromboolean, 10));
        Iterator<canCreateFromInt> it = cancreatefromboolean.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getRemoteActionCompatParcelizer());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void IconCompatParcelizer(canInstantiate p0, canCreateFromBoolean p1) {
        canCreateFromBoolean cancreatefromboolean = p1;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(cancreatefromboolean, 10));
        Iterator<canCreateFromInt> it = cancreatefromboolean.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getRemoteActionCompatParcelizer());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        p0.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
