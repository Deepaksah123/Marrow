package kotlin;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import java.util.HashMap;
import java.util.Map;
import kotlin.canKeepMediaPeriodHolder;

/* JADX INFO: loaded from: classes2.dex */
final class updateClipping {
    final Map<anyIgnorals, ForwardingPlayer> read = new HashMap();
    private final canKeepMediaPeriodHolder.write write;

    updateClipping(canKeepMediaPeriodHolder.write writeVar) {
        this.write = writeVar;
    }

    private ForwardingPlayer AudioAttributesCompatParcelizer(anyIgnorals anyignorals) {
        moveMediaSourceRange.write();
        return this.read.get(anyignorals);
    }

    final ForwardingPlayer AudioAttributesCompatParcelizer(Context context, Glide glide, final anyIgnorals anyignorals, FragmentManager fragmentManager, boolean z) {
        moveMediaSourceRange.write();
        ForwardingPlayer forwardingPlayerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(anyignorals);
        if (forwardingPlayerAudioAttributesCompatParcelizer != null) {
            return forwardingPlayerAudioAttributesCompatParcelizer;
        }
        toPeriodTime toperiodtime = new toPeriodTime(anyignorals);
        ForwardingPlayer forwardingPlayerWrite = this.write.write(glide, toperiodtime, new AudioAttributesCompatParcelizer(fragmentManager), context);
        this.read.put(anyignorals, forwardingPlayerWrite);
        toperiodtime.write(new toRendererTime() { // from class: o.updateClipping.4
            @Override // kotlin.toRendererTime
            public final void AudioAttributesImplApi21Parcelizer() {
            }

            @Override // kotlin.toRendererTime
            public final void MediaBrowserCompatItemReceiver() {
            }

            @Override // kotlin.toRendererTime
            public final void AudioAttributesImplApi26Parcelizer() {
                updateClipping.this.read.remove(anyignorals);
            }
        });
        if (z) {
            forwardingPlayerWrite.AudioAttributesImplApi21Parcelizer();
        }
        return forwardingPlayerWrite;
    }

    final class AudioAttributesCompatParcelizer implements copyWithRequestedContentPositionUs {
        private final FragmentManager RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(FragmentManager fragmentManager) {
            this.RemoteActionCompatParcelizer = fragmentManager;
        }
    }
}
