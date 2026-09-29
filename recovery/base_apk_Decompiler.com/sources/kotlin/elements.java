package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "operations", "Landroidx/collection/IntList;", "slotId", "", "cause", "", "<init>", "(Landroidx/collection/IntList;Ljava/lang/Object;Ljava/lang/Throwable;)V", "operationsList", "", "", "message", "getMessage$annotations", "()V", "getMessage", "()Ljava/lang/String;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class elements extends IllegalStateException {
    private final Object AudioAttributesCompatParcelizer;
    private final setWindowTitle write;

    public elements(setWindowTitle setwindowtitle, Object obj, Throwable th) {
        super(th);
        this.write = setwindowtitle;
        this.AudioAttributesCompatParcelizer = obj;
    }

    private final List<String> AudioAttributesCompatParcelizer() {
        String strConcat;
        List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
        for (int i = this.write.AudioAttributesCompatParcelizer - 1; i >= 0; i--) {
            int i2 = this.write.read(i);
            int iRemoteActionCompatParcelizer = asLong.RemoteActionCompatParcelizer(i2);
            if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.write())) {
                strConcat = "CancelPausedPrecomposition";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.AudioAttributesImplBaseParcelizer())) {
                strConcat = "ReuseForceSyncDeactivation";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
                strConcat = "ReuseScheduleOutOfFrameDeactivation";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
                strConcat = "ReuseSyncDeactivation";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.MediaBrowserCompatItemReceiver())) {
                strConcat = "ReuseDeactivationViaHost";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
                strConcat = "TookFromPrecomposeMap";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.MediaBrowserCompatMediaItem())) {
                strConcat = "Subcompose";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.onCommand())) {
                strConcat = "SubcomposeNew";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.onAddQueueItem())) {
                strConcat = "SubcomposePausable";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.MediaBrowserCompatSearchResultReceiver())) {
                strConcat = "SubcomposeForceReuse";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.RemoteActionCompatParcelizer())) {
                strConcat = "DeactivateOutOfFrame";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.read())) {
                strConcat = "DeactivateOutOfFrameCancelled";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.MediaMetadataCompat())) {
                strConcat = "SlotToReusedFromOnDeactivate";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.RatingCompat())) {
                strConcat = "SlotToReusedFromOnReuse";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.MediaDescriptionCompat())) {
                strConcat = "Reused";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
                strConcat = "ResumePaused";
            } else if (asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.AudioAttributesCompatParcelizer())) {
                strConcat = "PausePaused";
            } else {
                strConcat = asLong.IconCompatParcelizer(iRemoteActionCompatParcelizer, asLong.INSTANCE.IconCompatParcelizer()) ? "ApplyPaused" : "Unexpected ".concat(String.valueOf(i2));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(": ");
            sb.append(strConcat);
            listIconCompatParcelizer.add(sb.toString());
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("\n            |slotid=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(". Last operations:\n            |");
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), "\n", null, null, 0, null, null, 62));
        sb.append("\n            ");
        return TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|");
    }
}
