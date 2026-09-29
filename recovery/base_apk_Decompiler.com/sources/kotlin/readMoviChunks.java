package kotlin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class readMoviChunks extends getChunkReader<AviExtractorChunkHeaderHolder> {
    private static final int read = calculateNextSearchBytePosition.IconCompatParcelizer.sideSheetDialogTheme;
    private static final int write = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Theme_Material3_Light_SideSheetDialog;

    @Override // kotlin.getChunkReader
    final int MediaBrowserCompatCustomActionResultReceiver() {
        return 3;
    }

    @Override // kotlin.getChunkReader, android.app.Dialog, android.content.DialogInterface
    public final /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // kotlin.getChunkReader, android.app.Dialog, android.view.Window.Callback
    public final /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // kotlin.getChunkReader, android.app.Dialog, android.view.Window.Callback
    public final /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // kotlin.getChunkReader, android.app.Dialog
    public final /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // kotlin.getChunkReader, android.app.Dialog
    public final /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // kotlin.getChunkReader, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final /* bridge */ /* synthetic */ void setContentView(int i) {
        super.setContentView(i);
    }

    @Override // kotlin.getChunkReader, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // kotlin.getChunkReader, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    public readMoviChunks(Context context, int i) {
        super(context, i, read, write);
    }

    @Override // kotlin.getChunkReader
    final void write(AmrExtractorFlags<AviExtractorChunkHeaderHolder> amrExtractorFlags) {
        amrExtractorFlags.read(new AviExtractorChunkHeaderHolder() { // from class: o.readMoviChunks.1
            @Override // kotlin.alignInputToEvenPosition
            public final void read(int i) {
                if (i == 5) {
                    readMoviChunks.this.cancel();
                }
            }
        });
    }

    @Override // kotlin.getChunkReader
    final int IconCompatParcelizer() {
        return calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.m3_side_sheet_dialog;
    }

    @Override // kotlin.getChunkReader
    final int RemoteActionCompatParcelizer() {
        return calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.m3_side_sheet;
    }

    @Override // kotlin.getChunkReader
    final AmrExtractorFlags<AviExtractorChunkHeaderHolder> IconCompatParcelizer(FrameLayout frameLayout) {
        return SideSheetBehavior.read(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getChunkReader
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public SideSheetBehavior<? extends View> write() {
        AmrExtractorFlags amrExtractorFlagsWrite = super.write();
        if (!(amrExtractorFlagsWrite instanceof SideSheetBehavior)) {
            throw new IllegalStateException("The view is not associated with SideSheetBehavior");
        }
        return (SideSheetBehavior) amrExtractorFlagsWrite;
    }
}
