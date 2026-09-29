package kotlin;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin._findCustomDeser;
import kotlin.anyIgnorals;
import kotlin.withNext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\nR.\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000e\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\u0005R\u0014\u0010%\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005"}, d2 = {"Lo/_checkFloatSpecialValue;", "Landroid/app/Activity;", "Lo/hasGetter;", "Lo/_findCustomDeser$AudioAttributesCompatParcelizer;", "<init>", "()V", "Landroid/view/KeyEvent;", "p0", "", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "Lo/_checkFloatSpecialValue$write;", "T", "Ljava/lang/Class;", "getExtraData", "(Ljava/lang/Class;)Lo/_checkFloatSpecialValue$write;", "Landroid/os/Bundle;", "", "onCreate", "(Landroid/os/Bundle;)V", "onSaveInstanceState", "putExtraData", "(Lo/_checkFloatSpecialValue$write;)V", "", "", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "shouldSkipDump", "superDispatchKeyEvent", "Lo/AppCompatCheckBox;", "extraDataMap", "Lo/AppCompatCheckBox;", "getExtraDataMap$annotations", "Lo/anyIgnorals;", "getLifecycle", "()Lo/anyIgnorals;", LogCategory.LIFECYCLE, "Lo/getSetterUnchecked;", "lifecycleRegistry", "Lo/getSetterUnchecked;", "getLifecycleRegistry$annotations", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class _checkFloatSpecialValue extends Activity implements hasGetter, _findCustomDeser.AudioAttributesCompatParcelizer {
    private final AppCompatCheckBox<Class<? extends write>, write> extraDataMap = new AppCompatCheckBox<>(0, 1, null);
    private final getSetterUnchecked lifecycleRegistry = new getSetterUnchecked(this);

    @getRenewGrpId
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_checkFloatSpecialValue$write;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class write {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    @getRenewGrpId
    public void putExtraData(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.extraDataMap.put((Class<? extends write>) p0.getClass(), p0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        withNext.Companion remoteActionCompatParcelizer = withNext.INSTANCE;
        withNext.Companion.RemoteActionCompatParcelizer(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.lifecycleRegistry.RemoteActionCompatParcelizer(anyIgnorals.write.read);
        super.onSaveInstanceState(p0);
    }

    @getRenewGrpId
    public <T extends write> T getExtraData(Class<T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (T) this.extraDataMap.get(p0);
    }

    public anyIgnorals getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // o._findCustomDeser.AudioAttributesCompatParcelizer
    public boolean superDispatchKeyEvent(KeyEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return super.dispatchKeyEvent(p0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View decorView = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        if (_findCustomDeser.read(decorView, p0)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(p0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View decorView = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        if (_findCustomDeser.read(decorView, p0)) {
            return true;
        }
        return _findCustomDeser.IconCompatParcelizer(this, p0);
    }

    protected final boolean shouldDumpInternalState(String[] p0) {
        return !shouldSkipDump(p0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r3.equals("--list-dumpables") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r3.equals("--dump-dumpable") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean shouldSkipDump(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 0
            if (r3 == 0) goto L4b
            int r0 = r3.length
            if (r0 == 0) goto L4b
            r3 = r3[r2]
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -645125871: goto L3c;
                case 100470631: goto L2c;
                case 472614934: goto L23;
                case 1159329357: goto L1a;
                case 1455016274: goto L11;
                default: goto L10;
            }
        L10:
            goto L4b
        L11:
            java.lang.String r0 = "--autofill"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
            return r1
        L1a:
            java.lang.String r0 = "--contentcapture"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
            return r1
        L23:
            java.lang.String r0 = "--list-dumpables"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto L4b
        L2c:
            java.lang.String r0 = "--dump-dumpable"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
        L34:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L3b
            return r1
        L3b:
            return r2
        L3c:
            java.lang.String r0 = "--translation"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4b
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r3 < r0) goto L4b
            return r1
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._checkFloatSpecialValue.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
