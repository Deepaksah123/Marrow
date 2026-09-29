package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/zaba;", "Landroid/widget/PopupWindow;", "Landroid/content/Context;", "p0", "Lkotlin/Function0;", "", "p1", "Lo/refreshPlaylist;", "p2", "<init>", "(Landroid/content/Context;Lo/getCreatedOnDateMs;Lo/refreshPlaylist;)V", "read", "()V", "Landroid/view/View;", "", "(Landroid/view/View;II)V", "RemoteActionCompatParcelizer", "Lo/getCreatedOnDateMs;", "write", "IconCompatParcelizer", "Lo/refreshPlaylist;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zaba extends PopupWindow {
    public static int read;
    public static int write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final refreshPlaylist RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> write;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zaba(Context context, getCreatedOnDateMs getcreatedondatems, refreshPlaylist refreshplaylist, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 4) != 0) {
            refreshplaylist = refreshPlaylist.write(LayoutInflater.from(context));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(refreshplaylist, "");
        }
        this(context, getcreatedondatems, refreshplaylist);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zaba(Context context, getCreatedOnDateMs<getShowPopup> getcreatedondatems, refreshPlaylist refreshplaylist) {
        super((View) refreshplaylist.IconCompatParcelizer(), -2, -2, true);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(refreshplaylist, "");
        this.write = getcreatedondatems;
        this.RemoteActionCompatParcelizer = refreshplaylist;
        setTouchable(true);
        setOutsideTouchable(true);
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.zaax
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                zaba.write(this.RemoteActionCompatParcelizer);
            }
        });
        getContentView();
        refreshplaylist.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zabb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaba.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(zaba zabaVar) {
        zabaVar.write.invoke();
    }

    static final void AudioAttributesCompatParcelizer(zaba zabaVar) {
        zabaVar.write.invoke();
    }

    private final void read() {
        if (isShowing()) {
            dismiss();
        }
    }

    public final void read(View p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        showAsDropDown(p0, p1, p2);
    }

    public static int write() {
        int i = write;
        int i2 = i % 5501694;
        write = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        read = iMaxMemory;
        return iMaxMemory;
    }
}
