package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonAudioCodecError11 {
    private static final Object write = new Object();
    private ArrayList<generateMediaPeriodEventTime> AudioAttributesCompatParcelizer = new ArrayList<>();

    public final void read(generateMediaPeriodEventTime generatemediaperiodeventtime) {
        synchronized (write) {
            try {
                int size = this.AudioAttributesCompatParcelizer.size();
                if (size > 50) {
                    ArrayList<generateMediaPeriodEventTime> arrayList = new ArrayList<>();
                    for (int i = 10; i < size; i++) {
                        arrayList.add(this.AudioAttributesCompatParcelizer.get(i));
                    }
                    arrayList.add(generatemediaperiodeventtime);
                    this.AudioAttributesCompatParcelizer = arrayList;
                } else {
                    this.AudioAttributesCompatParcelizer.add(generatemediaperiodeventtime);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final generateMediaPeriodEventTime read() {
        generateMediaPeriodEventTime generatemediaperiodeventtimeRemove;
        synchronized (write) {
            generatemediaperiodeventtimeRemove = null;
            try {
                if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
                    generatemediaperiodeventtimeRemove = this.AudioAttributesCompatParcelizer.remove(0);
                }
            } catch (Exception unused) {
            }
        }
        return generatemediaperiodeventtimeRemove;
    }
}
