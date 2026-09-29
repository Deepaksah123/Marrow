package kotlin;

import android.content.Context;
import android.provider.Settings;
import in.juspay.hypersdk.analytics.LogConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0013J\u0011\u0010\u0012\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017"}, d2 = {"Lo/requestPlayPauseAccessibilityFocus;", "", "<init>", "()V", "Landroid/content/Context;", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Z", "p0", "Lo/requestPlayPauseAccessibilityFocus$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(Landroid/content/Context;)Lo/requestPlayPauseAccessibilityFocus$RemoteActionCompatParcelizer;", "", "", "RemoteActionCompatParcelizer", "()Ljava/util/Map;", "AudioAttributesImplApi21Parcelizer", "read", "write", "()Z", "p1", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class requestPlayPauseAccessibilityFocus {
    public static final requestPlayPauseAccessibilityFocus INSTANCE = new requestPlayPauseAccessibilityFocus();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final List<String> IconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"init.svc.adbd", "init.svc.usbd", "persist.adb.tcp.port", "persist.adb.wifi.guid", "service.adb.tcp.port", "persist.sys.usb.config", "sys.usb.config", "sys.usb.state"});

    private requestPlayPauseAccessibilityFocus() {
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return read(context) || AudioAttributesImplApi21Parcelizer(context) || AudioAttributesCompatParcelizer();
    }

    @getMagicModuleMeta
    public static final RemoteActionCompatParcelizer IconCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new RemoteActionCompatParcelizer(read(p0), AudioAttributesImplApi21Parcelizer(p0), AudioAttributesCompatParcelizer(), write());
    }

    public static Map<String, String> RemoteActionCompatParcelizer() {
        List<String> list = IconCompatParcelizer;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10)), 16));
        for (String str : list) {
            Pair pairWrite = setAction.write(TestGroupLSModel.AudioAttributesCompatParcelizer(str, '.', '_', false), RemoteActionCompatParcelizer(str, "NA"));
            linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
        }
        return linkedHashMap;
    }

    private static boolean AudioAttributesImplApi21Parcelizer(Context p0) {
        return Settings.Global.getInt(p0.getContentResolver(), "adb_wifi_enabled", 0) == 1;
    }

    private static boolean read(Context p0) {
        return Settings.Global.getInt(p0.getContentResolver(), "adb_enabled", 0) == 1;
    }

    private static boolean write() {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "running", (Object) RemoteActionCompatParcelizer("init.svc.adbd", LogConstants.DEFAULT_CHANNEL));
    }

    private static boolean AudioAttributesCompatParcelizer() {
        return TestGroupLSModel.write((CharSequence) RemoteActionCompatParcelizer("persist.sys.usb.config", LogConstants.DEFAULT_CHANNEL), (CharSequence) "adb", false);
    }

    public static boolean write(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 1;
    }

    public final boolean RemoteActionCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        boolean zWrite = write();
        boolean z = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) == 1;
        return ((zWrite && z) || !zWrite || z) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String RemoteActionCompatParcelizer(final String p0, String p1) {
        final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        final MagicModuleUseCaseImplWhenMappings.write writeVar2 = new MagicModuleUseCaseImplWhenMappings.write();
        String str = (String) getShowShuffleButton.AudioAttributesCompatParcelizer(new getCreatedOnDateMs() { // from class: o.requestPlayPauseFocus
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return requestPlayPauseAccessibilityFocus.IconCompatParcelizer(p0, writeVar2, writeVar);
            }
        });
        BufferedReader bufferedReader = (BufferedReader) writeVar.write;
        if (bufferedReader != null) {
            getShowShuffleButton.read(bufferedReader);
        }
        Process process = (Process) writeVar2.write;
        if (process != null) {
            process.destroy();
        }
        return str == null ? p1 : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Process] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.io.BufferedReader] */
    public static final String IconCompatParcelizer(String str, MagicModuleUseCaseImplWhenMappings.write writeVar, MagicModuleUseCaseImplWhenMappings.write writeVar2) throws IOException {
        ?? Start = new ProcessBuilder(new String[0]).command("/system/bin/getprop", str).redirectErrorStream(true).start();
        writeVar.write = Start;
        ?? bufferedReader = new BufferedReader(new InputStreamReader(Start.getInputStream()));
        writeVar2.write = bufferedReader;
        return bufferedReader.readLine();
    }

    public static final class RemoteActionCompatParcelizer {
        private final boolean IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final boolean read;
        private final boolean write;

        public RemoteActionCompatParcelizer(boolean z, boolean z2, boolean z3, boolean z4) {
            this.RemoteActionCompatParcelizer = z;
            this.write = z2;
            this.read = z3;
            this.IconCompatParcelizer = z4;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final boolean IconCompatParcelizer() {
            return this.read;
        }

        public final boolean read() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer && this.write == remoteActionCompatParcelizer.write && this.read == remoteActionCompatParcelizer.read && this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((((Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.RemoteActionCompatParcelizer;
            boolean z2 = this.write;
            boolean z3 = this.read;
            boolean z4 = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("AdbRunningInfo(usbDebugging=");
            sb.append(z);
            sb.append(", wifiAdb=");
            sb.append(z2);
            sb.append(", adbUsbConfig=");
            sb.append(z3);
            sb.append(", adbViaAdbd=");
            sb.append(z4);
            sb.append(")");
            return sb.toString();
        }
    }
}
