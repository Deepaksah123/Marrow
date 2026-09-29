package kotlin;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public abstract class skippableArray extends _addSuperInterfaces {
    private int AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private LayoutInflater read;

    @Deprecated
    public skippableArray(Context context, int i) {
        super(context, null, true);
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i;
        this.read = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // kotlin._addSuperInterfaces
    public View IconCompatParcelizer(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.read.inflate(this.AudioAttributesCompatParcelizer, viewGroup, false);
    }

    @Override // kotlin._addSuperInterfaces
    public final View RemoteActionCompatParcelizer(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.read.inflate(this.RemoteActionCompatParcelizer, viewGroup, false);
    }
}
