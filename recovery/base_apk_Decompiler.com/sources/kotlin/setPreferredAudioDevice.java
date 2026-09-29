package kotlin;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.setVerticalBias;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setPriority;", "read", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/setPriority;", "Lo/setPreferredAudioDevice$write;", "RemoteActionCompatParcelizer", "Lo/setPreferredAudioDevice$write;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setPreferredAudioDevice {
    private static final write RemoteActionCompatParcelizer;

    public static final setPriority read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        write writeVar;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1141871251, i, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        write writeVar2 = RemoteActionCompatParcelizer;
        if (writeVar2 != null) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1345554384);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            writeVar = writeVar2;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(1345603457);
            View view = (View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver());
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(view);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                Object tag = view.getTag(setVerticalBias.AudioAttributesCompatParcelizer.compose_prefetch_scheduler);
                Object obj = tag instanceof setPriority ? (setPriority) tag : null;
                if (obj == null) {
                    Object cancelloadinbackground = new cancelLoadInBackground(view);
                    view.setTag(setVerticalBias.AudioAttributesCompatParcelizer.compose_prefetch_scheduler, cancelloadinbackground);
                    obj = (setPriority) cancelloadinbackground;
                }
                objOnPause = obj;
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            writeVar = (setPriority) objOnPause;
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writeVar;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setPreferredAudioDevice$write;", "Lo/setPriority;", "Lo/setPauseAtEndOfMediaItems;", "p0", "", "write", "(Lo/setPauseAtEndOfMediaItems;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements setPriority {
        @Override // kotlin.setPriority
        public final void write(setPauseAtEndOfMediaItems p0) {
        }

        write() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    static {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            if (r0 == 0) goto L1f
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r1)
            java.lang.String r1 = "robolectric"
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r1)
            if (r0 == 0) goto L1f
            o.setPreferredAudioDevice$write r0 = new o.setPreferredAudioDevice$write
            r0.<init>()
            goto L20
        L1f:
            r0 = 0
        L20:
            kotlin.setPreferredAudioDevice.RemoteActionCompatParcelizer = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPreferredAudioDevice.<clinit>():void");
    }
}
