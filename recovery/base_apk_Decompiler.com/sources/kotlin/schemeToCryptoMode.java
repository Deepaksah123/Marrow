package kotlin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TrackSampleTable;

/* JADX INFO: loaded from: classes3.dex */
public final class schemeToCryptoMode {
    private final String AudioAttributesCompatParcelizer;
    private Integer IconCompatParcelizer = null;
    private final onInputBufferAvailable<TrackSampleTable> RemoteActionCompatParcelizer;

    public schemeToCryptoMode(onInputBufferAvailable<TrackSampleTable> oninputbufferavailable, String str) {
        this.RemoteActionCompatParcelizer = oninputbufferavailable;
        this.AudioAttributesCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(List<Map<String, String>> list) throws fillEncryptionData {
        AudioAttributesCompatParcelizer();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        write(RemoteActionCompatParcelizer(list));
    }

    private void write() throws fillEncryptionData {
        AudioAttributesCompatParcelizer();
        write(read());
    }

    private List<TrackFragment> RemoteActionCompatParcelizer() throws fillEncryptionData {
        AudioAttributesCompatParcelizer();
        List<TrackSampleTable.RemoteActionCompatParcelizer> list = read();
        ArrayList arrayList = new ArrayList();
        Iterator<TrackSampleTable.RemoteActionCompatParcelizer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TrackFragment.write(it.next()));
        }
        return arrayList;
    }

    private void write(List<TrackFragment> list) throws fillEncryptionData {
        if (list.isEmpty()) {
            write();
            return;
        }
        List<TrackFragment> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        write((Collection<TrackSampleTable.RemoteActionCompatParcelizer>) read(listRemoteActionCompatParcelizer, list));
        read(IconCompatParcelizer(list, listRemoteActionCompatParcelizer));
    }

    private ArrayList<TrackSampleTable.RemoteActionCompatParcelizer> read(List<TrackFragment> list, List<TrackFragment> list2) {
        ArrayList<TrackSampleTable.RemoteActionCompatParcelizer> arrayList = new ArrayList<>();
        for (TrackFragment trackFragment : list) {
            if (!write(list2, trackFragment)) {
                arrayList.add(trackFragment.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
            }
        }
        return arrayList;
    }

    private static ArrayList<TrackFragment> IconCompatParcelizer(List<TrackFragment> list, List<TrackFragment> list2) {
        ArrayList<TrackFragment> arrayList = new ArrayList<>();
        for (TrackFragment trackFragment : list) {
            if (!write(list2, trackFragment)) {
                arrayList.add(trackFragment);
            }
        }
        return arrayList;
    }

    private static boolean write(List<TrackFragment> list, TrackFragment trackFragment) {
        String strRemoteActionCompatParcelizer = trackFragment.RemoteActionCompatParcelizer();
        String strAudioAttributesCompatParcelizer = trackFragment.AudioAttributesCompatParcelizer();
        for (TrackFragment trackFragment2 : list) {
            if (trackFragment2.RemoteActionCompatParcelizer().equals(strRemoteActionCompatParcelizer) && trackFragment2.AudioAttributesCompatParcelizer().equals(strAudioAttributesCompatParcelizer)) {
                return true;
            }
        }
        return false;
    }

    private void read(List<TrackFragment> list) {
        ArrayDeque arrayDeque = new ArrayDeque(read());
        int iIconCompatParcelizer = IconCompatParcelizer();
        for (TrackFragment trackFragment : list) {
            while (arrayDeque.size() >= iIconCompatParcelizer) {
                read(((TrackSampleTable.RemoteActionCompatParcelizer) arrayDeque.pollFirst()).RemoteActionCompatParcelizer);
            }
            TrackSampleTable.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = trackFragment.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            read(RemoteActionCompatParcelizer);
            arrayDeque.offer(RemoteActionCompatParcelizer);
        }
    }

    private void write(Collection<TrackSampleTable.RemoteActionCompatParcelizer> collection) {
        Iterator<TrackSampleTable.RemoteActionCompatParcelizer> it = collection.iterator();
        while (it.hasNext()) {
            read(it.next().RemoteActionCompatParcelizer);
        }
    }

    private static List<TrackFragment> RemoteActionCompatParcelizer(List<Map<String, String>> list) throws fillEncryptionData {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TrackFragment.write(it.next()));
        }
        return arrayList;
    }

    private void read(TrackSampleTable.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer.write().IconCompatParcelizer(remoteActionCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer() throws fillEncryptionData {
        if (this.RemoteActionCompatParcelizer.write() == null) {
            throw new fillEncryptionData("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private void read(String str) {
        this.RemoteActionCompatParcelizer.write().IconCompatParcelizer(str);
    }

    private int IconCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Integer.valueOf(this.RemoteActionCompatParcelizer.write().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
        }
        return this.IconCompatParcelizer.intValue();
    }

    private List<TrackSampleTable.RemoteActionCompatParcelizer> read() {
        return this.RemoteActionCompatParcelizer.write().IconCompatParcelizer(this.AudioAttributesCompatParcelizer, "");
    }
}
