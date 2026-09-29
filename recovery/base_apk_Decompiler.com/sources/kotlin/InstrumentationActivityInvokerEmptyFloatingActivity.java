package kotlin;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/InstrumentationActivityInvokerEmptyFloatingActivity;", "", "<init>", "()V", "Landroid/view/Menu;", "p0", "", "p1", "Landroid/content/Context;", "p2", "Landroid/view/textclassifier/TextClassification;", "p3", "p4", "", "AudioAttributesCompatParcelizer", "(Landroid/view/Menu;ILandroid/content/Context;Landroid/view/textclassifier/TextClassification;I)V", "", "Landroid/app/RemoteAction;", "RemoteActionCompatParcelizer", "(Landroid/view/Menu;ILandroid/content/Context;ZLandroid/app/RemoteAction;)V", "write", "(Landroid/view/Menu;ILandroid/content/Context;Landroid/view/textclassifier/TextClassification;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class InstrumentationActivityInvokerEmptyFloatingActivity {
    public static final InstrumentationActivityInvokerEmptyFloatingActivity INSTANCE = new InstrumentationActivityInvokerEmptyFloatingActivity();

    private InstrumentationActivityInvokerEmptyFloatingActivity() {
    }

    public final void AudioAttributesCompatParcelizer(Menu p0, int p1, Context p2, TextClassification p3, int p4) {
        if (p4 < 0) {
            write(p0, p1, p2, p3);
        } else {
            RemoteActionCompatParcelizer(p0, p1, p2, p4 == 0, p3.getActions().get(p4));
        }
    }

    public final void RemoteActionCompatParcelizer(Menu p0, int p1, Context p2, boolean p3, final RemoteAction p4) {
        MenuItem menuItemAdd = p0.add(R.id.textAssist, p3 ? 16908353 : 0, p1, p4.getTitle());
        menuItemAdd.setShowAsAction(p3 ? 2 : 0);
        if (p3 || p4.shouldShowIcon()) {
            menuItemAdd.setIcon(p4.getIcon().loadDrawable(p2));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.InstrumentationActivityInvokerEmptyActivity
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return InstrumentationActivityInvokerEmptyFloatingActivity.read(p4, menuItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(RemoteAction remoteAction, MenuItem menuItem) throws PendingIntent.CanceledException {
        setProgressBackgroundColorSchemeColor.INSTANCE.AudioAttributesCompatParcelizer(remoteAction.getActionIntent());
        return true;
    }

    public final void write(Menu p0, int p1, final Context p2, final TextClassification p3) {
        MenuItem menuItemAdd = p0.add(R.id.textAssist, R.id.textAssist, p1, p3.getLabel());
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(p3.getIcon());
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.ServiceLoaderWrapper
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return InstrumentationActivityInvokerEmptyFloatingActivity.IconCompatParcelizer(p2, p3, menuItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(Context context, TextClassification textClassification, MenuItem menuItem) throws PendingIntent.CanceledException {
        setProgressBackgroundColorSchemeColor.INSTANCE.RemoteActionCompatParcelizer(context, textClassification);
        return true;
    }
}
