package kotlin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class trimByVisibility extends Service implements hasGetter {
    private final addLocalDefinition AudioAttributesCompatParcelizer = new addLocalDefinition(this);

    @Override // android.app.Service
    public void onCreate() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        this.AudioAttributesCompatParcelizer.write();
        return null;
    }

    @Override // android.app.Service
    @getRenewGrpId
    public void onStart(Intent intent, int i) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.AudioAttributesCompatParcelizer.read();
        super.onDestroy();
    }

    @Override // kotlin.hasGetter
    public anyIgnorals getLifecycle() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
