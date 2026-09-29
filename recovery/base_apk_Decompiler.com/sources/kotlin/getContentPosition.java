package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class getContentPosition {
    final List<? extends getCurrentPeriodIndex<?>> AudioAttributesCompatParcelizer;
    private SequenceSerializer.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private List<? extends getCurrentPeriodIndex<?>> RemoteActionCompatParcelizer;

    static getContentPosition AudioAttributesCompatParcelizer(List<? extends getCurrentPeriodIndex<?>> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new getContentPosition(list, list, null);
    }

    static getContentPosition write(List<? extends getCurrentPeriodIndex<?>> list) {
        return new getContentPosition(Collections.EMPTY_LIST, list, null);
    }

    static getContentPosition RemoteActionCompatParcelizer(List<? extends getCurrentPeriodIndex<?>> list) {
        return new getContentPosition(list, Collections.EMPTY_LIST, null);
    }

    static getContentPosition RemoteActionCompatParcelizer(List<? extends getCurrentPeriodIndex<?>> list, List<? extends getCurrentPeriodIndex<?>> list2, SequenceSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return new getContentPosition(list, list2, audioAttributesCompatParcelizer);
    }

    private getContentPosition(List<? extends getCurrentPeriodIndex<?>> list, List<? extends getCurrentPeriodIndex<?>> list2, SequenceSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = list2;
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        AudioAttributesCompatParcelizer(new ReflectionCacheBooleanTriStateEmpty(iconCompatParcelizer));
    }

    private void AudioAttributesCompatParcelizer(UByteKeyDeserializer uByteKeyDeserializer) {
        SequenceSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.IconCompatParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(uByteKeyDeserializer);
            return;
        }
        if (this.AudioAttributesCompatParcelizer.isEmpty() && !this.RemoteActionCompatParcelizer.isEmpty()) {
            uByteKeyDeserializer.write(0, this.RemoteActionCompatParcelizer.size());
        } else {
            if (this.AudioAttributesCompatParcelizer.isEmpty() || !this.RemoteActionCompatParcelizer.isEmpty()) {
                return;
            }
            uByteKeyDeserializer.read(0, this.AudioAttributesCompatParcelizer.size());
        }
    }
}
