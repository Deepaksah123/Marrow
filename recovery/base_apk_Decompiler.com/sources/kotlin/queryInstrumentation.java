package kotlin;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/queryInstrumentation;", "", "Landroid/app/Activity;", "p0", "Landroid/graphics/Rect;", "read", "(Landroid/app/Activity;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface queryInstrumentation {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    Rect read(Activity p0);

    /* JADX INFO: renamed from: o.queryInstrumentation$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

        private Companion() {
        }

        static {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("BoundsHelper", "");
        }

        public static queryInstrumentation AudioAttributesCompatParcelizer() {
            if (Build.VERSION.SDK_INT >= 30) {
                return queryBroadcastReceivers.INSTANCE;
            }
            return queryIntentActivities.INSTANCE;
        }
    }
}
