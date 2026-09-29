package kotlin;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class readUnsignedVarint extends parseAudioSampleEntry {
    private /* synthetic */ IBinder AudioAttributesCompatParcelizer;
    private /* synthetic */ ConstantBitrateSeeker read;

    readUnsignedVarint(ConstantBitrateSeeker constantBitrateSeeker, IBinder iBinder) {
        this.AudioAttributesCompatParcelizer = iBinder;
        this.read = constantBitrateSeeker;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void b() {
        this.read.AudioAttributesCompatParcelizer.MediaDescriptionCompat = (IInterface) this.read.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.a(this.AudioAttributesCompatParcelizer);
        IndexSeeker.MediaBrowserCompatSearchResultReceiver(this.read.AudioAttributesCompatParcelizer);
        this.read.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = false;
        Iterator it = this.read.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.read.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.clear();
    }
}
