package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/setProgressBackgroundColorSchemeColor;", "", "<init>", "()V", "Landroid/app/PendingIntent;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/app/PendingIntent;)V", "Landroid/content/Context;", "Landroid/view/textclassifier/TextClassification;", "p1", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Landroid/view/textclassifier/TextClassification;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setProgressBackgroundColorSchemeColor {
    public static final setProgressBackgroundColorSchemeColor INSTANCE = new setProgressBackgroundColorSchemeColor();

    private setProgressBackgroundColorSchemeColor() {
    }

    public final void AudioAttributesCompatParcelizer(PendingIntent p0) throws PendingIntent.CanceledException {
        if (Build.VERSION.SDK_INT >= 34) {
            setOnRefreshListener.INSTANCE.IconCompatParcelizer(p0);
        } else {
            p0.send();
        }
    }

    public final void RemoteActionCompatParcelizer(Context p0, TextClassification p1) throws PendingIntent.CanceledException {
        String text = p1.getText();
        AudioAttributesCompatParcelizer(PendingIntent.getActivity(p0, text != null ? text.hashCode() : 0, p1.getIntent(), 201326592));
    }
}
