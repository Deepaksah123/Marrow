package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class parseEsdsFromParent extends parseAudioSampleEntry {
    private /* synthetic */ IndexSeeker IconCompatParcelizer;
    private /* synthetic */ TaskCompletionSource RemoteActionCompatParcelizer;
    private /* synthetic */ parseAudioSampleEntry write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    parseEsdsFromParent(IndexSeeker indexSeeker, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, parseAudioSampleEntry parseaudiosampleentry) {
        super(taskCompletionSource);
        this.RemoteActionCompatParcelizer = taskCompletionSource2;
        this.write = parseaudiosampleentry;
        this.IconCompatParcelizer = indexSeeker;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void b() {
        synchronized (this.IconCompatParcelizer.MediaBrowserCompatItemReceiver) {
            IndexSeeker.write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
            if (this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver.getAndIncrement() > 0) {
                this.IconCompatParcelizer.read.RemoteActionCompatParcelizer("Already connected to the service.", new Object[0]);
            }
            IndexSeeker.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write);
        }
    }
}
