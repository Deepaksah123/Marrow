package kotlin;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class _isFalse implements Iterable<Intent> {
    private final Context AudioAttributesCompatParcelizer;
    private final ArrayList<Intent> RemoteActionCompatParcelizer = new ArrayList<>();

    public interface RemoteActionCompatParcelizer {
        Intent ak_();
    }

    private _isFalse(Context context) {
        this.AudioAttributesCompatParcelizer = context;
    }

    public static _isFalse RemoteActionCompatParcelizer(Context context) {
        return new _isFalse(context);
    }

    private _isFalse RemoteActionCompatParcelizer(Intent intent) {
        this.RemoteActionCompatParcelizer.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final _isFalse write(Activity activity) {
        Intent intentAk_ = ((RemoteActionCompatParcelizer) activity).ak_();
        if (intentAk_ == null) {
            intentAk_ = _checkToStringCoercion.RemoteActionCompatParcelizer(activity);
        }
        if (intentAk_ != null) {
            ComponentName component = intentAk_.getComponent();
            if (component == null) {
                component = intentAk_.resolveActivity(this.AudioAttributesCompatParcelizer.getPackageManager());
            }
            RemoteActionCompatParcelizer(component);
            RemoteActionCompatParcelizer(intentAk_);
        }
        return this;
    }

    private _isFalse RemoteActionCompatParcelizer(ComponentName componentName) {
        int size = this.RemoteActionCompatParcelizer.size();
        try {
            Intent intentAudioAttributesCompatParcelizer = _checkToStringCoercion.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, componentName);
            while (intentAudioAttributesCompatParcelizer != null) {
                this.RemoteActionCompatParcelizer.add(size, intentAudioAttributesCompatParcelizer);
                intentAudioAttributesCompatParcelizer = _checkToStringCoercion.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, intentAudioAttributesCompatParcelizer.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.RemoteActionCompatParcelizer.iterator();
    }

    public final void read() {
        write();
    }

    private void write() {
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.RemoteActionCompatParcelizer.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (_isNaN.startActivities(this.AudioAttributesCompatParcelizer, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.AudioAttributesCompatParcelizer.startActivity(intent);
    }
}
