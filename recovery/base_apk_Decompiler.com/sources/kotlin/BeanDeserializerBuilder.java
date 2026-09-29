package kotlin;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJW\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/BeanDeserializerBuilder;", "", "<init>", "()V", "", "p0", "Landroid/text/TextPaint;", "p1", "Landroid/text/TextDirectionHeuristic;", "p2", "Landroid/text/BoringLayout$Metrics;", "RemoteActionCompatParcelizer", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;", "", "p3", "Landroid/text/Layout$Alignment;", "p4", "", "p5", "p6", "Landroid/text/TextUtils$TruncateAt;", "p7", "p8", "Landroid/text/BoringLayout;", "AudioAttributesCompatParcelizer", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/BoringLayout$Metrics;Landroid/text/Layout$Alignment;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;", "read", "(Landroid/text/BoringLayout;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeanDeserializerBuilder {
    public static final BeanDeserializerBuilder INSTANCE = new BeanDeserializerBuilder();

    private BeanDeserializerBuilder() {
    }

    public final BoringLayout.Metrics RemoteActionCompatParcelizer(CharSequence p0, TextPaint p1, TextDirectionHeuristic p2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return resolve.RemoteActionCompatParcelizer(p0, p1, p2);
        }
        return wrapInstantiationProblem.IconCompatParcelizer(p0, p1, p2);
    }

    public final boolean read(BoringLayout p0) {
        if (Build.VERSION.SDK_INT >= 33) {
            return resolve.RemoteActionCompatParcelizer(p0);
        }
        return false;
    }

    public final BoringLayout AudioAttributesCompatParcelizer(CharSequence p0, TextPaint p1, int p2, BoringLayout.Metrics p3, Layout.Alignment p4, boolean p5, boolean p6, TextUtils.TruncateAt p7, int p8) {
        if (p2 < 0) {
            withStackTrace.read("negative width");
        }
        if (p8 < 0) {
            withStackTrace.read("negative ellipsized width");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return resolve.AudioAttributesCompatParcelizer(p0, p1, p2, p4, 1.0f, BitmapDescriptorFactory.HUE_RED, p3, p5, p6, p7, p8);
        }
        return wrapInstantiationProblem.AudioAttributesCompatParcelizer(p0, p1, p2, p4, 1.0f, BitmapDescriptorFactory.HUE_RED, p3, p5, p7, p8);
    }
}
