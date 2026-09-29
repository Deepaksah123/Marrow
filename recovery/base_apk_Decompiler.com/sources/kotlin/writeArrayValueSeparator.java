package kotlin;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0011\u0010\r\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0018\u0010\u001b\u001a\u00020\u0003*\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001c\u001a\u00020\u0003*\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001d"}, d2 = {"Lo/writeArrayValueSeparator;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Lo/parseDouble;", "", "p0", "p1", "p2", "<init>", "(ZZZ)V", "", "onAccessibilityStateChanged", "(Z)V", "Landroid/view/accessibility/AccessibilityManager;", "RemoteActionCompatParcelizer", "(Landroid/view/accessibility/AccessibilityManager;)V", "AudioAttributesCompatParcelizer", "Z", "IconCompatParcelizer", "read", "write", "Lo/InputAccessor;", "()Z", "Lo/writeArrayValueSeparator$RemoteActionCompatParcelizer;", "Lo/writeArrayValueSeparator$RemoteActionCompatParcelizer;", "Lo/writeArrayValueSeparator$write;", "Lo/writeArrayValueSeparator$write;", "(Landroid/view/accessibility/AccessibilityManager;)Z", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "()Ljava/lang/Boolean;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class writeArrayValueSeparator implements AccessibilityManager.AccessibilityStateChangeListener, parseDouble<Boolean> {
    private final write AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;
    private final InputAccessor write = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);

    public writeArrayValueSeparator(boolean z, boolean z2, boolean z3) {
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        write writeVar = null;
        this.read = z ? new RemoteActionCompatParcelizer() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            writeVar = new write();
        }
        this.AudioAttributesCompatParcelizer = writeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean RemoteActionCompatParcelizer() {
        return ((Boolean) this.write.getRemoteActionCompatParcelizer()).booleanValue();
    }

    private final void write(boolean z) {
        this.write.write(Boolean.valueOf(z));
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\t\u0010\u0006"}, d2 = {"Lo/writeArrayValueSeparator$RemoteActionCompatParcelizer;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "", "p0", "", "onTouchExplorationStateChanged", "(Z)V", "write", "Lo/InputAccessor;", "RemoteActionCompatParcelizer", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final InputAccessor IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);

        RemoteActionCompatParcelizer() {
        }

        public final void RemoteActionCompatParcelizer(boolean z) {
            this.IconCompatParcelizer.write(Boolean.valueOf(z));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean RemoteActionCompatParcelizer() {
            return ((Boolean) this.IconCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean p0) {
            RemoteActionCompatParcelizer(p0);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00078G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00078G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\r\u0010\n\"\u0004\b\r\u0010\f"}, d2 = {"Lo/writeArrayValueSeparator$write;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager;", "p0", "", "onAccessibilityServicesStateChanged", "(Landroid/view/accessibility/AccessibilityManager;)V", "", "read", "Lo/InputAccessor;", "()Z", "write", "(Z)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements AccessibilityManager.AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final InputAccessor IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final InputAccessor RemoteActionCompatParcelizer;

        write() {
            Boolean bool = Boolean.FALSE;
            this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
            this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean read() {
            return ((Boolean) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
        }

        public final void write(boolean z) {
            this.RemoteActionCompatParcelizer.write(Boolean.valueOf(z));
        }

        public final void RemoteActionCompatParcelizer(boolean z) {
            this.IconCompatParcelizer.write(Boolean.valueOf(z));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean RemoteActionCompatParcelizer() {
            return ((Boolean) this.IconCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
        public final void onAccessibilityServicesStateChanged(AccessibilityManager p0) {
            write(writeArrayValueSeparator.this.IconCompatParcelizer(p0));
            RemoteActionCompatParcelizer(writeArrayValueSeparator.this.read(p0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean IconCompatParcelizer(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && TestGroupLSModel.write((CharSequence) settingsActivityName, (CharSequence) "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean read(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && TestGroupLSModel.write((CharSequence) settingsActivityName, (CharSequence) "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    @Override // kotlin.parseDouble
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean getRemoteActionCompatParcelizer() {
        /*
            r2 = this;
            boolean r0 = r2.RemoteActionCompatParcelizer()
            if (r0 == 0) goto L2d
            o.writeArrayValueSeparator$RemoteActionCompatParcelizer r0 = r2.read
            r1 = 1
            if (r0 == 0) goto L11
            boolean r0 = r0.RemoteActionCompatParcelizer()
            if (r0 == r1) goto L2e
        L11:
            boolean r0 = r2.IconCompatParcelizer
            if (r0 == 0) goto L1f
            o.writeArrayValueSeparator$write r0 = r2.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L1f
            boolean r0 = r0.read()
            if (r0 == r1) goto L2e
        L1f:
            boolean r0 = r2.RemoteActionCompatParcelizer
            if (r0 == 0) goto L2d
            o.writeArrayValueSeparator$write r2 = r2.AudioAttributesCompatParcelizer
            if (r2 == 0) goto L2d
            boolean r2 = r2.RemoteActionCompatParcelizer()
            if (r2 == r1) goto L2e
        L2d:
            r1 = 0
        L2e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeArrayValueSeparator.getRemoteActionCompatParcelizer():java.lang.Boolean");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean p0) {
        write(p0);
    }

    public final void RemoteActionCompatParcelizer(AccessibilityManager p0) {
        write writeVar;
        write(p0.isEnabled());
        p0.addAccessibilityStateChangeListener(this);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0.isTouchExplorationEnabled());
            p0.addTouchExplorationStateChangeListener(remoteActionCompatParcelizer);
        }
        if (Build.VERSION.SDK_INT < 33 || (writeVar = this.AudioAttributesCompatParcelizer) == null) {
            return;
        }
        writeVar.write(IconCompatParcelizer(p0));
        writeVar.RemoteActionCompatParcelizer(read(p0));
        AudioAttributesCompatParcelizer.bX_(p0, writeVar);
    }

    public final void AudioAttributesCompatParcelizer(AccessibilityManager p0) {
        write writeVar;
        p0.removeAccessibilityStateChangeListener(this);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer != null) {
            p0.removeTouchExplorationStateChangeListener(remoteActionCompatParcelizer);
        }
        if (Build.VERSION.SDK_INT < 33 || (writeVar = this.AudioAttributesCompatParcelizer) == null) {
            return;
        }
        AudioAttributesCompatParcelizer.bY_(p0, writeVar);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lo/writeArrayValueSeparator$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "p0", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "p1", "", "bX_", "(Landroid/view/accessibility/AccessibilityManager;Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;)V", "bY_"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static final void bX_(AccessibilityManager p0, AccessibilityManager.AccessibilityServicesStateChangeListener p1) {
            p0.addAccessibilityServicesStateChangeListener(p1);
        }

        @getMagicModuleMeta
        public static final void bY_(AccessibilityManager p0, AccessibilityManager.AccessibilityServicesStateChangeListener p1) {
            p0.removeAccessibilityServicesStateChangeListener(p1);
        }
    }
}
