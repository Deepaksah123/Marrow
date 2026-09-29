package kotlin;

import com.google.android.exoplayer2.ui.TimeBar;

/* JADX INFO: loaded from: classes3.dex */
public class SubtitleExtractor implements TimeBar.OnScrubListener {
    @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
    public void onScrubMove(TimeBar timeBar, long j) {
        toMagicModuleMetaRepoModel.write(timeBar, "");
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
    public void onScrubStart(TimeBar timeBar, long j) {
        toMagicModuleMetaRepoModel.write(timeBar, "");
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
    public void onScrubStop(TimeBar timeBar, long j, boolean z) {
        toMagicModuleMetaRepoModel.write(timeBar, "");
    }
}
