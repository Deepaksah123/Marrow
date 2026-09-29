package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class _isStdKeyDeser extends JdkDeserializers {
    public ArrayList<JdkDeserializers> MediaSessionCompatQueueItem = new ArrayList<>();

    @Override // kotlin.JdkDeserializers
    public void ResultReceiver() {
        this.MediaSessionCompatQueueItem.clear();
        super.ResultReceiver();
    }

    public final void RemoteActionCompatParcelizer(JdkDeserializers jdkDeserializers) {
        this.MediaSessionCompatQueueItem.add(jdkDeserializers);
        if (jdkDeserializers.onPrepareFromMediaId() != null) {
            ((_isStdKeyDeser) jdkDeserializers.onPrepareFromMediaId()).read(jdkDeserializers);
        }
        jdkDeserializers.write(this);
    }

    public final void read(JdkDeserializers jdkDeserializers) {
        this.MediaSessionCompatQueueItem.remove(jdkDeserializers);
        jdkDeserializers.ResultReceiver();
    }

    public final ArrayList<JdkDeserializers> accessgetReportFullyDrawnExecutorp() {
        return this.MediaSessionCompatQueueItem;
    }

    public void _init_lambda4() {
        ArrayList<JdkDeserializers> arrayList = this.MediaSessionCompatQueueItem;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                JdkDeserializers jdkDeserializers = this.MediaSessionCompatQueueItem.get(i);
                if (jdkDeserializers instanceof _isStdKeyDeser) {
                    ((_isStdKeyDeser) jdkDeserializers)._init_lambda4();
                }
            }
        }
    }

    @Override // kotlin.JdkDeserializers
    public final void read(useDefaultValueForUnknownEnum usedefaultvalueforunknownenum) {
        super.read(usedefaultvalueforunknownenum);
        int size = this.MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaSessionCompatQueueItem.get(i).read(usedefaultvalueforunknownenum);
        }
    }

    public final void ensureViewModelStore() {
        this.MediaSessionCompatQueueItem.clear();
    }
}
