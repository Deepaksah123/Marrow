package kotlin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class setTabContainer {
    public final Bundle AudioAttributesCompatParcelizer;
    public final Intent read;

    public final void read(Context context, Uri uri) {
        this.read.setData(uri);
        _isNaN.startActivity(context, this.read, this.AudioAttributesCompatParcelizer);
    }

    setTabContainer(Intent intent, Bundle bundle) {
        this.read = intent;
        this.AudioAttributesCompatParcelizer = bundle;
    }

    public static final class RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private ArrayList<Bundle> IconCompatParcelizer;
        private Bundle RemoteActionCompatParcelizer;
        private ArrayList<Bundle> read;
        private final Intent write;

        public RemoteActionCompatParcelizer() {
            this((byte) 0);
        }

        private RemoteActionCompatParcelizer(byte b) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.write = intent;
            this.IconCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = null;
            this.read = null;
            this.AudioAttributesCompatParcelizer = true;
            Bundle bundle = new Bundle();
            _checkFromStringCoercion.AudioAttributesCompatParcelizer(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }

        public final setTabContainer write() {
            this.write.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.AudioAttributesCompatParcelizer);
            return new setTabContainer(this.write, this.RemoteActionCompatParcelizer);
        }
    }
}
