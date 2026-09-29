package kotlin;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/EpoxyRecyclerViewWithModelsController;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/getSpanCount;", "p1", "Landroid/view/textclassifier/TextClassifier;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/getSpanCount;)Landroid/view/textclassifier/TextClassifier;", "Lo/canCreateFromBoolean;", "Landroid/os/LocaleList;", "write", "(Lo/canCreateFromBoolean;)Landroid/os/LocaleList;", "Landroid/view/textclassifier/TextClassification;", "", "RemoteActionCompatParcelizer", "(Landroid/view/textclassifier/TextClassification;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EpoxyRecyclerViewWithModelsController {
    public static final EpoxyRecyclerViewWithModelsController INSTANCE = new EpoxyRecyclerViewWithModelsController();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[getSpanCount.values().length];
            try {
                iArr[getSpanCount.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getSpanCount.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            read = iArr;
        }
    }

    private EpoxyRecyclerViewWithModelsController() {
    }

    public final TextClassifier AudioAttributesCompatParcelizer(Context p0, getSpanCount p1) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) p0.getSystemService(TextClassificationManager.class);
        int i = WhenMappings.read[p1.ordinal()];
        if (i == 1) {
            str = "edittext";
        } else {
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(p0.getPackageName(), str).build());
    }

    public final LocaleList write(canCreateFromBoolean p0) {
        canCreateFromBoolean cancreatefromboolean = p0;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(cancreatefromboolean, 10));
        Iterator<canCreateFromInt> it = cancreatefromboolean.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getRemoteActionCompatParcelizer());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final boolean RemoteActionCompatParcelizer(TextClassification textClassification) {
        if (textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }
}
